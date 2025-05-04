package AST.Basic;

import java.util.List;

public class MyObject {

    private List<ObjectProperty> properties;

    public MyObject(List<ObjectProperty> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "\n \t\t\t\t\t\t\t Object{" +
                "\n \t\t\t\t\t\t\t properties=" + properties +
                '}';
    }
    public String print() {
        return "\n Object{" +
                "\n properties=" + properties +
                '}';
    }

    public List<ObjectProperty> getProperties() {
        return properties;
    }

    public void setProperties(List<ObjectProperty> properties) {
        this.properties = properties;
    }
}