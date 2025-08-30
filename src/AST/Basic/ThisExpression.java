//package AST.Basic;
//
//import AST.Statements;
//
//import java.util.List;
//
//public class ThisExpression extends Statements {
//    private String identifier;
//    private List<String> chainedIdentifiers;
//
//    // Constructor
//    public ThisExpression(String identifier, List<String> chainedIdentifiers) {
//        this.identifier = identifier;
//        this.chainedIdentifiers = chainedIdentifiers;
//    }
//
//    // Getters
//    public String getIdentifier() {
//        return identifier;
//    }
//
//    public List<String> getChainedIdentifiers() {
//        return chainedIdentifiers;
//    }
//
//    @Override
//    public String toString() {
//        return
//
//                " identifier = " + identifier ;
//    }
//
//    public String print() {
//        return
//
//                ",\n identifier = " + identifier
//                ;
//    }
//}
package AST.Basic;

import AST.Basic.This.Expr.Assignment;
import AST.Basic.This.Expr.PostOp;
import AST.Basic.This.Expr.PropertyChain;
import AST.Statements;

public class ThisExpression extends Statements {
    private PropertyChain propertyChain;
    private Assignment assignment; // nullable
    private PostOp postOp;         // nullable

    // Constructor with assignment
    public ThisExpression(PropertyChain propertyChain, Assignment assignment) {
        this.propertyChain = propertyChain;
        this.assignment = assignment;
        this.postOp = null;
    }

    // Constructor with post operation
    public ThisExpression(PropertyChain propertyChain, PostOp postOp) {
        this.propertyChain = propertyChain;
        this.postOp = postOp;
        this.assignment = null;
    }

    // Constructor with only propertyChain (no assignment/postOp)
    public ThisExpression(PropertyChain propertyChain) {
        this.propertyChain = propertyChain;
        this.assignment = null;
        this.postOp = null;
    }

    public PropertyChain getPropertyChain() {
        return propertyChain;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public PostOp getPostOp() {
        return postOp;
    }

    @Override
    public String toString() {
        return "ThisExpression{" +
                "propertyChain=" + propertyChain +
                ", assignment=" + assignment +
                ", postOp=" + postOp +
                '}';
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("this.").append(propertyChain.toString());
        if (assignment != null) {
            sb.append(" = ").append(assignment.getValue());
        } else if (postOp != null) {
            sb.append(postOp.getOperation());
        }
        return sb.toString();
    }
    @Override

  public String convertToJs() {
        StringBuilder sb = new StringBuilder("this.");
        sb.append(propertyChain.convertToJs());
        if (assignment != null) {
            sb.append(" = ").append(assignment.getValue().convertToJs());
        }
        return sb.toString();
    }
       // return "";}

}
