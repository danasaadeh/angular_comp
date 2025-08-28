package AST;

import AST.Basic.*;
import AST.Basic.Class.ClassDecl;
import AST.Basic.Constructor.Constructor;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Function.Return;
import AST.Basic.If.IfStatement;
import AST.Basic.Interface.Interface;
import AST.Basic.Loop.Exp.Expression;
import AST.Basic.Loop.ForLoop;
import AST.Basic.Loop.While;
import AST.Basic.This.Expr.Array;


import java.util.ArrayList;
import java.util.List;

public class Statements  extends Instruction{
    private String type;
    private List<ClassDecl> classDecls;
    private List<Interface> interfaces;
    private List<ThisExpression> thisExpressions;
    private List<SuperExp> superExpressions;
    private List<FuncDecl> funcDecls;
    private List<Init> inits;
    private  List<InitArray> initArrays;
    private List<Declaration> declarations;
    private List<ForLoop> forLoops;
    private List<Print> printStatements;
    private List<IfStatement> ifStatements;
//    private List<Return> returns;
    private List<Assign> assigns;
    private List<Constructor> cons;
    private List<While> whiles;
    private  List<Expression> exps;
    private List<Instance> inst;
    private  List<ReadOnly> reads;
    private List<Array> arrays; // list of arrays


    public Statements() {
        this.exps=new ArrayList<>();
        this.classDecls = new ArrayList<>();
        this.interfaces= new ArrayList<>();
        this.declarations = new ArrayList<>();
        this.funcDecls = new ArrayList<>();
        this.cons= new ArrayList<>();
        this.initArrays = new ArrayList<>();
        this.inits = new ArrayList<>();
        this.assigns=new ArrayList<>();
        this.thisExpressions=new ArrayList<>();
        this.superExpressions=new ArrayList<>();
        this.forLoops=new ArrayList<>();
        this.printStatements = new ArrayList<>();
        this.ifStatements = new ArrayList<>();
        this.whiles=new ArrayList<>();
//        this.returns=new ArrayList<>();
        this.inst=new ArrayList<>();
        this.reads=new ArrayList<>();
        this.type = null;
        this.arrays = new ArrayList<>();

    }

    public List<ClassDecl> getClassDecls() {
        return classDecls;
    }

