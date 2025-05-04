//package AST.Html;
//
//import java.util.ArrayList;
//import java.util.List;
//
////
//public class HtmlBody {
////    private String innerContent;
////
////    public String getInnerContent() {
////        return innerContent;
////    }
////
////    public void setInnerContent(String innerContent) {
////        this.innerContent = innerContent;
////    }
////
////    @Override
////    public String toString() {
////        return "HtmlBody{" +
////                "innerContent='" + innerContent + '\'' +
////                '}';
////    }
////}
//private List<HtmlAttribute> htmlAttributes;
//private  List<Directive> directives;
//private  List<Binding> bindings;
//private  List<HtmlContent> htmlContents;
//
//
//    public HtmlBody() {
//        this.bindings       = new ArrayList<>();
//        this.directives     = new ArrayList<>();
//        this.htmlAttributes = new ArrayList<>();
//        this.htmlContents   = new ArrayList<>();
//    }
//
//    public List<Binding> getBindings() {
//        return bindings;
//    }
//
//    public void setBindings(List<Binding> bindings) {
//        this.bindings = bindings;
//    }
//
//    public List<Directive> getDirectives() {
//        return directives;
//    }
//
//    public void setDirectives(List<Directive> directives) {
//        this.directives = directives;
//    }
//
//    public List<HtmlAttribute> getHtmlAttributes() {
//        return htmlAttributes;
//    }
//
//    public void setHtmlAttributes(List<HtmlAttribute> htmlAttributes) {
//        this.htmlAttributes = htmlAttributes;
//    }
//
//    public List<HtmlContent> getHtmlContents() {
//        return htmlContents;
//    }
//
//    public void setHtmlContents(List<HtmlContent> htmlContents) {
//        this.htmlContents = htmlContents;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("HtmlBody {");
//
//        if (bindings != null && !bindings.isEmpty()) {
//            sb.append(" bindings=").append(bindings);
//        }
//        if (directives != null && !directives.isEmpty()) {
//            sb.append(" directives=").append(directives);
//        }
//        if (htmlAttributes != null && !htmlAttributes.isEmpty()) {
//            sb.append(" htmlAttributes=").append(htmlAttributes);
//        }
//        if (htmlContents != null && !htmlContents.isEmpty()) {
//            sb.append(" htmlContents=").append(htmlContents);
//        }
//
//        sb.append(" }");
//        return sb.toString();
//    }
//}