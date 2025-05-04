package AST.Basic.Class;


import AST.Basic.Declaration;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Init;

import java.util.ArrayList;
import java.util.List;

public class ClassDecl  {

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
}
