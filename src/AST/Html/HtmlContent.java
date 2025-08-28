package AST.Html;

import java.util.ArrayList;
import java.util.List;

public class HtmlContent {
    private List<Object> children; // HtmlElement or HtmlChardata

    public HtmlContent() {
        this.children = new ArrayList<>();
    }

    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "HtmlContent{" +
                "children=" + children +
                '}';
    }

    public String convertToHtml() {
        StringBuilder sb = new StringBuilder();
        for (Object child : children) {
            if (child instanceof HtmlChardata) {
                sb.append(((HtmlChardata) child).convertToHtml());
            } else if (child instanceof HtmlElement) {
                sb.append(((HtmlElement) child).convertToHtml());
            }
        }
        return sb.toString();
    }


    public boolean hasContent() {
        if (children == null || children.isEmpty()) return false;
        for (Object child : children) {
            if (child instanceof HtmlChardata && ((HtmlChardata) child).hasContent()) {
                return true;
            }
            if (child instanceof HtmlElement) {
                return true;
            }
        }
        return false;
    }
}
