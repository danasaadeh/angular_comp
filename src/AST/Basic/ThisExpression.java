package AST.Basic;

import AST.Statements;

import java.util.List;

public class ThisExpression extends Statements {
    private String identifier;
    private List<String> chainedIdentifiers;

    // Constructor
    public ThisExpression(String identifier, List<String> chainedIdentifiers) {
        this.identifier = identifier;
        this.chainedIdentifiers = chainedIdentifiers;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public List<String> getChainedIdentifiers() {
        return chainedIdentifiers;
    }

    @Override
    public String toString() {
        return

                " identifier = " + identifier ;
    }

    public String print() {
        return

                ",\n identifier = " + identifier
                ;
    }
}