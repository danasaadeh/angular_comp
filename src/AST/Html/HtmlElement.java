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
    // inside class HtmlElement
    private List<String[]> ngModelBindings = new ArrayList<>();

    public String convertToHtml() {
        // --- Handle *ngFor first ---
        Directive ngForDir = findDirective("ngFor");
        if (ngForDir == null) ngForDir = findDirective("*ngFor");
        if (ngForDir != null) {
            String id = findId();
            String containerId = (id != null) ? " id=\"" + escapeHtmlAttr(id) + "\"" : "";
            return "<div" + containerId + " style=\"display: flex; flex-direction: column\"></div>";
        }

        // --- Handle *ngIf ---
        Directive ngIfDir = findDirective("ngIf");
        if (ngIfDir == null) ngIfDir = findDirective("*ngIf");
        if (ngIfDir != null) {
            String tag = (tagName != null && !tagName.trim().isEmpty()) ? tagName.trim() : "div";
            String attrString = buildAttributes(true);

            java.util.regex.Matcher m = java.util.regex.Pattern
                    .compile("style=\"([^\"]*)\"")
                    .matcher(attrString);

            if (m.find()) {
                String styleValue = m.group(1);
                styleValue = styleValue.replaceAll("display\\s*:\\s*[^;]+;?", "");
                styleValue = "display: none; " + styleValue.trim();
                attrString = attrString.replaceAll("style=\"[^\"]*\"", "style=\"" + styleValue.trim() + "\"");
            } else {
                if (!attrString.isEmpty()) attrString += " ";
                attrString += "style=\"display: none;\"";
            }

            return "<" + tag + (attrString.isEmpty() ? "" : " " + attrString) + "></" + tag + ">";
        }

        // --- Normal rendering ---
        if (tagName == null || tagName.trim().isEmpty()) {
            return htmlContents != null ? htmlContents.convertToHtml() : "";
        }

        String tag = tagName.trim();
        String attrString = buildAttributes(false);

        // === Special Case: Page Switching ===
        String elementId = findId();
        if ("div".equalsIgnoreCase(tag) && elementId != null &&
                ("product-details".equals(elementId) || "add-product-page".equals(elementId))) {
            java.util.regex.Matcher m = java.util.regex.Pattern
                    .compile("style=\"([^\"]*)\"")
                    .matcher(attrString);
            if (m.find()) {
                String styleValue = m.group(1);
                styleValue = styleValue.replaceAll("display\\s*:\\s*[^;]+;?", "");
                styleValue = "display: none; " + styleValue.trim();
                attrString = attrString.replaceAll("style=\"[^\"]*\"", "style=\"" + styleValue.trim() + "\"");
            } else {
                if (!attrString.isEmpty()) attrString += " ";
                attrString += "style=\"display: none;\"";
            }
        }

        // === Special Case: Form conversion ===
        if ("form".equalsIgnoreCase(tag)) {
            // remove Angular-only template refs
            if (hashes != null) {
                hashes.removeIf(h -> {
                    String name = (h != null) ? h.getHash() : null;
                    return name != null && name.startsWith("#");
                });
            }
            // rebuild without Angular refs
            attrString = buildAttributes(false);

            // ensure ID
            if (elementId == null) {
                elementId = "add-product-form";
                if (!attrString.contains("id=")) {
                    if (!attrString.isEmpty()) attrString += " ";
                    attrString += "id=\"" + elementId + "\"";
                }
            }
        }

        // === Buttons ending with -btn → onclick handler ===
        if ("button".equalsIgnoreCase(tag) && elementId != null && elementId.endsWith("-btn")) {
            String base = elementId.substring(0, elementId.length() - 4);
            String[] parts = base.split("-");
            StringBuilder camelName = new StringBuilder();
            for (String part : parts) {
                if (!part.isEmpty()) {
                    camelName.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1));
                }
            }
            String targetFn = "show" + camelName + "Page()";
            if (!attrString.contains("onclick=")) {
                if (!attrString.isEmpty()) attrString += " ";
                attrString += "onclick=\"" + targetFn + "\"";
            }
        }

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

    /**
     * Build attributes (handles Angular → HTML conversion)
     */
    private String buildAttributes(boolean keepNgIf) {
        StringBuilder attrBuilder = new StringBuilder();

        // 1) Plain HTML attributes
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                if (attr == null) continue;
                String a = attr.convertToHtml();
                if (a != null && !a.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(a.trim());
                }
            }
        }

        // 2) Hashes (#templateRefs) — skip Angular-only
        if (hashes != null) {
            for (Hash hash : hashes) {
                if (hash == null) continue;
                String name = hash.getHash();
                if (name != null && name.startsWith("#")) {
                    continue;
                }
                String h = hash.convertToHtml();
                if (h != null && !h.isEmpty()) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    attrBuilder.append(h.trim());
                }
            }
        }

        // 3) Bindings
        if (bindings != null) {
            for (Binding b : bindings) {
                if (b == null) continue;
                String binding = b.getBinding();
                String value   = b.getValue();
                if (binding == null) continue;

                binding = binding.trim();
                String cleanValue = (value == null) ? "" : value.replace("\"", "").trim();
                String lower = binding.toLowerCase();

                // ---- ngModel handling ----
                if (lower.contains("ngmodel")) {
                    String modelVar = cleanValue;
                    String elementId = findId();
                    if (elementId == null) {
                        elementId = modelVar + "-input";
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append("id=\"").append(elementId).append("\"");
                    }
                    ngModelBindings.add(new String[]{ modelVar, elementId });
                    continue; // don’t render ngModel in HTML
                }

                // ---- Skip ngIf unless explicitly asked ----
                if (!keepNgIf && ("*ngif".equals(lower) || "ngif".equals(lower))) {
                    continue;
                }

                // ---- Skip ngSubmit in HTML (JS will handle it) ----
                if ("(ngsubmit)".equals(lower)) {
                    continue;
                }

                // ---- Event binding: (click) → onclick ----
                if (binding.startsWith("(") && binding.endsWith(")")) {
                    String event = binding.substring(1, binding.length() - 1).trim();
                    if (!event.isEmpty()) {
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append("on").append(event)
                                .append("=\"").append(cleanValue).append("\"");
                    }
                    continue;
                }

                // ---- Property binding: [src] → src="..." ----
                if (binding.startsWith("[") && binding.endsWith("]")) {
                    String prop = binding.substring(1, binding.length() - 1).trim();
                    if (!prop.isEmpty()) {
                        if (attrBuilder.length() > 0) attrBuilder.append(" ");
                        attrBuilder.append(prop).append("=\"").append(cleanValue).append("\"");
                    }
                    continue;
                }

                // ---- Other bindings ----
                if (keepNgIf || (!binding.startsWith("*"))) {
                    if (attrBuilder.length() > 0) attrBuilder.append(" ");
                    if (!cleanValue.isEmpty()) {
                        attrBuilder.append(binding).append("=\"").append(cleanValue).append("\"");
                    } else {
                        attrBuilder.append(binding);
                    }
                }
            }
        }

        return attrBuilder.toString().trim();
    }

    /**
     * Generate JavaScript code for form submission
     */
    public String generateNgModelJs() {
        if (ngModelBindings.isEmpty()) return "const newProduct = {};\n";

        StringBuilder js = new StringBuilder();
        js.append("const newProduct = {\n");
        for (int i = 0; i < ngModelBindings.size(); i++) {
            String[] pair = ngModelBindings.get(i);
            String var = pair[0];
            String id = pair[1];
            js.append("  ").append(var)
                    .append(": document.getElementById(\"").append(id).append("\").value");
            if (i < ngModelBindings.size() - 1) js.append(",");
            js.append("\n");
        }
        js.append("};\n");
        return js.toString();
    }


    // ==== JS Conversion ====

    // Add this at the top of your HtmlElement class:
    private static final List<String> generatedRenderFunctions = new ArrayList<>();

    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();

        String elementId = findId();
        String varName = (elementId != null) ? sanitizeIdentifier(toCamelCase(elementId)) : null;

        if (elementId != null) {
            jsBuilder.append("const ").append(varName)
                    .append(" = document.getElementById(\"")
                    .append(escapeJsString(elementId)).append("\");\n");
        }

        // === Page togglers ===
        if (elementId != null && elementId.endsWith("-page")) {
            String baseName = toCamelCase(elementId.replace("-page", ""));
            String funcName = "show" + capitalize(baseName) + "Page";

            if (elementId.equals("home-page")) {
                jsBuilder.append("function ").append(funcName).append("() {\n")
                        .append("  homePage.style.display = \"flex\";\n")
                        .append("  addProductPage.style.display = \"none\";\n")
                        .append("  hideProductDetails();\n")
                        .append("  renderProductsList();\n")
                        .append("}\n\n");
            } else {
                jsBuilder.append("function ").append(funcName).append("() {\n")
                        .append("  homePage.style.display = \"none\";\n")
                        .append("  ").append(baseName).append("Page.style.display = \"flex\";\n")
                        .append("}\n\n");
            }
        }

        // === *ngFor → renderX() ===
        Directive ngForDir = findDirective("ngFor");
        if (ngForDir == null) ngForDir = findDirective("*ngFor");
        if (ngForDir != null) {
            NgForParts parts = parseNgFor(stripQuotes(ngForDir.getValue()));
            String itemVar = (parts.itemVar != null && !parts.itemVar.isEmpty()) ? parts.itemVar : "item";
            String listExpr = (parts.listExpr != null && !parts.listExpr.isEmpty()) ? parts.listExpr : "[]";

            String funcName = "render" + capitalize(varName != null ? varName : "List");
            String repeatTag = (tagName != null && !tagName.trim().isEmpty()) ? tagName.trim() : "div";

            String itemStyle = findAttributeValue("style");
            if (itemStyle == null) itemStyle = "";

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

            // ✅ Register this render function for later invocation
            generatedRenderFunctions.add(funcName);

            return jsBuilder.toString();
        }

        // === *ngIf ===
        Directive ngIfDir = findDirective("ngIf");
        if (ngIfDir == null) ngIfDir = findDirective("*ngIf");
        if (ngIfDir != null) {
            String param = stripQuotes(ngIfDir.getValue());

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
                    .append("(").append(param).append(") {\n")
                    .append("  ").append(varName).append(".style.display = \"flex\";\n")
                    .append("  ").append(varName).append(".innerHTML = `").append(inner.toString()).append("`;\n")
                    .append("}\n\n");
            jsBuilder.append("function ").append(hideFn).append("() {\n")
                    .append("  ").append(varName).append(".style.display = \"none\";\n")
                    .append("  ").append(varName).append(".innerHTML = \"\";\n")
                    .append("}\n\n");

            return jsBuilder.toString();
        }

        // === Special Case: (ngSubmit) on forms ===
        if ("form".equalsIgnoreCase(tagName)) {
            Binding ngSubmit = findBinding("(ngSubmit)");
            if (ngSubmit != null && elementId != null) {
                String varNameJs = sanitizeIdentifier(toCamelCase(elementId));
                jsBuilder.append(varNameJs)
                        .append(".addEventListener(\"submit\", (e) => {\n")
                        .append("  e.preventDefault();\n")
                        .append("  const newProduct = {};\n");

                // ✅ Recursive scan for all <input [(ngModel)]>
                List<HtmlElement> inputs = findAllInputsWithNgModel();
                for (HtmlElement inputEl : inputs) {
                    Binding model = inputEl.findBinding("[(ngModel)]");
                    if (model != null) {
                        String expr = stripQuotes(model.getValue()); // e.g. product.name
                        String idAttr = inputEl.findId();
                        if (idAttr == null) {
                            idAttr = inputEl.findAttributeValue("name");
                        }
                        if (idAttr != null && !expr.isEmpty()) {
                            String propName = expr.contains(".") ? expr.substring(expr.lastIndexOf('.') + 1) : expr;

                            String inputType = inputEl.findAttributeValue("type");
                            if ("number".equalsIgnoreCase(inputType)) {
                                jsBuilder.append("  newProduct.").append(propName)
                                        .append(" = parseFloat(document.getElementById(\"")
                                        .append(escapeJsString(idAttr)).append("\").value) || 0;\n");
                            } else if ("checkbox".equalsIgnoreCase(inputType)) {
                                jsBuilder.append("  newProduct.").append(propName)
                                        .append(" = document.getElementById(\"")
                                        .append(escapeJsString(idAttr)).append("\").checked;\n");
                            } else {
                                jsBuilder.append("  newProduct.").append(propName)
                                        .append(" = document.getElementById(\"")
                                        .append(escapeJsString(idAttr)).append("\").value;\n");
                            }
                        }
                    }
                }

                jsBuilder.append("  products.push(newProduct);\n")
                        .append("  showHomePage();\n")
                        .append("  ").append(varNameJs).append(".reset();\n")
                        .append("});\n\n");
            }
        }

        // === Recurse ===
        if (htmlContents != null && htmlContents.hasContent()) {
            for (Object child : htmlContents.getChildren()) {
                if (child instanceof HtmlElement) {
                    jsBuilder.append(((HtmlElement) child).convertToJs());
                }
            }
        }

        // === At root element: append initial render calls ===

        if (this.tagName == null
                || "html".equalsIgnoreCase(this.tagName)
                || "body".equalsIgnoreCase(this.tagName)
                || (this.findId() != null && this.findId().endsWith("-page"))) {

            for (String fn : generatedRenderFunctions) {
                jsBuilder.append("// Initial render\n").append(fn).append("();\n");
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

    // Remove an Angular directive by name (e.g. "ngSubmit")
    public void removeDirective(String name) {
        if (directives != null) {
            directives.removeIf(d -> d != null && name.equalsIgnoreCase(d.getNg()));
        }
    }

    // Remove Angular template refs like #form="ngForm"
    public void removeTemplateRef() {
        if (htmlAttributes != null) {
            htmlAttributes.removeIf(attr -> attr != null && attr.getName() != null &&
                    attr.getName().startsWith("#") &&
                    attr.getValue() != null &&
                    attr.getValue().toLowerCase().contains("ngform"));
        }
    }
    // === Utility: Find binding by its Angular-style name (like "(ngSubmit)") ===
    public Binding findBinding(String name) {
        if (bindings == null || name == null) return null;
        for (Binding b : bindings) {
            if (b.getBinding() == null) continue;
            String candidate = b.getBinding().trim();

            // Normalize both sides: strip parentheses if present
            String normCandidate = candidate.replaceAll("[()]", "");
            String normName = name.replaceAll("[()]", "");

            if (candidate.equalsIgnoreCase(name) || normCandidate.equalsIgnoreCase(normName)) {
                return b;
            }
        }
        return null;
    }
    /**
     * Recursively find all input/select/textarea elements that have [(ngModel)] binding.
     */
    public List<HtmlElement> findAllInputsWithNgModel() {
        List<HtmlElement> results = new ArrayList<>();

        if (this.tagName != null) {
            String tn = this.tagName.toLowerCase();
            if ("input".equals(tn) || "select".equals(tn) || "textarea".equals(tn)) {
                Binding model = findBinding("[(ngModel)]");
                if (model != null) {
                    results.add(this);
                }
            }
        }

        if (htmlContents != null && htmlContents.hasContent()) {
            for (Object child : htmlContents.getChildren()) {
                if (child instanceof HtmlElement) {
                    results.addAll(((HtmlElement) child).findAllInputsWithNgModel());
                }
            }
        }

        return results;
    }



}