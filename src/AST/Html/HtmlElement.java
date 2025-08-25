package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private String tagName;
    private List<HtmlAttribute> htmlAttributes;
    private Directive directives;
    private Binding bindings;
    private HtmlContent htmlContents;
    private  Hash hash;

    public HtmlElement() {
        this.bindings = new Binding();
        this.directives = new Directive();
        this.htmlAttributes = new ArrayList<>();
        this.htmlContents = new HtmlContent();
        this.hash=new Hash();
        this.tagName = "";
    }


    public Binding getBindings() {
        return bindings;
    }

    public void setBindings(Binding bindings) {
        this.bindings = bindings;
    }

    public Directive getDirectives() {
        return directives;
    }

    public void setDirectives(Directive directives) {
        this.directives = directives;
    }

    public List<HtmlAttribute> getHtmlAttributes() {
        return htmlAttributes;
    }

    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
        this.htmlAttributes = htmlAttributes;
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

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\t bindings=" + bindings +
                "\n \t\t\t\t\t\t\t tagName='" + tagName + '\'' +
                "\n \t\t\t\t\t\t\t htmlAttributes=" + htmlAttributes +
                " \n \t\t\t\t\t\t\t directives=" + directives +
                ",\n hash=" + hash +
                "\n \t\t\t\t\t\t\t htmlContents=" + htmlContents
                ;
    }
    public String print() {
        return "\n HtmlElement{" +
                "\n bindings=" + bindings +
                ", tagName='" + tagName + '\'' +
                ",\n htmlAttributes=" + htmlAttributes +
                ",\n directives=" + directives +
                ",\n hash=" + hash +
                ",\n htmlContents=" + htmlContents +
                '}';
    }

    public Hash getHash() {
        return hash;
    }

    public void setHash(Hash hash) {
        this.hash = hash;
    }

    public String convertToHtml() {
        StringBuilder htmlBuilder = new StringBuilder();
        
        // Start tag
        String tag = (tagName != null && !tagName.isEmpty()) ? tagName : "div";
        htmlBuilder.append("<").append(tag);
        
        // Add HTML attributes
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                if (attr != null) {
                    String attrHtml = attr.convertToHtml();
                    if (!attrHtml.isEmpty()) {
                        htmlBuilder.append(attrHtml);
                    }
                }
            }
        }
        
        // Add bindings (Angular property bindings)
        if (bindings != null) {
            String bindingHtml = bindings.convertToHtml();
            if (!bindingHtml.isEmpty()) {
                htmlBuilder.append(bindingHtml);
            }
        }
        
        // Add directives (Angular structural directives)
        if (directives != null) {
            String directiveHtml = directives.convertToHtml();
            if (!directiveHtml.isEmpty()) {
                htmlBuilder.append(directiveHtml);
            }
        }
        
        // Add hash (Angular event bindings)
        if (hash != null) {
            String hashHtml = hash.convertToHtml();
            if (!hashHtml.isEmpty()) {
                htmlBuilder.append(hashHtml);
            }
        }
        
        // Check if this is a self-closing tag or has content
        boolean hasContent = false;
        if (htmlContents != null) {
            hasContent = htmlContents.hasContent();
        }
        
        // Don't render empty divs unless they have attributes
        boolean hasAttributes = hasAttributes();
        
        if (isSelfClosingTag(tag) || (!hasContent && !hasAttributes)) {
            htmlBuilder.append(" />");
        } else {
            htmlBuilder.append(">");
            
            // Add content
            if (htmlContents != null) {
                htmlBuilder.append(htmlContents.convertToHtml());
            }
            
            // Close tag
            htmlBuilder.append("</").append(tag).append(">");
        }
        
        return htmlBuilder.toString();
    }
    
    private boolean hasAttributes() {
        // Check if element has any meaningful attributes
        if (htmlAttributes != null) {
            for (HtmlAttribute attr : htmlAttributes) {
                if (attr != null && attr.getTagName() != null && !attr.getTagName().isEmpty()) {
                    return true;
                }
            }
        }
        
        if (bindings != null && bindings.getBinding() != null && !bindings.getBinding().isEmpty()) {
            return true;
        }
        
        if (directives != null && directives.getNg() != null && !directives.getNg().isEmpty()) {
            return true;
        }
        
        if (hash != null && hash.getHash() != null && !hash.getHash().isEmpty()) {
            return true;
        }
        
        return false;
    }
    
    private boolean isSelfClosingTag(String tag) {
        String[] selfClosingTags = {"input", "img", "br", "hr", "meta", "link"};
        for (String selfClosingTag : selfClosingTags) {
            if (selfClosingTag.equalsIgnoreCase(tag)) {
                return true;
            }
        }
        return false;
    }
}