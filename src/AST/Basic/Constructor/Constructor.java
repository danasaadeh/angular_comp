package AST.Basic.Constructor;


import AST.Basic.Declaration;
import AST.Basic.Function.FuncBody;
import AST.Basic.Function.Parameter;
import AST.Statements;

import java.util.ArrayList;
import java.util.List;

public class Constructor extends  Statements {
    public String return_type ;
    public String name  ;
    public List <FuncBody> functionBodies;
    public List<Parameter> parameters ;


    //it will be null in case of void return
    //  public ReturnObject return_object ;


    public Constructor() {

        this.name = name;
        this.parameters = new ArrayList<>();
        this.return_type = return_type;
        this.functionBodies=new ArrayList<>();
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    public String getReturn_type() {
        return return_type;
    }

    public void setReturn_type(String return_type) {
        this.return_type = return_type;
    }



    public List<FuncBody> getFunctionBodies() {
        return functionBodies;
    }

    public void setFunctionBodies(List<FuncBody> functionBodies) {
        this.functionBodies = functionBodies;
    }

    @Override
    public String toString() {
        return
                "\n \t\t\t\t\t\t\tConstructorBodies=" + functionBodies +
                        "\n \t\t\t\t\t\t\treturn_type='" + return_type + '\'' +
                        "\n \t\t\t\t\t\t\tname='" + name + '\'' +
                        "\n \t\t\t\t\t\t\tparameters=" + parameters ;
    }
    public String print() {
        return "\n Constructor{" +
                "\n ConstructorBodies=" + functionBodies +
                ",\n return_type='" + return_type + '\'' +
                ",\n name='" + name + '\'' +
                ",\n parameters=" + parameters +
                '}';
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }
}


