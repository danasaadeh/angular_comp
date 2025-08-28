package AST.Basic.Function;

import AST.Basic.MyObject;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class Return  extends Statements{
    private String id;
    private String value;
    private String sentence;
    private List<MyObject> values;
    private  List<Statements> statements;
    public Return() {
        this.id = null;
        this.statements=new ArrayList<>();
        this.value = null;
        this.sentence = null;
        this.values = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t id=" + id + '\'' +
                        "\n \t\t\t\t\t\t\t value='" + value + '\'' +
                        "\n \t\t\t\t\t\t\t sentence='" + sentence + '\''+
                        "\n \t\t\t\t\t\t\t sentence='" + statements + '\''+
                        "\n \t\t\t\t\t\t\t object='" + values + '\''
                ;
    }
    public String print() {
        return "\n Return{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                "  objects='" + sentence + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public List<MyObject> getValues() {
        return values;
    }

    public void setValues(List<MyObject> values) {
        this.values = values;
    }

    public List<Statements> getStatements() {
        return statements;
    }

    public void setStatements(List<Statements> statements) {
        this.statements = statements;
    }

    public String convertToJs() {
        StringBuilder js = new StringBuilder();

        // If there is a simple value
        if (value != null && !value.isEmpty()) {
            js.append("return ").append(value).append(";");
        }
        // If the return has an expression sentence
        else if (sentence != null && !sentence.isEmpty()) {
            js.append("return ").append(sentence).append(";");
        }
        // If the return has nested statements
        else if (statements != null && !statements.isEmpty()) {
            js.append("return { ");
            for (int i = 0; i < statements.size(); i++) {
                Statements stmt = statements.get(i);
                if (stmt instanceof Return) {
                    js.append(((Return) stmt).convertToJs());
                } else {
                    // fallback: assume other statements implement convertToJs()
                    js.append(stmt.convertToJs());
                }
                if (i < statements.size() - 1) js.append(", ");
            }
            js.append(" };");
        }
        // Fallback empty return
        else {
            js.append("return;");
        }

        return js.toString();
    }
}
