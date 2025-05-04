package AST.Basic;

import java.util.ArrayList;
import java.util.List;

public class Value {
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
        return "\n \t\t\t\t\t\t\tValue{" +
                "\n \t\t\t\t\t\t\tobjects=" + objects +
                "\n \t\t\t\t\t\t\t values=" + values +
                '}';
    }
}
