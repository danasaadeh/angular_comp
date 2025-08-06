// Generated from D:/uni_projects/4th_year_projects/first_semester/compiler/projects/angular_compiler/src/antlr/ParserFile.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserFile extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BACKTICK=1, COMPONENT=2, INJECTABLE=3, PROVIDED_IN=4, STANDALONE=5, SELECTOR=6, 
		TEMPLATE=7, SPREAD=8, IMPORTS=9, TEMPLATE_URL=10, STYLE_URL=11, STYLE_URLS=12, 
		SL_COMMENT=13, ML_COMMENT=14, CLASS=15, EXPORT=16, IMPORT=17, EXTENDS=18, 
		FROM=19, CONSTRUCTOR=20, FUNCTION=21, OVERRIDE=22, RETURN=23, CONSOLE=24, 
		LOG=25, THIS=26, CASE=27, BREAK=28, DO=29, NEW=30, CATCH=31, FINALLY=32, 
		VOID=33, CONTINUE=34, SWITCH=35, WITH=36, THROW=37, IN=38, TRY=39, AS=40, 
		ASYNC=41, AWAIT=42, SUPER=43, ENUM=44, OF=45, ABSTRACT=46, IMPLEMENTS=47, 
		IS=48, AT=49, HASH_TAG=50, UNDER_SCORE=51, ARROW=52, Q_MARK=53, NULL=54, 
		MODIFIER=55, PRIVATE=56, PUBLIC=57, READ_ONLY=58, INTERFACE=59, PACKAGE=60, 
		PROTECTED=61, STATIC=62, DATA_TYPE=63, SEA_WS=64, IF=65, ELSE_IF=66, ELSE=67, 
		FOR=68, WHILE=69, OPEN_B=70, CLOSE_B=71, SQUARE_OPEN=72, SQUARE_CLOSE=73, 
		CURLY_OPEN=74, CURLY_CLOSE=75, ARRAY_TYPE=76, ANY_TYPE=77, NUMBER_TYPE=78, 
		HELPERS=79, LET=80, CONST=81, VAR_TYPE=82, BOOLEAN_TYPE=83, STRING_TYPE=84, 
		UNIQUE_TYPE=85, VAL=86, UNDEFINED=87, BOOLEAN_VAL=88, STRING_VAL=89, NUM_VAL=90, 
		DOUBLE_VAL=91, ID=92, COLON=93, COMMA=94, DOUBLE_QUOTE=95, SEMI_COLON=96, 
		EQUAL=97, DOT=98, PLUS=99, MINUS=100, PLUS_PLUS=101, MINUS_MINUS=102, 
		DIV=103, MUL=104, OPERATION=105, EQUALS=106, NOT=107, NOT_EQUALS=108, 
		IDENTITY_EQUALS=109, IDENTITY_NOT_EQUALS=110, LESS_THAN=111, GREATER_THAN=112, 
		LESS_THAN_EQUALS=113, GREATER_THAN_EQUALS=114, LOGICAL_OPERATION=115, 
		BACKTICK_CLOSE=116, HTML_COMMENT=117, HTML_CONDITIONAL_COMMENT=118, XML=119, 
		CDATA=120, DTD=121, INTERPOLATION=122, SCRIPTLET=123, SEA_WS2=124, SCRIPT_OPEN=125, 
		STYLE_OPEN=126, TAG_OPEN=127, HTML_TEXT=128, DIRECTIVE=129, IF_DIRECTIVE=130, 
		FOR_DIRECTIVE=131, TAG_CLOSE=132, TAG_SLASH_CLOSE=133, TAG_SLASH=134, 
		TAG_EQUALS=135, TAG_NAME=136, BINDING=137, HASH=138, EVENT=139, PROPERTY=140, 
		MODEL=141, TAG_WHITESPACE=142, SENTENCE=143, SCRIPT_BODY=144, SCRIPT_SHORT_BODY=145, 
		STYLE_BODY=146, STYLE_SHORT_BODY=147, ATTVALUE_VALUE=148, ATTRIBUTE=149, 
		FOR_VAL=150, IF_VAL=151;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_component = 2, RULE_componentBody = 3, 
		RULE_stanalone = 4, RULE_selector = 5, RULE_template_Url = 6, RULE_template = 7, 
		RULE_imports = 8, RULE_style_Urls = 9, RULE_inject = 10, RULE_provided_in = 11, 
		RULE_statements = 12, RULE_value = 13, RULE_init = 14, RULE_init_array = 15, 
		RULE_object = 16, RULE_objectProperty = 17, RULE_readOnly = 18, RULE_instance = 19, 
		RULE_declaration = 20, RULE_assign = 21, RULE_super_exp = 22, RULE_if_condition = 23, 
		RULE_else_if_condition = 24, RULE_else_condition = 25, RULE_condition = 26, 
		RULE_body = 27, RULE_for = 28, RULE_while = 29, RULE_expr = 30, RULE_this_exp = 31, 
		RULE_property_chain = 32, RULE_method_call = 33, RULE_assignment = 34, 
		RULE_post_op = 35, RULE_array = 36, RULE_arrayElement = 37, RULE_spreadElement = 38, 
		RULE_arrowFunction = 39, RULE_print = 40, RULE_parameter = 41, RULE_typeReference = 42, 
		RULE_return = 43, RULE_function_body = 44, RULE_function_decl = 45, RULE_class_body = 46, 
		RULE_class_decl = 47, RULE_interface = 48, RULE_constructor = 49, RULE_import_statement = 50, 
		RULE_comment = 51, RULE_eos = 52, RULE_htmlDocument = 53, RULE_scriptletOrSeaWs = 54, 
		RULE_htmlElements = 55, RULE_htmlElement = 56, RULE_directive = 57, RULE_binding = 58, 
		RULE_hash = 59, RULE_htmlContent = 60, RULE_htmlAttribute = 61, RULE_htmlChardata = 62, 
		RULE_htmlMisc = 63, RULE_htmlComment = 64, RULE_script = 65, RULE_style = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "component", "componentBody", "stanalone", 
			"selector", "template_Url", "template", "imports", "style_Urls", "inject", 
			"provided_in", "statements", "value", "init", "init_array", "object", 
			"objectProperty", "readOnly", "instance", "declaration", "assign", "super_exp", 
			"if_condition", "else_if_condition", "else_condition", "condition", "body", 
			"for", "while", "expr", "this_exp", "property_chain", "method_call", 
			"assignment", "post_op", "array", "arrayElement", "spreadElement", "arrowFunction", 
			"print", "parameter", "typeReference", "return", "function_body", "function_decl", 
			"class_body", "class_decl", "interface", "constructor", "import_statement", 
			"comment", "eos", "htmlDocument", "scriptletOrSeaWs", "htmlElements", 
			"htmlElement", "directive", "binding", "hash", "htmlContent", "htmlAttribute", 
			"htmlChardata", "htmlMisc", "htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@Component'", "'@Injectable'", "'providedIn'", "'standalone'", 
			"'selector'", "'template'", "'...'", "'imports'", "'templateUrl'", "'styleUrl'", 
			"'styleUrls'", null, null, "'class'", "'export'", "'import'", "'extends'", 
			"'from'", "'constructor'", "'function'", "'@override'", "'return'", "'console'", 
			"'log'", "'this'", "'case'", "'break'", "'do'", "'new'", "'catch'", "'finally'", 
			"'void'", "'continue'", "'switch'", "'with'", "'throw'", "'in'", "'try'", 
			"'as'", "'async'", "'await'", "'super'", "'enum'", "'of'", "'abstract'", 
			"'implements'", "'is'", "'@'", "'#'", "'_'", "'=>'", "'?'", "'null'", 
			null, "'private'", "'public'", "'readonly'", "'interface'", "'package'", 
			"'protected'", "'static'", null, null, "'if'", "'else if'", "'else'", 
			"'for'", "'while'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'array'", 
			"'any'", "'number'", null, "'let'", "'const'", "'var'", "'boolean'", 
			"'string'", "'unique'", null, "'undefined'", null, null, null, null, 
			null, "':'", "','", "'\"'", "';'", null, "'.'", "'+'", "'-'", "'++'", 
			"'--'", null, "'*'", null, "'=='", "'!'", "'!='", "'==='", "'!=='", null, 
			null, "'<='", "'>='", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'*ngIf'", "'*ngFor'", null, 
			"'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BACKTICK", "COMPONENT", "INJECTABLE", "PROVIDED_IN", "STANDALONE", 
			"SELECTOR", "TEMPLATE", "SPREAD", "IMPORTS", "TEMPLATE_URL", "STYLE_URL", 
			"STYLE_URLS", "SL_COMMENT", "ML_COMMENT", "CLASS", "EXPORT", "IMPORT", 
			"EXTENDS", "FROM", "CONSTRUCTOR", "FUNCTION", "OVERRIDE", "RETURN", "CONSOLE", 
			"LOG", "THIS", "CASE", "BREAK", "DO", "NEW", "CATCH", "FINALLY", "VOID", 
			"CONTINUE", "SWITCH", "WITH", "THROW", "IN", "TRY", "AS", "ASYNC", "AWAIT", 
			"SUPER", "ENUM", "OF", "ABSTRACT", "IMPLEMENTS", "IS", "AT", "HASH_TAG", 
			"UNDER_SCORE", "ARROW", "Q_MARK", "NULL", "MODIFIER", "PRIVATE", "PUBLIC", 
			"READ_ONLY", "INTERFACE", "PACKAGE", "PROTECTED", "STATIC", "DATA_TYPE", 
			"SEA_WS", "IF", "ELSE_IF", "ELSE", "FOR", "WHILE", "OPEN_B", "CLOSE_B", 
			"SQUARE_OPEN", "SQUARE_CLOSE", "CURLY_OPEN", "CURLY_CLOSE", "ARRAY_TYPE", 
			"ANY_TYPE", "NUMBER_TYPE", "HELPERS", "LET", "CONST", "VAR_TYPE", "BOOLEAN_TYPE", 
			"STRING_TYPE", "UNIQUE_TYPE", "VAL", "UNDEFINED", "BOOLEAN_VAL", "STRING_VAL", 
			"NUM_VAL", "DOUBLE_VAL", "ID", "COLON", "COMMA", "DOUBLE_QUOTE", "SEMI_COLON", 
			"EQUAL", "DOT", "PLUS", "MINUS", "PLUS_PLUS", "MINUS_MINUS", "DIV", "MUL", 
			"OPERATION", "EQUALS", "NOT", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", 
			"LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", 
			"LOGICAL_OPERATION", "BACKTICK_CLOSE", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "INTERPOLATION", "SCRIPTLET", "SEA_WS2", "SCRIPT_OPEN", 
			"STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "DIRECTIVE", "IF_DIRECTIVE", "FOR_DIRECTIVE", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"BINDING", "HASH", "EVENT", "PROPERTY", "MODEL", "TAG_WHITESPACE", "SENTENCE", 
			"SCRIPT_BODY", "SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "FOR_VAL", "IF_VAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ParserFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserFile(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				instruction();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 612498346589020172L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136331961L) != 0) || _la==SENTENCE );
			setState(139);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class COMPONENT_INSTRUCTContext extends InstructionContext {
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public COMPONENT_INSTRUCTContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCOMPONENT_INSTRUCT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCOMPONENT_INSTRUCT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCOMPONENT_INSTRUCT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IMPORT_INSTRUCTContext extends InstructionContext {
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public IMPORT_INSTRUCTContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIMPORT_INSTRUCT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIMPORT_INSTRUCT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIMPORT_INSTRUCT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INJECT_INSTRUCTContext extends InstructionContext {
		public InjectContext inject() {
			return getRuleContext(InjectContext.class,0);
		}
		public INJECT_INSTRUCTContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterINJECT_INSTRUCT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitINJECT_INSTRUCT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitINJECT_INSTRUCT(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STATEMENTS_INSTRUCTContext extends InstructionContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public STATEMENTS_INSTRUCTContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSTATEMENTS_INSTRUCT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSTATEMENTS_INSTRUCT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSTATEMENTS_INSTRUCT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			int _alt;
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORT_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(141);
						import_statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						import_statement();
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENT_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				component();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECT_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				inject();
				}
				break;
			case SL_COMMENT:
			case ML_COMMENT:
			case CLASS:
			case EXPORT:
			case CONSTRUCTOR:
			case FUNCTION:
			case OVERRIDE:
			case RETURN:
			case CONSOLE:
			case THIS:
			case NEW:
			case SUPER:
			case MODIFIER:
			case INTERFACE:
			case IF:
			case FOR:
			case WHILE:
			case OPEN_B:
			case SQUARE_OPEN:
			case CURLY_OPEN:
			case HELPERS:
			case VAL:
			case ID:
			case SENTENCE:
				_localctx = new STATEMENTS_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(ParserFile.COMPONENT, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(COMPONENT);
			setState(158);
			match(OPEN_B);
			setState(159);
			match(CURLY_OPEN);
			setState(160);
			componentBody();
			setState(161);
			match(CURLY_CLOSE);
			setState(162);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public StanaloneContext stanalone() {
			return getRuleContext(StanaloneContext.class,0);
		}
		public Template_UrlContext template_Url() {
			return getRuleContext(Template_UrlContext.class,0);
		}
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public Style_UrlsContext style_Urls() {
			return getRuleContext(Style_UrlsContext.class,0);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(164);
				selector();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STANDALONE) {
				{
				setState(167);
				stanalone();
				}
			}

			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_URL:
				{
				setState(170);
				template_Url();
				}
				break;
			case TEMPLATE:
				{
				setState(171);
				template();
				}
				break;
			case IMPORTS:
			case STYLE_URL:
			case STYLE_URLS:
			case CURLY_CLOSE:
				break;
			default:
				break;
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(174);
				imports();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLE_URL || _la==STYLE_URLS) {
				{
				setState(177);
				style_Urls();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StanaloneContext extends ParserRuleContext {
		public TerminalNode STANDALONE() { return getToken(ParserFile.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public StanaloneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stanalone; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStanalone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStanalone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStanalone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StanaloneContext stanalone() throws RecognitionException {
		StanaloneContext _localctx = new StanaloneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stanalone);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(STANDALONE);
			setState(181);
			match(COLON);
			setState(182);
			match(VAL);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(183);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(ParserFile.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(SELECTOR);
			setState(187);
			match(COLON);
			setState(188);
			match(VAL);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(189);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Template_UrlContext extends ParserRuleContext {
		public TerminalNode TEMPLATE_URL() { return getToken(ParserFile.TEMPLATE_URL, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public Template_UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template_Url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTemplate_Url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTemplate_Url(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTemplate_Url(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Template_UrlContext template_Url() throws RecognitionException {
		Template_UrlContext _localctx = new Template_UrlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_template_Url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(TEMPLATE_URL);
			setState(193);
			match(COLON);
			setState(194);
			match(VAL);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(195);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode TEMPLATE() { return getToken(ParserFile.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode BACKTICK() { return getToken(ParserFile.BACKTICK, 0); }
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public TerminalNode BACKTICK_CLOSE() { return getToken(ParserFile.BACKTICK_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(TEMPLATE);
			setState(199);
			match(COLON);
			setState(200);
			match(BACKTICK);
			setState(201);
			htmlDocument();
			setState(202);
			match(BACKTICK_CLOSE);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(203);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(ParserFile.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(IMPORTS);
			setState(207);
			match(COLON);
			setState(208);
			match(SQUARE_OPEN);
			setState(209);
			match(ID);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(210);
				match(COMMA);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(211);
					match(ID);
					}
					}
					setState(216);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(219);
			match(SQUARE_CLOSE);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(220);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Style_UrlsContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode STYLE_URL() { return getToken(ParserFile.STYLE_URL, 0); }
		public TerminalNode STYLE_URLS() { return getToken(ParserFile.STYLE_URLS, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public Style_UrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style_Urls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStyle_Urls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStyle_Urls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStyle_Urls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Style_UrlsContext style_Urls() throws RecognitionException {
		Style_UrlsContext _localctx = new Style_UrlsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_style_Urls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==STYLE_URL || _la==STYLE_URLS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			match(COLON);
			setState(225);
			match(VAL);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(226);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(ParserFile.INJECTABLE, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public Provided_inContext provided_in() {
			return getRuleContext(Provided_inContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public InjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectContext inject() throws RecognitionException {
		InjectContext _localctx = new InjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(INJECTABLE);
			setState(230);
			match(OPEN_B);
			setState(231);
			match(CURLY_OPEN);
			setState(232);
			provided_in();
			setState(233);
			match(CURLY_CLOSE);
			setState(234);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Provided_inContext extends ParserRuleContext {
		public TerminalNode PROVIDED_IN() { return getToken(ParserFile.PROVIDED_IN, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode COMMA() { return getToken(ParserFile.COMMA, 0); }
		public Provided_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provided_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterProvided_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitProvided_in(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitProvided_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Provided_inContext provided_in() throws RecognitionException {
		Provided_inContext _localctx = new Provided_inContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_provided_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(PROVIDED_IN);
			setState(237);
			match(COLON);
			setState(238);
			match(VAL);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(239);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PRINT_STATEContext extends StatementsContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PRINT_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPRINT_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPRINT_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPRINT_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INIT_STATEContext extends StatementsContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public INIT_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterINIT_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitINIT_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitINIT_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ASSIGN_STATEContext extends StatementsContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ASSIGN_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterASSIGN_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitASSIGN_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitASSIGN_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EXPR_STATEContext extends StatementsContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EXPR_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterEXPR_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitEXPR_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitEXPR_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FOR_LOOP_STATEContext extends StatementsContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public FOR_LOOP_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFOR_LOOP_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFOR_LOOP_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFOR_LOOP_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SUPER_EXPR_STATEContext extends StatementsContext {
		public Super_expContext super_exp() {
			return getRuleContext(Super_expContext.class,0);
		}
		public SUPER_EXPR_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSUPER_EXPR_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSUPER_EXPR_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSUPER_EXPR_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INTERFACE_STATEContext extends StatementsContext {
		public InterfaceContext interface_() {
			return getRuleContext(InterfaceContext.class,0);
		}
		public INTERFACE_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterINTERFACE_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitINTERFACE_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitINTERFACE_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DECLARE_STATEContext extends StatementsContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DECLARE_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDECLARE_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDECLARE_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDECLARE_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FUNC_DECL_STATEContext extends StatementsContext {
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public FUNC_DECL_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFUNC_DECL_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFUNC_DECL_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFUNC_DECL_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VALUE_STATEContext extends StatementsContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VALUE_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVALUE_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVALUE_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVALUE_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RETRUN_STATEContext extends StatementsContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public RETRUN_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterRETRUN_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitRETRUN_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitRETRUN_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class INIT_ARRAY_STATEContext extends StatementsContext {
		public Init_arrayContext init_array() {
			return getRuleContext(Init_arrayContext.class,0);
		}
		public INIT_ARRAY_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterINIT_ARRAY_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitINIT_ARRAY_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitINIT_ARRAY_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class READ_ONLY_STATEContext extends StatementsContext {
		public ReadOnlyContext readOnly() {
			return getRuleContext(ReadOnlyContext.class,0);
		}
		public READ_ONLY_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterREAD_ONLY_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitREAD_ONLY_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitREAD_ONLY_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IF_CONDITION_STATEContext extends StatementsContext {
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public IF_CONDITION_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIF_CONDITION_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIF_CONDITION_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIF_CONDITION_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CONSTR_STATEContext extends StatementsContext {
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public CONSTR_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCONSTR_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCONSTR_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCONSTR_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WHILE_LOOP_STATEContext extends StatementsContext {
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public WHILE_LOOP_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWHILE_LOOP_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWHILE_LOOP_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWHILE_LOOP_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CLASS_DECLAR_STATEContext extends StatementsContext {
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public CLASS_DECLAR_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCLASS_DECLAR_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCLASS_DECLAR_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCLASS_DECLAR_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class COMMENT_STATEContext extends StatementsContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public COMMENT_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterCOMMENT_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitCOMMENT_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitCOMMENT_STATE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class THIS_EXPR_STATEContext extends StatementsContext {
		public This_expContext this_exp() {
			return getRuleContext(This_expContext.class,0);
		}
		public THIS_EXPR_STATEContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTHIS_EXPR_STATE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTHIS_EXPR_STATE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTHIS_EXPR_STATE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statements);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new CLASS_DECLAR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				class_decl();
				}
				break;
			case 2:
				_localctx = new INTERFACE_STATEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				interface_();
				}
				break;
			case 3:
				_localctx = new FUNC_DECL_STATEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				function_decl();
				}
				break;
			case 4:
				_localctx = new CONSTR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				constructor();
				}
				break;
			case 5:
				_localctx = new INIT_STATEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				init();
				}
				break;
			case 6:
				_localctx = new INIT_ARRAY_STATEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				init_array();
				}
				break;
			case 7:
				_localctx = new READ_ONLY_STATEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				readOnly();
				}
				break;
			case 8:
				_localctx = new DECLARE_STATEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				declaration();
				}
				break;
			case 9:
				_localctx = new ASSIGN_STATEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				assign();
				}
				break;
			case 10:
				_localctx = new IF_CONDITION_STATEContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				if_condition();
				}
				break;
			case 11:
				_localctx = new FOR_LOOP_STATEContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
				for_();
				}
				break;
			case 12:
				_localctx = new WHILE_LOOP_STATEContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(253);
				while_();
				}
				break;
			case 13:
				_localctx = new EXPR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(254);
				expr(0);
				}
				break;
			case 14:
				_localctx = new THIS_EXPR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(255);
				this_exp();
				}
				break;
			case 15:
				_localctx = new SUPER_EXPR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(256);
				super_exp();
				}
				break;
			case 16:
				_localctx = new PRINT_STATEContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(257);
				print();
				}
				break;
			case 17:
				_localctx = new VALUE_STATEContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(258);
				value();
				}
				break;
			case 18:
				_localctx = new RETRUN_STATEContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(259);
				return_();
				}
				break;
			case 19:
				_localctx = new COMMENT_STATEContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(260);
				comment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(VAL);
				}
				break;
			case CURLY_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode MODIFIER() { return getToken(ParserFile.MODIFIER, 0); }
		public TerminalNode HELPERS() { return getToken(ParserFile.HELPERS, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(267);
				match(MODIFIER);
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(270);
				match(HELPERS);
				}
			}

			setState(273);
			match(ID);
			setState(274);
			match(COLON);
			setState(275);
			match(DATA_TYPE);
			setState(276);
			match(EQUAL);
			setState(277);
			value();
			setState(278);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Init_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public List<TerminalNode> SQUARE_OPEN() { return getTokens(ParserFile.SQUARE_OPEN); }
		public TerminalNode SQUARE_OPEN(int i) {
			return getToken(ParserFile.SQUARE_OPEN, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> SQUARE_CLOSE() { return getTokens(ParserFile.SQUARE_CLOSE); }
		public TerminalNode SQUARE_CLOSE(int i) {
			return getToken(ParserFile.SQUARE_CLOSE, i);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public TerminalNode HELPERS() { return getToken(ParserFile.HELPERS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public Init_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInit_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInit_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInit_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_arrayContext init_array() throws RecognitionException {
		Init_arrayContext _localctx = new Init_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_init_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(280);
				match(EXPORT);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(283);
				match(HELPERS);
				}
			}

			setState(286);
			match(ID);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(287);
				match(COLON);
				setState(288);
				typeReference();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SQUARE_OPEN) {
					{
					setState(289);
					match(SQUARE_OPEN);
					setState(290);
					match(SQUARE_CLOSE);
					}
				}

				}
			}

			setState(295);
			match(EQUAL);
			setState(296);
			match(SQUARE_OPEN);
			setState(297);
			value();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(298);
				match(COMMA);
				setState(299);
				value();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(SQUARE_CLOSE);
			setState(306);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public List<ObjectPropertyContext> objectProperty() {
			return getRuleContexts(ObjectPropertyContext.class);
		}
		public ObjectPropertyContext objectProperty(int i) {
			return getRuleContext(ObjectPropertyContext.class,i);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(CURLY_OPEN);
			setState(309);
			objectProperty();
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					match(COMMA);
					setState(311);
					objectProperty();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(317);
				match(COMMA);
				}
			}

			setState(320);
			match(CURLY_CLOSE);
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(321);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPropertyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public ObjectPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterObjectProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitObjectProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitObjectProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertyContext objectProperty() throws RecognitionException {
		ObjectPropertyContext _localctx = new ObjectPropertyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objectProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
			setState(325);
			match(COLON);
			setState(326);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadOnlyContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public This_expContext this_exp() {
			return getRuleContext(This_expContext.class,0);
		}
		public ReadOnlyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readOnly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReadOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReadOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReadOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadOnlyContext readOnly() throws RecognitionException {
		ReadOnlyContext _localctx = new ReadOnlyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_readOnly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			declaration();
			setState(329);
			match(EQUAL);
			setState(330);
			this_exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstanceContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public TerminalNode NEW() { return getToken(ParserFile.NEW, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode LESS_THAN() { return getToken(ParserFile.LESS_THAN, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ParserFile.GREATER_THAN, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ParserFile.SEMI_COLON, 0); }
		public InstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceContext instance() throws RecognitionException {
		InstanceContext _localctx = new InstanceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_instance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			declaration();
			setState(333);
			match(EQUAL);
			setState(334);
			match(NEW);
			setState(335);
			match(ID);
			setState(336);
			match(LESS_THAN);
			setState(337);
			match(DATA_TYPE);
			setState(338);
			match(SQUARE_OPEN);
			setState(339);
			match(SQUARE_CLOSE);
			setState(340);
			match(GREATER_THAN);
			setState(341);
			match(OPEN_B);
			setState(342);
			array();
			setState(343);
			match(CLOSE_B);
			setState(344);
			match(SEMI_COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode MODIFIER() { return getToken(ParserFile.MODIFIER, 0); }
		public TerminalNode HELPERS() { return getToken(ParserFile.HELPERS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(346);
				match(MODIFIER);
				}
			}

			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(349);
				match(HELPERS);
				}
			}

			setState(352);
			match(ID);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(353);
				match(COLON);
				setState(354);
				match(DATA_TYPE);
				}
			}

			setState(357);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode HELPERS() { return getToken(ParserFile.HELPERS, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(359);
				match(HELPERS);
				}
			}

			setState(362);
			match(ID);
			setState(363);
			match(EQUAL);
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(365);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Super_expContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(ParserFile.SUPER, 0); }
		public List<TerminalNode> DOT() { return getTokens(ParserFile.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserFile.DOT, i);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public Super_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_super_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSuper_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSuper_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSuper_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Super_expContext super_exp() throws RecognitionException {
		Super_expContext _localctx = new Super_expContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_super_exp);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(SUPER);
				setState(368);
				match(DOT);
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(369);
					match(ID);
					}
					}
					setState(372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(374);
					match(DOT);
					setState(375);
					match(ID);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(EQUAL);
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(383);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(SUPER);
				setState(385);
				match(OPEN_B);
				setState(386);
				match(ID);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(387);
					match(COMMA);
					setState(388);
					match(ID);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(CLOSE_B);
				setState(395);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_conditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ParserFile.IF, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> LOGICAL_OPERATION() { return getTokens(ParserFile.LOGICAL_OPERATION); }
		public TerminalNode LOGICAL_OPERATION(int i) {
			return getToken(ParserFile.LOGICAL_OPERATION, i);
		}
		public List<Else_if_conditionContext> else_if_condition() {
			return getRuleContexts(Else_if_conditionContext.class);
		}
		public Else_if_conditionContext else_if_condition(int i) {
			return getRuleContext(Else_if_conditionContext.class,i);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(IF);
			setState(399);
			match(OPEN_B);
			setState(400);
			condition();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATION) {
				{
				{
				setState(401);
				match(LOGICAL_OPERATION);
				setState(402);
				condition();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
			match(CLOSE_B);
			setState(409);
			body();
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					else_if_condition();
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(416);
				else_condition();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_if_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE_IF() { return getToken(ParserFile.ELSE_IF, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> LOGICAL_OPERATION() { return getTokens(ParserFile.LOGICAL_OPERATION); }
		public TerminalNode LOGICAL_OPERATION(int i) {
			return getToken(ParserFile.LOGICAL_OPERATION, i);
		}
		public Else_if_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElse_if_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElse_if_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElse_if_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_conditionContext else_if_condition() throws RecognitionException {
		Else_if_conditionContext _localctx = new Else_if_conditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_else_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(ELSE_IF);
			setState(420);
			match(OPEN_B);
			setState(421);
			condition();
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATION) {
				{
				{
				setState(422);
				match(LOGICAL_OPERATION);
				setState(423);
				condition();
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(CLOSE_B);
			setState(430);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_conditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ParserFile.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Else_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterElse_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitElse_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitElse_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_conditionContext else_condition() throws RecognitionException {
		Else_conditionContext _localctx = new Else_conditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(ELSE);
			setState(433);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ID_OPERA_DOT_IDContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode OPERATION() { return getToken(ParserFile.OPERATION, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public ID_OPERA_DOT_IDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterID_OPERA_DOT_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitID_OPERA_DOT_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitID_OPERA_DOT_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ID_OPERA_VALContext extends ConditionContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPERATION() { return getToken(ParserFile.OPERATION, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public ID_OPERA_VALContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterID_OPERA_VAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitID_OPERA_VAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitID_OPERA_VAL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VAL_CONDContext extends ConditionContext {
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public VAL_CONDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVAL_COND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVAL_COND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVAL_COND(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VAL_OPERA_IDContext extends ConditionContext {
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode OPERATION() { return getToken(ParserFile.OPERATION, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public VAL_OPERA_IDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVAL_OPERA_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVAL_OPERA_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVAL_OPERA_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ID_OPERA_IDContext extends ConditionContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode OPERATION() { return getToken(ParserFile.OPERATION, 0); }
		public ID_OPERA_IDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterID_OPERA_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitID_OPERA_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitID_OPERA_ID(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VAL_OPERA_VALContext extends ConditionContext {
		public List<TerminalNode> VAL() { return getTokens(ParserFile.VAL); }
		public TerminalNode VAL(int i) {
			return getToken(ParserFile.VAL, i);
		}
		public TerminalNode OPERATION() { return getToken(ParserFile.OPERATION, 0); }
		public VAL_OPERA_VALContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVAL_OPERA_VAL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVAL_OPERA_VAL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVAL_OPERA_VAL(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ID_CONDContext extends ConditionContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ID_CONDContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterID_COND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitID_COND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitID_COND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new ID_CONDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(ID);
				}
				break;
			case 2:
				_localctx = new VAL_CONDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(VAL);
				}
				break;
			case 3:
				_localctx = new VAL_OPERA_VALContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(VAL);
				setState(438);
				match(OPERATION);
				setState(439);
				match(VAL);
				}
				break;
			case 4:
				_localctx = new VAL_OPERA_IDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				match(VAL);
				setState(441);
				match(OPERATION);
				setState(442);
				match(ID);
				}
				break;
			case 5:
				_localctx = new ID_OPERA_VALContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				match(ID);
				setState(444);
				match(OPERATION);
				setState(445);
				match(VAL);
				}
				break;
			case 6:
				_localctx = new ID_OPERA_IDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(446);
				match(ID);
				setState(447);
				match(OPERATION);
				setState(448);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ID_OPERA_DOT_IDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(449);
				match(ID);
				setState(450);
				match(OPERATION);
				setState(451);
				match(ID);
				setState(452);
				match(DOT);
				setState(453);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_body);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				match(CURLY_OPEN);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612498346588889088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136331961L) != 0) || _la==SENTENCE) {
					{
					{
					setState(458);
					statements();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(464);
					eos();
					}
					break;
				}
				setState(467);
				match(CURLY_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ParserFile.FOR, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(ParserFile.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ParserFile.SEMI_COLON, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(FOR);
			setState(471);
			match(OPEN_B);
			setState(472);
			init();
			setState(473);
			match(SEMI_COLON);
			setState(474);
			condition();
			setState(475);
			match(SEMI_COLON);
			setState(476);
			expr(0);
			setState(477);
			match(CLOSE_B);
			setState(478);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ParserFile.WHILE, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> LOGICAL_OPERATION() { return getTokens(ParserFile.LOGICAL_OPERATION); }
		public TerminalNode LOGICAL_OPERATION(int i) {
			return getToken(ParserFile.LOGICAL_OPERATION, i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(WHILE);
			setState(481);
			match(OPEN_B);
			setState(482);
			condition();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATION) {
				{
				{
				setState(483);
				match(LOGICAL_OPERATION);
				setState(484);
				condition();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(CLOSE_B);
			setState(491);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SENT_EXPRContext extends ExprContext {
		public TerminalNode SENTENCE() { return getToken(ParserFile.SENTENCE, 0); }
		public SENT_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSENT_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSENT_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSENT_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class METHOD_CALL_EXPRContext extends ExprContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public METHOD_CALL_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMETHOD_CALL_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMETHOD_CALL_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMETHOD_CALL_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MINUS2Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS_MINUS() { return getToken(ParserFile.MINUS_MINUS, 0); }
		public MINUS2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMINUS2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMINUS2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMINUS2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class THIS_PROP_EXPRContext extends ExprContext {
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public Property_chainContext property_chain() {
			return getRuleContext(Property_chainContext.class,0);
		}
		public THIS_PROP_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTHIS_PROP_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTHIS_PROP_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTHIS_PROP_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NEW_EXPRContext extends ExprContext {
		public TerminalNode NEW() { return getToken(ParserFile.NEW, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public TerminalNode LESS_THAN() { return getToken(ParserFile.LESS_THAN, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ParserFile.GREATER_THAN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public NEW_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterNEW_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitNEW_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitNEW_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ARROW_FUNC_EXPRContext extends ExprContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ARROW_FUNC_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterARROW_FUNC_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitARROW_FUNC_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitARROW_FUNC_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MINUSContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(ParserFile.MINUS, 0); }
		public MINUSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMINUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMINUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMINUS(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DIVContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ParserFile.DIV, 0); }
		public DIVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ID_EXPRContext extends ExprContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public ID_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterID_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitID_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitID_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ASSIGN_EXPRContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public ASSIGN_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterASSIGN_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitASSIGN_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitASSIGN_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PLUS2Context extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(ParserFile.PLUS_PLUS, 0); }
		public PLUS2Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPLUS2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPLUS2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPLUS2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VAL_EXPRContext extends ExprContext {
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public VAL_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterVAL_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitVAL_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitVAL_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OBJECT_EXPRContext extends ExprContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public OBJECT_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterOBJECT_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitOBJECT_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitOBJECT_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ARRAY_EXPRContext extends ExprContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ARRAY_EXPRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterARRAY_EXPR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitARRAY_EXPR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitARRAY_EXPR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MULTIContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ParserFile.MUL, 0); }
		public MULTIContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMULTI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMULTI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMULTI(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PLUSContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(ParserFile.PLUS, 0); }
		public PLUSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPLUS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPLUS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPLUS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new VAL_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(494);
				match(VAL);
				}
				break;
			case 2:
				{
				_localctx = new ID_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new SENT_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(SENTENCE);
				}
				break;
			case 4:
				{
				_localctx = new OBJECT_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				object();
				}
				break;
			case 5:
				{
				_localctx = new ARRAY_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				array();
				}
				break;
			case 6:
				{
				_localctx = new METHOD_CALL_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				method_call();
				}
				break;
			case 7:
				{
				_localctx = new THIS_PROP_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				match(THIS);
				setState(501);
				match(DOT);
				setState(502);
				property_chain();
				}
				break;
			case 8:
				{
				_localctx = new NEW_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				match(NEW);
				setState(504);
				match(ID);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(505);
					match(LESS_THAN);
					setState(506);
					match(DATA_TYPE);
					setState(507);
					match(GREATER_THAN);
					}
				}

				setState(510);
				match(OPEN_B);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 1153290940513779729L) != 0) || _la==ID || _la==SENTENCE) {
					{
					setState(511);
					expr(0);
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(512);
						match(COMMA);
						setState(513);
						expr(0);
						}
						}
						setState(518);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(521);
				match(CLOSE_B);
				}
				break;
			case 9:
				{
				_localctx = new ARROW_FUNC_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				arrowFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(544);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ASSIGN_EXPRContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(525);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(526);
						match(EQUAL);
						setState(527);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new MULTIContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(528);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(529);
						match(MUL);
						setState(530);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new DIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(531);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(532);
						match(DIV);
						setState(533);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new PLUSContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(534);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(535);
						match(PLUS);
						setState(536);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new MINUSContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(537);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(538);
						match(MINUS);
						setState(539);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new PLUS2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(540);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(541);
						match(PLUS_PLUS);
						}
						break;
					case 7:
						{
						_localctx = new MINUS2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(542);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(543);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class This_expContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public Property_chainContext property_chain() {
			return getRuleContext(Property_chainContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Post_opContext post_op() {
			return getRuleContext(Post_opContext.class,0);
		}
		public This_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_this_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterThis_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitThis_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitThis_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final This_expContext this_exp() throws RecognitionException {
		This_expContext _localctx = new This_expContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_this_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(THIS);
			setState(550);
			match(DOT);
			setState(551);
			property_chain();
			setState(554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				{
				setState(552);
				assignment();
				}
				break;
			case PLUS_PLUS:
			case MINUS_MINUS:
				{
				setState(553);
				post_op();
				}
				break;
			case EOF:
			case COMPONENT:
			case INJECTABLE:
			case SL_COMMENT:
			case ML_COMMENT:
			case CLASS:
			case EXPORT:
			case IMPORT:
			case CONSTRUCTOR:
			case FUNCTION:
			case OVERRIDE:
			case RETURN:
			case CONSOLE:
			case THIS:
			case NEW:
			case SUPER:
			case MODIFIER:
			case INTERFACE:
			case IF:
			case ELSE_IF:
			case ELSE:
			case FOR:
			case WHILE:
			case OPEN_B:
			case SQUARE_OPEN:
			case CURLY_OPEN:
			case CURLY_CLOSE:
			case HELPERS:
			case VAL:
			case ID:
			case SEMI_COLON:
			case SENTENCE:
				break;
			default:
				break;
			}
			setState(556);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_chainContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ParserFile.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ParserFile.DOT, i);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Property_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterProperty_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitProperty_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitProperty_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_chainContext property_chain() throws RecognitionException {
		Property_chainContext _localctx = new Property_chainContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_property_chain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(ID);
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(559);
					match(DOT);
					setState(560);
					match(ID);
					}
					} 
				}
				setState(565);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(568);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(566);
				match(DOT);
				setState(567);
				method_call();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitMethod_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(ID);
			setState(571);
			match(OPEN_B);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 1153290940513779729L) != 0) || _la==ID || _la==SENTENCE) {
				{
				setState(572);
				expr(0);
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(573);
					match(COMMA);
					setState(574);
					expr(0);
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(582);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(EQUAL);
			setState(585);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Post_opContext extends ParserRuleContext {
		public TerminalNode PLUS_PLUS() { return getToken(ParserFile.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(ParserFile.MINUS_MINUS, 0); }
		public Post_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_post_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPost_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPost_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPost_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Post_opContext post_op() throws RecognitionException {
		Post_opContext _localctx = new Post_opContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_post_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_la = _input.LA(1);
			if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(SQUARE_OPEN);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1140850944L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 4259861L) != 0) || _la==SENTENCE) {
				{
				setState(590);
				arrayElement();
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(591);
					match(COMMA);
					setState(592);
					arrayElement();
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(600);
			match(SQUARE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public SpreadElementContext spreadElement() {
			return getRuleContext(SpreadElementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayElement);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPREAD:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				spreadElement();
				}
				break;
			case THIS:
			case NEW:
			case OPEN_B:
			case SQUARE_OPEN:
			case CURLY_OPEN:
			case VAL:
			case ID:
			case SENTENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpreadElementContext extends ParserRuleContext {
		public TerminalNode SPREAD() { return getToken(ParserFile.SPREAD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SpreadElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterSpreadElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitSpreadElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitSpreadElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpreadElementContext spreadElement() throws RecognitionException {
		SpreadElementContext _localctx = new SpreadElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_spreadElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(SPREAD);
			setState(607);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_B() { return getTokens(ParserFile.OPEN_B); }
		public TerminalNode OPEN_B(int i) {
			return getToken(ParserFile.OPEN_B, i);
		}
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public List<TerminalNode> CLOSE_B() { return getTokens(ParserFile.CLOSE_B); }
		public TerminalNode CLOSE_B(int i) {
			return getToken(ParserFile.CLOSE_B, i);
		}
		public TerminalNode ARROW() { return getToken(ParserFile.ARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(OPEN_B);
			setState(610);
			match(ID);
			setState(611);
			match(CLOSE_B);
			setState(612);
			match(ARROW);
			setState(613);
			match(OPEN_B);
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case NEW:
			case OPEN_B:
			case SQUARE_OPEN:
			case CURLY_OPEN:
			case VAL:
			case ID:
			case SENTENCE:
				{
				setState(614);
				expr(0);
				}
				break;
			case EQUAL:
				{
				setState(615);
				assignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(618);
			match(CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(ParserFile.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode LOG() { return getToken(ParserFile.LOG, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(CONSOLE);
			setState(621);
			match(DOT);
			setState(622);
			match(LOG);
			setState(623);
			match(OPEN_B);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 1153290940513779729L) != 0) || _la==ID || _la==SENTENCE) {
				{
				setState(624);
				expr(0);
				}
			}

			setState(627);
			match(CLOSE_B);
			setState(628);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public TerminalNode MODIFIER() { return getToken(ParserFile.MODIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(630);
				match(MODIFIER);
				}
			}

			setState(633);
			match(ID);
			setState(634);
			match(COLON);
			setState(635);
			typeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeReferenceContext extends ParserRuleContext {
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitTypeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitTypeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_la = _input.LA(1);
			if ( !(_la==DATA_TYPE || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ParserFile.RETURN, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public TerminalNode SENTENCE() { return getToken(ParserFile.SENTENCE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(ParserFile.SQUARE_OPEN, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(ParserFile.SQUARE_CLOSE, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(RETURN);
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(640);
				match(ID);
				}
				break;
			case 2:
				{
				setState(641);
				match(VAL);
				}
				break;
			case 3:
				{
				setState(642);
				match(SENTENCE);
				}
				break;
			case 4:
				{
				setState(643);
				statements();
				}
				break;
			case 5:
				{
				setState(644);
				match(SQUARE_OPEN);
				setState(645);
				object();
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(646);
					match(COMMA);
					setState(647);
					object();
					}
					}
					setState(652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(653);
				match(SQUARE_CLOSE);
				setState(654);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunction_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunction_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_function_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(CURLY_OPEN);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(659);
					statements();
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(665);
				return_();
				}
			}

			setState(668);
			eos();
			setState(669);
			match(CURLY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public TerminalNode OVERRIDE() { return getToken(ParserFile.OVERRIDE, 0); }
		public TerminalNode FUNCTION() { return getToken(ParserFile.FUNCTION, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode VOID() { return getToken(ParserFile.VOID, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterFunction_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitFunction_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitFunction_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(671);
				match(OVERRIDE);
				}
			}

			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(674);
				match(FUNCTION);
				}
			}

			setState(677);
			match(ID);
			setState(678);
			match(OPEN_B);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER || _la==ID) {
				{
				setState(679);
				parameter();
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(680);
					match(COMMA);
					setState(681);
					parameter();
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(689);
			match(CLOSE_B);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(690);
				match(COLON);
				setState(691);
				_la = _input.LA(1);
				if ( !(_la==VOID || _la==DATA_TYPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(694);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(CURLY_OPEN);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 612498346588889088L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136331961L) != 0) || _la==SENTENCE) {
				{
				{
				setState(697);
				statements();
				}
				}
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(703);
			match(CURLY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Class_declContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ParserFile.CLASS, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public TerminalNode EXTENDS() { return getToken(ParserFile.EXTENDS, 0); }
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitClass_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitClass_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(705);
				match(EXPORT);
				}
			}

			setState(708);
			match(CLASS);
			setState(709);
			match(ID);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(710);
				match(EXTENDS);
				}
			}

			setState(713);
			class_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ParserFile.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public TerminalNode EXPORT() { return getToken(ParserFile.EXPORT, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(715);
				match(EXPORT);
				}
			}

			setState(718);
			match(INTERFACE);
			setState(719);
			match(ID);
			setState(720);
			match(CURLY_OPEN);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 137455730689L) != 0)) {
				{
				{
				setState(721);
				declaration();
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			match(CURLY_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(ParserFile.CONSTRUCTOR, 0); }
		public TerminalNode OPEN_B() { return getToken(ParserFile.OPEN_B, 0); }
		public TerminalNode CLOSE_B() { return getToken(ParserFile.CLOSE_B, 0); }
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(CONSTRUCTOR);
			setState(730);
			match(OPEN_B);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER || _la==ID) {
				{
				setState(731);
				parameter();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(732);
					match(COMMA);
					setState(733);
					parameter();
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(741);
			match(CLOSE_B);
			setState(742);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserFile.IMPORT, 0); }
		public TerminalNode CURLY_OPEN() { return getToken(ParserFile.CURLY_OPEN, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ParserFile.CURLY_CLOSE, 0); }
		public TerminalNode FROM() { return getToken(ParserFile.FROM, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserFile.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserFile.COMMA, i);
		}
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			match(IMPORT);
			setState(745);
			match(CURLY_OPEN);
			setState(746);
			match(ID);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(747);
				match(COMMA);
				setState(748);
				match(ID);
				}
				}
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(754);
			match(CURLY_CLOSE);
			setState(755);
			match(FROM);
			setState(756);
			match(VAL);
			setState(757);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode SL_COMMENT() { return getToken(ParserFile.SL_COMMENT, 0); }
		public TerminalNode ML_COMMENT() { return getToken(ParserFile.ML_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_la = _input.LA(1);
			if ( !(_la==SL_COMMENT || _la==ML_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI_COLON() { return getToken(ParserFile.SEMI_COLON, 0); }
		public TerminalNode EOF() { return getToken(ParserFile.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_eos);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(761);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(ParserFile.XML, 0); }
		public TerminalNode DTD() { return getToken(ParserFile.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(767);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(773);
				match(XML);
				}
			}

			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(776);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			}
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(782);
				match(DTD);
				}
			}

			setState(788);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(785);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(790);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1702360659146047487L) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & 921L) != 0)) {
				{
				{
				setState(791);
				htmlElements();
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(ParserFile.SCRIPTLET, 0); }
		public TerminalNode SEA_WS() { return getToken(ParserFile.SEA_WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==SCRIPTLET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 27021597764222977L) != 0)) {
				{
				{
				setState(799);
				htmlMisc();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
			htmlElement();
			setState(809);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(806);
					htmlMisc();
					}
					} 
				}
				setState(811);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(ParserFile.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(ParserFile.TAG_NAME, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(ParserFile.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(ParserFile.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(ParserFile.TAG_SLASH_CLOSE, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(ParserFile.TAG_SLASH, 0); }
		public TerminalNode SCRIPTLET() { return getToken(ParserFile.SCRIPTLET, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				match(TAG_OPEN);
				setState(813);
				match(TAG_NAME);
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(814);
						htmlAttribute();
						}
						} 
					}
					setState(819);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				setState(821);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(820);
					binding();
					}
					break;
				}
				setState(824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(823);
					hash();
					}
					break;
				}
				setState(827);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(826);
					directive();
					}
					break;
				}
				}
				break;
			case DIRECTIVE:
			case TAG_CLOSE:
			case TAG_SLASH_CLOSE:
			case TAG_NAME:
			case BINDING:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIRECTIVE) {
					{
					setState(829);
					directive();
					}
				}

				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(832);
					htmlAttribute();
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINDING) {
					{
					setState(838);
					binding();
					}
				}

				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(841);
					hash();
					}
				}

				setState(854);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(844);
					match(TAG_CLOSE);
					setState(851);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						setState(845);
						htmlContent();
						setState(846);
						match(TAG_OPEN);
						setState(847);
						match(TAG_SLASH);
						setState(848);
						match(TAG_NAME);
						setState(849);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(853);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				match(SCRIPTLET);
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(857);
				script();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(858);
				style();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE() { return getToken(ParserFile.DIRECTIVE, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ParserFile.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ParserFile.ATTVALUE_VALUE, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(DIRECTIVE);
			setState(862);
			match(TAG_EQUALS);
			setState(863);
			match(ATTVALUE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BindingContext extends ParserRuleContext {
		public TerminalNode BINDING() { return getToken(ParserFile.BINDING, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ParserFile.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ParserFile.ATTVALUE_VALUE, 0); }
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(BINDING);
			setState(866);
			match(TAG_EQUALS);
			setState(867);
			match(ATTVALUE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HashContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ParserFile.HASH, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ParserFile.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ParserFile.ATTVALUE_VALUE, 0); }
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(HASH);
			setState(870);
			match(TAG_EQUALS);
			setState(871);
			match(ATTVALUE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlChardataContext> htmlChardata() {
			return getRuleContexts(HtmlChardataContext.class);
		}
		public HtmlChardataContext htmlChardata(int i) {
			return getRuleContext(HtmlChardataContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<TerminalNode> CDATA() { return getTokens(ParserFile.CDATA); }
		public TerminalNode CDATA(int i) {
			return getToken(ParserFile.CDATA, i);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(873);
				htmlChardata();
				}
				break;
			}
			setState(886);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(879);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCRIPTLET:
					case SCRIPT_OPEN:
					case STYLE_OPEN:
					case TAG_OPEN:
					case DIRECTIVE:
					case TAG_CLOSE:
					case TAG_SLASH_CLOSE:
					case TAG_NAME:
					case BINDING:
					case HASH:
						{
						setState(876);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(877);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(878);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(882);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						setState(881);
						htmlChardata();
						}
						break;
					}
					}
					} 
				}
				setState(888);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(ParserFile.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(ParserFile.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(ParserFile.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(TAG_NAME);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(890);
				match(TAG_EQUALS);
				setState(891);
				match(ATTVALUE_VALUE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(ParserFile.HTML_TEXT, 0); }
		public TerminalNode INTERPOLATION() { return getToken(ParserFile.INTERPOLATION, 0); }
		public TerminalNode SEA_WS() { return getToken(ParserFile.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_htmlChardata);
		int _la;
		try {
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
			case CDATA:
			case INTERPOLATION:
			case SCRIPTLET:
			case SCRIPT_OPEN:
			case STYLE_OPEN:
			case TAG_OPEN:
			case HTML_TEXT:
			case DIRECTIVE:
			case TAG_CLOSE:
			case TAG_SLASH_CLOSE:
			case TAG_NAME:
			case BINDING:
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_TEXT) {
					{
					setState(894);
					match(HTML_TEXT);
					}
				}

				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERPOLATION) {
					{
					setState(897);
					match(INTERPOLATION);
					}
				}

				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(ParserFile.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlMisc);
		try {
			setState(905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				match(SEA_WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(ParserFile.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(ParserFile.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(ParserFile.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(ParserFile.SCRIPT_BODY, 0); }
		public TerminalNode SCRIPT_SHORT_BODY() { return getToken(ParserFile.SCRIPT_SHORT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			match(SCRIPT_OPEN);
			setState(910);
			_la = _input.LA(1);
			if ( !(_la==SCRIPT_BODY || _la==SCRIPT_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(ParserFile.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(ParserFile.STYLE_BODY, 0); }
		public TerminalNode STYLE_SHORT_BODY() { return getToken(ParserFile.STYLE_SHORT_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserFileListener ) ((ParserFileListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserFileVisitor ) return ((ParserFileVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(STYLE_OPEN);
			setState(913);
			_la = _input.LA(1);
			if ( !(_la==STYLE_BODY || _la==STYLE_SHORT_BODY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 30:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0097\u0394\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0001\u0000\u0004\u0000\u0088\b\u0000\u000b"+
		"\u0000\f\u0000\u0089\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u008f"+
		"\b\u0001\u000b\u0001\f\u0001\u0090\u0001\u0001\u0005\u0001\u0094\b\u0001"+
		"\n\u0001\f\u0001\u0097\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u009c\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003\u0003\u00a6\b\u0003\u0001"+
		"\u0003\u0003\u0003\u00a9\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ad"+
		"\b\u0003\u0001\u0003\u0003\u0003\u00b0\b\u0003\u0001\u0003\u0003\u0003"+
		"\u00b3\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b9\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00bf\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00c5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00cd\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00d5\b\b\n\b\f\b\u00d8\t\b\u0003\b\u00da\b\b"+
		"\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00e4\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f1\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0106\b\f\u0001\r\u0001\r\u0003\r\u010a\b\r\u0001\u000e\u0003"+
		"\u000e\u010d\b\u000e\u0001\u000e\u0003\u000e\u0110\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0003\u000f\u011a\b\u000f\u0001\u000f\u0003\u000f\u011d\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0124\b\u000f\u0003\u000f\u0126\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u012d\b\u000f\n\u000f"+
		"\f\u000f\u0130\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0139\b\u0010\n\u0010"+
		"\f\u0010\u013c\t\u0010\u0001\u0010\u0003\u0010\u013f\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0143\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0003\u0014\u015c\b\u0014\u0001\u0014\u0003\u0014"+
		"\u015f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0164\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0169\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0004\u0016\u0173\b\u0016\u000b\u0016\f\u0016\u0174"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0179\b\u0016\n\u0016\f\u0016\u017c"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0186\b\u0016\n\u0016\f\u0016"+
		"\u0189\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u018d\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0194"+
		"\b\u0017\n\u0017\f\u0017\u0197\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u019c\b\u0017\n\u0017\f\u0017\u019f\t\u0017\u0001\u0017\u0003"+
		"\u0017\u01a2\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u01a9\b\u0018\n\u0018\f\u0018\u01ac\t\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01c7\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01cc\b\u001b\n\u001b\f\u001b\u01cf\t\u001b\u0001\u001b\u0003\u001b\u01d2"+
		"\b\u001b\u0001\u001b\u0003\u001b\u01d5\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u01e6\b\u001d\n\u001d\f\u001d\u01e9\t\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01fd\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0203\b\u001e\n\u001e\f\u001e\u0206\t\u001e\u0003\u001e\u0208\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u020c\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0221\b\u001e\n\u001e\f\u001e\u0224\t\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u022b\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u0232\b \n \f \u0235\t \u0001"+
		" \u0001 \u0003 \u0239\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0240"+
		"\b!\n!\f!\u0243\t!\u0003!\u0245\b!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0005$\u0252\b$\n$\f$\u0255"+
		"\t$\u0003$\u0257\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u025d\b%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u0269\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u0272\b(\u0001(\u0001(\u0001(\u0001)\u0003)\u0278\b)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0005+\u0289\b+\n+\f+\u028c\t+\u0001+\u0001+\u0001"+
		"+\u0003+\u0291\b+\u0001,\u0001,\u0005,\u0295\b,\n,\f,\u0298\t,\u0001,"+
		"\u0003,\u029b\b,\u0001,\u0001,\u0001,\u0001-\u0003-\u02a1\b-\u0001-\u0003"+
		"-\u02a4\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0005-\u02ab\b-\n-\f-\u02ae"+
		"\t-\u0003-\u02b0\b-\u0001-\u0001-\u0001-\u0003-\u02b5\b-\u0001-\u0001"+
		"-\u0001.\u0001.\u0005.\u02bb\b.\n.\f.\u02be\t.\u0001.\u0001.\u0001/\u0003"+
		"/\u02c3\b/\u0001/\u0001/\u0001/\u0003/\u02c8\b/\u0001/\u0001/\u00010\u0003"+
		"0\u02cd\b0\u00010\u00010\u00010\u00010\u00050\u02d3\b0\n0\f0\u02d6\t0"+
		"\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00051\u02df\b1\n1\f"+
		"1\u02e2\t1\u00031\u02e4\b1\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00052\u02ee\b2\n2\f2\u02f1\t2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00013\u00013\u00014\u00034\u02fb\b4\u00014\u00034\u02fe\b4\u00015\u0005"+
		"5\u0301\b5\n5\f5\u0304\t5\u00015\u00035\u0307\b5\u00015\u00055\u030a\b"+
		"5\n5\f5\u030d\t5\u00015\u00035\u0310\b5\u00015\u00055\u0313\b5\n5\f5\u0316"+
		"\t5\u00015\u00055\u0319\b5\n5\f5\u031c\t5\u00016\u00016\u00017\u00057"+
		"\u0321\b7\n7\f7\u0324\t7\u00017\u00017\u00057\u0328\b7\n7\f7\u032b\t7"+
		"\u00018\u00018\u00018\u00058\u0330\b8\n8\f8\u0333\t8\u00018\u00038\u0336"+
		"\b8\u00018\u00038\u0339\b8\u00018\u00038\u033c\b8\u00018\u00038\u033f"+
		"\b8\u00018\u00058\u0342\b8\n8\f8\u0345\t8\u00018\u00038\u0348\b8\u0001"+
		"8\u00038\u034b\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0003"+
		"8\u0354\b8\u00018\u00038\u0357\b8\u00018\u00018\u00018\u00038\u035c\b"+
		"8\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0003<\u036b\b<\u0001<\u0001<\u0001<\u0003<\u0370"+
		"\b<\u0001<\u0003<\u0373\b<\u0005<\u0375\b<\n<\f<\u0378\t<\u0001=\u0001"+
		"=\u0001=\u0003=\u037d\b=\u0001>\u0003>\u0380\b>\u0001>\u0003>\u0383\b"+
		">\u0001>\u0003>\u0386\b>\u0001?\u0001?\u0003?\u038a\b?\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0000\u0001<C\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0000"+
		"\n\u0001\u0000\u000b\f\u0002\u0000VV\\\\\u0001\u0000ef\u0002\u0000??\\"+
		"\\\u0002\u0000!!??\u0001\u0000\r\u000e\u0002\u0000@@{{\u0001\u0000uv\u0001"+
		"\u0000\u0090\u0091\u0001\u0000\u0092\u0093\u03ec\u0000\u0087\u0001\u0000"+
		"\u0000\u0000\u0002\u009b\u0001\u0000\u0000\u0000\u0004\u009d\u0001\u0000"+
		"\u0000\u0000\u0006\u00a5\u0001\u0000\u0000\u0000\b\u00b4\u0001\u0000\u0000"+
		"\u0000\n\u00ba\u0001\u0000\u0000\u0000\f\u00c0\u0001\u0000\u0000\u0000"+
		"\u000e\u00c6\u0001\u0000\u0000\u0000\u0010\u00ce\u0001\u0000\u0000\u0000"+
		"\u0012\u00df\u0001\u0000\u0000\u0000\u0014\u00e5\u0001\u0000\u0000\u0000"+
		"\u0016\u00ec\u0001\u0000\u0000\u0000\u0018\u0105\u0001\u0000\u0000\u0000"+
		"\u001a\u0109\u0001\u0000\u0000\u0000\u001c\u010c\u0001\u0000\u0000\u0000"+
		"\u001e\u0119\u0001\u0000\u0000\u0000 \u0134\u0001\u0000\u0000\u0000\""+
		"\u0144\u0001\u0000\u0000\u0000$\u0148\u0001\u0000\u0000\u0000&\u014c\u0001"+
		"\u0000\u0000\u0000(\u015b\u0001\u0000\u0000\u0000*\u0168\u0001\u0000\u0000"+
		"\u0000,\u018c\u0001\u0000\u0000\u0000.\u018e\u0001\u0000\u0000\u00000"+
		"\u01a3\u0001\u0000\u0000\u00002\u01b0\u0001\u0000\u0000\u00004\u01c6\u0001"+
		"\u0000\u0000\u00006\u01d4\u0001\u0000\u0000\u00008\u01d6\u0001\u0000\u0000"+
		"\u0000:\u01e0\u0001\u0000\u0000\u0000<\u020b\u0001\u0000\u0000\u0000>"+
		"\u0225\u0001\u0000\u0000\u0000@\u022e\u0001\u0000\u0000\u0000B\u023a\u0001"+
		"\u0000\u0000\u0000D\u0248\u0001\u0000\u0000\u0000F\u024b\u0001\u0000\u0000"+
		"\u0000H\u024d\u0001\u0000\u0000\u0000J\u025c\u0001\u0000\u0000\u0000L"+
		"\u025e\u0001\u0000\u0000\u0000N\u0261\u0001\u0000\u0000\u0000P\u026c\u0001"+
		"\u0000\u0000\u0000R\u0277\u0001\u0000\u0000\u0000T\u027d\u0001\u0000\u0000"+
		"\u0000V\u027f\u0001\u0000\u0000\u0000X\u0292\u0001\u0000\u0000\u0000Z"+
		"\u02a0\u0001\u0000\u0000\u0000\\\u02b8\u0001\u0000\u0000\u0000^\u02c2"+
		"\u0001\u0000\u0000\u0000`\u02cc\u0001\u0000\u0000\u0000b\u02d9\u0001\u0000"+
		"\u0000\u0000d\u02e8\u0001\u0000\u0000\u0000f\u02f7\u0001\u0000\u0000\u0000"+
		"h\u02fd\u0001\u0000\u0000\u0000j\u0302\u0001\u0000\u0000\u0000l\u031d"+
		"\u0001\u0000\u0000\u0000n\u0322\u0001\u0000\u0000\u0000p\u035b\u0001\u0000"+
		"\u0000\u0000r\u035d\u0001\u0000\u0000\u0000t\u0361\u0001\u0000\u0000\u0000"+
		"v\u0365\u0001\u0000\u0000\u0000x\u036a\u0001\u0000\u0000\u0000z\u0379"+
		"\u0001\u0000\u0000\u0000|\u0385\u0001\u0000\u0000\u0000~\u0389\u0001\u0000"+
		"\u0000\u0000\u0080\u038b\u0001\u0000\u0000\u0000\u0082\u038d\u0001\u0000"+
		"\u0000\u0000\u0084\u0390\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0002"+
		"\u0001\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0003h4\u0000"+
		"\u008c\u0001\u0001\u0000\u0000\u0000\u008d\u008f\u0003d2\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0095"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0003d2\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u009c\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009c\u0003\u0004"+
		"\u0002\u0000\u0099\u009c\u0003\u0014\n\u0000\u009a\u009c\u0003\u0018\f"+
		"\u0000\u009b\u008e\u0001\u0000\u0000\u0000\u009b\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u0003\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0002\u0000"+
		"\u0000\u009e\u009f\u0005F\u0000\u0000\u009f\u00a0\u0005J\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0006\u0003\u0000\u00a1\u00a2\u0005K\u0000\u0000\u00a2\u00a3"+
		"\u0005G\u0000\u0000\u00a3\u0005\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003"+
		"\n\u0005\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\b\u0004"+
		"\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003\f\u0006\u0000"+
		"\u00ab\u00ad\u0003\u000e\u0007\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0010\b\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u0012\t\u0000\u00b2\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u0007"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00b6"+
		"\u0005]\u0000\u0000\u00b6\u00b8\u0005V\u0000\u0000\u00b7\u00b9\u0005^"+
		"\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\t\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0006\u0000"+
		"\u0000\u00bb\u00bc\u0005]\u0000\u0000\u00bc\u00be\u0005V\u0000\u0000\u00bd"+
		"\u00bf\u0005^\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u000b\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\n\u0000\u0000\u00c1\u00c2\u0005]\u0000\u0000\u00c2\u00c4\u0005"+
		"V\u0000\u0000\u00c3\u00c5\u0005^\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\r\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005\u0007\u0000\u0000\u00c7\u00c8\u0005]\u0000\u0000\u00c8"+
		"\u00c9\u0005\u0001\u0000\u0000\u00c9\u00ca\u0003j5\u0000\u00ca\u00cc\u0005"+
		"t\u0000\u0000\u00cb\u00cd\u0005^\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u000f\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005\t\u0000\u0000\u00cf\u00d0\u0005]\u0000\u0000"+
		"\u00d0\u00d1\u0005H\u0000\u0000\u00d1\u00d9\u0005\\\u0000\u0000\u00d2"+
		"\u00d6\u0005^\u0000\u0000\u00d3\u00d5\u0005\\\u0000\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0001\u0000\u0000\u0000\u00db\u00dd\u0005I\u0000\u0000\u00dc\u00de\u0005"+
		"^\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u0011\u0001\u0000\u0000\u0000\u00df\u00e0\u0007\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005]\u0000\u0000\u00e1\u00e3\u0005V\u0000\u0000"+
		"\u00e2\u00e4\u0005^\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u0013\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005\u0003\u0000\u0000\u00e6\u00e7\u0005F\u0000\u0000\u00e7\u00e8"+
		"\u0005J\u0000\u0000\u00e8\u00e9\u0003\u0016\u000b\u0000\u00e9\u00ea\u0005"+
		"K\u0000\u0000\u00ea\u00eb\u0005G\u0000\u0000\u00eb\u0015\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\u0004\u0000\u0000\u00ed\u00ee\u0005]\u0000\u0000"+
		"\u00ee\u00f0\u0005V\u0000\u0000\u00ef\u00f1\u0005^\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0017"+
		"\u0001\u0000\u0000\u0000\u00f2\u0106\u0003^/\u0000\u00f3\u0106\u0003`"+
		"0\u0000\u00f4\u0106\u0003Z-\u0000\u00f5\u0106\u0003b1\u0000\u00f6\u0106"+
		"\u0003\u001c\u000e\u0000\u00f7\u0106\u0003\u001e\u000f\u0000\u00f8\u0106"+
		"\u0003$\u0012\u0000\u00f9\u0106\u0003(\u0014\u0000\u00fa\u0106\u0003*"+
		"\u0015\u0000\u00fb\u0106\u0003.\u0017\u0000\u00fc\u0106\u00038\u001c\u0000"+
		"\u00fd\u0106\u0003:\u001d\u0000\u00fe\u0106\u0003<\u001e\u0000\u00ff\u0106"+
		"\u0003>\u001f\u0000\u0100\u0106\u0003,\u0016\u0000\u0101\u0106\u0003P"+
		"(\u0000\u0102\u0106\u0003\u001a\r\u0000\u0103\u0106\u0003V+\u0000\u0104"+
		"\u0106\u0003f3\u0000\u0105\u00f2\u0001\u0000\u0000\u0000\u0105\u00f3\u0001"+
		"\u0000\u0000\u0000\u0105\u00f4\u0001\u0000\u0000\u0000\u0105\u00f5\u0001"+
		"\u0000\u0000\u0000\u0105\u00f6\u0001\u0000\u0000\u0000\u0105\u00f7\u0001"+
		"\u0000\u0000\u0000\u0105\u00f8\u0001\u0000\u0000\u0000\u0105\u00f9\u0001"+
		"\u0000\u0000\u0000\u0105\u00fa\u0001\u0000\u0000\u0000\u0105\u00fb\u0001"+
		"\u0000\u0000\u0000\u0105\u00fc\u0001\u0000\u0000\u0000\u0105\u00fd\u0001"+
		"\u0000\u0000\u0000\u0105\u00fe\u0001\u0000\u0000\u0000\u0105\u00ff\u0001"+
		"\u0000\u0000\u0000\u0105\u0100\u0001\u0000\u0000\u0000\u0105\u0101\u0001"+
		"\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0104\u0001\u0000\u0000\u0000\u0106\u0019\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0005V\u0000\u0000\u0108\u010a\u0003 \u0010"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u001b\u0001\u0000\u0000\u0000\u010b\u010d\u00057\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0110\u0005O\u0000\u0000\u010f"+
		"\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0005\\\u0000\u0000\u0112\u0113"+
		"\u0005]\u0000\u0000\u0113\u0114\u0005?\u0000\u0000\u0114\u0115\u0005a"+
		"\u0000\u0000\u0115\u0116\u0003\u001a\r\u0000\u0116\u0117\u0003h4\u0000"+
		"\u0117\u001d\u0001\u0000\u0000\u0000\u0118\u011a\u0005\u0010\u0000\u0000"+
		"\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u011d\u0005O\u0000\u0000\u011c"+
		"\u011b\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0125\u0005\\\u0000\u0000\u011f\u0120"+
		"\u0005]\u0000\u0000\u0120\u0123\u0003T*\u0000\u0121\u0122\u0005H\u0000"+
		"\u0000\u0122\u0124\u0005I\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126\u0001\u0000\u0000\u0000"+
		"\u0125\u011f\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005a\u0000\u0000\u0128"+
		"\u0129\u0005H\u0000\u0000\u0129\u012e\u0003\u001a\r\u0000\u012a\u012b"+
		"\u0005^\u0000\u0000\u012b\u012d\u0003\u001a\r\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"I\u0000\u0000\u0132\u0133\u0003h4\u0000\u0133\u001f\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0005J\u0000\u0000\u0135\u013a\u0003\"\u0011\u0000"+
		"\u0136\u0137\u0005^\u0000\u0000\u0137\u0139\u0003\"\u0011\u0000\u0138"+
		"\u0136\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u013f\u0005^\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000\u013e\u013f"+
		"\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0142"+
		"\u0005K\u0000\u0000\u0141\u0143\u0005^\u0000\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143!\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\\\u0000\u0000\u0145\u0146\u0005]\u0000\u0000"+
		"\u0146\u0147\u0007\u0001\u0000\u0000\u0147#\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0003(\u0014\u0000\u0149\u014a\u0005a\u0000\u0000\u014a\u014b\u0003"+
		">\u001f\u0000\u014b%\u0001\u0000\u0000\u0000\u014c\u014d\u0003(\u0014"+
		"\u0000\u014d\u014e\u0005a\u0000\u0000\u014e\u014f\u0005\u001e\u0000\u0000"+
		"\u014f\u0150\u0005\\\u0000\u0000\u0150\u0151\u0005o\u0000\u0000\u0151"+
		"\u0152\u0005?\u0000\u0000\u0152\u0153\u0005H\u0000\u0000\u0153\u0154\u0005"+
		"I\u0000\u0000\u0154\u0155\u0005p\u0000\u0000\u0155\u0156\u0005F\u0000"+
		"\u0000\u0156\u0157\u0003H$\u0000\u0157\u0158\u0005G\u0000\u0000\u0158"+
		"\u0159\u0005`\u0000\u0000\u0159\'\u0001\u0000\u0000\u0000\u015a\u015c"+
		"\u00057\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015f\u0005"+
		"O\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0163\u0005\\\u0000"+
		"\u0000\u0161\u0162\u0005]\u0000\u0000\u0162\u0164\u0005?\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0003h4\u0000\u0166)\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u0005O\u0000\u0000\u0168\u0167\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0005\\\u0000\u0000\u016b\u016c\u0005a\u0000"+
		"\u0000\u016c\u016d\u0007\u0001\u0000\u0000\u016d\u016e\u0003h4\u0000\u016e"+
		"+\u0001\u0000\u0000\u0000\u016f\u0170\u0005+\u0000\u0000\u0170\u0172\u0005"+
		"b\u0000\u0000\u0171\u0173\u0005\\\u0000\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u017a\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005b\u0000\u0000\u0177\u0179\u0005\\\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005a\u0000\u0000\u017e\u017f\u0007\u0001\u0000\u0000"+
		"\u017f\u018d\u0003h4\u0000\u0180\u0181\u0005+\u0000\u0000\u0181\u0182"+
		"\u0005F\u0000\u0000\u0182\u0187\u0005\\\u0000\u0000\u0183\u0184\u0005"+
		"^\u0000\u0000\u0184\u0186\u0005\\\u0000\u0000\u0185\u0183\u0001\u0000"+
		"\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0005G\u0000"+
		"\u0000\u018b\u018d\u0003h4\u0000\u018c\u016f\u0001\u0000\u0000\u0000\u018c"+
		"\u0180\u0001\u0000\u0000\u0000\u018d-\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005A\u0000\u0000\u018f\u0190\u0005F\u0000\u0000\u0190\u0195\u00034"+
		"\u001a\u0000\u0191\u0192\u0005s\u0000\u0000\u0192\u0194\u00034\u001a\u0000"+
		"\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0005G\u0000\u0000\u0199\u019d\u00036\u001b\u0000\u019a\u019c"+
		"\u00030\u0018\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u019f\u0001"+
		"\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a2\u00032\u0019\u0000\u01a1\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2/\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0005B\u0000\u0000\u01a4\u01a5\u0005F\u0000\u0000\u01a5"+
		"\u01aa\u00034\u001a\u0000\u01a6\u01a7\u0005s\u0000\u0000\u01a7\u01a9\u0003"+
		"4\u001a\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005G\u0000\u0000\u01ae\u01af\u00036\u001b\u0000"+
		"\u01af1\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005C\u0000\u0000\u01b1\u01b2"+
		"\u00036\u001b\u0000\u01b23\u0001\u0000\u0000\u0000\u01b3\u01c7\u0005\\"+
		"\u0000\u0000\u01b4\u01c7\u0005V\u0000\u0000\u01b5\u01b6\u0005V\u0000\u0000"+
		"\u01b6\u01b7\u0005i\u0000\u0000\u01b7\u01c7\u0005V\u0000\u0000\u01b8\u01b9"+
		"\u0005V\u0000\u0000\u01b9\u01ba\u0005i\u0000\u0000\u01ba\u01c7\u0005\\"+
		"\u0000\u0000\u01bb\u01bc\u0005\\\u0000\u0000\u01bc\u01bd\u0005i\u0000"+
		"\u0000\u01bd\u01c7\u0005V\u0000\u0000\u01be\u01bf\u0005\\\u0000\u0000"+
		"\u01bf\u01c0\u0005i\u0000\u0000\u01c0\u01c7\u0005\\\u0000\u0000\u01c1"+
		"\u01c2\u0005\\\u0000\u0000\u01c2\u01c3\u0005i\u0000\u0000\u01c3\u01c4"+
		"\u0005\\\u0000\u0000\u01c4\u01c5\u0005b\u0000\u0000\u01c5\u01c7\u0005"+
		"\\\u0000\u0000\u01c6\u01b3\u0001\u0000\u0000\u0000\u01c6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01c6\u01b5\u0001\u0000\u0000\u0000\u01c6\u01b8\u0001\u0000"+
		"\u0000\u0000\u01c6\u01bb\u0001\u0000\u0000\u0000\u01c6\u01be\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c1\u0001\u0000\u0000\u0000\u01c75\u0001\u0000\u0000"+
		"\u0000\u01c8\u01d5\u0003\u0018\f\u0000\u01c9\u01cd\u0005J\u0000\u0000"+
		"\u01ca\u01cc\u0003\u0018\f\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd"+
		"\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d2\u0003h4\u0000\u01d1\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d5\u0005K\u0000\u0000\u01d4\u01c8\u0001\u0000"+
		"\u0000\u0000\u01d4\u01c9\u0001\u0000\u0000\u0000\u01d57\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0005D\u0000\u0000\u01d7\u01d8\u0005F\u0000\u0000\u01d8"+
		"\u01d9\u0003\u001c\u000e\u0000\u01d9\u01da\u0005`\u0000\u0000\u01da\u01db"+
		"\u00034\u001a\u0000\u01db\u01dc\u0005`\u0000\u0000\u01dc\u01dd\u0003<"+
		"\u001e\u0000\u01dd\u01de\u0005G\u0000\u0000\u01de\u01df\u00036\u001b\u0000"+
		"\u01df9\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005E\u0000\u0000\u01e1\u01e2"+
		"\u0005F\u0000\u0000\u01e2\u01e7\u00034\u001a\u0000\u01e3\u01e4\u0005s"+
		"\u0000\u0000\u01e4\u01e6\u00034\u001a\u0000\u01e5\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005G\u0000\u0000"+
		"\u01eb\u01ec\u00036\u001b\u0000\u01ec;\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0006\u001e\uffff\uffff\u0000\u01ee\u020c\u0005V\u0000\u0000\u01ef\u020c"+
		"\u0005\\\u0000\u0000\u01f0\u020c\u0005\u008f\u0000\u0000\u01f1\u020c\u0003"+
		" \u0010\u0000\u01f2\u020c\u0003H$\u0000\u01f3\u020c\u0003B!\u0000\u01f4"+
		"\u01f5\u0005\u001a\u0000\u0000\u01f5\u01f6\u0005b\u0000\u0000\u01f6\u020c"+
		"\u0003@ \u0000\u01f7\u01f8\u0005\u001e\u0000\u0000\u01f8\u01fc\u0005\\"+
		"\u0000\u0000\u01f9\u01fa\u0005o\u0000\u0000\u01fa\u01fb\u0005?\u0000\u0000"+
		"\u01fb\u01fd\u0005p\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe"+
		"\u0207\u0005F\u0000\u0000\u01ff\u0204\u0003<\u001e\u0000\u0200\u0201\u0005"+
		"^\u0000\u0000\u0201\u0203\u0003<\u001e\u0000\u0202\u0200\u0001\u0000\u0000"+
		"\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000"+
		"\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u01ff\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u020c\u0005G\u0000\u0000\u020a\u020c\u0003N\'\u0000\u020b"+
		"\u01ed\u0001\u0000\u0000\u0000\u020b\u01ef\u0001\u0000\u0000\u0000\u020b"+
		"\u01f0\u0001\u0000\u0000\u0000\u020b\u01f1\u0001\u0000\u0000\u0000\u020b"+
		"\u01f2\u0001\u0000\u0000\u0000\u020b\u01f3\u0001\u0000\u0000\u0000\u020b"+
		"\u01f4\u0001\u0000\u0000\u0000\u020b\u01f7\u0001\u0000\u0000\u0000\u020b"+
		"\u020a\u0001\u0000\u0000\u0000\u020c\u0222\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\n\u0010\u0000\u0000\u020e\u020f\u0005a\u0000\u0000\u020f\u0221"+
		"\u0003<\u001e\u0011\u0210\u0211\n\u000f\u0000\u0000\u0211\u0212\u0005"+
		"h\u0000\u0000\u0212\u0221\u0003<\u001e\u0010\u0213\u0214\n\u000e\u0000"+
		"\u0000\u0214\u0215\u0005g\u0000\u0000\u0215\u0221\u0003<\u001e\u000f\u0216"+
		"\u0217\n\r\u0000\u0000\u0217\u0218\u0005c\u0000\u0000\u0218\u0221\u0003"+
		"<\u001e\u000e\u0219\u021a\n\f\u0000\u0000\u021a\u021b\u0005d\u0000\u0000"+
		"\u021b\u0221\u0003<\u001e\r\u021c\u021d\n\u000b\u0000\u0000\u021d\u0221"+
		"\u0005e\u0000\u0000\u021e\u021f\n\n\u0000\u0000\u021f\u0221\u0005f\u0000"+
		"\u0000\u0220\u020d\u0001\u0000\u0000\u0000\u0220\u0210\u0001\u0000\u0000"+
		"\u0000\u0220\u0213\u0001\u0000\u0000\u0000\u0220\u0216\u0001\u0000\u0000"+
		"\u0000\u0220\u0219\u0001\u0000\u0000\u0000\u0220\u021c\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0224\u0001\u0000\u0000"+
		"\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223=\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000"+
		"\u0225\u0226\u0005\u001a\u0000\u0000\u0226\u0227\u0005b\u0000\u0000\u0227"+
		"\u022a\u0003@ \u0000\u0228\u022b\u0003D\"\u0000\u0229\u022b\u0003F#\u0000"+
		"\u022a\u0228\u0001\u0000\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000"+
		"\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u022d\u0003h4\u0000\u022d?\u0001\u0000\u0000\u0000\u022e\u0233"+
		"\u0005\\\u0000\u0000\u022f\u0230\u0005b\u0000\u0000\u0230\u0232\u0005"+
		"\\\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000"+
		"\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0238\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000"+
		"\u0000\u0000\u0236\u0237\u0005b\u0000\u0000\u0237\u0239\u0003B!\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000"+
		"\u0239A\u0001\u0000\u0000\u0000\u023a\u023b\u0005\\\u0000\u0000\u023b"+
		"\u0244\u0005F\u0000\u0000\u023c\u0241\u0003<\u001e\u0000\u023d\u023e\u0005"+
		"^\u0000\u0000\u023e\u0240\u0003<\u001e\u0000\u023f\u023d\u0001\u0000\u0000"+
		"\u0000\u0240\u0243\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0245\u0001\u0000\u0000"+
		"\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0244\u023c\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000"+
		"\u0000\u0246\u0247\u0005G\u0000\u0000\u0247C\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0005a\u0000\u0000\u0249\u024a\u0003<\u001e\u0000\u024aE\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0007\u0002\u0000\u0000\u024cG\u0001\u0000"+
		"\u0000\u0000\u024d\u0256\u0005H\u0000\u0000\u024e\u0253\u0003J%\u0000"+
		"\u024f\u0250\u0005^\u0000\u0000\u0250\u0252\u0003J%\u0000\u0251\u024f"+
		"\u0001\u0000\u0000\u0000\u0252\u0255\u0001\u0000\u0000\u0000\u0253\u0251"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0257"+
		"\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0256\u024e"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0005I\u0000\u0000\u0259I\u0001\u0000"+
		"\u0000\u0000\u025a\u025d\u0003L&\u0000\u025b\u025d\u0003<\u001e\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000"+
		"\u025dK\u0001\u0000\u0000\u0000\u025e\u025f\u0005\b\u0000\u0000\u025f"+
		"\u0260\u0003<\u001e\u0000\u0260M\u0001\u0000\u0000\u0000\u0261\u0262\u0005"+
		"F\u0000\u0000\u0262\u0263\u0005\\\u0000\u0000\u0263\u0264\u0005G\u0000"+
		"\u0000\u0264\u0265\u00054\u0000\u0000\u0265\u0268\u0005F\u0000\u0000\u0266"+
		"\u0269\u0003<\u001e\u0000\u0267\u0269\u0003D\"\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0005G\u0000\u0000\u026bO\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0005\u0018\u0000\u0000\u026d\u026e\u0005b\u0000\u0000"+
		"\u026e\u026f\u0005\u0019\u0000\u0000\u026f\u0271\u0005F\u0000\u0000\u0270"+
		"\u0272\u0003<\u001e\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0005G\u0000\u0000\u0274\u0275\u0003h4\u0000\u0275Q\u0001\u0000\u0000"+
		"\u0000\u0276\u0278\u00057\u0000\u0000\u0277\u0276\u0001\u0000\u0000\u0000"+
		"\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279\u027a\u0005\\\u0000\u0000\u027a\u027b\u0005]\u0000\u0000\u027b"+
		"\u027c\u0003T*\u0000\u027cS\u0001\u0000\u0000\u0000\u027d\u027e\u0007"+
		"\u0003\u0000\u0000\u027eU\u0001\u0000\u0000\u0000\u027f\u0290\u0005\u0017"+
		"\u0000\u0000\u0280\u0291\u0005\\\u0000\u0000\u0281\u0291\u0005V\u0000"+
		"\u0000\u0282\u0291\u0005\u008f\u0000\u0000\u0283\u0291\u0003\u0018\f\u0000"+
		"\u0284\u0285\u0005H\u0000\u0000\u0285\u028a\u0003 \u0010\u0000\u0286\u0287"+
		"\u0005^\u0000\u0000\u0287\u0289\u0003 \u0010\u0000\u0288\u0286\u0001\u0000"+
		"\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028d\u0001\u0000"+
		"\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028e\u0005I\u0000"+
		"\u0000\u028e\u028f\u0003h4\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290"+
		"\u0280\u0001\u0000\u0000\u0000\u0290\u0281\u0001\u0000\u0000\u0000\u0290"+
		"\u0282\u0001\u0000\u0000\u0000\u0290\u0283\u0001\u0000\u0000\u0000\u0290"+
		"\u0284\u0001\u0000\u0000\u0000\u0291W\u0001\u0000\u0000\u0000\u0292\u0296"+
		"\u0005J\u0000\u0000\u0293\u0295\u0003\u0018\f\u0000\u0294\u0293\u0001"+
		"\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u029a\u0001"+
		"\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0299\u029b\u0003"+
		"V+\u0000\u029a\u0299\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0003h4\u0000\u029d"+
		"\u029e\u0005K\u0000\u0000\u029eY\u0001\u0000\u0000\u0000\u029f\u02a1\u0005"+
		"\u0016\u0000\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u02a4\u0005"+
		"\u0015\u0000\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005"+
		"\\\u0000\u0000\u02a6\u02af\u0005F\u0000\u0000\u02a7\u02ac\u0003R)\u0000"+
		"\u02a8\u02a9\u0005^\u0000\u0000\u02a9\u02ab\u0003R)\u0000\u02aa\u02a8"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02b0"+
		"\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02a7"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b4\u0005G\u0000\u0000\u02b2\u02b3\u0005"+
		"]\u0000\u0000\u02b3\u02b5\u0007\u0004\u0000\u0000\u02b4\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0003X,\u0000\u02b7[\u0001\u0000\u0000\u0000"+
		"\u02b8\u02bc\u0005J\u0000\u0000\u02b9\u02bb\u0003\u0018\f\u0000\u02ba"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc"+
		"\u02ba\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd"+
		"\u02bf\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf"+
		"\u02c0\u0005K\u0000\u0000\u02c0]\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005"+
		"\u0010\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005"+
		"\u000f\u0000\u0000\u02c5\u02c7\u0005\\\u0000\u0000\u02c6\u02c8\u0005\u0012"+
		"\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000"+
		"\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0003\\."+
		"\u0000\u02ca_\u0001\u0000\u0000\u0000\u02cb\u02cd\u0005\u0010\u0000\u0000"+
		"\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cf\u0005;\u0000\u0000\u02cf"+
		"\u02d0\u0005\\\u0000\u0000\u02d0\u02d4\u0005J\u0000\u0000\u02d1\u02d3"+
		"\u0003(\u0014\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0005K\u0000\u0000\u02d8a\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0005\u0014\u0000\u0000\u02da\u02e3\u0005F\u0000\u0000"+
		"\u02db\u02e0\u0003R)\u0000\u02dc\u02dd\u0005^\u0000\u0000\u02dd\u02df"+
		"\u0003R)\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000"+
		"\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000"+
		"\u0000\u0000\u02e3\u02db\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e6\u0005G\u0000"+
		"\u0000\u02e6\u02e7\u0003X,\u0000\u02e7c\u0001\u0000\u0000\u0000\u02e8"+
		"\u02e9\u0005\u0011\u0000\u0000\u02e9\u02ea\u0005J\u0000\u0000\u02ea\u02ef"+
		"\u0005\\\u0000\u0000\u02eb\u02ec\u0005^\u0000\u0000\u02ec\u02ee\u0005"+
		"\\\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ee\u02f1\u0001\u0000"+
		"\u0000\u0000\u02ef\u02ed\u0001\u0000\u0000\u0000\u02ef\u02f0\u0001\u0000"+
		"\u0000\u0000\u02f0\u02f2\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f2\u02f3\u0005K\u0000\u0000\u02f3\u02f4\u0005\u0013\u0000"+
		"\u0000\u02f4\u02f5\u0005V\u0000\u0000\u02f5\u02f6\u0003h4\u0000\u02f6"+
		"e\u0001\u0000\u0000\u0000\u02f7\u02f8\u0007\u0005\u0000\u0000\u02f8g\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fb\u0005`\u0000\u0000\u02fa\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fe\u0005\u0000\u0000\u0001\u02fd\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fei\u0001\u0000\u0000"+
		"\u0000\u02ff\u0301\u0003l6\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0301"+
		"\u0304\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304"+
		"\u0302\u0001\u0000\u0000\u0000\u0305\u0307\u0005w\u0000\u0000\u0306\u0305"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u030b"+
		"\u0001\u0000\u0000\u0000\u0308\u030a\u0003l6\u0000\u0309\u0308\u0001\u0000"+
		"\u0000\u0000\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000"+
		"\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030e\u0310\u0005y\u0000"+
		"\u0000\u030f\u030e\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000"+
		"\u0000\u0310\u0314\u0001\u0000\u0000\u0000\u0311\u0313\u0003l6\u0000\u0312"+
		"\u0311\u0001\u0000\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314"+
		"\u0312\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315"+
		"\u031a\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317"+
		"\u0319\u0003n7\u0000\u0318\u0317\u0001\u0000\u0000\u0000\u0319\u031c\u0001"+
		"\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001"+
		"\u0000\u0000\u0000\u031bk\u0001\u0000\u0000\u0000\u031c\u031a\u0001\u0000"+
		"\u0000\u0000\u031d\u031e\u0007\u0006\u0000\u0000\u031em\u0001\u0000\u0000"+
		"\u0000\u031f\u0321\u0003~?\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321"+
		"\u0324\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322"+
		"\u0323\u0001\u0000\u0000\u0000\u0323\u0325\u0001\u0000\u0000\u0000\u0324"+
		"\u0322\u0001\u0000\u0000\u0000\u0325\u0329\u0003p8\u0000\u0326\u0328\u0003"+
		"~?\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000\u0000"+
		"\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000"+
		"\u0000\u032ao\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000"+
		"\u032c\u032d\u0005\u007f\u0000\u0000\u032d\u0331\u0005\u0088\u0000\u0000"+
		"\u032e\u0330\u0003z=\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u0330\u0333"+
		"\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0331\u0332"+
		"\u0001\u0000\u0000\u0000\u0332\u0335\u0001\u0000\u0000\u0000\u0333\u0331"+
		"\u0001\u0000\u0000\u0000\u0334\u0336\u0003t:\u0000\u0335\u0334\u0001\u0000"+
		"\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0338\u0001\u0000"+
		"\u0000\u0000\u0337\u0339\u0003v;\u0000\u0338\u0337\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033b\u0001\u0000\u0000\u0000"+
		"\u033a\u033c\u0003r9\u0000\u033b\u033a\u0001\u0000\u0000\u0000\u033b\u033c"+
		"\u0001\u0000\u0000\u0000\u033c\u035c\u0001\u0000\u0000\u0000\u033d\u033f"+
		"\u0003r9\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000"+
		"\u0000\u0000\u033f\u0343\u0001\u0000\u0000\u0000\u0340\u0342\u0003z=\u0000"+
		"\u0341\u0340\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000\u0000"+
		"\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000"+
		"\u0344\u0347\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000"+
		"\u0346\u0348\u0003t:\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348"+
		"\u0001\u0000\u0000\u0000\u0348\u034a\u0001\u0000\u0000\u0000\u0349\u034b"+
		"\u0003v;\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000"+
		"\u0000\u0000\u034b\u0356\u0001\u0000\u0000\u0000\u034c\u0353\u0005\u0084"+
		"\u0000\u0000\u034d\u034e\u0003x<\u0000\u034e\u034f\u0005\u007f\u0000\u0000"+
		"\u034f\u0350\u0005\u0086\u0000\u0000\u0350\u0351\u0005\u0088\u0000\u0000"+
		"\u0351\u0352\u0005\u0084\u0000\u0000\u0352\u0354\u0001\u0000\u0000\u0000"+
		"\u0353\u034d\u0001\u0000\u0000\u0000\u0353\u0354\u0001\u0000\u0000\u0000"+
		"\u0354\u0357\u0001\u0000\u0000\u0000\u0355\u0357\u0005\u0085\u0000\u0000"+
		"\u0356\u034c\u0001\u0000\u0000\u0000\u0356\u0355\u0001\u0000\u0000\u0000"+
		"\u0357\u035c\u0001\u0000\u0000\u0000\u0358\u035c\u0005{\u0000\u0000\u0359"+
		"\u035c\u0003\u0082A\u0000\u035a\u035c\u0003\u0084B\u0000\u035b\u032c\u0001"+
		"\u0000\u0000\u0000\u035b\u033e\u0001\u0000\u0000\u0000\u035b\u0358\u0001"+
		"\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b\u035a\u0001"+
		"\u0000\u0000\u0000\u035cq\u0001\u0000\u0000\u0000\u035d\u035e\u0005\u0081"+
		"\u0000\u0000\u035e\u035f\u0005\u0087\u0000\u0000\u035f\u0360\u0005\u0094"+
		"\u0000\u0000\u0360s\u0001\u0000\u0000\u0000\u0361\u0362\u0005\u0089\u0000"+
		"\u0000\u0362\u0363\u0005\u0087\u0000\u0000\u0363\u0364\u0005\u0094\u0000"+
		"\u0000\u0364u\u0001\u0000\u0000\u0000\u0365\u0366\u0005\u008a\u0000\u0000"+
		"\u0366\u0367\u0005\u0087\u0000\u0000\u0367\u0368\u0005\u0094\u0000\u0000"+
		"\u0368w\u0001\u0000\u0000\u0000\u0369\u036b\u0003|>\u0000\u036a\u0369"+
		"\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u0376"+
		"\u0001\u0000\u0000\u0000\u036c\u0370\u0003p8\u0000\u036d\u0370\u0005x"+
		"\u0000\u0000\u036e\u0370\u0003\u0080@\u0000\u036f\u036c\u0001\u0000\u0000"+
		"\u0000\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u036e\u0001\u0000\u0000"+
		"\u0000\u0370\u0372\u0001\u0000\u0000\u0000\u0371\u0373\u0003|>\u0000\u0372"+
		"\u0371\u0001\u0000\u0000\u0000\u0372\u0373\u0001\u0000\u0000\u0000\u0373"+
		"\u0375\u0001\u0000\u0000\u0000\u0374\u036f\u0001\u0000\u0000\u0000\u0375"+
		"\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0376"+
		"\u0377\u0001\u0000\u0000\u0000\u0377y\u0001\u0000\u0000\u0000\u0378\u0376"+
		"\u0001\u0000\u0000\u0000\u0379\u037c\u0005\u0088\u0000\u0000\u037a\u037b"+
		"\u0005\u0087\u0000\u0000\u037b\u037d\u0005\u0094\u0000\u0000\u037c\u037a"+
		"\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d{\u0001"+
		"\u0000\u0000\u0000\u037e\u0380\u0005\u0080\u0000\u0000\u037f\u037e\u0001"+
		"\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0382\u0001"+
		"\u0000\u0000\u0000\u0381\u0383\u0005z\u0000\u0000\u0382\u0381\u0001\u0000"+
		"\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383\u0386\u0001\u0000"+
		"\u0000\u0000\u0384\u0386\u0005@\u0000\u0000\u0385\u037f\u0001\u0000\u0000"+
		"\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0386}\u0001\u0000\u0000\u0000"+
		"\u0387\u038a\u0003\u0080@\u0000\u0388\u038a\u0005@\u0000\u0000\u0389\u0387"+
		"\u0001\u0000\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u038a\u007f"+
		"\u0001\u0000\u0000\u0000\u038b\u038c\u0007\u0007\u0000\u0000\u038c\u0081"+
		"\u0001\u0000\u0000\u0000\u038d\u038e\u0005}\u0000\u0000\u038e\u038f\u0007"+
		"\b\u0000\u0000\u038f\u0083\u0001\u0000\u0000\u0000\u0390\u0391\u0005~"+
		"\u0000\u0000\u0391\u0392\u0007\t\u0000\u0000\u0392\u0085\u0001\u0000\u0000"+
		"\u0000o\u0089\u0090\u0095\u009b\u00a5\u00a8\u00ac\u00af\u00b2\u00b8\u00be"+
		"\u00c4\u00cc\u00d6\u00d9\u00dd\u00e3\u00f0\u0105\u0109\u010c\u010f\u0119"+
		"\u011c\u0123\u0125\u012e\u013a\u013e\u0142\u015b\u015e\u0163\u0168\u0174"+
		"\u017a\u0187\u018c\u0195\u019d\u01a1\u01aa\u01c6\u01cd\u01d1\u01d4\u01e7"+
		"\u01fc\u0204\u0207\u020b\u0220\u0222\u022a\u0233\u0238\u0241\u0244\u0253"+
		"\u0256\u025c\u0268\u0271\u0277\u028a\u0290\u0296\u029a\u02a0\u02a3\u02ac"+
		"\u02af\u02b4\u02bc\u02c2\u02c7\u02cc\u02d4\u02e0\u02e3\u02ef\u02fa\u02fd"+
		"\u0302\u0306\u030b\u030f\u0314\u031a\u0322\u0329\u0331\u0335\u0338\u033b"+
		"\u033e\u0343\u0347\u034a\u0353\u0356\u035b\u036a\u036f\u0372\u0376\u037c"+
		"\u037f\u0382\u0385\u0389";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}