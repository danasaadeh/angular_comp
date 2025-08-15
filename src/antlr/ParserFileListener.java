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
	 * Enter a parse tree produced by the {@code IMPORT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void enterIMPORT_INSTRUCT(ParserFile.IMPORT_INSTRUCTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IMPORT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void exitIMPORT_INSTRUCT(ParserFile.IMPORT_INSTRUCTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPONENT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void enterCOMPONENT_INSTRUCT(ParserFile.COMPONENT_INSTRUCTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPONENT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void exitCOMPONENT_INSTRUCT(ParserFile.COMPONENT_INSTRUCTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INJECT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void enterINJECT_INSTRUCT(ParserFile.INJECT_INSTRUCTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INJECT_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void exitINJECT_INSTRUCT(ParserFile.INJECT_INSTRUCTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STATEMENTS_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSTATEMENTS_INSTRUCT(ParserFile.STATEMENTS_INSTRUCTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STATEMENTS_INSTRUCT}
	 * labeled alternative in {@link ParserFile#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSTATEMENTS_INSTRUCT(ParserFile.STATEMENTS_INSTRUCTContext ctx);
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
	 * Enter a parse tree produced by {@link ParserFile#stanalone}.
	 * @param ctx the parse tree
	 */
	void enterStanalone(ParserFile.StanaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#stanalone}.
	 * @param ctx the parse tree
	 */
	void exitStanalone(ParserFile.StanaloneContext ctx);
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
	 * Enter a parse tree produced by the {@code CLASS_DECLAR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterCLASS_DECLAR_STATE(ParserFile.CLASS_DECLAR_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CLASS_DECLAR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitCLASS_DECLAR_STATE(ParserFile.CLASS_DECLAR_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INTERFACE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterINTERFACE_STATE(ParserFile.INTERFACE_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INTERFACE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitINTERFACE_STATE(ParserFile.INTERFACE_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNC_DECL_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterFUNC_DECL_STATE(ParserFile.FUNC_DECL_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNC_DECL_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitFUNC_DECL_STATE(ParserFile.FUNC_DECL_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterCONSTR_STATE(ParserFile.CONSTR_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitCONSTR_STATE(ParserFile.CONSTR_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INIT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterINIT_STATE(ParserFile.INIT_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INIT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitINIT_STATE(ParserFile.INIT_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INIT_ARRAY_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterINIT_ARRAY_STATE(ParserFile.INIT_ARRAY_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INIT_ARRAY_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitINIT_ARRAY_STATE(ParserFile.INIT_ARRAY_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code READ_ONLY_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterREAD_ONLY_STATE(ParserFile.READ_ONLY_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code READ_ONLY_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitREAD_ONLY_STATE(ParserFile.READ_ONLY_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INSTANCE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterINSTANCE_STATE(ParserFile.INSTANCE_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INSTANCE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitINSTANCE_STATE(ParserFile.INSTANCE_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECLARE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterDECLARE_STATE(ParserFile.DECLARE_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECLARE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitDECLARE_STATE(ParserFile.DECLARE_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN_STATE(ParserFile.ASSIGN_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN_STATE(ParserFile.ASSIGN_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF_CONDITION_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterIF_CONDITION_STATE(ParserFile.IF_CONDITION_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF_CONDITION_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitIF_CONDITION_STATE(ParserFile.IF_CONDITION_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FOR_LOOP_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterFOR_LOOP_STATE(ParserFile.FOR_LOOP_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FOR_LOOP_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitFOR_LOOP_STATE(ParserFile.FOR_LOOP_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WHILE_LOOP_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterWHILE_LOOP_STATE(ParserFile.WHILE_LOOP_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WHILE_LOOP_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitWHILE_LOOP_STATE(ParserFile.WHILE_LOOP_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterEXPR_STATE(ParserFile.EXPR_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitEXPR_STATE(ParserFile.EXPR_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code THIS_EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterTHIS_EXPR_STATE(ParserFile.THIS_EXPR_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code THIS_EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitTHIS_EXPR_STATE(ParserFile.THIS_EXPR_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUPER_EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterSUPER_EXPR_STATE(ParserFile.SUPER_EXPR_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUPER_EXPR_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitSUPER_EXPR_STATE(ParserFile.SUPER_EXPR_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PRINT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterPRINT_STATE(ParserFile.PRINT_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PRINT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitPRINT_STATE(ParserFile.PRINT_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VALUE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterVALUE_STATE(ParserFile.VALUE_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VALUE_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitVALUE_STATE(ParserFile.VALUE_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RETRUN_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterRETRUN_STATE(ParserFile.RETRUN_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RETRUN_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitRETRUN_STATE(ParserFile.RETRUN_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMMENT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void enterCOMMENT_STATE(ParserFile.COMMENT_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMMENT_STATE}
	 * labeled alternative in {@link ParserFile#statements}.
	 * @param ctx the parse tree
	 */
	void exitCOMMENT_STATE(ParserFile.COMMENT_STATEContext ctx);
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
	 * Enter a parse tree produced by {@link ParserFile#readOnly}.
	 * @param ctx the parse tree
	 */
	void enterReadOnly(ParserFile.ReadOnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#readOnly}.
	 * @param ctx the parse tree
	 */
	void exitReadOnly(ParserFile.ReadOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstance(ParserFile.InstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstance(ParserFile.InstanceContext ctx);
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
	 * Enter a parse tree produced by the {@code ID_COND}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterID_COND(ParserFile.ID_CONDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID_COND}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitID_COND(ParserFile.ID_CONDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAL_COND}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterVAL_COND(ParserFile.VAL_CONDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAL_COND}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitVAL_COND(ParserFile.VAL_CONDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAL_OPERA_VAL}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterVAL_OPERA_VAL(ParserFile.VAL_OPERA_VALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAL_OPERA_VAL}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitVAL_OPERA_VAL(ParserFile.VAL_OPERA_VALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VAL_OPERA_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterVAL_OPERA_ID(ParserFile.VAL_OPERA_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAL_OPERA_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitVAL_OPERA_ID(ParserFile.VAL_OPERA_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID_OPERA_VAL}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterID_OPERA_VAL(ParserFile.ID_OPERA_VALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID_OPERA_VAL}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitID_OPERA_VAL(ParserFile.ID_OPERA_VALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID_OPERA_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterID_OPERA_ID(ParserFile.ID_OPERA_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID_OPERA_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitID_OPERA_ID(ParserFile.ID_OPERA_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID_OPERA_DOT_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void enterID_OPERA_DOT_ID(ParserFile.ID_OPERA_DOT_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID_OPERA_DOT_ID}
	 * labeled alternative in {@link ParserFile#condition}.
	 * @param ctx the parse tree
	 */
	void exitID_OPERA_DOT_ID(ParserFile.ID_OPERA_DOT_IDContext ctx);
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
	 * Enter a parse tree produced by the {@code SENT_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterSENT_EXPR(ParserFile.SENT_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SENT_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitSENT_EXPR(ParserFile.SENT_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code METHOD_CALL_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterMETHOD_CALL_EXPR(ParserFile.METHOD_CALL_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code METHOD_CALL_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitMETHOD_CALL_EXPR(ParserFile.METHOD_CALL_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MINUS2}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterMINUS2(ParserFile.MINUS2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code MINUS2}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitMINUS2(ParserFile.MINUS2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code THIS_PROP_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterTHIS_PROP_EXPR(ParserFile.THIS_PROP_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code THIS_PROP_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitTHIS_PROP_EXPR(ParserFile.THIS_PROP_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEW_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterNEW_EXPR(ParserFile.NEW_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEW_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitNEW_EXPR(ParserFile.NEW_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARROW_FUNC_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterARROW_FUNC_EXPR(ParserFile.ARROW_FUNC_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARROW_FUNC_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitARROW_FUNC_EXPR(ParserFile.ARROW_FUNC_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterMINUS(ParserFile.MINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitMINUS(ParserFile.MINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterDIV(ParserFile.DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIV}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitDIV(ParserFile.DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterID_EXPR(ParserFile.ID_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitID_EXPR(ParserFile.ID_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSIGN_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterASSIGN_EXPR(ParserFile.ASSIGN_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSIGN_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitASSIGN_EXPR(ParserFile.ASSIGN_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLUS2}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLUS2(ParserFile.PLUS2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code PLUS2}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLUS2(ParserFile.PLUS2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code VAL_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterVAL_EXPR(ParserFile.VAL_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VAL_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitVAL_EXPR(ParserFile.VAL_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECT_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterOBJECT_EXPR(ParserFile.OBJECT_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECT_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitOBJECT_EXPR(ParserFile.OBJECT_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ARRAY_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterARRAY_EXPR(ParserFile.ARRAY_EXPRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ARRAY_EXPR}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitARRAY_EXPR(ParserFile.ARRAY_EXPRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULTI}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULTI(ParserFile.MULTIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULTI}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULTI(ParserFile.MULTIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PLUS}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void enterPLUS(ParserFile.PLUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PLUS}
	 * labeled alternative in {@link ParserFile#expr}.
	 * @param ctx the parse tree
	 */
	void exitPLUS(ParserFile.PLUSContext ctx);
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
	 * Enter a parse tree produced by {@link ParserFile#property_chain}.
	 * @param ctx the parse tree
	 */
	void enterProperty_chain(ParserFile.Property_chainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#property_chain}.
	 * @param ctx the parse tree
	 */
	void exitProperty_chain(ParserFile.Property_chainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(ParserFile.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(ParserFile.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ParserFile.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ParserFile.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#post_op}.
	 * @param ctx the parse tree
	 */
	void enterPost_op(ParserFile.Post_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#post_op}.
	 * @param ctx the parse tree
	 */
	void exitPost_op(ParserFile.Post_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ParserFile.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ParserFile.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ParserFile.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#spreadElement}.
	 * @param ctx the parse tree
	 */
	void enterSpreadElement(ParserFile.SpreadElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#spreadElement}.
	 * @param ctx the parse tree
	 */
	void exitSpreadElement(ParserFile.SpreadElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserFile#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(ParserFile.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(ParserFile.ArrowFunctionContext ctx);
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
	 * Enter a parse tree produced by {@link ParserFile#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(ParserFile.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(ParserFile.TypeReferenceContext ctx);
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
	 * Enter a parse tree produced by {@link ParserFile#hash}.
	 * @param ctx the parse tree
	 */
	void enterHash(ParserFile.HashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserFile#hash}.
	 * @param ctx the parse tree
	 */
	void exitHash(ParserFile.HashContext ctx);
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