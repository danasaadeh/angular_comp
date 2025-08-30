

package AST;

import AST.Angular.Component.Component;
import AST.Angular.Service.Inject;
import AST.Basic.*;
import AST.Basic.Class.ClassDecl;
import AST.Basic.Function.FuncDecl;
import AST.Html.HtmlElements;

import java.util.ArrayList;
import java.util.List;

public class Instruction implements Program {

    private List<ImportState> importStates;
    private List<Statements> statements;
    private List<Component> components;
    private List<Inject> injects;

    private List<Instruction> instructions_list = new ArrayList<>();

    private String type;

    public Instruction() {
        this.importStates = new ArrayList<>();
        this.components = new ArrayList<>();
        this.injects = new ArrayList<>();
        this.statements = new ArrayList<>();
    }

    // --- Implementing Program interface methods ---
    @Override
    public List<Instruction> getInstructions_list() {
        return instructions_list;
    }

    @Override
    public void setInstructions_list(Instruction instruction) {
        this.instructions_list.add(instruction);
    }

    @Override
    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Instruction {");

        // ✅ Print nested instructions list (the Program content)
        if (!instructions_list.isEmpty()) {
            sb.append("\n instructions_list=[");
            for (Instruction i : instructions_list) {
                sb.append(i.print()).append(",");
            }
            sb.append("]");
        }

        if (!statements.isEmpty()) {
            sb.append("\n statements=").append(statements);
        }
        if (!importStates.isEmpty()) {
            sb.append("\n importStates=").append(importStates);
        }
        if (!components.isEmpty()) {
            sb.append("\n components=").append(components);
        }
        if (!injects.isEmpty()) {
            sb.append("\n injects=").append(injects);
        }

        sb.append("\n }");
        return sb.toString();
    }


    @Override
    public String toString() {
        return print();
    }

    // --- Code generation: HTML/CSS/JS ---
    @Override


    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<!-- output.html -->\n");
        htmlBuilder.append("<!DOCTYPE html>\n");
        htmlBuilder.append("<html lang=\"en\">\n");
        htmlBuilder.append("<head>\n");
        htmlBuilder.append("    <meta charset=\"UTF-8\">\n");
        htmlBuilder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        htmlBuilder.append("    <title>Generated Page</title>\n");
        htmlBuilder.append("</head>\n");
        htmlBuilder.append("<body>\n");

        // Collect every Component from this node and all descendants
        List<Component> allComponents = collectAllComponents(this);

        boolean renderedAny = false;
        if (allComponents != null && !allComponents.isEmpty()) {
            for (Component comp : allComponents) {
                if (comp == null || comp.getComponentBody() == null) continue;

                AST.Angular.Component.Template tpl = comp.getComponentBody().getTemplate();
                if (tpl != null) {
                    String rendered = renderTemplate(tpl);
                    if (rendered != null && !rendered.isEmpty()) {
                        htmlBuilder.append(rendered).append("\n");
                        renderedAny = true;
                    }
                }
            }
        }

        // Fallback if no templates were rendered
        if (!renderedAny) {
            htmlBuilder.append("    <div id=\"app\"></div>\n");
        }

