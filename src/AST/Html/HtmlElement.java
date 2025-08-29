package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private String tagName;
    private List<HtmlAttribute> htmlAttributes;
    private List<Directive> directives;
    private List<Binding> bindings;
    private HtmlContent htmlContents;
    private List<Hash> hashes;
    private boolean selfClosing;
    private int order;   // NEW field

    public HtmlElement() {
        this.bindings = new ArrayList<>();
        this.directives = new ArrayList<>();
        this.htmlAttributes = new ArrayList<>();
        this.htmlContents = new HtmlContent();
        this.hashes = new ArrayList<>();
        this.tagName = "";
        this.selfClosing = false;
        this.order = -1;
    }

    // ==== Getters & Setters ====
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<Binding> getBindings() {
        return bindings;
    }

    public void setBindings(List<Binding> bindings) {
        this.bindings = bindings;
    }

    public void addBinding(Binding binding) {
        if (binding != null) this.bindings.add(binding);
    }

    public List<Directive> getDirectives() {
        return directives;
    }

    public void setDirectives(List<Directive> directives) {
        this.directives = directives;
    }

    public void addDirective(Directive directive) {
        if (directive != null) this.directives.add(directive);
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
    }

    public void addHtmlAttribute(HtmlAttribute attr) {
        if (attr != null) this.htmlAttributes.add(attr);
    }

    public HtmlContent getHtmlContents() {
        return htmlContents;
    }

    public void setHtmlContents(HtmlContent htmlContents) {
        this.htmlContents = htmlContents;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Hash> getHashes() {
        return hashes;
    }

    public void setHashes(List<Hash> hashes) {
        this.hashes = hashes;
    }

    public void addHash(Hash hash) {
        if (hash != null) this.hashes.add(hash);
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public void setSelfClosing(boolean selfClosing) {
        this.selfClosing = selfClosing;
    }

    // ==== Debug Output ====
    @Override
    public String toString() {
        return "\nHtmlElement{" +
                "\n tagName='" + tagName + '\'' +
                "\n htmlAttributes=" + htmlAttributes +
                "\n bindings=" + bindings +
                "\n directives=" + directives +
                "\n hashes=" + hashes +
                "\n htmlContents=" + htmlContents +
                "\n selfClosing=" + selfClosing +
                "\n order=" + order +
                "\n}";
    }

    // ==== HTML Conversion ====
    public String convertToHtml() {
        // --- Handle *ngFor first: replace repeated element with a container DIV ---
        Directive ngForDir = findDirective("ngFor");
        if (ngForDir == null) ngForDir = findDirective("*ngFor");
        if (ngForDir != null) {
            String id = findId();
            // Always output the static container. Keep the id if present.
            String containerId = (id != null) ? " id=\"" + escapeHtmlAttr(id) + "\"" : "";
            return "<div" + containerId + " style=\"display: flex; flex-direction: column\"></div>";
        }

        // --- Handle *ngIf: keep element and attributes, drop the directive itself ---
        Directive ngIfDir = findDirective("ngIf");
        if (ngIfDir == null) ngIfDir = findDirective("*ngIf");
        if (ngIfDir != null) {
            String tag = (tagName != null && !tagName.trim().isEmpty()) ? tagName.trim() : "div";

            StringBuilder attrBuilder = new StringBuilder();
            if (htmlAttributes != null) {
                for (HtmlAttribute attr : htmlAttributes) {
                    String a = attr.convertToHtml();
                    if (a != null && !a.isEmpty()) {
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append(a);
                    }
                }
            }
            if (hashes != null) {
                for (Hash hash : hashes) {
                    String h = hash.convertToHtml();
                    if (h != null && !h.isEmpty()) {
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append(h.trim());
                    }
                }
            }
            if (bindings != null) {
                for (Binding b : bindings) {
                    String bindStr = b.convertToHtml();
                    if (bindStr != null && !bindStr.isEmpty()) {
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append(bindStr.trim());
                    }
                }
            }
            String attrString = attrBuilder.toString().trim();

// Ensure style contains display:none
            if (attrString.contains("style=")) {
                // Append display:none inside existing style
                attrString = attrString.replaceFirst("style=\"", "style=\"display: none; ");
            } else {
                // No style yet → add new style attribute
                if (!attrString.isEmpty()) {
                    attrString += " ";
                }
                attrString += "style=\"display: none;\"";
            }

            return "<" + tag + (attrString.isEmpty() ? "" : " " + attrString) + "></" + tag + ">";

        }

        // --- Normal rendering (no structural directives) ---
        if (tagName == null || tagName.trim().isEmpty()) {
            return htmlContents != null ? htmlContents.convertToHtml() : "";
        }

        String tag = tagName.trim();
        StringBuilder attrBuilder = new StringBuilder();

        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                String a = attr.convertToHtml();
                if (a != null && !a.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(a);
                }
            }
        }

        if (hashes != null) {
            for (Hash hash : hashes) {
                String h = hash.convertToHtml();
                if (h != null && !h.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(h.trim());
                }
            }
        }

        if (bindings != null) {
            for (Binding b : bindings) {
                String bindStr = b.convertToHtml();
                if (bindStr != null && !bindStr.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(bindStr.trim());
                }
            }
        }

        String attrString = attrBuilder.toString().trim();
        boolean hasContent = htmlContents != null && htmlContents.hasContent();
        boolean voidTag = isSelfClosingTag(tag);

        if (!selfClosing && !voidTag && attrString.isEmpty() && !hasContent) {
            return "";
        }

        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<").append(tag);
        if (!attrString.isEmpty()) {
            htmlBuilder.append(" ").append(attrString);
        }

        if (selfClosing || voidTag) {
            htmlBuilder.append(" />");
        } else if (!hasContent) {
            htmlBuilder.append("></").append(tag).append(">");
        } else {
            htmlBuilder.append(">");
            htmlBuilder.append(htmlContents.convertToHtml());
            htmlBuilder.append("</").append(tag).append(">");
        }

        return htmlBuilder.toString();
    }


    // ==== JS Conversion ====
    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();

        String elementId = findId();
        String varName = (elementId != null) ? sanitizeIdentifier(toCamelCase(elementId)) : null;

        if (elementId != null) {
            jsBuilder.append("const ").append(varName)
                    .append(" = document.getElementById(\"")
                    .append(escapeJsString(elementId)).append("\");\n");
        }

        // --- *ngFor → render<IdCamel>() that builds items dynamically ---
        Directive ngForDir = findDirective("ngFor");
        if (ngForDir == null) ngForDir = findDirective("*ngFor");
        if (ngForDir != null) {
            NgForParts parts = parseNgFor(stripQuotes(ngForDir.getValue()));
            // Fallbacks just in case parsing fails
            String itemVar = (parts.itemVar != null && !parts.itemVar.isEmpty()) ? parts.itemVar : "item";
            String listExpr = (parts.listExpr != null && !parts.listExpr.isEmpty()) ? parts.listExpr : "[]";

            String funcName = "render" + capitalize(varName != null ? varName : "List");

            // Tag to create for each item = the original element's tag (e.g., "button")
            String repeatTag = (tagName != null && !tagName.trim().isEmpty()) ? tagName.trim() : "div";

            // Collect inline style on the repeated element (if any)
            String itemStyle = findAttributeValue("style");
            if (itemStyle == null) itemStyle = "";

            // Build the inner template for each repeated item from the CHILDREN of this element
            StringBuilder inner = new StringBuilder();
            if (htmlContents != null && htmlContents.hasContent()) {
                for (Object child : htmlContents.getChildren()) {
                    if (child instanceof HtmlChardata) {
                        inner.append(((HtmlChardata) child).convertToJsTemplate());
                    } else if (child instanceof HtmlElement) {
                        // Convert nested element to a template string with ${...} + property bindings
                        inner.append(((HtmlElement) child).convertElementToJsTemplate());
                    }
                }
            }

            // Find event bindings on the repeated element, e.g. (click)="buttonClicked(product)"
            List<String> eventLines = new ArrayList<>();
            if (bindings != null) {
                for (Binding b : bindings) {
                    String bind = b.getBinding();
                    if (bind != null && bind.startsWith("(") && bind.endsWith(")")) {
                        String eventName = bind.substring(1, bind.length() - 1).trim();
                        String handlerExpr = b.getValue() != null ? stripQuotes(b.getValue().trim()) : "";
                        if (!eventName.isEmpty() && !handlerExpr.isEmpty()) {
                            eventLines.add("  itemEl.addEventListener(\"" + eventName + "\", () => " + handlerExpr + ");\n");
                        }
                    }
                }
            }

            jsBuilder.append("function ").append(funcName).append("() {\n")
                    .append("  ").append(varName != null ? varName : "/*container*/").append(".innerHTML = \"\";\n")
                    .append("  (").append(listExpr).append(").forEach((").append(itemVar).append(") => {\n")
                    .append("    const itemEl = document.createElement(\"").append(repeatTag).append("\");\n");

            if (!itemStyle.isEmpty()) {
                jsBuilder.append("    itemEl.style.cssText = \"").append(escapeJsString(itemStyle)).append("\";\n");
            }

            jsBuilder.append("    itemEl.innerHTML = `").append(inner.toString()).append("`;\n");

            for (String ev : eventLines) {
                jsBuilder.append(ev);
            }

            jsBuilder.append("    ").append(varName != null ? varName : "/*container*/")
                    .append(".appendChild(itemEl);\n")
                    .append("  });\n")
                    .append("}\n\n");

            // Stop here: children of an *ngFor are rendered by the function
            return jsBuilder.toString();
        }

        // --- *ngIf → show/hide helpers (your previous behavior) ---
        Directive ngIfDir = findDirective("ngIf");
        if (ngIfDir == null) ngIfDir = findDirective("*ngIf");
        if (ngIfDir != null) {
            String param = stripQuotes(ngIfDir.getValue()); // remove " ... "

            String showFn = "show" + capitalize(varName);
            String hideFn = "hide" + capitalize(varName);

            StringBuilder inner = new StringBuilder();
            if (htmlContents != null && htmlContents.hasContent()) {
                for (Object child : htmlContents.getChildren()) {
                    if (child instanceof HtmlChardata) {
                        inner.append(((HtmlChardata) child).convertToJsTemplate());
                    } else if (child instanceof HtmlElement) {
                        inner.append(((HtmlElement) child).convertElementToJsTemplate());
                    }
                }
            }

            jsBuilder.append("function ").append(showFn)
                    .append("(").append(param).append(") {\n")   // <-- pass parameter
                    .append("  ").append(varName).append(".style.display = \"flex\";\n")
                    .append("  ").append(varName).append(".innerHTML = `").append(inner.toString()).append("`;\n")
                    .append("}\n\n");
            jsBuilder.append("function ").append(hideFn).append("() {\n")
                    .append("  ").append(varName).append(".style.display = \"none\";\n")
                    .append("  ").append(varName).append(".innerHTML = \"\";\n")
                    .append("}\n\n");

            return jsBuilder.toString();
        }

        // --- Recurse normally for non-structural elements ---
        if (htmlContents != null && htmlContents.hasContent()) {
            for (Object child : htmlContents.getChildren()) {
                if (child instanceof HtmlElement) {
                    jsBuilder.append(((HtmlElement) child).convertToJs());
                }
            }
        }

        return jsBuilder.toString();
    }

    // === Utility methods ===
    private String findId() {
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                if ("id".equalsIgnoreCase(attr.getName()) && attr.getValue() != null) {
                    return stripQuotes(attr.getValue().trim());
                }
            }
        }
        return null;
    }

    // Build a JS template for a single nested element (used inside *ngFor & *ngIf bodies)
    public String convertElementToJsTemplate() {
        String tag = (tagName != null && !tagName.isEmpty()) ? tagName.trim() : "div";
        StringBuilder attrBuilder = new StringBuilder();

        // Normal attributes → also convert any {{ }} inside attribute values to ${ }
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                // Do not propagate id of the repeated element into each item
                if ("id".equalsIgnoreCase(attr.getName())) continue;

                String a = attributeToJsTemplate(attr); // <-- converts {{ }} to ${ }
                if (a != null && !a.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(a);
                }
            }
        }

        // Property/event bindings → src="${...}", alt="${...}", etc.
        if (bindings != null) {
            for (Binding b : bindings) {
                // Only property bindings become attributes here; events are attached in convertToJs()
                String bind = b.getBinding();
                if (bind != null && bind.startsWith("[") && bind.endsWith("]")) {
                    String prop = bind.substring(1, bind.length() - 1).trim();
                    String expr = b.getValue() != null ? stripQuotes(b.getValue().trim()) : "";
                    if (!prop.isEmpty() && !expr.isEmpty()) {
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append(prop).append("=\"${").append(expr).append("}\"");
                    }
                } else if (bind != null && bind.startsWith("(") && bind.endsWith(")")) {
                    // Skip here; handled as addEventListener in convertToJs()
                }
            }
        }

        // Children
        StringBuilder childBuilder = new StringBuilder();
        if (htmlContents != null && htmlContents.hasContent()) {
            for (Object child : htmlContents.getChildren()) {
                if (child instanceof HtmlChardata) {
                    childBuilder.append(((HtmlChardata) child).convertToJsTemplate());
                } else if (child instanceof HtmlElement) {
                    childBuilder.append(((HtmlElement) child).convertElementToJsTemplate());
                }
            }
        }

        return "<" + tag +
                (attrBuilder.length() > 0 ? " " + attrBuilder.toString() : "") +
                ">" + childBuilder.toString() +
                "</" + tag + ">";
    }


    private String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public static boolean isSelfClosingTag(String tag) {
        String[] voidTags = {"area","base","br","col","embed","hr","img",
                "input","link","meta","param","source","track","wbr"};
        if (tag == null) return false;
        for (String t : voidTags) {
            if (t.equalsIgnoreCase(tag)) return true;
        }
        return false;
    }

    private String toCamelCase(String value) {
        if (value == null || value.isEmpty()) return "";
        String[] parts = value.split("[-_]");
        StringBuilder camelCase = new StringBuilder(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            if (!parts[i].isEmpty()) {
                camelCase.append(parts[i].substring(0, 1).toUpperCase())
                        .append(parts[i].substring(1));
            }
        }
        return camelCase.toString();
    }

    private String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        char first = s.charAt(0), last = s.charAt(s.length() - 1);
        if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    private String sanitizeIdentifier(String s) {
        if (s == null || s.isEmpty()) return "_el";
        String out = s.replaceAll("[^A-Za-z0-9_$]", "_");
        if (out.matches("^[0-9].*")) out = "_" + out;
        if (isReservedWord(out)) out = out + "El";
        return out;
    }

    private boolean isReservedWord(String s) {
        switch (s) {
            case "class": case "function": case "var": case "let": case "const":
            case "if": case "else": case "switch": case "for": case "while":
            case "do": case "return": case "break": case "case": case "new":
            case "this": case "super": case "import": case "export":
            case "default": case "try": case "catch": case "finally":
                return true;
            default: return false;
        }
    }

    private String escapeJsString(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }


    private Directive findDirective(String name) {
        if (directives == null || name == null) return null;
        for (Directive d : directives) {
            if (d == null || d.getNg() == null) continue;
            String ng = d.getNg().trim();
            if (name.equalsIgnoreCase(ng)) return d;
        }
        return null;
    }

    private static class NgForParts {
        String itemVar;
        String listExpr;
    }

    private NgForParts parseNgFor(String expr) {
        NgForParts p = new NgForParts();
        if (expr == null) return p;
        String s = expr.trim();

        // Expect shapes like: let item of items [; ...ignored]
        // Strip any trailing ";" segment (e.g., "let item of items; index as i")
        int semi = s.indexOf(';');
        if (semi >= 0) s = s.substring(0, semi).trim();

        // Remove optional quotes if caller forgot
        s = stripQuotes(s);

        java.util.regex.Matcher m = java.util.regex.Pattern
                .compile("let\\s+(\\w+)\\s+of\\s+(.+)", java.util.regex.Pattern.CASE_INSENSITIVE)
                .matcher(s);
        if (m.find()) {
            p.itemVar = m.group(1).trim();
            p.listExpr = m.group(2).trim();
        }
        return p;
    }

    private String findAttributeValue(String name) {
        if (htmlAttributes == null || name == null) return null;
        for (HtmlAttribute a : htmlAttributes) {
            if (a != null && name.equalsIgnoreCase(a.getName())) {
                String v = a.getValue();
                return (v != null) ? stripQuotes(v.trim()) : null;
            }
        }
        return null;
    }

    private String attributeToJsTemplate(HtmlAttribute attr) {
        if (attr == null || attr.getName() == null) return "";
        String name = attr.getName().trim();
        String raw = attr.getValue();

        if (raw == null || raw.isEmpty()) {
            return name; // boolean attribute
        }
        String val = stripQuotes(raw.trim());
        // Convert {{ expr }} → ${expr}
        val = val.replaceAll("\\{\\{\\s*(.*?)\\s*\\}\\}", "\\${$1}");
        return name + "=\"" + val + "\"";
    }

    private String escapeHtmlAttr(String s) {
        if (s == null) return "";
        return s.replace("&", "&amp;").replace("\"", "&quot;")
                .replace("<", "&lt;").replace(">", "&gt;");
    }

}