package AST.Angular.Component;

public class ComponentBody {
    private Selector selector;
    private Template template;
    private Imports imports;
    private Style_Urls style_Urls;
    private Template_Url templateUrl;

    public ComponentBody(Selector selector, Template template, Imports imports, Style_Urls style_Urls, Template_Url templateUrl) {
        this.selector = selector;
        this.template = template;
        this.imports = imports;
        this.style_Urls = style_Urls;
        this.templateUrl = templateUrl;
    }

    public Selector getSelector() {
        return selector;
    }

    public Template getTemplate() {
        return template;
    }

    public Imports getImports() {
        return imports;
    }

    public Style_Urls getStyleUrls() {
        return style_Urls;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public void setImports(Imports imports) {
        this.imports = imports;
    }

    public void setStyleUrls(Style_Urls style_Urls) {
        this.style_Urls = style_Urls;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Component:");
        sb.append("  ").append(selector != null ? selector.toString() : "No selector").append("\n");

        if (template != null) {
            sb.append("  ").append(template.toString()).append("\n");
        }

        if (imports != null) {
            sb.append("  ").append(imports).append("\n");
        }

        if (style_Urls != null) {
            sb.append("  ").append(style_Urls).append("\n");
        }

        if (templateUrl != null) {
            sb.append("  ").append(templateUrl).append("\n");
        }

        return sb.toString();
    }

    public String print() {
        StringBuilder sb = new StringBuilder("Component:\n");
        sb.append("  ").append(selector != null ? selector.toString() : "No selector").append("\n");
        sb.append("  ").append(template != null ? template.toString() : "No template").append("\n");

        if (imports != null) {
            sb.append("  ").append(imports).append("\n");
        }

        if (style_Urls != null) {
            sb.append("  ").append(style_Urls).append("\n");
        }

        return sb.toString();
    }

    public Style_Urls getStyle_Urls() {
        return style_Urls;
    }

    public void setStyle_Urls(Style_Urls style_Urls) {
        this.style_Urls = style_Urls;
    }

    public Template_Url getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(Template_Url templateUrl) {
        this.templateUrl = templateUrl;
    }
}