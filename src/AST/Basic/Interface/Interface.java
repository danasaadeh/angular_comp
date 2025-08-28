package AST.Basic.Interface;


import AST.Basic.Declaration;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Init;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class Interface extends Statements {

    public String interface_name ;
    public List<Declaration> body;

    public Interface()
    {
        this.interface_name = "" ;
        this.body=new ArrayList<>();
    }



    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\tbody=" + body +
                        "\n \t\t\t\t\t\t\t interface_name='" + interface_name + '\'' ;
    }
    public String print() {
        return "\n ClassDecl{" +
                "body=" + body +
                ", class_name='" + interface_name + '\'' +
                '}';
    }

    public List<Declaration> getBody() {
        return body;
    }

    public void setBody(List<Declaration> body) {
        this.body = body;
    }

    public String getInterface_name() {
        return interface_name;
    }

    public void setInterface_name(String interface_name) {
        this.interface_name = interface_name;
    }
    public String convertToJs() {
        StringBuilder js = new StringBuilder();

        js.append("const ").append(interface_name).append(" = {\n");

        for (Declaration decl : body) {

            js.append("  ").append(decl.getId()).append(": function() {},\n");
        }

        js.append("};\n");

        return js.toString();
    }
}
