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
	 * Visit a parse tree produced by {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(ParserFile.InstructionContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(ParserFile.StatementsContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ParserFile.ValueContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#this_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis_exp(ParserFile.This_expContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ParserFile.ConditionContext ctx);
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
	 * Visit a parse tree produced by {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ParserFile.ExprContext ctx);
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