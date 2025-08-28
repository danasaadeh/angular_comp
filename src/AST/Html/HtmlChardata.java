package AST.Html;

public class HtmlChardata {
    private String htmlText;
    private String inter;   // interpolation {{...}}
    private int order;

    public HtmlChardata() {
        this.htmlText = "";
        this.inter = "";
        this.order = -1;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean hasContent() {
        return (htmlText != null && !htmlText.trim().isEmpty())
                || (inter != null && !inter.trim().isEmpty());
    }

    public String convertToHtml() {
        StringBuilder sb = new StringBuilder();
        if (htmlText != null && !htmlText.isEmpty()) {
            sb.append(htmlText);  // keep spaces and formatting
        }
        if (inter != null && !inter.isEmpty()) {
            sb.append(inter);
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return "HtmlChardata{" +
                "htmlText='" + htmlText + '\'' +
                ", inter='" + inter + '\'' +
                ", order=" + order +
                '}';
    }
}
