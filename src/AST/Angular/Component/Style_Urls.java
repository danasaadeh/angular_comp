package AST.Angular.Component;

import java.util.List;

public class Style_Urls {
    private List<String> styleUrls;


    public Style_Urls(List<String> styleUrls) {
        this.styleUrls = styleUrls;
    }


    public List<String> getStyleUrls() {
        return styleUrls;
    }

    public void setStyleUrls(List<String> styleUrls) {
        this.styleUrls = styleUrls;
    }

    @Override
    public String toString() {
        return "Style URLs: " + String.join(", ", styleUrls);
    }
}
