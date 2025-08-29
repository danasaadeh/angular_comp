import AST.Program;
import CodeGeneration.Generation;
import Visitors.AngularVisitor;
import antlr.LexerFile;
import antlr.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.SemanticError;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "tests/test.txt";
        String output = "output.txt";

        CharStream sc = fromFileName(source);
        LexerFile lexer = new LexerFile(sc);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserFile parser = new ParserFile(token);
        ParseTree tree = parser.program();

        AngularVisitor visitor = new AngularVisitor();
        Program program = (Program) visitor.visit(tree);
        List<SemanticError> errors = visitor.getSemanticErrors();

        // Write semantic errors to output file
        try (PrintWriter writer = new PrintWriter(new FileWriter(output))) {
            if (!errors.isEmpty()) {
                writer.println("Semantic check errors:");
                for (SemanticError error : errors) {
                    writer.printf("Line %d: (Error: %s)%n", error.getLine(), error.getMessage());
                }
            } else {
                writer.println("No semantic errors found.");
            }
        }

        // Output AST and symbol table to console
        System.out.println("Abstract Syntax Tree:");
        System.out.println(program.print());
        System.out.println();

        // Print the populated symbol table to console
        visitor.st.writeTo();

        // --------------------------------------------------
        // Print five semantic-error tables in console
        semantic.SemanticErrorTablePrinter.printTables(errors);
        Generation codeGeneration = new Generation();
        codeGeneration.generateOutputFiles(program);

    }
}