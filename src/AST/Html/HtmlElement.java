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
        // If this element has an ngIf directive, keep attributes (id, style, etc.) but remove the directive itself
        if (directives != null) {
            for (Directive dir : directives) {
                if ("ngIf".equalsIgnoreCase(dir.getNg()) || "*ngIf".equalsIgnoreCase(dir.getNg())) {
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

                    // include hashes
                    if (hashes != null) {
                        for (Hash hash : hashes) {
                            String h = hash.convertToHtml();
                            if (h != null && !h.isEmpty()) {
                                if (attrBuilder.length() > 0) attrBuilder.append(" ");
                                attrBuilder.append(h.trim());
                            }
                        }
                    }

                    // include bindings (property + event)
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
                    return "<" + tag + (attrString.isEmpty() ? "" : " " + attrString) + "></" + tag + ">";
                }
            }
        }

        // Normal rendering if no ngIf directive
        if (tagName == null || tagName.trim().isEmpty()) {
            return htmlContents != null ? htmlContents.convertToHtml() : "";
        }

        String tag = tagName.trim();
        StringBuilder attrBuilder = new StringBuilder();

        // include normal HTML attributes
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                String a = attr.convertToHtml();
                if (a != null && !a.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(a);
                }
            }
        }

        // include hashes
        if (hashes != null) {
            for (Hash hash : hashes) {
                String h = hash.convertToHtml();
                if (h != null && !h.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(h.trim());
                }
            }
        }

        // include bindings (property + event)
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

        // Step 1: create variable for id
        if (elementId != null) {
            jsBuilder.append("const ").append(varName)
                    .append(" = document.getElementById(\"")
                    .append(escapeJsString(elementId)).append("\");\n");
        }

        // Step 2: handle ngIf directive → generate toggle functions
        if (directives != null) {
            for (Directive dir : directives) {
                if ("ngIf".equalsIgnoreCase(dir.getNg()) || "*ngIf".equalsIgnoreCase(dir.getNg())) {
                    String showFn = "show" + capitalize(varName);
                    String hideFn = "hide" + capitalize(varName);

                    // Build inner template
                    StringBuilder inner = new StringBuilder();
                    if (htmlContents != null && htmlContents.hasContent()) {
                        for (Object child : htmlContents.getChildren()) {
                            if (child instanceof HtmlChardata) {
                                inner.append(((HtmlChardata) child).convertToJsTemplate());
                            } else if (child instanceof HtmlElement) {
                                // For nested elements, just render their HTML directly
                                inner.append(((HtmlElement) child).convertElementToJsTemplate());
                            }
                        }
                    }

                    jsBuilder.append("function ").append(showFn).append("() {\n")
                            .append("  ").append(varName).append(".style.display = \"flex\";\n")
                            .append("  ").append(varName).append(".innerHTML = `")
                            .append(inner.toString())
                            .append("`;\n")
                            .append("}\n\n");

                    jsBuilder.append("function ").append(hideFn).append("() {\n")
                            .append("  ").append(varName).append(".style.display = \"none\";\n")
                            .append("  ").append(varName).append(".innerHTML = \"\";\n")
                            .append("}\n\n");

                    return jsBuilder.toString();
                }
            }
        }

        // Step 3: recurse normally for children
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

    public String convertElementToJsTemplate() {
        String tag = (tagName != null && !tagName.isEmpty()) ? tagName.trim() : "div";
        StringBuilder attrBuilder = new StringBuilder();

        // Convert normal attributes
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                String a = attr.convertToHtml(); // works if plain
                if (a != null && !a.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(a);
                }
            }
        }

        // Convert bindings → src="${...}", alt="${...}", etc.
        if (bindings != null) {
            for (Binding b : bindings) {
                String bindJs = b.convertToJsTemplate(); // you need this in Binding
                if (bindJs != null && !bindJs.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(bindJs);
                }
            }
        }

        // children
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
}