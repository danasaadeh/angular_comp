package AST.Basic.This.Expr;

import AST.Statements;
import java.util.List;

public class Array extends Statements {
    private List<Object> elements;  // was List<Statements>

    public Array(List<Object> elements) {
        this.elements = elements;
    }

    public List<Object> getElements() {
        return elements;
    }


    @Override
    public String convertToJs() {
        StringBuilder sb = new StringBuilder("[\n");
        if (elements != null && !elements.isEmpty()) {
            for (int i = 0; i < elements.size(); i++) {
                Object element = elements.get(i);
                sb.append("\t"); // indentation for each object
                if (element instanceof AST.Basic.MyObject) {
                    sb.append(((AST.Basic.MyObject) element).convertToJs());
                } else if (element instanceof Statements) {
                    sb.append(((Statements) element).convertToJs());
                } else {
                    sb.append(element.toString());
                }
                if (i < elements.size() - 1) sb.append(",\n"); // newline between elements
            }
        }
        sb.append("\n]");
        return sb.toString();
    }

}
