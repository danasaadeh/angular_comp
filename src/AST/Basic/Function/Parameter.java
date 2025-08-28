package AST.Basic.Function;

public class Parameter  {

    public String type ;
    public String name ;

    public Parameter()
    {
        this.name = name ;
        this.type = type ;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\t name='" + name + '\'' +
                        "\n \t\t\t\t\t\t\t type='" + type + '\'' ;
    }
    public String print() {
        return "\n Parameter{" +
                "\n name='" + name + '\'' +
                ",\n type='" + type + '\'' +
                '}';
    }
    public String convertToJs() {
        return name;
    }
}