        htmlBuilder.append("    <script src=\"script.js\"></script>\n");
        htmlBuilder.append("</body>\n");
        htmlBuilder.append("</html>");
        return htmlBuilder.toString();
    }

    /**
     * Recursively collects all Component nodes found in this Instruction and its children.
     */
    private List<Component> collectAllComponents(Instruction root) {
        List<Component> result = new ArrayList<>();
        collectAllComponentsInto(root, result);
        return result;
    }

    /** Helper to avoid repeated list allocations. */
    private void collectAllComponentsInto(Instruction node, List<Component> out) {
        if (node == null) return;

        // ✅ If this node is itself a Component, add it
        if (node instanceof Component) {
            out.add((Component) node);
        }

        // ✅ Add components defined at this node
        if (node.getComponents() != null && !node.getComponents().isEmpty()) {
            out.addAll(node.getComponents());
        }

        // ✅ Recurse into children
        if (node.getInstructions_list() != null && !node.getInstructions_list().isEmpty()) {
            for (Instruction child : node.getInstructions_list()) {
                collectAllComponentsInto(child, out);
            }
        }
    }




    @Override
    public String convertToCss() {
        // Intentionally empty because styles should be inline in the generated HTML
        return "";
    }

    @Override
    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();


        // --- 1. Emit import states if needed ---
        if (importStates != null && !importStates.isEmpty()) {
            for (ImportState imp : importStates) {
                jsBuilder.append(imp.convertToJs()).append("\n");
            }
        }

        // --- 2. Emit top-level statements (Init, Assign, FuncDecl, ClassDecl, etc.) ---
        if (statements != null && !statements.isEmpty()) {
            for (Statements stmt : statements) {
                jsBuilder.append(stmt.convertToJs()).append("\n");
            }
        }

        // --- 3. Emit Angular/Component bodies if any ---
        if (components != null && !components.isEmpty()) {
            for (Component comp : components) {
                jsBuilder.append(comp.convertToJs()).append("\n");
            }
        }

        // --- 4. Recursively emit children instructions ---
        if (instructions_list != null && !instructions_list.isEmpty()) {
            for (Instruction child : instructions_list) {
                jsBuilder.append(child.convertToJs()).append("\n");
            }
        }

        return jsBuilder.toString();
    }

    // ---- Helpers to render HTML with inline attributes/styles ----
    private String renderTemplate(AST.Angular.Component.Template template) {
        if (template == null || template.getHtmlDocument() == null) return "";
        return renderHtmlDocument(template.getHtmlDocument());
    }

    private String renderHtmlDocument(AST.Html.HtmlDocument document) {
        StringBuilder sb = new StringBuilder();
        for (AST.Html.HtmlElement el : document.getHtmlElements()) {
            sb.append(el.convertToHtml());   // ✅ use HtmlElement’s built-in renderer
        }
        return sb.toString();
    }


    private String escapeHtml(String s) {
        return s.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }

    // --- Other Getters/Setters ---
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<ImportState> getImportStates() {
        return importStates;
    }

    public void setImportStates(List<ImportState> importStates) {
        this.importStates = importStates;
    }

    public List<Inject> getInjects() {
        return injects;
    }

    public void setInjects(List<Inject> injects) {
        this.injects = injects;
    }

    public List<Statements> getStatements() {
        return statements;
    }

    public void setStatements(List<Statements> statements) {
        this.statements = statements;
    }
}













//package AST;
//
//import AST.Angular.Component.Component;
//import AST.Angular.Service.Inject;
//import AST.Basic.*;
//import AST.Basic.Class.ClassDecl;
//import AST.Basic.Function.FuncDecl;
//import AST.Html.HtmlElements;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Instruction extends Program{
//    private List<ImportState> importStates;
//    private List<Statements> statements;
//    private List<Component> components;
//    private List<Inject> injects;
//
//    private String type;
//
////    public Instruction(List<Component> components, List<ImportState> importStates, List<Inject> injects, List<Statements> statements) {
////        this.components = components;
////        this.importStates = importStates;
////        this.injects = injects;
////        this.statements = statements;
////    }
//
//public  Instruction(){
//    this.importStates=new ArrayList<>();
//    this.components=new ArrayList<>();
//    this.injects=new ArrayList<>();
//    this.statements=new ArrayList<>();
//}
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//
//
//        if (statements != null && !statements.isEmpty()) {
//            sb.append("\n \t\t\t\t\t\t\tclassDecls=").append(statements);
//        }
//        if (importStates != null && !importStates.isEmpty()) {
//            sb.append("\n \t\t\t\t\t\t\timportStates=").append(importStates);
//        }
//
//
//        if (components != null && !components.isEmpty()) {
//            sb.append("\n \t\t\t\t\t\t\tcomponents=").append(components);
//        }
//        if (injects != null && !injects.isEmpty()) {
//            sb.append("\n \t\t\t\t\t\t\tinjects=").append(injects);
//        }
//
//
//
//        return sb.toString();
//    }
//
//
//    public String print() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("\n Instruction {");
//
//        if (statements != null && !statements.isEmpty()) {
//            sb.append("\n classDecls=").append(statements);
//        }
//        if (importStates != null && !importStates.isEmpty()) {
//            sb.append("\n importStates=").append(importStates);
//        }
//
//
//        if (components != null && !components.isEmpty()) {
//            sb.append("\n components=").append(components);
//        }
//        if (injects != null && !injects.isEmpty()) {
//            sb.append("\n injects=").append(injects);
//        }
//
//
//        sb.append(" }");
//        return sb.toString();
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public List<Component> getComponents() {
//        return components;
//    }
//
//    public void setComponents(List<Component> components) {
//        this.components = components;
//    }
//
//
//
//    public List<ImportState> getImportStates() {
//        return importStates;
//    }
//
//    public void setImportStates(List<ImportState> importStates) {
//        this.importStates = importStates;
//    }
//
//    public List<Inject> getInjects() {
//        return injects;
//    }
//
//    public void setInjects(List<Inject> injects) {
//        this.injects = injects;
//    }
//
//    public List<Statements> getStatements() {
//        return statements;
//    }
//
//    public void setStatements(List<Statements> statements) {
//        this.statements = statements;
//    }
//}
