import AST.Program;
import Symbol_table.SymbolTable;
import Visitors.AngularVisitor;
import antlr.LexerFile;
import antlr.ParserFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import semantic.SemanticError;

import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "tests/test14.txt";
        CharStream sc = fromFileName(source);
        LexerFile lexer = new LexerFile(sc);
        CommonTokenStream token = new CommonTokenStream(lexer);
        ParserFile parser = new ParserFile(token);
        ParseTree tree = parser.program();
        SymbolTable symbolTable = new SymbolTable();
        AngularVisitor visitor = new AngularVisitor();
        Program doc = (Program) visitor.visit(tree);
        List<SemanticError> errors = visitor.getSemanticErrors();
        if (!errors.isEmpty()) {
            System.out.println("Semantic check errors:");
            for (SemanticError error : errors) {
                System.out.printf("Line %d: (Error: %s)\n", error.getLine(), error.getMessage());
            }
        } else {
            System.out.println("No semantic errors found.");
        }
        System.out.println(doc.print());
        visitor.st.print();

    }}