    public void setClassDecls(List<ClassDecl> classDecls) {
        this.classDecls = classDecls;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    public List<FuncDecl> getFuncDecls() {
        return funcDecls;
    }

    public void setFuncDecls(List<FuncDecl> funcDecls) {
        this.funcDecls = funcDecls;
    }

    public List<InitArray> getInitArrays() {
        return initArrays;
    }

    public void setInitArrays(List<InitArray> initArrays) {
        this.initArrays = initArrays;
    }

    public List<Init> getInits() {
        return inits;
    }

    public void setInits(List<Init> inits) {
        this.inits = inits;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (forLoops != null && !forLoops.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tdeclarations=").append(forLoops);
        }
        if (classDecls != null && !classDecls.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tclassDecls=").append(classDecls);
        }
        if (interfaces != null && !interfaces.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tInterface=").append(interfaces);
        }
        if (superExpressions != null && !superExpressions.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tsuper=").append(superExpressions);
        }
        if (funcDecls != null && !funcDecls.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tfuncDecls=").append(funcDecls);
        }
        if (cons != null && !cons.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tConsructor=").append(cons);
        }
        if (inits != null && !inits.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tinits=").append(inits);
        }
        if (initArrays != null && !initArrays.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\tinitArrays=").append(initArrays);
        }
        if (declarations != null && !declarations.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t declarations=").append(declarations);
        }
        if (assigns != null && !assigns.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t assign=").append(assigns);
        }
        if (thisExpressions != null && !thisExpressions.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t this=").append(thisExpressions);
        }
        if (forLoops != null && !forLoops.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t for=").append(forLoops);
        }
        if (ifStatements != null && !ifStatements.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t if=").append(ifStatements);
        }
        if (whiles != null && !whiles.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t while=").append(whiles);
        }
//        if (returns != null && !returns.isEmpty()) {
//            sb.append("\n \t\t\t\t\t\t\t if=").append(returns);
//        }
        if (exps != null && !exps.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t expressions=").append(exps);
        }
        if (printStatements != null && !printStatements.isEmpty()) {
            sb.append("\n \t\t\t\t\t\t\t print=").append(printStatements);
        }
        if (!arrays.isEmpty()) {sb.append("\n  arrays=").append(arrays);}


        return sb.toString();
    }



    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Statements {");
        if (forLoops != null && !forLoops.isEmpty()) {
            sb.append("\n declarations=").append(forLoops);
        }
        if (classDecls != null && !classDecls.isEmpty()) {
            sb.append("\n classDecls=").append(classDecls);
        }
        if (funcDecls != null && !funcDecls.isEmpty()) {
            sb.append("\n funcDecls=").append(funcDecls);
        }
        if (inits != null && !inits.isEmpty()) {
            sb.append("\n inits=").append(inits);
        }
        if (initArrays != null && !initArrays.isEmpty()) {
            sb.append("\n initArrays=").append(initArrays);
        }
        if (declarations != null && !declarations.isEmpty()) {
            sb.append("\n declarations=").append(declarations);
        }
        if (thisExpressions != null && !thisExpressions.isEmpty()) {
            sb.append("\n this=").append(thisExpressions);
        }
        if (superExpressions != null && !superExpressions.isEmpty()) {
            sb.append("\n super=").append(superExpressions);
        }
        if (forLoops != null && !forLoops.isEmpty()) {
            sb.append("for=").append(forLoops);
        }
        if (ifStatements != null && !ifStatements.isEmpty()) {
            sb.append(" if=").append(ifStatements);
        }
        if (printStatements != null && !printStatements.isEmpty()) {
            sb.append(" print=").append(printStatements);
        }
        if (reads != null && !reads.isEmpty()) {
            sb.append(" read_only=").append(reads);
        }
        if (inst != null && !inst.isEmpty()) {
            sb.append("instance=").append(inst);
        }
        sb.append(" }");
        return sb.toString();
    }

    public String convertToJs() {
        StringBuilder jsBuilder = new StringBuilder();
//        jsBuilder.append("// Generated JavaScript\n");

        // Classes
        for (ClassDecl classDecl : classDecls) {
            jsBuilder.append(classDecl.convertToJs()).append("\n");
        }

        // Interfaces
        for (Interface inter : interfaces) {
            jsBuilder.append(inter.convertToJs()).append("\n");
        }

        // Constructors
        for (Constructor constructor : cons) {
            jsBuilder.append(constructor.convertToJs()).append("\n");
        }

        // Functions
        for (FuncDecl func : funcDecls) {
            jsBuilder.append(func.convertToJs()).append("\n");
        }

        for (Declaration decl : declarations) {
            jsBuilder.append("let ").append(decl.convertToJs()).append(";\n");
        }

        // Initializations
        for (Init init : inits) {
            jsBuilder.append(init.convertToJs()).append("\n");
        }

        // Array initializations
        for (InitArray initArray : initArrays) {
            jsBuilder.append(initArray.convertToJs()).append("\n");
        }

        // Assignments
        for (Assign assign : assigns) {
            jsBuilder.append(assign.convertToJs()).append("\n");
        }

        // Expressions
        for (Expression exp : exps) {
            jsBuilder.append(exp.convertToJs()).append("\n");
        }

        // This keyword usage
        for (ThisExpression thisExp : thisExpressions) {
            jsBuilder.append(thisExp.convertToJs()).append("\n");
        }

        // Super keyword usage
        for (SuperExp superExp : superExpressions) {
            jsBuilder.append(superExp.convertToJs()).append("\n");
        }

        // Control structures
        for (IfStatement ifStatement : ifStatements) {
            jsBuilder.append(ifStatement.convertToJs()).append("\n");
        }
        for (While whileStatement : whiles) {
            jsBuilder.append(whileStatement.convertToJs()).append("\n");
        }
        for (ForLoop forLoop : forLoops) {
            jsBuilder.append(forLoop.convertToJs()).append("\n");
        }

//        // Return statements
//        for (Return returnStmt : returns) {
//            jsBuilder.append(returnStmt.convertToJs()).append("\n");
//        }

        // Print statements
        for (Print printStatement : printStatements) {
            jsBuilder.append(printStatement.convertToJs()).append("\n");
        }

        // Read-only expressions/statements
        for (ReadOnly read : reads) {
            jsBuilder.append(read.convertToJs()).append("\n");
        }


        for (Instance instance : inst) {
            jsBuilder.append(instance.convertToJs()).append("\n");
        }
        arrays.forEach(a -> jsBuilder.append(a.convertToJs()).append(";\n"));

        return jsBuilder.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ThisExpression> getThisExpressions() {
        return thisExpressions;
    }

    public void setThisExpressions(List<ThisExpression> thisExpressions) {
        this.thisExpressions = thisExpressions;
    }

    public List<ForLoop> getForLoops() {
        return forLoops;
    }

    public void setForLoops(List<ForLoop> forLoops) {
        this.forLoops = forLoops;
    }

    public List<IfStatement> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<IfStatement> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Print> getPrintStatements() {
        return printStatements;
    }

    public void setPrintStatements(List<Print> printStatements) {
        this.printStatements = printStatements;
    }

//    public List<Return> getReturns() {
//        return returns;
//    }
//
//    public void setReturns(List<Return> returns) {
//        this.returns = returns;
//    }

    public List<Constructor> getCons() {
        return cons;
    }

    public void setCons(List<Constructor> cons) {
        this.cons = cons;
    }

    public List<Interface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<Interface> interfaces) {
        this.interfaces = interfaces;
    }

    public List<SuperExp> getSuperExpressions() {
        return superExpressions;
    }

    public void setSuperExpressions(List<SuperExp> superExpressions) {
        this.superExpressions = superExpressions;
    }


    public List<Assign> getAssigns() {
        return assigns;
    }

    public void setAssigns(List<Assign> assigns) {
        this.assigns = assigns;
    }

    public List<While> getWhiles() {
        return whiles;
    }

    public void setWhiles(List<While> whiles) {
        this.whiles = whiles;
    }

    public List<Expression> getExps() {
        return exps;
    }

    public void setExps(List<Expression> exps) {
        this.exps = exps;
    }

    public List<Instance> getInst() {
        return inst;
    }

    public void setInst(List<Instance> inst) {
        this.inst = inst;
    }

    public List<ReadOnly> getReads() {
        return reads;
    }

    public void setReads(List<ReadOnly> reads) {
        this.reads = reads;
    }
    public List<AST.Basic.This.Expr.Array> getArrays() { return arrays; }
    public void setArrays(List<Array> arrays) { this.arrays = arrays; }
    public void addArray(Array array) { this.arrays.add(array); }

}
