// Generated from D:/uni_projects/4th_year_projects/first_semester/compiler/projects/angular_compiler/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserFile}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserFile.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IMPORT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIMPORT_INSTRUCT(ParserFile.IMPORT_INSTRUCTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMPONENT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMPONENT_INSTRUCT(ParserFile.COMPONENT_INSTRUCTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INJECT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINJECT_INSTRUCT(ParserFile.INJECT_INSTRUCTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STATEMENTS_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTATEMENTS_INSTRUCT(ParserFile.STATEMENTS_INSTRUCTContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(ParserFile.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#componentBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBody(ParserFile.ComponentBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#stanalone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStanalone(ParserFile.StanaloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ParserFile.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#template_Url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate_Url(ParserFile.Template_UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(ParserFile.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(ParserFile.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#style_Urls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_Urls(ParserFile.Style_UrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#inject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInject(ParserFile.InjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#provided_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvided_in(ParserFile.Provided_inContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CLASS_DECLAR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCLASS_DECLAR_STATE(ParserFile.CLASS_DECLAR_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INTERFACE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINTERFACE_STATE(ParserFile.INTERFACE_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNC_DECL_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNC_DECL_STATE(ParserFile.FUNC_DECL_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTR_STATE(ParserFile.CONSTR_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INIT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINIT_STATE(ParserFile.INIT_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INIT_ARRAY_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINIT_ARRAY_STATE(ParserFile.INIT_ARRAY_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code READ_ONLY_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitREAD_ONLY_STATE(ParserFile.READ_ONLY_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code INSTANCE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitINSTANCE_STATE(ParserFile.INSTANCE_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DECLARE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDECLARE_STATE(ParserFile.DECLARE_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN_STATE(ParserFile.ASSIGN_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF_CONDITION_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF_CONDITION_STATE(ParserFile.IF_CONDITION_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FOR_LOOP_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOR_LOOP_STATE(ParserFile.FOR_LOOP_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WHILE_LOOP_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWHILE_LOOP_STATE(ParserFile.WHILE_LOOP_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEXPR_STATE(ParserFile.EXPR_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code THIS_EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTHIS_EXPR_STATE(ParserFile.THIS_EXPR_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUPER_EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUPER_EXPR_STATE(ParserFile.SUPER_EXPR_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PRINT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPRINT_STATE(ParserFile.PRINT_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VALUE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVALUE_STATE(ParserFile.VALUE_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RETRUN_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRETRUN_STATE(ParserFile.RETRUN_STATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COMMENT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOMMENT_STATE(ParserFile.COMMENT_STATEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ParserFile.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ParserFile.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#init_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_array(ParserFile.Init_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(ParserFile.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(ParserFile.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#readOnly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadOnly(ParserFile.ReadOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance(ParserFile.InstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ParserFile.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(ParserFile.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#super_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_exp(ParserFile.Super_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(ParserFile.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#else_if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_condition(ParserFile.Else_if_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#else_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_condition(ParserFile.Else_conditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_COND}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_COND(ParserFile.ID_CONDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAL_COND}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAL_COND(ParserFile.VAL_CONDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAL_OPERA_VAL}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAL_OPERA_VAL(ParserFile.VAL_OPERA_VALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VAL_OPERA_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAL_OPERA_ID(ParserFile.VAL_OPERA_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_OPERA_VAL}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_OPERA_VAL(ParserFile.ID_OPERA_VALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_OPERA_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_OPERA_ID(ParserFile.ID_OPERA_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_OPERA_DOT_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_OPERA_DOT_ID(ParserFile.ID_OPERA_DOT_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(ParserFile.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(ParserFile.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ParserFile.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SENT_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSENT_EXPR(ParserFile.SENT_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code METHOD_CALL_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMETHOD_CALL_EXPR(ParserFile.METHOD_CALL_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MINUS2}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMINUS2(ParserFile.MINUS2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code THIS_PROP_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTHIS_PROP_EXPR(ParserFile.THIS_PROP_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NEW_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNEW_EXPR(ParserFile.NEW_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARROW_FUNC_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARROW_FUNC_EXPR(ParserFile.ARROW_FUNC_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMINUS(ParserFile.MINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDIV(ParserFile.DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID_EXPR(ParserFile.ID_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ASSIGN_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitASSIGN_EXPR(ParserFile.ASSIGN_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLUS2}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLUS2(ParserFile.PLUS2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code VAL_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVAL_EXPR(ParserFile.VAL_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OBJECT_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOBJECT_EXPR(ParserFile.OBJECT_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ARRAY_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitARRAY_EXPR(ParserFile.ARRAY_EXPRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULTI}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULTI(ParserFile.MULTIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PLUS}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPLUS(ParserFile.PLUSContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#this_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_exp(ParserFile.This_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#property_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_chain(ParserFile.Property_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(ParserFile.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ParserFile.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#post_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_op(ParserFile.Post_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ParserFile.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#spreadElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpreadElement(ParserFile.SpreadElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(ParserFile.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ParserFile.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ParserFile.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#typeReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReference(ParserFile.TypeReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(ParserFile.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(ParserFile.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#function_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_decl(ParserFile.Function_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(ParserFile.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#class_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_decl(ParserFile.Class_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(ParserFile.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(ParserFile.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(ParserFile.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(ParserFile.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(ParserFile.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(ParserFile.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(ParserFile.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(ParserFile.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(ParserFile.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinding(ParserFile.BindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash(ParserFile.HashContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(ParserFile.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(ParserFile.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(ParserFile.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(ParserFile.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(ParserFile.StyleContext ctx);
}