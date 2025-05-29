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
import AST.Html.*;
import AST.Instruction;
import AST.Program;
import AST.Statements;
import Symbol_table.Row;
import Symbol_table.SemanticChecker;
import Symbol_table.SymbolTable;
import antlr.ParserFile;
import antlr.ParserFileBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import semantic.*;

import javax.swing.text.DefaultCaret;
import java.util.*;

public class AngularVisitor extends ParserFileBaseVisitor {


    public SymbolTable st = new SymbolTable();
    private Set<String> selectorSet = new HashSet<>();
    private List<SemanticError> semanticErrors = new ArrayList<>();

    public List<SemanticError> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    public Program visitProgram(ParserFile.ProgramContext ctx) {
        st.enterScope("global");
        Program program = new Program();
        for (int i = 0; i<ctx.instruction().size(); i++) {
            if (ctx.instruction(i)!=null)
                program.setInstructions_list((Instruction) visit(ctx.instruction(i)));
        }
        // this.st.print();
        st.exitScope();
        return program;

    }

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
        return super.visitSTATEMENTS_INSTRUCT(ctx);
    }


    /*@Override
    public Instruction visitInstruction(ParserFile.InstructionContext ctx) {
        List<Component> components = new ArrayList<>();
        List<ImportState> importStates = new ArrayList<>();
        List<Inject> injects = new ArrayList<>();
        List<Statements> statements = new ArrayList<>();


        if (ctx.statements() != null) {
            Statements statement = (Statements) visit(ctx.statements());
            statements.add(statement);
        }


        if (ctx.component() != null) {

            Component component = (Component) visitComponent(ctx.component());
            components.add(component);

        }

        if (ctx.inject() != null) {

            Inject inject = (Inject) visitInject(ctx.inject());
            injects.add(inject);

        }

        if (ctx.import_statement() != null) {

            for (ParserFile.Import_statementContext importCtx : ctx.import_statement()) {
                ImportState importState = (ImportState) visitImport_statement(importCtx);
                importStates.add(importState);
            }
        }

        Instruction instruction = new Instruction(components, importStates, injects, statements);

        Row row = new Row();

        row.setType("instruction");
        row.setValue(instruction.toString());
        row.setScope(st.getCurrentScope());
        st.getRow().add(row);

        return instruction;
    }*/
    @Override
    public Object visitCLASS_DECLAR_STATE(ParserFile.CLASS_DECLAR_STATEContext ctx) {
        return super.visitCLASS_DECLAR_STATE(ctx);
    }

    @Override
    public Statements visitINTERFACE_STATE(ParserFile.INTERFACE_STATEContext ctx) {
        return (Statements) super.visitINTERFACE_STATE(ctx);
    }

    @Override
    public Object visitFUNC_DECL_STATE(ParserFile.FUNC_DECL_STATEContext ctx) {
        return super.visitFUNC_DECL_STATE(ctx);
    }

    @Override
    public Object visitCONSTR_STATE(ParserFile.CONSTR_STATEContext ctx) {
        return super.visitCONSTR_STATE(ctx);
    }

    @Override
    public Object visitINIT_STATE(ParserFile.INIT_STATEContext ctx) {
        return super.visitINIT_STATE(ctx);
    }

    @Override
    public Object visitINIT_ARRAY_STATE(ParserFile.INIT_ARRAY_STATEContext ctx) {
        return super.visitINIT_ARRAY_STATE(ctx);
    }

    @Override
    public Object visitDECLARE_STATE(ParserFile.DECLARE_STATEContext ctx) {
        return super.visitDECLARE_STATE(ctx);
    }

    @Override
    public Object visitASSIGN_STATE(ParserFile.ASSIGN_STATEContext ctx) {
        return super.visitASSIGN_STATE(ctx);
    }

    @Override
    public Object visitIF_CONDITION_STATE(ParserFile.IF_CONDITION_STATEContext ctx) {
        return super.visitIF_CONDITION_STATE(ctx);
    }

    @Override
    public Object visitFOR_LOOP_STATE(ParserFile.FOR_LOOP_STATEContext ctx) {
        return super.visitFOR_LOOP_STATE(ctx);
    }

    @Override
    public Object visitWHILE_LOOP_STATE(ParserFile.WHILE_LOOP_STATEContext ctx) {
        return super.visitWHILE_LOOP_STATE(ctx);
    }

    @Override
    public Object visitEXPR_STATE(ParserFile.EXPR_STATEContext ctx) {
        return super.visitEXPR_STATE(ctx);
    }

    @Override
    public Object visitTHIS_EXPR_STATE(ParserFile.THIS_EXPR_STATEContext ctx) {
        return super.visitTHIS_EXPR_STATE(ctx);
    }

    @Override
    public Object visitSUPER_EXPR_STATE(ParserFile.SUPER_EXPR_STATEContext ctx) {
        return super.visitSUPER_EXPR_STATE(ctx);
    }

    @Override
    public Object visitPRINT_STATE(ParserFile.PRINT_STATEContext ctx) {
        return super.visitPRINT_STATE(ctx);
    }

    @Override
    public Object visitVALUE_STATE(ParserFile.VALUE_STATEContext ctx) {
        return super.visitVALUE_STATE(ctx);
    }

    @Override
    public Object visitRETRUN_STATE(ParserFile.RETRUN_STATEContext ctx) {
        return super.visitRETRUN_STATE(ctx);
    }

    @Override
    public Object visitCOMMENT_STATE(ParserFile.COMMENT_STATEContext ctx) {
        return super.visitCOMMENT_STATE(ctx);
    }





