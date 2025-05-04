package AST.Angular.Component;

import java.util.List;

public class Template_Url {
    private List<String> templateUrl;


    public Template_Url(List<String> templateUrl) {
        this.templateUrl = templateUrl;
    }




    @Override
    public String toString() {
        return "Tempalate URL: " + String.join(", ", templateUrl);
    }

    public List<String> getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(List<String> templateUrl) {
        this.templateUrl = templateUrl;
    }
}
