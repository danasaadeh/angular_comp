package AST.Basic;

import AST.Statements;

public class Instance extends Statements {
    private Declaration declaration;
    private String typeName;
    private String genericType;
    private boolean isArray;
    private Object arrayNode;

    public Instance(Declaration declaration, String typeName, String genericType, boolean isArray, Object arrayNode) {
        this.declaration = declaration;
        this.typeName = typeName;
        this.genericType = genericType;
        this.isArray = isArray;
        this.arrayNode = arrayNode;
    }

    public Declaration getDeclaration() { return declaration; }
    public String getTypeName() { return typeName; }
    public String getGenericType() { return genericType; }
    public boolean isArray() { return isArray; }
    public Object getArrayNode() { return arrayNode; }
    public void setDeclaration(Declaration declaration) { this.declaration = declaration; }
    public void setTypeName(String typeName) { this.typeName = typeName; }
    public void setGenericType(String genericType) { this.genericType = genericType; }
    public void setArrayNode(Object arrayNode) { this.arrayNode = arrayNode; }

    @Override
    public String toString() {
        return "Instance{" +
                "declaration=" + declaration +
                ", typeName='" + typeName + '\'' +
                (genericType != null ? ", genericType='" + genericType + '\'' : "") +
                ", isArray=" + isArray +
                ", arrayNode=" + arrayNode +
                '}';
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instance { ");
        if (declaration != null) sb.append(declaration.print());
        sb.append(" = new ").append(typeName);
        if (genericType != null) sb.append("<").append(genericType).append(">");
        if (isArray) sb.append("[]");
        if (arrayNode != null) sb.append(" (").append(arrayNode.toString()).append(")");
        sb.append(" }");
        return sb.toString();
    }
    @Override
    public String convertToJs() {
        if (declaration == null || declaration.getId() == null) {
            throw new IllegalStateException("Declaration id is null");
        }

        String varName = declaration.getId();

        if (isArray) {
            if (arrayNode != null) {
                String arrayJs;
                if (arrayNode instanceof Statements) {
                    arrayJs = ((Statements) arrayNode).convertToJs();
                } else {
                    arrayJs = arrayNode.toString();
                }
                return "let " + varName + " = " + arrayJs + ";";
            } else {
                return "let " + varName + " = [];";
            }
        } else {
            return "let " + varName + " = new " + typeName
                    + (genericType != null ? "<" + genericType + ">()" : "();");
        }
    }


}
