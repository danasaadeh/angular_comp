package AST.Basic.Class;


import AST.Basic.Declaration;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Init;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class ClassDecl extends Statements {

    public String class_name ;
    public ClassBody body;

    public ClassDecl()
    {
        this.class_name = "" ;
        this.body=new ClassBody();
    }


    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }


    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\tbody=" + body +
                        "\n \t\t\t\t\t\t\tclass_name='" + class_name + '\'' ;
    }
    public String print() {
        return "\n ClassDecl{" +
                "body=" + body +
                ", class_name='" + class_name + '\'' +
                '}';
    }

    public ClassBody getBody() {
        return body;
    }

    public void setBody(ClassBody body) {
        this.body = body;
    }

    public String convertToJs() {
        StringBuilder js = new StringBuilder();
        js.append("class ").append(class_name).append(" {\n");
        if (body != null) {
            js.append(body.convertToJs());
        }
        js.append("}\n");
        return js.toString();
    }
}