/*
    @Override
    public Statements visitStatements(ParserFile.StatementsContext ctx) {
        Statements statements = new Statements();
        if (ctx.for_() != null) {
            ForLoop forLoop = (ForLoop) visit(ctx.for_());
            statements.getForLoops().add(forLoop);
        }
        if (ctx.while_()!= null) {
            While whiles = (While) visitWhile(ctx.while_());
            statements.getWhiles().add(whiles);
        }

        if (ctx.if_condition() != null) {
            IfStatement ifStatement = (IfStatement) visit(ctx.if_condition());
            statements.getIfStatements().add(ifStatement);
        }

        if (ctx.declaration() != null) {

            Declaration declaration = (Declaration) visitDeclaration(ctx.declaration());
            statements.getDeclarations().add(declaration);

        }
        if (ctx.init() != null) {

            Init init = (Init) visitInit(ctx.init());
            statements.getInits().add(init);}



        if (ctx.init_array() != null) {

            InitArray initArray = (InitArray) visitInit_array(ctx.init_array());
            statements.getInitArrays().add(initArray);

        }
        if (ctx.return_() != null) {
            Return retrun=(Return) visitReturn(ctx.return_());
            statements.getReturns().add(retrun);}

        if (ctx.assign() != null) {
          Assign assign= visitAssign(ctx.assign());
            statements.getAssigns().add(assign);}

        if (ctx.this_exp() != null) {
            ThisExpression thisExpr = (ThisExpression) visitThis_exp(ctx.this_exp());
            statements.getThisExpressions().add(thisExpr);
        }
        if (ctx.super_exp() != null) {
            SuperExp superExpr = (SuperExp) visitSuper_exp(ctx.super_exp());
            statements.getSuperExpressions().add(superExpr);
        }
        if (ctx.print()!= null) {

            Print print = (Print) visit(ctx.print());
            statements.getPrintStatements().add(print);

        }

        if (ctx.function_decl() != null) {

            FuncDecl funcDecl = (FuncDecl) visitFunction_decl(ctx.function_decl());
            statements.getFuncDecls().add(funcDecl);

        }
        if (ctx.constructor() != null) {

            Constructor cons = (Constructor) visitConstructor(ctx.constructor());
            statements.getCons().add(cons);

        }
        if (ctx.class_decl() != null) {

            ClassDecl classDecl = (ClassDecl) visitClass_decl(ctx.class_decl());
            statements.getClassDecls().add(classDecl);

        }
        if (ctx.interface_() != null) {

            Interface inter = (Interface)visitInterface(ctx.interface_());
            statements.getInterfaces().add(inter);

        }
        if (ctx.expr()!= null) {
            Expression exps = (Expression) visitExpr(ctx.expr());
            statements.getExps().add(exps);
        }

        statements.setType("Statements");

        Row row = new Row();

        row.setType("statements");
        row.setValue(statements.toString());
        row.setScope(st.getCurrentScope());
        st.getRow().add(row);

        return statements;
    }
*/

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

        ComponentBody componentBody = new ComponentBody(selector, template, imports, styleUrls, templateUrl);

        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();
        String componentName = "component_" + line;

        if (selector == null || selector.getValue() == null || selector.getValue().isEmpty()) {
            semanticErrors.add(new MissingSelectorError(componentName, line, column));
        } else {
            String selectorValue = selector.getValue();
            if (!selectorSet.add(selectorValue)) {
                semanticErrors.add(new DuplicateSelectorError(selectorValue, line, column));
            }
        }

        return componentBody;
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

