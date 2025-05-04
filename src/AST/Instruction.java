package AST;

import AST.Angular.Component.Component;
import AST.Angular.Service.Inject;
import AST.Basic.*;
import AST.Basic.Class.ClassDecl;
import AST.Basic.Function.FuncDecl;
import AST.Html.HtmlElements;

import java.util.ArrayList;
import java.util.List;

public class Instruction extends Program{
    private List<ImportState> importStates;
    private List<Statements> statements;
    private List<Component> components;
    private List<Inject> injects;

    private String type;

    public Instruction(List<Component> components, List<ImportState> importStates, List<Inject> injects, List<Statements> statements) {
        this.components = components;
        this.importStates = importStates;
        this.injects = injects;
        this.statements = statements;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        if (statements != null && !statements.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tclassDecls=").append(statements);
        }
        if (importStates != null && !importStates.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\timportStates=").append(importStates);
        }


        if (components != null && !components.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tcomponents=").append(components);
        }
        if (injects != null && !injects.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tinjects=").append(injects);
        }



        return sb.toString();
    }


    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Instruction {");

        if (statements != null && !statements.isEmpty()) {
            sb.append("\n classDecls=").append(statements);
        }
        if (importStates != null && !importStates.isEmpty()) {
            sb.append("\n importStates=").append(importStates);
        }


        if (components != null && !components.isEmpty()) {
            sb.append("\n components=").append(components);
        }
        if (injects != null && !injects.isEmpty()) {
            sb.append("\n injects=").append(injects);
        }


        sb.append(" }");
        return sb.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }



    public List<ImportState> getImportStates() {
        return importStates;
    }

    public void setImportStates(List<ImportState> importStates) {
        this.importStates = importStates;
    }

    public List<Inject> getInjects() {
        return injects;
    }

    public void setInjects(List<Inject> injects) {
        this.injects = injects;
    }

    public List<Statements> getStatements() {
        return statements;
    }

    public void setStatements(List<Statements> statements) {
        this.statements = statements;
    }
}
