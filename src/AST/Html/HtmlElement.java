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

        if (bindings != null) {
            for (Binding binding : bindings) {
                String b = binding.convertToHtml();
                if (b != null && !b.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(b.trim());
                }
            }
        }

        if (directives != null) {
            for (Directive directive : directives) {
                String d = directive.convertToHtml();
                if (d != null && !d.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(d.trim());
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

    public static boolean isSelfClosingTag(String tag) {
        String[] voidTags = {
                "area", "base", "br", "col", "embed", "hr", "img",
                "input", "link", "meta", "param", "source", "track", "wbr"
        };
        if (tag == null) return false;
        for (String t : voidTags) {
            if (t.equalsIgnoreCase(tag)) return true;
        }
        return false;
    }


    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();

        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                if ("id".equalsIgnoreCase(attr.getName()) && attr.getValue() != null && !attr.getValue().isEmpty()) {
                    String rawId = attr.getValue().trim();
                    String cleanId = stripQuotes(rawId);                  // <-- remove wrapping quotes if any
                    String varName = sanitizeIdentifier(toCamelCase(cleanId)); // <-- make a valid JS identifier

                    jsBuilder.append("const ")
                            .append(varName)                              // <-- NO quotes here
                            .append(" = document.getElementById(\"")      // <-- quote the string literal id
                            .append(escapeJsString(cleanId))
                            .append("\");\n");
                }
            }
        }

        if (htmlContents != null && htmlContents.hasContent()) {
            for (Object child : htmlContents.getChildren()) {
                if (child instanceof HtmlElement) {
                    jsBuilder.append(((HtmlElement) child).convertToJs());
                }
            }
        }

        return jsBuilder.toString();
    }

    // Utility: convert kebab-case or snake_case to camelCase
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

    // Remove wrapping single/double quotes if present
    private String stripQuotes(String s) {
        if (s == null || s.length() < 2) return s;
        char first = s.charAt(0), last = s.charAt(s.length() - 1);
        if ((first == '"' && last == '"') || (first == '\'' && last == '\'')) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }

    // Ensure it's a valid, non-reserved JS identifier
    private String sanitizeIdentifier(String s) {
        if (s == null || s.isEmpty()) return "_el";
        // Replace invalid characters
        String out = s.replaceAll("[^A-Za-z0-9_$]", "_");
        // Cannot start with a digit
        if (out.matches("^[0-9].*")) out = "_" + out;
        // Avoid reserved words
        if (isReservedWord(out)) out = out + "El";
        return out;
    }

    private boolean isReservedWord(String s) {
        switch (s) {
            case "break":
            case "case":
            case "catch":
            case "class":
            case "const":
            case "continue":
            case "debugger":
            case "default":
            case "delete":
            case "do":
            case "else":
            case "export":
            case "extends":
            case "finally":
            case "for":
            case "function":
            case "if":
            case "import":
            case "in":
            case "instanceof":
            case "new":
            case "return":
            case "super":
            case "switch":
            case "this":
            case "throw":
            case "try":
            case "typeof":
            case "var":
            case "void":
            case "while":
            case "with":
            case "yield":
            case "let":
            case "enum":
            case "await":
            case "implements":
            case "package":
            case "protected":
            case "static":
            case "interface":
            case "private":
            case "public":
                return true;
            default:
                return false;
        }
    }

    // Escape quotes/backslashes for JS string literal
    private String escapeJsString(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}