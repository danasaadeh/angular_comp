package Visitors;

import AST.Angular.Component.*;
import AST.Angular.Service.Inject;
import AST.Angular.Service.ProvidedIn;
import AST.Basic.*;
import AST.Basic.Class.ClassBody;
import AST.Basic.Class.ClassDecl;
import AST.Basic.Constructor.Constructor;
import AST.Basic.Function.FuncBody;
import AST.Basic.Function.FuncDecl;
import AST.Basic.Function.Parameter;
import AST.Basic.Function.Return;
import AST.Basic.If.ElseIfStatement;
import AST.Basic.If.ElseStatement;
import AST.Basic.If.IfStatement;
import AST.Basic.Interface.Interface;
import AST.Basic.Loop.Exp.*;
import AST.Basic.Loop.Exp.Condition.BinaryCondition;
import AST.Basic.Loop.Exp.Condition.Condition;
import AST.Basic.Loop.Exp.Condition.IdentifierCondition;
import AST.Basic.Loop.Exp.Condition.ValueCondition;
import AST.Basic.Loop.ForLoop;

import AST.Basic.Loop.While;
import AST.Basic.This.Expr.*;
import AST.Html.*;
import AST.Instruction;
import AST.Program;

import AST.Statements;
import Symbol_table.Row;
import Symbol_table.SymbolTable;
import antlr.ParserFile;
import antlr.ParserFileBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import semantic.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class AngularVisitor extends ParserFileBaseVisitor<Object> {


    public SymbolTable st = new SymbolTable();
    private Set<String> selectorSet = new HashSet<>();
    private List<SemanticError> semanticErrors = new ArrayList<>();

    public List<SemanticError> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    public Program visitProgram(ParserFile.ProgramContext ctx) {
        st.enterScope("global");
        Program program = new Instruction(); // Use interface type, concrete class instantiation
        for (int i = 0; i < ctx.instruction().size(); i++) {
            if (ctx.instruction(i) != null)
                program.setInstructions_list((Instruction) visit(ctx.instruction(i)));
        }
        st.exitScope();
        return program;
    }

//    @Override
//    public Program visitProgram(ParserFile.ProgramContext ctx) {
//        st.enterScope("global");
//        Program program = new Program();
//        for (int i=ctx.instruction().size(); i<ctx.instruction().size(); i++) {
//            if (ctx.instruction(i)!=null)
//                program.setInstructions_list((Instruction) visit(ctx.instruction(i)));
//        }
//        // this.st.print();
//        st.exitScope();
//        return program;
//
//    }

    @Override
    public Object visitIMPORT_INSTRUCT(ParserFile.IMPORT_INSTRUCTContext ctx) {
        return super.visitIMPORT_INSTRUCT(ctx);
    }

    @Override
    public Object visitCOMPONENT_INSTRUCT(ParserFile.COMPONENT_INSTRUCTContext ctx) {
        return super.visitCOMPONENT_INSTRUCT(ctx);
    }

    @Override
    public Object visitINJECT_INSTRUCT(ParserFile.INJECT_INSTRUCTContext ctx) {
        return super.visitINJECT_INSTRUCT(ctx);
    }

    @Override
    public Object visitSTATEMENTS_INSTRUCT(ParserFile.STATEMENTS_INSTRUCTContext ctx) {
        // The statements() method returns a single StatementsContext, not a list
        if (ctx.statements() != null) {
            return visit(ctx.statements());
        }
        return new Statements();
    }

    @Override
    public Object visitCLASS_DECLAR_STATE(ParserFile.CLASS_DECLAR_STATEContext ctx) {
        Statements statements = new Statements();
        ClassDecl classDecl = (ClassDecl) visit(ctx.class_decl());
        if (classDecl != null) {
            statements.getClassDecls().add(classDecl);
        }
        return statements;
    }

    @Override
    public Statements visitINTERFACE_STATE(ParserFile.INTERFACE_STATEContext ctx) {
        Statements statements = new Statements();
        Interface interfaceDecl = (Interface) visit(ctx.interface_());
        if (interfaceDecl != null) {
            statements.getInterfaces().add(interfaceDecl);
        }
        return statements;
    }

    @Override
    public Object visitFUNC_DECL_STATE(ParserFile.FUNC_DECL_STATEContext ctx) {
        Statements statements = new Statements();
        FuncDecl funcDecl = (FuncDecl) visit(ctx.function_decl());
        if (funcDecl != null) {
            statements.getFuncDecls().add(funcDecl);
        }
        return statements;
    }

    @Override
    public Object visitCONSTR_STATE(ParserFile.CONSTR_STATEContext ctx) {
        Statements statements = new Statements();
        Constructor constructor = (Constructor) visit(ctx.constructor());
        if (constructor != null) {
            statements.getCons().add(constructor);
        }
        return statements;
    }

    @Override
    public Object visitINIT_STATE(ParserFile.INIT_STATEContext ctx) {
        Statements statements = new Statements();
        Init init = (Init) visit(ctx.init());
        if (init != null) {
            statements.getInits().add(init);
        }
        return statements;
    }

    @Override
    public Object visitINIT_ARRAY_STATE(ParserFile.INIT_ARRAY_STATEContext ctx) {
        Statements statements = new Statements();
        InitArray initArray = (InitArray) visit(ctx.init_array());
        if (initArray != null) {
            statements.getInitArrays().add(initArray);
        }
        return statements;
    }

    @Override
    public Object visitREAD_ONLY_STATE(ParserFile.READ_ONLY_STATEContext ctx) {
        Statements statements = new Statements();
        ReadOnly readOnly = (ReadOnly) visit(ctx.readOnly());
        if (readOnly != null) {
            statements.getReads().add(readOnly);
        }
        return statements;
    }

    @Override
    public Object visitINSTANCE_STATE(ParserFile.INSTANCE_STATEContext ctx) {
        Statements statements = new Statements();
        Instance instance = (Instance) visit(ctx.instance());
        if (instance != null) {
            statements.getInst().add(instance);
        }
        return statements;
    }

    @Override
    public Object visitDECLARE_STATE(ParserFile.DECLARE_STATEContext ctx) {
        Statements statements = new Statements();
        Declaration declaration = (Declaration) visit(ctx.declaration());
        if (declaration != null) {
            statements.getDeclarations().add(declaration);
        }
        return statements;
    }

    @Override
    public Object visitASSIGN_STATE(ParserFile.ASSIGN_STATEContext ctx) {
        Statements statements = new Statements();
        Assign assign = (Assign) visit(ctx.assign());
        if (assign != null) {
            statements.getAssigns().add(assign);
        }
        return statements;
    }

    @Override
    public Object visitIF_CONDITION_STATE(ParserFile.IF_CONDITION_STATEContext ctx) {
        Statements statements = new Statements();
        IfStatement ifStatement = (IfStatement) visit(ctx.if_condition());
        if (ifStatement != null) {
            statements.getIfStatements().add(ifStatement);
        }
        return statements;
    }

    @Override
    public Object visitFOR_LOOP_STATE(ParserFile.FOR_LOOP_STATEContext ctx) {
        Statements statements = new Statements();
        ForLoop forLoop = (ForLoop) visit(ctx.for_());
        if (forLoop != null) {
            statements.getForLoops().add(forLoop);
        }
        return statements;
    }

    @Override
    public Object visitWHILE_LOOP_STATE(ParserFile.WHILE_LOOP_STATEContext ctx) {
        Statements statements = new Statements();
        While whileLoop = (While) visit(ctx.while_());
        if (whileLoop != null) {
            statements.getWhiles().add(whileLoop);
        }
        return statements;
    }

    @Override
    public Object visitEXPR_STATE(ParserFile.EXPR_STATEContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Object visitTHIS_EXPR_STATE(ParserFile.THIS_EXPR_STATEContext ctx) {
        Statements statements = new Statements();
        ThisExpression thisExpression = (ThisExpression) visit(ctx.this_exp());
        if (thisExpression != null) {
            statements.getThisExpressions().add(thisExpression);
        }
        return statements;
    }

    @Override
    public Object visitSUPER_EXPR_STATE(ParserFile.SUPER_EXPR_STATEContext ctx) {
        Statements statements = new Statements();
        SuperExp superExpression = (SuperExp) visit(ctx.super_exp());
        if (superExpression != null) {
            statements.getSuperExpressions().add(superExpression);
        }
        return statements;
    }

    @Override
    public Object visitPRINT_STATE(ParserFile.PRINT_STATEContext ctx) {
        Statements statements = new Statements();
        Print printStatement = (Print) visit(ctx.print());
        if (printStatement != null) {
            statements.getPrintStatements().add(printStatement);
        }
        return statements;
    }

    @Override
    public Object visitVALUE_STATE(ParserFile.VALUE_STATEContext ctx) {
        return super.visitVALUE_STATE(ctx);
    }

//    @Override
//    public Object visitRETRUN_STATE(ParserFile.RETRUN_STATEContext ctx) {
//        Statements statements = new Statements();
//        Return returnStatement = (Return) visit(ctx.return_());
//        if (returnStatement != null) {
//            statements.getReturns().add(returnStatement);
//        }
//        return statements;
//    }

    @Override
    public Object visitCOMMENT_STATE(ParserFile.COMMENT_STATEContext ctx) {
        return super.visitCOMMENT_STATE(ctx);
    }

    @Override
    public Object visitARRAY_STATE(ParserFile.ARRAY_STATEContext ctx) {
        Statements statements = new Statements();

        // delegate to the array() rule
        Array arrayNode = (Array) visit(ctx.array());
        if (arrayNode != null) {
            // Assuming you add a list for arrays inside your Statements class
            statements.getArrays().add(arrayNode);
        }

        return statements;
    }
    @Override
    public Component visitComponent(ParserFile.ComponentContext ctx) {
        // Visit the body of the component, where selector and other properties are handled
        ComponentBody componentBody = (ComponentBody) visit(ctx.componentBody());

        // You could perform additional checks here if needed

        return new Component(componentBody);
    }

    @Override
    public ComponentBody visitComponentBody(ParserFile.ComponentBodyContext ctx) {
        Selector selector = ctx.selector() != null ? (Selector) visit(ctx.selector()) : null;
        Template template = ctx.template() != null ? (Template) visit(ctx.template()) : null;
        Imports imports = ctx.imports() != null ? (Imports) visit(ctx.imports()) : null;
        Style_Urls styleUrls = ctx.style_Urls() != null ? (Style_Urls) visit(ctx.style_Urls()) : null;
        Template_Url templateUrl = ctx.template_Url() != null ? (Template_Url) visit(ctx.template_Url()) : null;
        Standalone standalone=ctx.stanalone()!=null?(Standalone)visit(ctx.stanalone()):null;
        ComponentBody componentBody = new ComponentBody(selector, template, imports, styleUrls, templateUrl,standalone);

        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String componentName = "component_" + line;

        // Duplicate/Missing selector checks
        if (selector == null || selector.getValue() == null || selector.getValue().isEmpty()) {
            semanticErrors.add(new MissingSelectorError(componentName, line, column));
        } else {
            String selectorValue = selector.getValue();
            if (!selectorSet.add(selectorValue)) {
                semanticErrors.add(new DuplicateSelectorError(selectorValue, line, column));
            }
        }

        // ✅ Check that each ID in the `imports: [...]` list has a corresponding import
        if (imports != null) {
            for (String used : imports.getImports()) {
                if (st.lookup(used) == null) {
                    semanticErrors.add(new MissingComponentImportError(used, line, column));
                }
            }
        }

        return componentBody;
    }

    @Override
    public Standalone visitStanalone(ParserFile.StanaloneContext ctx) {
        String value = ctx.VAL().getText();
        Standalone standalone = new Standalone(value);

        // Also store as row in symbol table if needed
        Row row = new Row();
        row.setName("standalone" + ctx.getStart().getLine());
        row.setKind("standalone");
        row.setType("standalone");
        row.setValue(value);
        row.setScope(st.getCurrentScope());
        row.setLine(ctx.getStart().getLine());
        row.setColumn(ctx.getStart().getCharPositionInLine());

        st.add(row.getName(), row);
        return standalone;
    }


    @Override
    public Selector visitSelector(ParserFile.SelectorContext ctx) {
        String value = ctx.VAL().getText();
        Selector selector = new Selector(value);

        // Also store as row in symbol table if needed
        Row row = new Row();
        row.setName("selector_" + ctx.getStart().getLine());
        row.setKind("selector");
        row.setType("selector");
        row.setValue(value);
        row.setScope(st.getCurrentScope());
        row.setLine(ctx.getStart().getLine());
        row.setColumn(ctx.getStart().getCharPositionInLine());

        st.add(row.getName(), row);
        return selector;
    }



    @Override
    public  Imports visitImports(ParserFile.ImportsContext ctx) {
        List<String> importsList = new ArrayList<>();


        for (TerminalNode importNode : ctx.ID()) {
            importsList.add(importNode.getText());
        }


        Imports imports = new Imports(importsList);

        Row row = new Row();
        row.setType("Imports");
        row.setValue(importsList.toString());
        st.getRow().add(row);

        return imports;


    }

    @Override
    public Style_Urls visitStyle_Urls(ParserFile.Style_UrlsContext ctx) {
        List<String> styleUrlsList = new ArrayList<>();


        TerminalNode styleUrlNode = ctx.VAL();
        if (styleUrlNode != null) {
            styleUrlsList.add(styleUrlNode.getText());
        }

        return new Style_Urls(styleUrlsList);
    }
    @Override
    public Template_Url visitTemplate_Url(ParserFile.Template_UrlContext ctx) {
        List<String> templateUrlList = new ArrayList<>();


        TerminalNode templateUrlNode = ctx.VAL();
        if (templateUrlNode != null) {
            templateUrlList.add(templateUrlNode.getText());
        }

        return new Template_Url(templateUrlList);
    }


    @Override
    public Inject visitInject(ParserFile.InjectContext ctx) {

        ProvidedIn providedIn = (ProvidedIn) visit(ctx.provided_in());

        Inject injectObj = new Inject(providedIn);



        return injectObj;
    }

    @Override
    public ProvidedIn visitProvided_in(ParserFile.Provided_inContext ctx) {
        String value = ctx.VAL().getText();


        ProvidedIn providedInObj = new ProvidedIn(value);



        return providedInObj;
    }



    @Override
    public Value visitValue(ParserFile.ValueContext ctx) {
        Value value = new Value();

        if (ctx.VAL() != null) {
            value.getValues().add(ctx.VAL().getText());
        } else if (ctx.object() != null) {
            MyObject myObject = (MyObject) visit(ctx.object());
            value.getObjects().add(myObject);
        }

        Row row = new Row();
        row.setType("Value");
        row.setValue(value.toString());
        st.getRow().add(row);

        return value;
    }


    @Override
    public Init visitInit(ParserFile.InitContext ctx) {
        String name = ctx.ID().getText();
        String dataType = ctx.DATA_TYPE() != null ? ctx.DATA_TYPE().getText() : "unknown";
        String valueText = ctx.value() != null ? ctx.value().getText() : null;

        // Duplicate variable check
        for (Row existing : st.getRow()) {
            if (existing != null
                    && name.equals(existing.getName())
                    && st.getCurrentScope().equals(existing.getScope())) {
                int line = ctx.getStart().getLine();
                int column = ctx.getStart().getCharPositionInLine();
                semanticErrors.add(new DuplicateVariableError(name, line, column));
                return new Init(dataType, name, valueText);
            }
        }

        // Type checks
        if ("number".equals(dataType) && (valueText == null || !valueText.matches("\\d+"))) {
            int line = ctx.getStart().getLine();
            int column = ctx.getStart().getCharPositionInLine();
            semanticErrors.add(new TypeMismatchError(name, valueText, dataType, line, column));
        } else if ("boolean".equals(dataType) && (valueText == null || !valueText.matches("true|false"))) {
            int line = ctx.getStart().getLine();
            int column = ctx.getStart().getCharPositionInLine();
            semanticErrors.add(new TypeMismatchError(name, valueText, dataType, line, column));
        } else if ("string".equals(dataType) && (valueText == null || !valueText.matches("\".*\""))) {
            int line = ctx.getStart().getLine();
            int column = ctx.getStart().getCharPositionInLine();
            semanticErrors.add(new TypeMismatchError(name, valueText, dataType, line, column));
        }

        // Add row to symbol table
        Row row = new Row();
        row.setType(dataType);
        row.setName(name);
        row.setValue(valueText); // keep object literal as text
        row.setScope(st.getCurrentScope());
        row.setLine(ctx.getStart().getLine());
        row.setColumn(ctx.getStart().getCharPositionInLine());
        st.getRow().add(row);

        return new Init(dataType, name, valueText);
    }




    @Override
    public String visitTypeReference(ParserFile.TypeReferenceContext ctx) {
        if (ctx.DATA_TYPE() != null) return ctx.DATA_TYPE().getText();
        if (ctx.ID() != null)       return ctx.ID().getText();
        return "unknown";
    }



    @Override
    public InitArray visitInit_array(ParserFile.Init_arrayContext ctx) {
        String name = ctx.ID().getText();

        // type is now via `typeReference` (optional)
        String dataType = null;
        if (ctx.typeReference() != null) {
            dataType = visitTypeReference(ctx.typeReference());
            // If you want to reflect the optional [] after the typeReference, you could append "[]"
            // but beware there is also an array literal with brackets. Easiest is to skip appending here
            // or do it only if you track positions in the tree.
        }

        InitArray initArray = new InitArray(name,dataType);

        Row arrayRow = new Row();
        arrayRow.setType(dataType != null ? dataType : "array");
        arrayRow.setName(name);
        arrayRow.setScope(st.getCurrentScope());
        st.getRow().add(arrayRow);

        // `value` appears multiple times: first element + (COMMA value)*
        if (ctx.value() != null && !ctx.value().isEmpty()) {
            for (ParserFile.ValueContext vctx : ctx.value()) {
                Value v = (Value) visit(vctx);
                initArray.addValue(v);
            }
            arrayRow.setValue(initArray.getValues().toString());
        } else {
            arrayRow.setValue("[]");
        }

        return initArray;
    }



    @Override
    public IfStatement visitIf_condition(ParserFile.If_conditionContext ctx) {
        st.enterScope("if_scope");
        Condition condition = (Condition) visit(ctx.condition(0));
        Body body = (Body) visit(ctx.body());


        List<ElseIfStatement> elseIfs = new ArrayList<>();
        for (ParserFile.Else_if_conditionContext elseIfCtx : ctx.else_if_condition()) {
            ElseIfStatement elseIfStatement = visitElse_if_condition(elseIfCtx);
            elseIfs.add(elseIfStatement);
        }


        Body elseBody = null;
        if (ctx.else_condition() != null) {
            elseBody = (Body) visit(ctx.else_condition().body());
        }

        st.exitScope();
        return new IfStatement(condition, body, elseIfs, elseBody);
    }

    @Override
    public ElseIfStatement visitElse_if_condition(ParserFile.Else_if_conditionContext ctx) {
        st.enterScope("else_If_scope");

        Condition condition = (Condition) visit(ctx.condition(0));
        Body body = (Body) visit(ctx.body());
        st.exitScope();
        return new ElseIfStatement(condition, body);
    }

    @Override
    public ElseStatement visitElse_condition(ParserFile.Else_conditionContext ctx) {
        st.enterScope("else_scope");
        Body body = (Body) visit(ctx.body());
        st.exitScope();
        return new ElseStatement(body);
    }

    @Override
    public Object visitID_COND(ParserFile.ID_CONDContext ctx) {
        return new IdentifierCondition(ctx.ID().getText());
    }

    @Override
    public Object visitVAL_COND(ParserFile.VAL_CONDContext ctx) {
        return new ValueCondition(ctx.VAL().getText());
    }

    @Override
    public Object visitVAL_OPERA_VAL(ParserFile.VAL_OPERA_VALContext ctx) {
        Condition left = new ValueCondition(ctx.VAL(0).getText());
        String operation = ctx.OPERATION().getText();
        Condition right = new ValueCondition(ctx.VAL(1).getText());
        return new BinaryCondition(left, operation, right);
    }

    @Override
    public Object visitVAL_OPERA_ID(ParserFile.VAL_OPERA_IDContext ctx) {
        Condition left = new ValueCondition(ctx.VAL().getText());
        String operation = ctx.OPERATION().getText();
        Condition right = new IdentifierCondition(ctx.ID().getText());
        return new BinaryCondition(left, operation, right);
    }

    @Override
    public Object visitID_OPERA_VAL(ParserFile.ID_OPERA_VALContext ctx) {
        Condition left = new IdentifierCondition(ctx.ID().getText());
        String operation = ctx.OPERATION().getText();
        Condition right = new ValueCondition(ctx.VAL().getText());
        return new BinaryCondition(left, operation, right);
    }

    @Override
    public Object visitID_OPERA_ID(ParserFile.ID_OPERA_IDContext ctx) {
        Condition left = new IdentifierCondition(ctx.ID(0).getText());
        String operation = ctx.OPERATION().getText();
        Condition right = new IdentifierCondition(ctx.ID(1).getText());
        return new BinaryCondition(left, operation, right);
    }

    @Override
    public Object visitID_OPERA_DOT_ID(ParserFile.ID_OPERA_DOT_IDContext ctx) {
        Condition left = new IdentifierCondition(ctx.ID(0).getText());
        String operation = ctx.OPERATION().getText();
        Condition right = new IdentifierCondition(ctx.ID(1).getText() + "." + ctx.ID(2).getText());
        return new BinaryCondition(left, operation, right);
    }

    @Override
    public Body visitBody(ParserFile.BodyContext ctx) {
        Body body = new Body();


        for (ParserFile.StatementsContext stmtCtx : ctx.statements()) {
            Statements statement = (Statements) visit(stmtCtx);
            body.addStatement(statement);
        }

        return body;
    }
    @Override
    public ForLoop visitFor(ParserFile.ForContext ctx) {
        st.enterScope("for");
        Init init = (Init) visit(ctx.init());


        Condition condition = (Condition) visit(ctx.condition());


        Expression expression = (Expression) visit(ctx.expr());


        Body body = (Body) visit(ctx.body());

        ForLoop forLoop = new ForLoop(init, condition, expression, body);

//        Row row = new Row();
//
//        row.setType("forLoop");
//        row.setValue(forLoop.toString());
//        row.setScope(st.getCurrentScope());
//        st.getRow().add(row);
//        st.exitScope();
        return forLoop;
    }

    @Override
    public While visitWhile(ParserFile.WhileContext ctx) {
        st.enterScope("while");
        Condition condition = (Condition) visit(ctx.condition(0));
        Body body = (Body) visit(ctx.body());



//        Row row = new Row();
//
//        row.setType("While");
//        row.setValue(body.toString());
//        row.setScope(st.getCurrentScope());
//        st.getRow().add(row);
//        st.exitScope();

        return new While(condition, body);
    }

    @Override
    public Object visitDIV(ParserFile.DIVContext ctx) {
        return new BinaryExpression(
                (Expression) visit(ctx.expr(0)),
                "/",
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Object visitID_EXPR(ParserFile.ID_EXPRContext ctx) {
        return new IdExpr(ctx.ID().getText());
    }

    @Override
    public Object visitPLUS2(ParserFile.PLUS2Context ctx) {
        return new UnaryExpression("++", (Expression) visit(ctx.expr()));
    }

    @Override
    public Object visitSENT_EXPR(ParserFile.SENT_EXPRContext ctx) {
        return new ValueExpression(ctx.SENTENCE().getText());
    }

    @Override
    public Object visitVAL_EXPR(ParserFile.VAL_EXPRContext ctx) {
        return new ValueExpression(ctx.VAL().getText());
    }

    @Override
    public Object visitMINUS2(ParserFile.MINUS2Context ctx) {
        return new UnaryExpression("--", (Expression) visit(ctx.expr()));
    }

    @Override
    public Object visitMULTI(ParserFile.MULTIContext ctx) {
        return new BinaryExpression(
                (Expression) visit(ctx.expr(0)),
                "*",
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Object visitPLUS(ParserFile.PLUSContext ctx) {
        return new BinaryExpression(
                (Expression) visit(ctx.expr(0)),
                "+",
                (Expression) visit(ctx.expr(1))
        );
    }

    @Override
    public Object visitMINUS(ParserFile.MINUSContext ctx) {
        return new BinaryExpression(
                (Expression) visit(ctx.expr(0)),
                "-",
                (Expression) visit(ctx.expr(1))
        );
    }


    @Override
    public Object visitPrint(ParserFile.PrintContext ctx) {
        Expression expr = null;

        if (ctx.expr() != null) {
            expr = (Expression) visit(ctx.expr());

            if (expr instanceof IdExpr) {
                String varName = ((IdExpr) expr).getID();

                boolean isDefined = false;
                for (Row row : st.getRow()) {
                    if (row != null && varName.equals(row.getName())) {
                        isDefined = true;
                        break;
                    }
                }

                if (!isDefined) {
                    int line = ctx.getStart().getLine();
                    int column = ctx.getStart().getCharPositionInLine();
                    semanticErrors.add(new UndefinedVariableError(varName, line, column));
                }
            }
        }

        return new Print(expr);
    }



    @Override
    public Object visitObject(ParserFile.ObjectContext ctx) {
        List<ObjectProperty> properties = new ArrayList<>();

        for (ParserFile.ObjectPropertyContext propCtx : ctx.objectProperty()) {
            ObjectProperty property = (ObjectProperty) visitObjectProperty(propCtx);
            properties.add(property);
        }
        Row row = new Row();
        row.setName("object");
        row.setType("objects");
        row.setValue(properties.toString());
        st.getRow().add(row);

        return new MyObject(properties);
    }

    @Override
    public ReadOnly visitReadOnly(ParserFile.ReadOnlyContext ctx) {
        // readOnly: declaration EQUAL this_exp;
        Declaration declaration = (Declaration) visit(ctx.declaration());
        ThisExpression thisExpression = (ThisExpression) visit(ctx.this_exp());

        ReadOnly node = new ReadOnly(declaration, thisExpression);

        // Symbol table bookkeeping (name/type/scope/value)
        try {
            Row row = new Row();
            String name, type;
            try {
                name = (String) Declaration.class.getMethod("getName").invoke(declaration);
                type = (String) Declaration.class.getMethod("getDataType").invoke(declaration);
            } catch (Exception ignore) {
                name = ctx.declaration().ID() != null ? ctx.declaration().ID().getText() : "unnamed";
                type = ctx.declaration().DATA_TYPE() != null ? ctx.declaration().DATA_TYPE().getText() : "undefined";
            }
            row.setName(name);
            row.setType(type);
            row.setScope(st.getCurrentScope());
            row.setValue("readonly = " + (thisExpression != null ? thisExpression.toString() : "this"));
            st.getRow().add(row);
        } catch (Throwable t) {
            // keep going even if symbol table update isn't possible
        }

        return node;
    }
    @Override
    public Instance visitInstance(ParserFile.InstanceContext ctx) {
        // Parse declaration first
        Declaration declaration = (Declaration) visit(ctx.declaration());

        // Directly get the ID after NEW
        String typeName = ctx.ID() != null ? ctx.ID().getText() : "UnknownType";

        // Generic type from DATA_TYPE
        String genericType = ctx.DATA_TYPE() != null ? ctx.DATA_TYPE().getText() : null;

        // Visit array part if present
        Object arrayNode = ctx.array() != null ? visit(ctx.array()) : null;

        // Build AST node
        Instance node = new Instance(declaration, typeName, genericType, true, arrayNode);

        // Symbol table bookkeeping
        try {
            Row row = new Row();
            String name, declaredType;
            try {
                name = (String) Declaration.class.getMethod("getName").invoke(declaration);
                declaredType = (String) Declaration.class.getMethod("getDataType").invoke(declaration);
            } catch (Exception ignore) {
                name = ctx.declaration().ID() != null ? ctx.declaration().ID().getText() : "unnamed";
                declaredType = ctx.declaration().DATA_TYPE() != null ? ctx.declaration().DATA_TYPE().getText() : "undefined";
            }
            row.setName(name);

            String composedType = (typeName != null ? typeName : declaredType);
            if (genericType != null) composedType += "<" + genericType + ">";
            composedType += "[]";
            row.setType(composedType);

            row.setScope(st.getCurrentScope());
            row.setValue("new " + typeName
                    + (genericType != null ? "<" + genericType + ">" : "")
                    + "[](" + (arrayNode != null ? arrayNode.toString() : "") + ")");
            st.getRow().add(row);
        } catch (Throwable t) {
            // Ignore symbol table errors
        }

        return node;
    }


    @Override
    public ObjectProperty visitObjectProperty(ParserFile.ObjectPropertyContext ctx) {
        String id = ctx.ID(0).getText(); // first ID is the key
        String value;

        if (ctx.VAL() != null) {
            value = ctx.VAL().getText();
        } else if (ctx.ID().size() > 1) {
            // second ID is the value if VAL is absent
            value = ctx.ID(1).getText();
        } else {
            value = ""; // fallback if grammar ever changes
        }

        return new ObjectProperty(id, value);
    }





    @Override
    public Declaration visitDeclaration(ParserFile.DeclarationContext ctx) {
        String name = ctx.ID() != null ? ctx.ID().getText() : "unnamed";
        String dataType = ctx.DATA_TYPE() != null ? ctx.DATA_TYPE().getText() : "undefined";

        // Check for duplicate variable declaration
        for (Row existing : st.getRow()) {
            if (existing != null && name.equals(existing.getName()) && st.getCurrentScope().equals(existing.getScope())) {
                int line = ctx.getStart().getLine();
                int column = ctx.getStart().getCharPositionInLine();
                semanticErrors.add(new DuplicateVariableError(name, line, column));
                return new Declaration(dataType, name); // fixed order
            }
        }

        Declaration declaration = new Declaration(dataType, name); // fixed order
        Row row = new Row();
        row.setType(dataType);
        row.setName(name);
        row.setValue("declaration");
        row.setScope(st.getCurrentScope());
        st.getRow().add(row);

        return declaration;
    }

    @Override
    public Assign visitAssign(ParserFile.AssignContext ctx) {
        String variableName = ctx.ID(0).getText();
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String currentScope = st.getCurrentScope();

        // Find the variable from the symbol table (in current scope or global as fallback)
        Row variableRow = st.getRow().stream()
                .filter(row -> row.getName().equals(variableName) && row.getScope().equals(currentScope))
                .findFirst()
                .orElse(null);

        if (variableRow == null) {
            semanticErrors.add(new UndefinedVariableError(variableName, line, column));
            return new Assign(variableName, null); // Return partial node
        }

        String value;
        String assignedType;

        if (ctx.VAL() != null) {
            value = ctx.VAL().getText();
            assignedType = determineType(value); // Custom helper to infer type from value (e.g., "number", "string")
        } else if (ctx.ID().size() > 1) {
            value = ctx.ID(1).getText();
            assignedType = getVariableType(value); // Get type of another variable
        } else {
            semanticErrors.add(new TypeMismatchError(variableName, "unknown", variableRow.getType(), line, column));
            return new Assign(variableName, null);
        }

        // Type compatibility check
        if (!isTypeCompatible(variableRow.getType(), assignedType)) {
            semanticErrors.add(new TypeMismatchError(variableName, assignedType, variableRow.getType(), line, column));
        }

        Assign assignment = new Assign(variableName, value);

        // Optional: store the assignment in the symbol table
        Row row = new Row();
        row.setType("Assign");
        row.setName(variableName);
        row.setValue(value);
        row.setScope(currentScope);
        row.setLine(line);
        row.setColumn(column);

        st.getRow().add(row);

        return assignment;
    }


    // Helper method to determine the type of a value
    private String determineType(String value) {
        if (value.matches("\\d+")) {
            return "number";
        } else if (value.matches("\".*\"")) {
            return "string";
        }
        // Add more types as needed
        return "unknown";
    }

    // Helper method to get the type of a variable
    private String getVariableType(String variableName) {
        Row row = st.getRow().stream()
                .filter(r -> r.getName().equals(variableName))
                .findFirst()
                .orElse(null);
        return row != null ? row.getType() : "unknown";
    }

    // Helper method to check type compatibility
    private boolean isTypeCompatible(String declaredType, String assignedType) {
        return declaredType.equals(assignedType);
    }
//    @Override
//    public Object visitThis_exp(ParserFile.This_expContext ctx) {
//
//        String identifier = ctx.ID(0).getText();
//        List<String> chainedIdentifiers = new ArrayList<>();
//        for (int i = 1; i < ctx.ID().size(); i++) {
//            chainedIdentifiers.add(ctx.ID(i).getText());
//        }
//        ThisExpression thisExpr = new ThisExpression(identifier, chainedIdentifiers);
//        String value = null;
//        if (ctx.VAL() != null) {
//            value = ctx.VAL().getText();
//        } else if (ctx.ID().size() > 1) {
//            value = ctx.ID(ctx.ID().size() - 1).getText();
//        } else {
//            throw new IllegalArgumentException("Invalid assignment context: no value found.");
//        }
//
//
////        Row row = new Row();
////        row.setType("this");
////        row.setValue(value);
////        row.setScope(st.getCurrentScope());
////        row.setName(identifier);
////
////        st.getRow().add(row);
//
//        return thisExpr;
//    }

    @Override
    public Object visitThis_exp(ParserFile.This_expContext ctx) {
        PropertyChain propertyChain = (PropertyChain) visit(ctx.property_chain());
        String mainIdentifier = propertyChain.getIdentifiers().get(0);

        ThisExpression result;

        if (ctx.assignment() != null) {
            Assignment assignment = (Assignment) visit(ctx.assignment());
            result = new ThisExpression(propertyChain, assignment);

            String valueStr = extractValueFromAssignment(assignment);
            // Customize display for productService.addProduct(product)
            if (mainIdentifier.equals("productService") && valueStr.equals("product")) {
                valueStr = "PropertyChain representing product or its value";
            }
            addRow(mainIdentifier, valueStr);

        } else if (ctx.post_op() != null) {
            PostOp postOp = (PostOp) visit(ctx.post_op());
            result = new ThisExpression(propertyChain, postOp);

            addRow(mainIdentifier, postOp.getOperation());

        } else {
            result = new ThisExpression(propertyChain);

            String valueStr = null;
            if (propertyChain.getMethodCall() != null) {
                MethodCall methodCall = propertyChain.getMethodCall();
                String argsStr = methodCall.getArguments().stream()
                        .map(this::extractArgumentValue)
                        .collect(Collectors.joining(", "));
                valueStr = methodCall.getMethodName() + "(" + argsStr + ")";
            } else {
                // No method call: just print property chain identifiers joined by dot
                valueStr = String.join(".", propertyChain.getIdentifiers());
            }

            // Special cases
            if (mainIdentifier.equals("productService") && valueStr.startsWith("subscribe")) {
                // Replace lambda arguments with 'lambda'
                valueStr = "subscribe(lambda)";
            }
            if (mainIdentifier.equals("router") && valueStr.startsWith("navigate")) {
                // leave as is: e.g., navigate(['/'])
            }
            if (mainIdentifier.equals("selected_product") && valueStr.equals("product")) {
                valueStr = "IDExpression with value 'product'";
            }
            addRow(mainIdentifier, valueStr);
        }

        return result;
    }

    private void addRow(String name, String value) {
        Row row = new Row();
        row.setType("this");
        row.setName(name);
        row.setValue(value);
        row.setScope(st.getCurrentScope());
        st.getRow().add(row);
    }

    private String extractArgumentValue(Object arg) {
        if (arg == null) {
            return "<no-arg>";
        }
        if (arg instanceof ValueExpression) {
            return ((ValueExpression) arg).getValue();
        } else if (arg instanceof ThisExpression) {
            PropertyChain pc = ((ThisExpression) arg).getPropertyChain();
            return "this." + String.join(".", pc.getIdentifiers());
        } else if (arg instanceof PropertyChain) {
            PropertyChain pc = (PropertyChain) arg;
            if (pc.getMethodCall() != null) {
                MethodCall mc = pc.getMethodCall();
                String argsStr = mc.getArguments().stream()
                        .map(this::extractArgumentValue)
                        .collect(Collectors.joining(", "));
                return String.join(".", pc.getIdentifiers()) + "." + mc.getMethodName() + "(" + argsStr + ")";
            } else {
                return String.join(".", pc.getIdentifiers());
            }
        } else if (arg instanceof Array) {
            Array arrayExpr = (Array) arg;
            List<Object> elements = arrayExpr.getElements();
            List<String> elemsStr = new ArrayList<>();
            for (Object elem : elements) {
                elemsStr.add(extractArgumentValue(elem));
            }
            return "[" + String.join(", ", elemsStr) + "]";
        } else if (arg instanceof SpreadElement) {
            SpreadElement spread = (SpreadElement) arg;
            return "..." + extractArgumentValue(spread.getExpression());
        } else if (arg instanceof MethodCall) {
            MethodCall mc = (MethodCall) arg;
            String argsStr = mc.getArguments().stream()
                    .map(this::extractArgumentValue)
                    .collect(Collectors.joining(", "));
            return mc.getMethodName() + "(" + argsStr + ")";
        } else if (arg instanceof MyObject) {
            // New case → convert object literal
            return ((MyObject) arg).convertToJs(); // you can define a helper in MyObject
        }

        // Heuristic for lambda detection
        String argText = arg.toString();
        if (argText.contains("=>")) {
            return "lambda";
        }
        return argText;
    }


    private String extractValueFromAssignment(Assignment assignment) {
        Object value = assignment.getValue(); // was Statements

        if (value instanceof ValueExpression) {
            return ((ValueExpression) value).getValue();
        } else if (value instanceof MethodCall) {
            MethodCall methodCall = (MethodCall) value;
            if (!methodCall.getArguments().isEmpty()) {
                return extractArgumentValue(methodCall.getArguments().get(0));
            }
            return methodCall.getMethodName();
        } else if (value instanceof MyObject) {
            return ((MyObject) value).convertToJs();
        } else {
            return value.toString();
        }
    }


    @Override
    public PropertyChain visitProperty_chain(ParserFile.Property_chainContext ctx) {
        List<String> identifiers = new ArrayList<>();
        for (TerminalNode id : ctx.ID()) {
            identifiers.add(id.getText());
        }

        MethodCall methodCall = null;
        if (ctx.method_call() != null) {
            methodCall = (MethodCall) visit(ctx.method_call());
        }

        return new PropertyChain(identifiers, methodCall);
    }

    @Override
    public MethodCall visitMethod_call(ParserFile.Method_callContext ctx) {
        String methodName = ctx.ID().getText();
        List<Statements> args = new ArrayList<>();

        if (ctx.expr() != null) {
            for (ParserFile.ExprContext exprCtx : ctx.expr()) {
                Statements arg = (Statements) visit(exprCtx);
                if (arg != null) {
                    args.add(arg);
                }
            }
        }

        return new MethodCall(methodName, args);
    }

    @Override
    public Assignment visitAssignment(ParserFile.AssignmentContext ctx) {
        Statements value = (Statements) visit(ctx.expr());
        return new Assignment(value);
    }

    @Override
    public PostOp visitPost_op(ParserFile.Post_opContext ctx) {
        String op = ctx.getText();
        return new PostOp(op);
    }

    @Override
    public Object visitArray(ParserFile.ArrayContext ctx) {
        List<Object> elements = new ArrayList<>();

        for (ParserFile.ArrayElementContext elemCtx : ctx.arrayElement()) {
            Object element = visit(elemCtx); // don’t cast to Statements
            if (element != null) {
                elements.add(element);
            }
        }

        return new Array(elements);
    }

    @Override
    public Object visitSuper_exp(ParserFile.Super_expContext ctx) {

        if (ctx.getChildCount() >= 6 && ctx.EQUAL() != null) {
            StringBuilder propertyBuilder = new StringBuilder();
            String firstProperty = ctx.ID(0) != null ? ctx.ID(0).getText() : null;


            for (int i = 0; i < ctx.ID().size(); i++) {
                if (i > 0) {
                    propertyBuilder.append(".");
                }
                propertyBuilder.append(ctx.ID(i).getText());
            }

            String property = propertyBuilder.toString();
            String value = ctx.VAL() != null ? ctx.VAL().getText() : (ctx.ID(ctx.ID().size() - 1) != null ? ctx.ID(ctx.ID().size() - 1).getText() : null);
            if (firstProperty == null) {
                return null;
            }
            if (value == null) {
                return null;
            }
            SuperExp superExp = new SuperExp(property, value);


//            Row row = new Row();
//            row.setType("Super");
//            row.setName(firstProperty);
//            row.setValue(value);
//            row.setScope(st.getCurrentScope());
//            st.getRow().add(row);

            return superExp;
        }

        else if (ctx.getChildCount() > 4) {
            String methodName = "unnamed";

            List<String> arguments = new ArrayList<>();
            for (int i = 0; i < ctx.ID().size(); i++) {
                if (ctx.ID(i) != null) {
                    arguments.add(ctx.ID(i).getText());
                }
            }
            SuperExp superExp = new SuperExp(methodName, arguments);


//            Row row = new Row();
//            row.setType("Super");
//            row.setName(methodName);
//            row.setValue(superExp.toString());
//            row.setScope(st.getCurrentScope());
//            st.getRow().add(row);

            return superExp;
        }
        return null;
    }
    @Override
    public Return visitReturn(ParserFile.ReturnContext ctx) {
        Return returnStatement = new Return();

        if (ctx.ID() != null) {
            returnStatement.setId(ctx.ID().getText());
        }

        if (ctx.VAL() != null) {
            returnStatement.setValue(ctx.VAL().getText());
        }

        if (ctx.SENTENCE() != null) {
            returnStatement.setSentence(ctx.SENTENCE().getText());
        }

        if (ctx.statements() != null) {

            Statements statements = (Statements) visit(ctx.statements());
            returnStatement.getStatements().add(statements);
        }

        if (ctx.object() != null) {
            List<MyObject> objectList = new ArrayList<>();
            for (ParserFile.ObjectContext objectCtx : ctx.object()) {
                MyObject myObject = (MyObject) visit(objectCtx);
                objectList.add(myObject);
            }
            returnStatement.setValues(objectList);
        }

//
//        Row row = new Row();
//
//        row.setType("Return");
//        row.setName("return");
//        row.setValue(returnStatement.toString());
//        row.setScope(st.getCurrentScope());
//        st.getRow().add(row);

        return returnStatement;
    }

    @Override
    public Parameter visitParameter(ParserFile.ParameterContext ctx) {
        Parameter parameter = new Parameter();

        // Parameter name comes directly from ctx.ID()
        parameter.setName(ctx.ID().getText());

        // Type is inside typeReference
        String type = visitTypeReference(ctx.typeReference());
        parameter.setType(type);

        // Log into your symbol table or rows
        Row row = new Row();
        row.setType("Parameters");
        row.setValue(parameter.toString());
        st.getRow().add(row);

        return parameter;
    }

    @Override
    public FuncDecl visitFunction_decl(ParserFile.Function_declContext ctx) {
        st.enterScope("function");

        // Pass the symbol table
        FuncDecl funcDecl = new FuncDecl(st);

        funcDecl.setName(ctx.ID().getText());

        if (ctx.COLON() != null && ctx.DATA_TYPE() != null) {
            funcDecl.setReturn_type(ctx.DATA_TYPE().getText());
        } else {
            funcDecl.setReturn_type("void");
        }

        Set<String> parameterNames = new HashSet<>();

        if (ctx.parameter() != null) {
            for (ParserFile.ParameterContext paramCtx : ctx.parameter()) {
                String paramName = paramCtx.ID().getText();

                // Check for duplicate parameter names
                if (!parameterNames.add(paramName)) {
                    System.err.println("Duplicate parameter name: " + paramName);
                }

                Parameter parameter = (Parameter) visit(paramCtx);
                funcDecl.getParameters().add(parameter);
            }
        }

        FuncBody functionBody = (FuncBody) visit(ctx.function_body());
        funcDecl.getFunctionBodies().add(functionBody);

        st.exitScope();
        return funcDecl;
    }


    @Override
    public FuncBody visitFunction_body(ParserFile.Function_bodyContext ctx) {
        FuncBody functionBody = new FuncBody();

        // Track variable names declared in this function scope
        Set<String> declaredNames = new HashSet<>();

        if (ctx.statements() != null) {
            for (ParserFile.StatementsContext statementCtx : ctx.statements()) {
                Statements statement = (Statements) visit(statementCtx);

                if (statement instanceof Init) {
                    String varName = ((Init) statement).getId();

                    if (!declaredNames.add(varName)) {
                        int line = statementCtx.getStart().getLine();
                        int column = statementCtx.getStart().getCharPositionInLine();
                        semanticErrors.add(new DuplicateVariableError(varName, line, column));
                    }
                }

                functionBody.addStatement(statement);
            }
        }

        if (ctx.return_() != null) {
            Return returnStatement = (Return) visit(ctx.return_());
            functionBody.setReturnStatement(returnStatement);
        }

        return functionBody;
    }

    @Override
    public ClassBody visitClass_body(ParserFile.Class_bodyContext ctx) {
        ClassBody classBody = new ClassBody();


        for (ParserFile.StatementsContext statement : ctx.statements()) {
            Statements stmt = (Statements) visit(statement);
            classBody.getStatements().add(stmt);
        }
//        Row row = new Row();
//        row.setType("Class Body");
//        row.setValue(classBody.toString());
//        st.getRow().add(row);
        return classBody;
    }

    @Override
    public ClassDecl visitClass_decl(ParserFile.Class_declContext ctx) {
        st.enterScope("class");
        ClassDecl classDecl = new ClassDecl();

        classDecl.setClass_name(ctx.ID().getText());


        if (ctx.class_body() != null) {
            ClassBody body = (ClassBody) visitClass_body(ctx.class_body());
            classDecl.setBody(body);
        }
//        Row row = new Row();
//        row.setType("Class Decl");
//        row.setValue(classDecl.toString());
//        row.setScope(st.getCurrentScope());
//        st.getRow().add(row);
        st.exitScope();
        return classDecl;
    }

    @Override
    public Interface visitInterface(ParserFile.InterfaceContext ctx) {
        st.enterScope("interface");
        Interface inter = new Interface();

        inter.setInterface_name(ctx.ID().getText());


        if (ctx.declaration() != null) {
            for (ParserFile.DeclarationContext declCtx : ctx.declaration()) {
                Declaration body = (Declaration) visitDeclaration(declCtx);
                inter.getBody().add(body);
            }
        }
//        Row row = new Row();
//        row.setType("Interface");
//        row.setValue(inter.toString());
//        row.setScope(st.getCurrentScope());
//        st.getRow().add(row);
//        st.exitScope();
        return inter;
    }

    @Override
    public Constructor visitConstructor(ParserFile.ConstructorContext ctx) {
        Constructor cons = new Constructor();


        if (ctx.parameter() != null) {
            for (ParserFile.ParameterContext paramCtx : ctx.parameter()) {
                Parameter parameter = (Parameter) visit(paramCtx);
                cons.getParameters().add(parameter);
            }
        }


        FuncBody functionBody = (FuncBody) visit(ctx.function_body());
        cons.getFunctionBodies().add(functionBody);
//        Row row = new Row();
//        row.setType("Constructor");
//        row.setValue(cons.toString());
//        st.getRow().add(row);
        return cons;
    }





    @Override
    public ImportState visitImport_statement(ParserFile.Import_statementContext ctx) {
        ImportState importStatement = new ImportState();

        List<String> importedIds = ctx.ID().stream()
                .map(TerminalNode::getText)
                .collect(Collectors.toList());

        importStatement.setImportTypes(importedIds);

        if (ctx.VAL() != null) {
            importStatement.setFromPath(ctx.VAL().getText());
        }

        // Add individual entries to symbol table
        for (String id : importedIds) {
            Row row = new Row();
            row.setName(id);
            row.setType("Import");
            row.setValue(importStatement.getFromPath());
            row.setScope(st.getCurrentScope());
            row.setKind("import");
            row.setLine(ctx.getStart().getLine());
            row.setColumn(ctx.getStart().getCharPositionInLine());
            st.add(id, row); // Add per-symbol entry
        }

        return importStatement;
    }


    @Override
    public Object visitEos(ParserFile.EosContext ctx) {
        return super.visitEos(ctx);
    }


    @Override
    public Template visitTemplate(ParserFile.TemplateContext ctx) {
        Template template = new Template();

        HtmlDocument htmlDocument = (HtmlDocument) visitHtmlDocument(ctx.htmlDocument());
        template.setHtmlDocument(htmlDocument);
//        Row row = new Row();
//        row.setName("template");
//        row.setType("Template");
//        row.setValue("template value");
//        st.getRow().add(row);

        return template;
    }

    @Override
    public HtmlDocument visitHtmlDocument(ParserFile.HtmlDocumentContext ctx) {
        HtmlDocument htmlDocument = new HtmlDocument();

        for (ParserFile.ScriptletOrSeaWsContext scriptlet : ctx.scriptletOrSeaWs()) {
            htmlDocument.addScriptlet(visit(scriptlet));
        }

        if (ctx.XML() != null) {
            htmlDocument.setXml(ctx.XML().getText());
        }
        if (ctx.DTD() != null) {
            htmlDocument.setDtd(ctx.DTD().getText());
        }


        for (ParserFile.HtmlElementsContext elements : ctx.htmlElements()) {
            HtmlElements htmlElements = (HtmlElements) visitHtmlElements(elements);
            for (HtmlElement htmlElement : htmlElements.getHtmlElements()) {
                htmlDocument.addHtmlElement(htmlElement); // Add individual HtmlElement
            }
        }
//        Row row = new Row();
//        row.setType("Html Document");
//        row.setValue(htmlDocument.toString());
//        st.getRow().add(row);

        return htmlDocument;
    }

    @Override
    public HtmlElements visitHtmlElements(ParserFile.HtmlElementsContext ctx) {
        HtmlElements elements = new HtmlElements();


        if (ctx.htmlElement() != null) {
            HtmlElement htmlElement = (HtmlElement) visitHtmlElement(ctx.htmlElement());
            elements.setHtmlElements(htmlElement);
        }
//        Row row = new Row();
//        row.setType("Html Elements");
//        row.setValue(elements.toString());
//        st.getRow().add(row);

        return elements;
    }

    @Override
    public HtmlElement visitHtmlElement(ParserFile.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();

        // Opening tag name
        if (ctx.TAG_NAME() != null && !ctx.TAG_NAME().isEmpty()) {
            String tagName = ctx.TAG_NAME(0).getText();
            htmlElement.setTagName(tagName);
        }

        // Attributes
        for (ParserFile.HtmlAttributeContext attribute : ctx.htmlAttribute()) {
            HtmlAttribute htmlAttribute = (HtmlAttribute) visitHtmlAttribute(attribute);
            htmlElement.addHtmlAttribute(htmlAttribute);
        }

        // Bindings
        for (ParserFile.BindingContext bindingCtx : ctx.binding()) {
            Binding binding = (Binding) visitBinding(bindingCtx);
            htmlElement.addBinding(binding);
        }

        // Directives
        for (ParserFile.DirectiveContext directiveCtx : ctx.directive()) {
            Directive directive = (Directive) visitDirective(directiveCtx);
            htmlElement.addDirective(directive);
        }

        // Hashes
        for (ParserFile.HashContext hashCtx : ctx.hash()) {
            Hash hash = (Hash) visitHash(hashCtx);
            htmlElement.addHash(hash);
        }

        // Decide if this is self-closing (by grammar alternative OR by tag name)
        boolean explicitSelfClose = ctx.TAG_SLASH_CLOSE() != null;
        boolean voidByName = HtmlElement.isSelfClosingTag(htmlElement.getTagName());
        htmlElement.setSelfClosing(explicitSelfClose || voidByName);

        // Attach children only if not self-closing
        if (!htmlElement.isSelfClosing() && ctx.htmlContent() != null) {
            HtmlContent htmlContent = (HtmlContent) visitHtmlContent(ctx.htmlContent());
            htmlElement.setHtmlContents(htmlContent);
        }

        // Normal tags: check for matching closing name
        if (!htmlElement.isSelfClosing() && ctx.TAG_NAME().size() > 1) {
            String openName = ctx.TAG_NAME(0).getText();
            String closeName = ctx.TAG_NAME(1).getText();
            if (!openName.equalsIgnoreCase(closeName)) {
                System.err.println("Warning: mismatched tag names: <" + openName + "> ... </" + closeName + ">");
            }
        }

        return htmlElement;
    }

    @Override
    public HtmlContent visitHtmlContent(ParserFile.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();
        int order = 0;

        for (ParseTree child : ctx.children) {
            if (child instanceof ParserFile.HtmlElementContext) {
                HtmlElement htmlElement = (HtmlElement) visitHtmlElement((ParserFile.HtmlElementContext) child);
                htmlElement.setOrder(order++);
                htmlContent.getChildren().add(htmlElement);
            } else if (child instanceof ParserFile.HtmlChardataContext) {
                HtmlChardata data = (HtmlChardata) visitHtmlChardata((ParserFile.HtmlChardataContext) child);
                if (data.hasContent()) {
                    data.setOrder(order++);
                    htmlContent.getChildren().add(data);
                }
            } else if (child instanceof TerminalNode) {
                // Skip structural tokens
            }
        }

        return htmlContent;
    }

    @Override
    public HtmlChardata visitHtmlChardata(ParserFile.HtmlChardataContext ctx) {
        HtmlChardata chardata = new HtmlChardata();

        if (ctx.HTML_TEXT() != null) {
            chardata.setHtmlText(ctx.HTML_TEXT().getText());
        }
        if (ctx.INTERPOLATION() != null) {
            chardata.setInter(ctx.INTERPOLATION().getText());
        }
        // SEA_WS is preserved separately if you decide to keep whitespace nodes

        return chardata;
    }





    @Override
    public HtmlAttribute visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        if (ctx.TAG_NAME() != null) {
            htmlAttribute.setName(ctx.TAG_NAME().getText());
        }
        // Handle boolean attributes (e.g., required) that may not have a value
        if (ctx.ATTVALUE_VALUE() != null) {
            htmlAttribute.setValue(ctx.ATTVALUE_VALUE().getText());
        }

//        Row row = new Row();
//        row.setType("Html Attribute");
//        row.setValue(htmlAttribute.toString());
//        st.getRow().add(row);

        return htmlAttribute;
    }

    @Override
    public Binding visitBinding(ParserFile.BindingContext ctx) {
        Binding binding = new Binding();
        binding.setBinding(ctx.BINDING().getText());
        binding.setValue(ctx.ATTVALUE_VALUE().getText());


//        Row row = new Row();
//        row.setType("Binding");
//        row.setValue(binding.toString());
//        st.getRow().add(row);
        return binding;
    }

    @Override
    public Hash visitHash(ParserFile.HashContext ctx) {
        Hash hash= new Hash();
        hash.setHash(ctx.HASH().getText());
        hash.setValue(ctx.ATTVALUE_VALUE().getText());


//        Row row = new Row();
//        row.setType("Binding");
//        row.setValue(binding.toString());
//        st.getRow().add(row);
        return hash;
    }

    @Override
    public Directive visitDirective(ParserFile.DirectiveContext ctx) {
        Directive directive = new Directive();
        directive.setNg(ctx.DIRECTIVE().getText());
        directive.setValue(ctx.ATTVALUE_VALUE().getText());


//        Row row = new Row();
//        row.setType("Directive");
//        row.setValue(directive.toString());
//        st.getRow().add(row);

        return directive;
    }




    private boolean isVariableDefined(String name) {
        for (Row row : st.getRow()) {
            if (row.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

}



