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
            return objects.toString(); // print list of MyObject
        } else {
            return values.toString(); // simple primitive values
        }
    }

}
