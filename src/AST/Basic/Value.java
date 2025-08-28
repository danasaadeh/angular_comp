package AST.Basic;

import AST.Statements;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class Value extends Statements {
    private List<String> values;
    private List <MyObject> objects;

    public Value() {
        this.objects = new ArrayList<>();
        this.values = new ArrayList<>();
    }


    public List<MyObject> getObjects() {
        return objects;
    }

    public void setObjects(List<MyObject> objects) {
        this.objects = objects;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        if (!objects.isEmpty()) {
            return objects.toString();
        } else {
            return values.toString();
        }
    }
    public String convertToJs() {
        StringBuilder js = new StringBuilder();


        if (!objects.isEmpty()) {
            js.append("{ ");
            for (int i = 0; i < objects.size(); i++) {
                MyObject obj = objects.get(i);

                js.append(obj.convertToJs());
                if (i < objects.size() - 1) js.append(", ");
            }
            js.append(" }");
        }

        else if (!values.isEmpty()) {
            if (values.size() == 1) {
                js.append(values.get(0));
            } else {
                js.append("[");
                for (int i = 0; i < values.size(); i++) {
                    js.append(values.get(i));
                    if (i < values.size() - 1) js.append(", ");
                }
                js.append("]");
            }
        }

        else {
            js.append("undefined");
        }

        return js.toString();
    }

}
