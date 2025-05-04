// Generated from D:/uni_projects/4th_year_projects/first_semester/compiler/projects/angular_compiler/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserFile}.
 */
public interface ParserFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserFile.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserFile.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(ParserFile.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(ParserFile.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(ParserFile.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(ParserFile.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#componentBody}.
	 * @param ctx the parse tree
	 */
	void enterComponentBody(ParserFile.ComponentBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#componentBody}.
	 * @param ctx the parse tree
	 */
	void exitComponentBody(ParserFile.ComponentBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ParserFile.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ParserFile.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#template_Url}.
	 * @param ctx the parse tree
	 */
	void enterTemplate_Url(ParserFile.Template_UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#template_Url}.
	 * @param ctx the parse tree
	 */
	void exitTemplate_Url(ParserFile.Template_UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(ParserFile.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(ParserFile.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(ParserFile.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(ParserFile.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#style_Urls}.
	 * @param ctx the parse tree
	 */
	void enterStyle_Urls(ParserFile.Style_UrlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#style_Urls}.
	 * @param ctx the parse tree
	 */
	void exitStyle_Urls(ParserFile.Style_UrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#inject}.
	 * @param ctx the parse tree
	 */
	void enterInject(ParserFile.InjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#inject}.
	 * @param ctx the parse tree
	 */
	void exitInject(ParserFile.InjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#provided_in}.
	 * @param ctx the parse tree
	 */
	void enterProvided_in(ParserFile.Provided_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#provided_in}.
	 * @param ctx the parse tree
	 */
	void exitProvided_in(ParserFile.Provided_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(ParserFile.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(ParserFile.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ParserFile.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ParserFile.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#init_array}.
	 * @param ctx the parse tree
	 */
	void enterInit_array(ParserFile.Init_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#init_array}.
	 * @param ctx the parse tree
	 */
	void exitInit_array(ParserFile.Init_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ParserFile.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ParserFile.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ParserFile.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ParserFile.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperty(ParserFile.ObjectPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperty(ParserFile.ObjectPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ParserFile.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ParserFile.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ParserFile.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ParserFile.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#this_exp}.
	 * @param ctx the parse tree
	 */
	void enterThis_exp(ParserFile.This_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#this_exp}.
	 * @param ctx the parse tree
	 */
	void exitThis_exp(ParserFile.This_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#super_exp}.
	 * @param ctx the parse tree
	 */
	void enterSuper_exp(ParserFile.Super_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#super_exp}.
	 * @param ctx the parse tree
	 */
	void exitSuper_exp(ParserFile.Super_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(ParserFile.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(ParserFile.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#else_if_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_condition(ParserFile.Else_if_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#else_if_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_condition(ParserFile.Else_if_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(ParserFile.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(ParserFile.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ParserFile.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ParserFile.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ParserFile.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ParserFile.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(ParserFile.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(ParserFile.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ParserFile.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ParserFile.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ParserFile.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ParserFile.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ParserFile.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ParserFile.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ParserFile.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ParserFile.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(ParserFile.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(ParserFile.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(ParserFile.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(ParserFile.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#function_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_decl(ParserFile.Function_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#function_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_decl(ParserFile.Function_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(ParserFile.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(ParserFile.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#class_decl}.
	 * @param ctx the parse tree
	 */
	void enterClass_decl(ParserFile.Class_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#class_decl}.
	 * @param ctx the parse tree
	 */
	void exitClass_decl(ParserFile.Class_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#interface}.
	 * @param ctx the parse tree
	 */
	void enterInterface(ParserFile.InterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#interface}.
	 * @param ctx the parse tree
	 */
	void exitInterface(ParserFile.InterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(ParserFile.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(ParserFile.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(ParserFile.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(ParserFile.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(ParserFile.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(ParserFile.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ParserFile.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ParserFile.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(ParserFile.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(ParserFile.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(ParserFile.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(ParserFile.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(ParserFile.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(ParserFile.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(ParserFile.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(ParserFile.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(ParserFile.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(ParserFile.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(ParserFile.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(ParserFile.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(ParserFile.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(ParserFile.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(ParserFile.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(ParserFile.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(ParserFile.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(ParserFile.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(ParserFile.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ParserFile.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ParserFile.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(ParserFile.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(ParserFile.StyleContext ctx);
}