//
//        Row row = new Row();
//
//        row.setType("imports");
//        row.setValue(imports.toString());
//        st.getRow().add(row);

        return imports;


    }

    @Override
    public Style_Urls visitStyle_Urls(ParserFile.Style_UrlsContext ctx) {
        List<String> styleUrlsList = new ArrayList<>();


        TerminalNode styleUrlNode = ctx.VAL();
        if (styleUrlNode != null) {
            styleUrlsList.add(styleUrlNode.getText());
        }
//        Row row = new Row();
//
//        row.setType("style_urls");
//        row.setValue(styleUrlsList.toString());
//        st.getRow().add(row);
        return new Style_Urls(styleUrlsList);
    }
    @Override
    public Template_Url visitTemplate_Url(ParserFile.Template_UrlContext ctx) {
        List<String> templateUrlList = new ArrayList<>();


        TerminalNode templateUrlNode = ctx.VAL();
        if (templateUrlNode != null) {
            templateUrlList.add(templateUrlNode.getText());
      }
//        Row row = new Row();
//
//        row.setType("Template_url");
//        row.setName("template_url");
//        row.setValue(templateUrlList.toString());
//        st.getRow().add(row);
        return new Template_Url(templateUrlList);
    }


    @Override
    public Inject visitInject(ParserFile.InjectContext ctx) {

        ProvidedIn providedIn = (ProvidedIn) visit(ctx.provided_in());

        Inject injectObj = new Inject(providedIn);

//        Row row = new Row();
//
//        row.setType("inject");
//        row.setValue(injectObj.toString());
//        st.getRow().add(row);

        return injectObj;
    }

    @Override
    public ProvidedIn visitProvided_in(ParserFile.Provided_inContext ctx) {
        String value = ctx.VAL().getText();


        ProvidedIn providedInObj = new ProvidedIn(value);


//        Row row = new Row();
//
//        row.setType("provided_in");
//        row.setValue(providedInObj.toString());
//        st.getRow().add(row);

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
        String value = ctx.VAL() != null ? ctx.VAL().getText() : null;

        String currentScope = st.getCurrentScope();
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        // Check for duplicate variable declaration in the same scope
        for (Row existing : st.getRow()) {
            if (existing != null && name.equals(existing.getName()) && currentScope.equals(existing.getScope())) {
                semanticErrors.add(new DuplicateVariableError(name, line, column));
                // Return Init anyway if you want to keep the tree structure
                return new Init(dataType, name, value);
            }
        }

        // Create and add new row
        Row row = new Row();
        row.setType(dataType);
        row.setName(name);
        row.setValue(value);
        row.setScope(currentScope);
        row.setLine(line);
        row.setColumn(column);

        st.getRow().add(row);

        return new Init(dataType, name, value);
    }



    @Override
    public InitArray visitInit_array(ParserFile.Init_arrayContext ctx) {

        String name = ctx.ID() != null ? ctx.ID().getText() : "unnamed";
        InitArray initArray = new InitArray(name);
        String dataType = ctx.DATA_TYPE() != null ? ctx.DATA_TYPE().getText() :"undefined";

        Row arrayRow = new Row();
        arrayRow.setType(dataType);
        arrayRow.setName(name);
        arrayRow.setScope(st.getCurrentScope());
        st.getRow().add(arrayRow);


        if (ctx.value() != null) {
            for (ParserFile.ValueContext valueCtx : ctx.value()) {
                Value value = (Value) visit(valueCtx);
                initArray.addValue(value);
            }
        }


        arrayRow.setValue(initArray.getValues().toString());

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
//        Row row = new Row();
//
//        row.setType("If Statement");
//        row.setValue(body.toString());
//        row.setScope(st.getCurrentScope());
//        st.getRow().add(row);
//        st.exitScope();
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
    /*  @Override
      public Condition visitCondition(ParserFile.ConditionContext ctx) {
          // Handling the case where the condition is of the form ID OPERATION ID DOT ID
          if (ctx.ID().size() == 3 && ctx.DOT() != null) {
              Condition left = new IdentifierCondition(ctx.ID(0).getText()); // First ID
              String operation = ctx.OPERATION().getText();
              Condition right = new IdentifierCondition(ctx.ID(1).getText() + "." + ctx.ID(2).getText()); // Combine second and third IDs
              return new BinaryCondition(left, operation, right);
          }

          // Handling the case for ID OPERATION ID
          if (ctx.ID().size() == 2) {
              Condition left = new IdentifierCondition(ctx.ID(0).getText()); // First ID
              String operation = ctx.OPERATION().getText();
              Condition right = new IdentifierCondition(ctx.ID(1).getText()); // Second ID
              return new BinaryCondition(left, operation, right);
          }

          // Handling the case for VAL OPERATION VAL or VAL OPERATION ID
          if (ctx.VAL() != null && ctx.VAL().size() > 0) {
              Condition left = new ValueCondition(ctx.VAL(0).getText()); // Access the first VAL
              String operation = ctx.OPERATION().getText();

              if (ctx.ID().size() == 1) {
                  Condition right = new IdentifierCondition(ctx.ID(0).getText());
                  return new BinaryCondition(left, operation, right);
              }

              // If both left and right are VAL, handle this case
              if (ctx.ID().size() == 0) {
                  return left; // Just return the ValueCondition
              }
          }

          // Handling the case for ID OPERATION VAL
          if (ctx.ID().size() == 1 && ctx.VAL() != null && ctx.VAL().size() > 0) {
              Condition left = new IdentifierCondition(ctx.ID(0).getText());
              String operation = ctx.OPERATION().getText();
              Condition right = new ValueCondition(ctx.VAL(0).getText()); // Access the first VAL
              return new BinaryCondition(left, operation, right);
          }

          // For simple ID or VAL
          if (ctx.ID().size() == 1) {
              return new IdentifierCondition(ctx.ID(0).getText());
          } else if (ctx.VAL() != null && ctx.VAL().size() > 0) {
              return new ValueCondition(ctx.VAL(0).getText()); // Access the first VAL
          }

          return null; // Return null or handle invalid cases
      }*/
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

    /*@Override
    public Expression visitExpr(ParserFile.ExprContext ctx) {

        if (ctx.MUL() != null) {
            return new BinaryExpression(
                    (Expression) visit(ctx.expr(0)),
                    "*",
                    (Expression) visit(ctx.expr(1))
            );
        } else if (ctx.DIV() != null) {
            return new BinaryExpression(
                    (Expression) visit(ctx.expr(0)),
                    "/",
                    (Expression) visit(ctx.expr(1))
            );
        } else if (ctx.PLUS() != null) {
            return new BinaryExpression(
                    (Expression) visit(ctx.expr(0)),
                    "+",
                    (Expression) visit(ctx.expr(1))
            );
        } else if (ctx.MINUS() != null) {
            return new BinaryExpression(
                    (Expression) visit(ctx.expr(0)),
                    "-",
                    (Expression) visit(ctx.expr(1))
            );
        } else if (ctx.PLUS_PLUS() != null) {
            return new UnaryExpression("++", (Expression) visit(ctx.expr(0)));
        } else if (ctx.MINUS_MINUS() != null) {
            return new UnaryExpression("--", (Expression) visit(ctx.expr(0)));
        } else if (ctx.VAL() != null) {
            return new ValueExpression(ctx.VAL().getText());
        } else if (ctx.ID() != null) {
            return new ValueExpression(ctx.ID().getText());
        } else if (ctx.SENTENCE() != null) {
            return new ValueExpression(ctx.SENTENCE().getText());
        }

        return null;
    }*/
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
    public Object visitObjectProperty(ParserFile.ObjectPropertyContext ctx) {
        String id = ctx.ID().getText();
        String value = ctx.VAL().getText();
        return new ObjectProperty(id, value);

    }




    @Override
    public Declaration visitDeclaration(ParserFile.DeclarationContext ctx) {
        String name = ctx.ID() != null ? ctx.ID().getText() : "unnamed";
        String dataType = ctx.DATA_TYPE() != null ? ctx.DATA_TYPE().getText() : "undefined";



        Declaration declaration = new Declaration(name, dataType);
        Row row = new Row();

        row.setType(dataType);
        row.setName(name);
        row.setValue("declaration");
        row.setScope(st.getCurrentScope());
        st.getRow().add(row);
//        SemanticChecker semantic=new SemanticChecker();
//        semantic.setSymbolTable(this.st);
//        semantic.check();

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
    @Override
    public Object visitThis_exp(ParserFile.This_expContext ctx) {

        String identifier = ctx.ID(0).getText();
        List<String> chainedIdentifiers = new ArrayList<>();
        for (int i = 1; i < ctx.ID().size(); i++) {
            chainedIdentifiers.add(ctx.ID(i).getText());
        }
        ThisExpression thisExpr = new ThisExpression(identifier, chainedIdentifiers);
        String value = null;
        if (ctx.VAL() != null) {
            value = ctx.VAL().getText();
        } else if (ctx.ID().size() > 1) {
            value = ctx.ID(ctx.ID().size() - 1).getText();
        } else {
            throw new IllegalArgumentException("Invalid assignment context: no value found.");
        }


        Row row = new Row();
        row.setType("this");
        row.setValue(value);
        row.setScope(st.getCurrentScope());
        row.setName(identifier);

        st.getRow().add(row);

        return thisExpr;
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


            Row row = new Row();
            row.setType("Super");
            row.setName(firstProperty);
            row.setValue(value);
            row.setScope(st.getCurrentScope());
            st.getRow().add(row);

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


            Row row = new Row();
            row.setType("Super");
            row.setName(methodName);
            row.setValue(superExp.toString());
            row.setScope(st.getCurrentScope());
            st.getRow().add(row);

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


        Row row = new Row();

        row.setType("Return");
        row.setName("return");
        row.setValue(returnStatement.toString());
        row.setScope(st.getCurrentScope());
        st.getRow().add(row);

        return returnStatement;
    }

    @Override
    public Parameter visitParameter(ParserFile.ParameterContext ctx) {
        Parameter parameter = new Parameter();

        parameter.setName(ctx.ID().getText());


        if (ctx.DATA_TYPE() != null) {
       //     parameter.setType(ctx.DATA_TYPE().getText());
        } else {
        //    parameter.setType("unknown");
        }
    //    Row row = new Row();
//
//        row.setType("Parameters");
//        row.setValue(parameter.toString());
//        st.getRow().add(row);
        return parameter;
    }
    @Override
    public FuncDecl visitFunction_decl(ParserFile.Function_declContext ctx) {
        st.enterScope("function");

        FuncDecl funcDecl = new FuncDecl();
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
    public ImportState visitImport_statement(ParserFile.Import_statementContext ctx) {  ImportState importStatement = new ImportState();


        if (ctx.ID() != null && !ctx.ID().isEmpty()) {

            importStatement.setImportType(ctx.ID().get(0).getText());


            if (ctx.VAL() != null ) {

                importStatement.setFromPath(ctx.VAL().getText());
            } else {

                System.err.println("Warning: No 'from' path found in import statement.");
            }
        } else {

            System.err.println("Warning: No IDs found in import statement.");
        }


//        Row row = new Row();
//        row.setType("Import");
//        row.setValue(importStatement.toString());
//        st.getRow().add(row);


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
    public Object visitHtmlElement(ParserFile.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();
        if(ctx.TAG_NAME()!=null){
            htmlElement.setTagName(ctx.TAG_NAME().getText());}


        for (ParserFile.HtmlAttributeContext attribute : ctx.htmlAttribute()) {
            HtmlAttribute htmlAttribute = (HtmlAttribute) visitHtmlAttribute(attribute);
            htmlElement.getHtmlAttributes().add(htmlAttribute);
        }


        if (ctx.binding() != null) {
            Binding binding = (Binding) visitBinding(ctx.binding());
            htmlElement.setBindings(binding);
        }


        if (ctx.directive() != null) {
            Directive directive = (Directive) visitDirective(ctx.directive());
            htmlElement.setDirectives(directive);
        }


        if (ctx.htmlContent() != null) {
            HtmlContent htmlContent = (HtmlContent) visitHtmlContent(ctx.htmlContent());
            htmlElement.setHtmlContents(htmlContent);
        }

//        Row row = new Row();
//        row.setType("Html Element");
//        row.setValue(htmlElement.toString());
//        st.getRow().add(row);
        return htmlElement;
    }


    @Override
    public HtmlAttribute visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx) {
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        htmlAttribute.setTagName(ctx.TAG_NAME().getText());
        htmlAttribute.setValue(ctx.ATTVALUE_VALUE().getText());

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

    @Override
    public HtmlContent visitHtmlContent(ParserFile.HtmlContentContext ctx) {
        HtmlContent htmlContent = new HtmlContent();

        if(ctx.htmlElement() !=null){
            for (ParserFile.HtmlElementContext element : ctx.htmlElement()) {
                HtmlElement htmlElement = (HtmlElement) visitHtmlElement(element);
                htmlContent.getHtmlElements().add(htmlElement);
            }}

        for (ParserFile.HtmlChardataContext chardata : ctx.htmlChardata()) {
            HtmlChardata data = (HtmlChardata) visit(chardata);
            htmlContent.getData().add(data);

//            Row row = new Row();
//            row.setType("Html Content");
//            row.setValue(htmlContent.toString());
//            st.getRow().add(row);
        }

        return htmlContent;
    }



    @Override
    public HtmlChardata visitHtmlChardata(ParserFile.HtmlChardataContext ctx) {
        HtmlChardata chardata = new HtmlChardata();
        if(ctx.HTML_TEXT()!=null) {
            chardata.setHtmlText(ctx.HTML_TEXT().getText());
        }
        if(ctx.INTERPOLATION()!=null) {
            chardata.setInter(ctx.INTERPOLATION().getText());
        }


//        Row row = new Row();
//        row.setType("CharData");
//        row.setValue(chardata.toString());
//        st.getRow().add(row);
        return chardata;
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



