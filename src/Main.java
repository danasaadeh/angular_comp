import AST.Instruction;
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
        // === 1) Define multiple sources
        String[] sources = {
                "tests/product.service.txt",
                "tests/home.component.txt",
                "tests/add-product.component.txt",
                "tests/app.routes.txt"
        };

        String output = "output.txt";

        // === 2) Visitor + root container
        AngularVisitor visitor = new AngularVisitor();
        Instruction rootProgram = new Instruction();

        // === 3) Parse each file and merge
        for (String source : sources) {
            CharStream sc = fromFileName(source);
            LexerFile lexer = new LexerFile(sc);
            CommonTokenStream token = new CommonTokenStream(lexer);
            ParserFile parser = new ParserFile(token);
            ParseTree tree = parser.program();

            Program subProgram = (Program) visitor.visit(tree);

            if (subProgram instanceof Instruction) {
                Instruction subInstr = (Instruction) subProgram;

                // ✅ Add sub-instruction
                rootProgram.setInstructions_list(subInstr);

                // ✅ Also merge components into root so they are visible
                if (subInstr.getComponents() != null && !subInstr.getComponents().isEmpty()) {
                    rootProgram.getComponents().addAll(subInstr.getComponents());
                }
            }

        }

        // === 4) Collect semantic errors
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

        // === 5) Output AST + symbol table
        System.out.println("Abstract Syntax Tree:");
        System.out.println(rootProgram.print());
        System.out.println();

        visitor.st.writeTo();

        // Print the semantic-error tables in console
        semantic.SemanticErrorTablePrinter.printTables(errors);

        // === 6) Generate code from combined AST
        Generation codeGeneration = new Generation();
        codeGeneration.generateOutputFiles(rootProgram);
    }
}