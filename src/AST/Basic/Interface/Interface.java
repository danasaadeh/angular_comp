package AST.Basic.Interface;


import AST.Basic.Declaration;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Init;

import java.util.ArrayList;
import java.util.List;

public class Interface  {

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
}
