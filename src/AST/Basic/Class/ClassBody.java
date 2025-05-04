package AST.Basic.Class;

import AST.Basic.Declaration;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Init;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class ClassBody {
    public List<Statements> statements;

    public ClassBody() {
       this.statements=new ArrayList<>();
    }


    public List<Statements> getStatements() {
        return statements;
    }

    public void setStatements(List<Statements> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\tstatements=" + statements ;
    }
    public String print() {
        return "\n ClassBody{" +
                "statements=" + statements +
                '}';
    }
}