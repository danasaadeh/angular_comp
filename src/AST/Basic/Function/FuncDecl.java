package AST.Basic.Function;

import AST.Basic.Init;
import AST.Statements;
import Symbol_table.Row;
import Symbol_table.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class FuncDecl extends Statements {
    public String return_type;
    public String name;
    public List<FuncBody> functionBodies;
    public List<Parameter> parameters;

    // Symbol table reference
    private SymbolTable st;

    public FuncDecl(SymbolTable st) {
        this.st = st;
        this.name = null;
        this.return_type = null;
        this.parameters = new ArrayList<>();
        this.functionBodies = new ArrayList<>();
    }

    public void setSymbolTable(SymbolTable st) {
        this.st = st;
    }

    public SymbolTable getSymbolTable() {
        return st;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReturn_type() {
        return return_type;
    }

    public void setReturn_type(String return_type) {
        this.return_type = return_type;
    }

    public List<FuncBody> getFunctionBodies() {
        return functionBodies;
    }

    public void setFunctionBodies(List<FuncBody> functionBodies) {
        this.functionBodies = functionBodies;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "\nFuncDecl{" +
                "functionBodies=" + functionBodies +
                ", return_type='" + return_type + '\'' +
                ", name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }



    @Override
    public String convertToJs() {
//        if (st == null) {
//            throw new RuntimeException("SymbolTable not set in FuncDecl");
//        }
//
//        StringBuilder jsBuilder = new StringBuilder();
//
//        if ("submit".equals(name)) {
//
//            // Pick first non-null object from symbol table as the entity
//            String entity = null;
//            Row entityRow = null;
//
//            for (Row r : st.getRow()) {
//                if (r != null && r.getValue() != null && r.getValue().toString().startsWith("{")) {
//                    entity = r.getName();
//                    entityRow = r;
//                    break;
//                }
//            }
//
//            if (entity == null) {
//                entity = "product"; // fallback
//            }
//
//            // Extract keys from entity object
//            List<String> keys = new ArrayList<>();
//            if (entityRow != null) {
//                String valueText = entityRow.getValue().toString().trim();
//                String objectBody = valueText.substring(1, valueText.length() - 1).trim();
//                if (!objectBody.isEmpty()) {
//                    for (String part : objectBody.split(",")) {
//                        String[] kv = part.split(":");
//                        if (kv.length > 0) keys.add(kv[0].trim());
//                    }
//                }
//            }
//
//            // fallback keys if none found
//            if (keys.isEmpty()) {
//                keys.add("name");
//                keys.add("image");
//                keys.add("details");
//                keys.add("price");
//                keys.add("size");
//            }
//
//            // JS variable names based on entity
//            String cap = Character.toUpperCase(entity.charAt(0)) + entity.substring(1);
//            String formVarName = "add" + cap + "Form";
//            String plural = entity + "s";
//
////            jsBuilder.append("let ").append(entity).append(" = {");
////            for (int i = 0; i < keys.size(); i++) {
////                jsBuilder.append(keys.get(i)).append(": ''");
////                if (i < keys.size() - 1) jsBuilder.append(",");
////            }
////            jsBuilder.append("};\n\n");
//
//            jsBuilder.append(formVarName).append(".addEventListener(\"submit\", (e) => {\n")
//                    .append("  e.preventDefault();\n")
//                    .append(buildObjectLiteralFromKeys(cap, keys, st))
//                    .append("  ").append(plural).append(".push(new").append(cap).append(");\n")
//                    .append("  showHomePage();\n")
//                    .append("  ").append(formVarName).append(".reset();\n")
//                    .append("});\n\n")
//                    .append("// Initial render\n")
//                    .append("renderProducts();\n");
//        }
//
//        return jsBuilder.toString();
        return "";
    }


    private String buildObjectLiteralFromKeys(String entity, List<String> keys, SymbolTable st) {
        String cap = Character.toUpperCase(entity.charAt(0)) + entity.substring(1);
        StringBuilder b = new StringBuilder();
        b.append("  const new").append(cap).append(" = {\n");

        for (int i = 0; i < keys.size(); i++) {
            String k = keys.get(i);
            String line;

            // detect if the key is numeric from symbol table safely
            boolean isNumeric = false;
            if (st != null && st.getRow() != null) {
                for (Row r : st.getRow()) {
                    if (r != null && k.equals(r.getName()) && r.getValue() != null) {
                        Object val = r.getValue();
                        if (val instanceof Number) {
                            isNumeric = true;
                        } else if (val instanceof String) {
                            try {
                                Double.parseDouble((String) val);
                                isNumeric = true;
                            } catch (NumberFormatException ignored) {}
                        }
                        break;
                    }
                }
            }

            if (isNumeric) {
                line = "    " + k + ": parseFloat(document.getElementById(\"" + k + "\").value)";
            } else {
                line = "    " + k + ": document.getElementById(\"" + k + "\").value";
            }

            if (i < keys.size() - 1) line += ",";
            b.append(line).append("\n");
        }

        b.append("  };\n");
        return b.toString();
    }



}
