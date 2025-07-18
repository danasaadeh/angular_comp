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
		TEMPLATE=7, IMPORTS=8, TEMPLATE_URL=9, STYLE_URL=10, STYLE_URLS=11, SL_COMMENT=12, 
		ML_COMMENT=13, CLASS=14, EXPORT=15, IMPORT=16, EXTENDS=17, FROM=18, CONSTRUCTOR=19, 
		FUNCTION=20, OVERRIDE=21, RETURN=22, CONSOLE=23, LOG=24, THIS=25, CASE=26, 
		BREAK=27, DO=28, NEW=29, CATCH=30, FINALLY=31, VOID=32, CONTINUE=33, SWITCH=34, 
		WITH=35, THROW=36, IN=37, TRY=38, AS=39, ASYNC=40, AWAIT=41, SUPER=42, 
		ENUM=43, OF=44, ABSTRACT=45, IMPLEMENTS=46, IS=47, AT=48, UNDER_SCORE=49, 
		ARROW=50, Q_MARK=51, NULL=52, MODIFIER=53, PRIVATE=54, PUBLIC=55, INTERFACE=56, 
		PACKAGE=57, PROTECTED=58, STATIC=59, DATA_TYPE=60, SEA_WS=61, IF=62, ELSE_IF=63, 
		ELSE=64, FOR=65, WHILE=66, OPEN_B=67, CLOSE_B=68, SQUARE_OPEN=69, SQUARE_CLOSE=70, 
		CURLY_OPEN=71, CURLY_CLOSE=72, ARRAY_TYPE=73, ANY_TYPE=74, NUMBER_TYPE=75, 
		ROUTER=76, HELPERS=77, LET=78, CONST=79, VAR_TYPE=80, BOOLEAN_TYPE=81, 
		STRING_TYPE=82, UNIQUE_TYPE=83, VAL=84, UNDEFINED=85, BOOLEAN_VAL=86, 
		STRING_VAL=87, NUM_VAL=88, DOUBLE_VAL=89, ID=90, COLON=91, COMMA=92, DOUBLE_QUOTE=93, 
		SEMI_COLON=94, EQUAL=95, DOT=96, PLUS=97, MINUS=98, PLUS_PLUS=99, MINUS_MINUS=100, 
		DIV=101, MUL=102, OPERATION=103, EQUALS=104, NOT=105, NOT_EQUALS=106, 
		IDENTITY_EQUALS=107, IDENTITY_NOT_EQUALS=108, LESS_THAN=109, GREATER_THAN=110, 
		LESS_THAN_EQUALS=111, GREATER_THAN_EQUALS=112, LOGICAL_OPERATION=113, 
		BACKTICK_CLOSE=114, HTML_COMMENT=115, HTML_CONDITIONAL_COMMENT=116, XML=117, 
		CDATA=118, DTD=119, INTERPOLATION=120, SCRIPTLET=121, SEA_WS2=122, SCRIPT_OPEN=123, 
		STYLE_OPEN=124, TAG_OPEN=125, HTML_TEXT=126, DIRECTIVE=127, IF_DIRECTIVE=128, 
		FOR_DIRECTIVE=129, TAG_CLOSE=130, TAG_SLASH_CLOSE=131, TAG_SLASH=132, 
		TAG_EQUALS=133, TAG_NAME=134, BINDING=135, EVENT=136, PROPERTY=137, TAG_WHITESPACE=138, 
		SENTENCE=139, SCRIPT_BODY=140, SCRIPT_SHORT_BODY=141, STYLE_BODY=142, 
		STYLE_SHORT_BODY=143, ATTVALUE_VALUE=144, ATTRIBUTE=145, FOR_VAL=146, 
		IF_VAL=147;
	public static final int
		RULE_program = 0, RULE_instruction = 1, RULE_component = 2, RULE_componentBody = 3, 
		RULE_stanalone = 4, RULE_selector = 5, RULE_template_Url = 6, RULE_template = 7, 
		RULE_imports = 8, RULE_style_Urls = 9, RULE_inject = 10, RULE_provided_in = 11, 
		RULE_statements = 12, RULE_init = 13, RULE_init_array = 14, RULE_value = 15, 
		RULE_object = 16, RULE_objectProperty = 17, RULE_declaration = 18, RULE_assign = 19, 
		RULE_this_exp = 20, RULE_super_exp = 21, RULE_if_condition = 22, RULE_else_if_condition = 23, 
		RULE_else_condition = 24, RULE_condition = 25, RULE_body = 26, RULE_for = 27, 
		RULE_while = 28, RULE_expr = 29, RULE_print = 30, RULE_parameter = 31, 
		RULE_return = 32, RULE_function_body = 33, RULE_function_decl = 34, RULE_class_body = 35, 
		RULE_class_decl = 36, RULE_interface = 37, RULE_constructor = 38, RULE_import_statement = 39, 
		RULE_comment = 40, RULE_eos = 41, RULE_htmlDocument = 42, RULE_scriptletOrSeaWs = 43, 
		RULE_htmlElements = 44, RULE_htmlElement = 45, RULE_directive = 46, RULE_binding = 47, 
		RULE_htmlContent = 48, RULE_htmlAttribute = 49, RULE_htmlChardata = 50, 
		RULE_htmlMisc = 51, RULE_htmlComment = 52, RULE_script = 53, RULE_style = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instruction", "component", "componentBody", "stanalone", 
			"selector", "template_Url", "template", "imports", "style_Urls", "inject", 
			"provided_in", "statements", "init", "init_array", "value", "object", 
			"objectProperty", "declaration", "assign", "this_exp", "super_exp", "if_condition", 
			"else_if_condition", "else_condition", "condition", "body", "for", "while", 
			"expr", "print", "parameter", "return", "function_body", "function_decl", 
			"class_body", "class_decl", "interface", "constructor", "import_statement", 
			"comment", "eos", "htmlDocument", "scriptletOrSeaWs", "htmlElements", 
			"htmlElement", "directive", "binding", "htmlContent", "htmlAttribute", 
			"htmlChardata", "htmlMisc", "htmlComment", "script", "style"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@Component'", "'@Injectable'", "'providedIn'", "'standalone'", 
			"'selector'", "'template'", "'imports'", "'templateUrl'", "'styleUrl'", 
			"'styleUrls'", null, null, "'class'", "'export'", "'import'", "'extends'", 
			"'from'", "'constructor'", "'function'", "'@override'", "'return'", "'console'", 
			"'log'", "'this'", "'case'", "'break'", "'do'", "'new'", "'catch'", "'finally'", 
			"'void'", "'continue'", "'switch'", "'with'", "'throw'", "'in'", "'try'", 
			"'as'", "'async'", "'await'", "'super'", "'enum'", "'of'", "'abstract'", 
			"'implements'", "'is'", "'@'", "'_'", "'=>'", "'?'", "'null'", null, 
			"'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'", 
			null, null, "'if'", "'else if'", "'else'", "'for'", "'while'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'array'", "'any'", "'number'", "'Router'", 
			null, "'let'", "'const'", "'var'", "'boolean'", "'string'", "'unique'", 
			null, "'undefined'", null, null, null, null, null, "':'", "','", "'\"'", 
			"';'", null, "'.'", "'+'", "'-'", "'++'", "'--'", null, "'*'", null, 
			"'=='", "'!'", "'!='", "'==='", "'!=='", null, null, "'<='", "'>='", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'*ngIf'", "'*ngFor'", null, "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BACKTICK", "COMPONENT", "INJECTABLE", "PROVIDED_IN", "STANDALONE", 
			"SELECTOR", "TEMPLATE", "IMPORTS", "TEMPLATE_URL", "STYLE_URL", "STYLE_URLS", 
			"SL_COMMENT", "ML_COMMENT", "CLASS", "EXPORT", "IMPORT", "EXTENDS", "FROM", 
			"CONSTRUCTOR", "FUNCTION", "OVERRIDE", "RETURN", "CONSOLE", "LOG", "THIS", 
			"CASE", "BREAK", "DO", "NEW", "CATCH", "FINALLY", "VOID", "CONTINUE", 
			"SWITCH", "WITH", "THROW", "IN", "TRY", "AS", "ASYNC", "AWAIT", "SUPER", 
			"ENUM", "OF", "ABSTRACT", "IMPLEMENTS", "IS", "AT", "UNDER_SCORE", "ARROW", 
			"Q_MARK", "NULL", "MODIFIER", "PRIVATE", "PUBLIC", "INTERFACE", "PACKAGE", 
			"PROTECTED", "STATIC", "DATA_TYPE", "SEA_WS", "IF", "ELSE_IF", "ELSE", 
			"FOR", "WHILE", "OPEN_B", "CLOSE_B", "SQUARE_OPEN", "SQUARE_CLOSE", "CURLY_OPEN", 
			"CURLY_CLOSE", "ARRAY_TYPE", "ANY_TYPE", "NUMBER_TYPE", "ROUTER", "HELPERS", 
			"LET", "CONST", "VAR_TYPE", "BOOLEAN_TYPE", "STRING_TYPE", "UNIQUE_TYPE", 
			"VAL", "UNDEFINED", "BOOLEAN_VAL", "STRING_VAL", "NUM_VAL", "DOUBLE_VAL", 
			"ID", "COLON", "COMMA", "DOUBLE_QUOTE", "SEMI_COLON", "EQUAL", "DOT", 
			"PLUS", "MINUS", "PLUS_PLUS", "MINUS_MINUS", "DIV", "MUL", "OPERATION", 
			"EQUALS", "NOT", "NOT_EQUALS", "IDENTITY_EQUALS", "IDENTITY_NOT_EQUALS", 
			"LESS_THAN", "GREATER_THAN", "LESS_THAN_EQUALS", "GREATER_THAN_EQUALS", 
			"LOGICAL_OPERATION", "BACKTICK_CLOSE", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "CDATA", "DTD", "INTERPOLATION", "SCRIPTLET", "SEA_WS2", "SCRIPT_OPEN", 
			"STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "DIRECTIVE", "IF_DIRECTIVE", "FOR_DIRECTIVE", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", 
			"BINDING", "EVENT", "PROPERTY", "TAG_WHITESPACE", "SENTENCE", "SCRIPT_BODY", 
			"SCRIPT_SHORT_BODY", "STYLE_BODY", "STYLE_SHORT_BODY", "ATTVALUE_VALUE", 
			"ATTRIBUTE", "FOR_VAL", "IF_VAL"
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
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				instruction();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4692755209816502284L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 34082883L) != 0) || _la==SENTENCE );
			setState(115);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new IMPORT_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(117);
						import_statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(120); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						import_statement();
						}
						} 
					}
					setState(127);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			case COMPONENT:
				_localctx = new COMPONENT_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				component();
				}
				break;
			case INJECTABLE:
				_localctx = new INJECT_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
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
			case SUPER:
			case MODIFIER:
			case INTERFACE:
			case IF:
			case FOR:
			case WHILE:
			case CURLY_OPEN:
			case HELPERS:
			case VAL:
			case ID:
			case SENTENCE:
				_localctx = new STATEMENTS_INSTRUCTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
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
			setState(133);
			match(COMPONENT);
			setState(134);
			match(OPEN_B);
			setState(135);
			match(CURLY_OPEN);
			setState(136);
			componentBody();
			setState(137);
			match(CURLY_CLOSE);
			setState(138);
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(140);
				selector();
				}
			}

			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STANDALONE) {
				{
				setState(143);
				stanalone();
				}
			}

			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEMPLATE_URL:
				{
				setState(146);
				template_Url();
				}
				break;
			case TEMPLATE:
				{
				setState(147);
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
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(150);
				imports();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLE_URL || _la==STYLE_URLS) {
				{
				setState(153);
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
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(STANDALONE);
			setState(157);
			match(COLON);
			setState(158);
			match(DATA_TYPE);
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
			setState(160);
			match(SELECTOR);
			setState(161);
			match(COLON);
			setState(162);
			match(VAL);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(163);
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
			setState(166);
			match(TEMPLATE_URL);
			setState(167);
			match(COLON);
			setState(168);
			match(VAL);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(169);
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
			setState(172);
			match(TEMPLATE);
			setState(173);
			match(COLON);
			setState(174);
			match(BACKTICK);
			setState(175);
			htmlDocument();
			setState(176);
			match(BACKTICK_CLOSE);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(177);
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
			setState(180);
			match(IMPORTS);
			setState(181);
			match(COLON);
			setState(182);
			match(SQUARE_OPEN);
			setState(183);
			match(ID);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(184);
				match(COMMA);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(185);
					match(ID);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(193);
			match(SQUARE_CLOSE);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
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
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==STYLE_URL || _la==STYLE_URLS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(198);
			match(COLON);
			setState(199);
			match(VAL);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(200);
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
			setState(203);
			match(INJECTABLE);
			setState(204);
			match(OPEN_B);
			setState(205);
			match(CURLY_OPEN);
			setState(206);
			provided_in();
			setState(207);
			match(CURLY_CLOSE);
			setState(208);
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
			setState(210);
			match(PROVIDED_IN);
			setState(211);
			match(COLON);
			setState(212);
			match(VAL);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(213);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new CLASS_DECLAR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				class_decl();
				}
				break;
			case 2:
				_localctx = new INTERFACE_STATEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				interface_();
				}
				break;
			case 3:
				_localctx = new FUNC_DECL_STATEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				function_decl();
				}
				break;
			case 4:
				_localctx = new CONSTR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				constructor();
				}
				break;
			case 5:
				_localctx = new INIT_STATEContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				init();
				}
				break;
			case 6:
				_localctx = new INIT_ARRAY_STATEContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				init_array();
				}
				break;
			case 7:
				_localctx = new DECLARE_STATEContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				declaration();
				}
				break;
			case 8:
				_localctx = new ASSIGN_STATEContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				assign();
				}
				break;
			case 9:
				_localctx = new IF_CONDITION_STATEContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				if_condition();
				}
				break;
			case 10:
				_localctx = new FOR_LOOP_STATEContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				for_();
				}
				break;
			case 11:
				_localctx = new WHILE_LOOP_STATEContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				while_();
				}
				break;
			case 12:
				_localctx = new EXPR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(227);
				expr(0);
				}
				break;
			case 13:
				_localctx = new THIS_EXPR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
				this_exp();
				}
				break;
			case 14:
				_localctx = new SUPER_EXPR_STATEContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
				super_exp();
				}
				break;
			case 15:
				_localctx = new PRINT_STATEContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(230);
				print();
				}
				break;
			case 16:
				_localctx = new VALUE_STATEContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(231);
				value();
				}
				break;
			case 17:
				_localctx = new RETRUN_STATEContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(232);
				return_();
				}
				break;
			case 18:
				_localctx = new COMMENT_STATEContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(233);
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
	public static class InitContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(236);
				match(HELPERS);
				}
			}

			setState(239);
			match(ID);
			setState(240);
			match(COLON);
			setState(241);
			match(DATA_TYPE);
			setState(242);
			match(EQUAL);
			setState(243);
			match(VAL);
			setState(244);
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
		public TerminalNode HELPERS() { return getToken(ParserFile.HELPERS, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
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
		enterRule(_localctx, 28, RULE_init_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(246);
				match(HELPERS);
				}
			}

			setState(249);
			match(ID);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(250);
				match(COLON);
				setState(251);
				match(DATA_TYPE);
				setState(252);
				match(SQUARE_OPEN);
				setState(253);
				match(SQUARE_CLOSE);
				}
			}

			setState(256);
			match(EQUAL);
			setState(257);
			match(SQUARE_OPEN);
			setState(258);
			value();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				value();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(SQUARE_CLOSE);
			setState(267);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(VAL);
				}
				break;
			case CURLY_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(CURLY_OPEN);
			setState(274);
			objectProperty();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(275);
				match(COMMA);
				setState(276);
				objectProperty();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
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
	public static class ObjectPropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ParserFile.ID, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ID);
			setState(285);
			match(COLON);
			setState(286);
			match(VAL);
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
		enterRule(_localctx, 36, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(288);
				match(MODIFIER);
				}
			}

			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(291);
				match(HELPERS);
				}
			}

			setState(294);
			match(ID);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(295);
				match(COLON);
				setState(296);
				match(DATA_TYPE);
				}
			}

			setState(299);
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
		enterRule(_localctx, 38, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELPERS) {
				{
				setState(301);
				match(HELPERS);
				}
			}

			setState(304);
			match(ID);
			setState(305);
			match(EQUAL);
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(307);
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
	public static class This_expContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(ParserFile.THIS, 0); }
		public TerminalNode DOT() { return getToken(ParserFile.DOT, 0); }
		public TerminalNode EQUAL() { return getToken(ParserFile.EQUAL, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode VAL() { return getToken(ParserFile.VAL, 0); }
		public List<TerminalNode> ID() { return getTokens(ParserFile.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserFile.ID, i);
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
		enterRule(_localctx, 40, RULE_this_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(THIS);
			setState(310);
			match(DOT);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				match(ID);
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(316);
			match(EQUAL);
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==VAL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(318);
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
		enterRule(_localctx, 42, RULE_super_exp);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(SUPER);
				setState(321);
				match(DOT);
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(322);
					match(ID);
					}
					}
					setState(325); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(327);
					match(DOT);
					setState(328);
					match(ID);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				match(EQUAL);
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==VAL || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				eos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(SUPER);
				setState(338);
				match(OPEN_B);
				setState(339);
				match(ID);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(340);
					match(COMMA);
					setState(341);
					match(ID);
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347);
				match(CLOSE_B);
				setState(348);
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
		enterRule(_localctx, 44, RULE_if_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(IF);
			setState(352);
			match(OPEN_B);
			setState(353);
			condition();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATION) {
				{
				{
				setState(354);
				match(LOGICAL_OPERATION);
				setState(355);
				condition();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(CLOSE_B);
			setState(362);
			body();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					else_if_condition();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(369);
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
		enterRule(_localctx, 46, RULE_else_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ELSE_IF);
			setState(373);
			match(OPEN_B);
			setState(374);
			condition();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATION) {
				{
				{
				setState(375);
				match(LOGICAL_OPERATION);
				setState(376);
				condition();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(CLOSE_B);
			setState(383);
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
		enterRule(_localctx, 48, RULE_else_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(ELSE);
			setState(386);
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
		enterRule(_localctx, 50, RULE_condition);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new ID_CONDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(ID);
				}
				break;
			case 2:
				_localctx = new VAL_CONDContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(VAL);
				}
				break;
			case 3:
				_localctx = new VAL_OPERA_VALContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(VAL);
				setState(391);
				match(OPERATION);
				setState(392);
				match(VAL);
				}
				break;
			case 4:
				_localctx = new VAL_OPERA_IDContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				match(VAL);
				setState(394);
				match(OPERATION);
				setState(395);
				match(ID);
				}
				break;
			case 5:
				_localctx = new ID_OPERA_VALContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(396);
				match(ID);
				setState(397);
				match(OPERATION);
				setState(398);
				match(VAL);
				}
				break;
			case 6:
				_localctx = new ID_OPERA_IDContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(399);
				match(ID);
				setState(400);
				match(OPERATION);
				setState(401);
				match(ID);
				}
				break;
			case 7:
				_localctx = new ID_OPERA_DOT_IDContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(402);
				match(ID);
				setState(403);
				match(OPERATION);
				setState(404);
				match(ID);
				setState(405);
				match(DOT);
				setState(406);
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
		enterRule(_localctx, 52, RULE_body);
		int _la;
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(CURLY_OPEN);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 604628042257543055L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 4611686018427396225L) != 0)) {
					{
					{
					setState(411);
					statements();
					}
					}
					setState(416);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(417);
					eos();
					}
					break;
				}
				setState(420);
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
		enterRule(_localctx, 54, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(FOR);
			setState(424);
			match(OPEN_B);
			setState(425);
			init();
			setState(426);
			match(SEMI_COLON);
			setState(427);
			condition();
			setState(428);
			match(SEMI_COLON);
			setState(429);
			expr(0);
			setState(430);
			match(CLOSE_B);
			setState(431);
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
		enterRule(_localctx, 56, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(WHILE);
			setState(434);
			match(OPEN_B);
			setState(435);
			condition();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICAL_OPERATION) {
				{
				{
				setState(436);
				match(LOGICAL_OPERATION);
				setState(437);
				condition();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(CLOSE_B);
			setState(444);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAL:
				{
				_localctx = new VAL_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(447);
				match(VAL);
				}
				break;
			case ID:
				{
				_localctx = new ID_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(448);
				match(ID);
				}
				break;
			case SENTENCE:
				{
				_localctx = new SENT_EXPRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(449);
				match(SENTENCE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MULTIContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(452);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(453);
						match(MUL);
						setState(454);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new DIVContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(455);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(456);
						match(DIV);
						setState(457);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new PLUSContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(458);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(459);
						match(PLUS);
						setState(460);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new MINUSContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(461);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(462);
						match(MINUS);
						setState(463);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new PLUS2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(464);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(465);
						match(PLUS_PLUS);
						}
						break;
					case 6:
						{
						_localctx = new MINUS2Context(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(466);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(467);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 60, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(CONSOLE);
			setState(474);
			match(DOT);
			setState(475);
			match(LOG);
			setState(476);
			match(OPEN_B);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 36028797018964033L) != 0)) {
				{
				setState(477);
				expr(0);
				}
			}

			setState(480);
			match(CLOSE_B);
			setState(481);
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
		public TerminalNode MODIFIER() { return getToken(ParserFile.MODIFIER, 0); }
		public TerminalNode COLON() { return getToken(ParserFile.COLON, 0); }
		public TerminalNode DATA_TYPE() { return getToken(ParserFile.DATA_TYPE, 0); }
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
		enterRule(_localctx, 62, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(483);
				match(MODIFIER);
				}
			}

			setState(486);
			match(ID);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(487);
				match(COLON);
				setState(488);
				match(DATA_TYPE);
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
		enterRule(_localctx, 64, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(RETURN);
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(492);
				match(ID);
				}
				break;
			case 2:
				{
				setState(493);
				match(VAL);
				}
				break;
			case 3:
				{
				setState(494);
				match(SENTENCE);
				}
				break;
			case 4:
				{
				setState(495);
				statements();
				}
				break;
			case 5:
				{
				setState(496);
				match(SQUARE_OPEN);
				setState(497);
				object();
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(498);
					match(COMMA);
					setState(499);
					object();
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(505);
				match(SQUARE_CLOSE);
				setState(506);
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
		enterRule(_localctx, 66, RULE_function_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CURLY_OPEN);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					statements();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(517);
				return_();
				}
			}

			setState(520);
			eos();
			setState(521);
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
		enterRule(_localctx, 68, RULE_function_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(523);
				match(OVERRIDE);
				}
			}

			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(526);
				match(FUNCTION);
				}
			}

			setState(529);
			match(ID);
			setState(530);
			match(OPEN_B);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER || _la==ID) {
				{
				setState(531);
				parameter();
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(532);
					match(COMMA);
					setState(533);
					parameter();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(541);
			match(CLOSE_B);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(542);
				match(COLON);
				setState(543);
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

			setState(546);
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
		enterRule(_localctx, 70, RULE_class_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(CURLY_OPEN);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & 604628042257543055L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 4611686018427396225L) != 0)) {
				{
				{
				setState(549);
				statements();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		enterRule(_localctx, 72, RULE_class_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(557);
				match(EXPORT);
				}
			}

			setState(560);
			match(CLASS);
			setState(561);
			match(ID);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(562);
				match(EXTENDS);
				}
			}

			setState(565);
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
		enterRule(_localctx, 74, RULE_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(567);
				match(EXPORT);
				}
			}

			setState(570);
			match(INTERFACE);
			setState(571);
			match(ID);
			setState(572);
			match(CURLY_OPEN);
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 137455730689L) != 0)) {
				{
				{
				setState(573);
				declaration();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(579);
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
		enterRule(_localctx, 76, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(CONSTRUCTOR);
			setState(582);
			match(OPEN_B);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER || _la==ID) {
				{
				setState(583);
				parameter();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(584);
					match(COMMA);
					setState(585);
					parameter();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(593);
			match(CLOSE_B);
			setState(594);
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
		enterRule(_localctx, 78, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(IMPORT);
			setState(597);
			match(CURLY_OPEN);
			setState(598);
			match(ID);
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(599);
				match(COMMA);
				setState(600);
				match(ID);
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(606);
			match(CURLY_CLOSE);
			setState(607);
			match(FROM);
			setState(608);
			match(VAL);
			setState(609);
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
		enterRule(_localctx, 80, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
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
		enterRule(_localctx, 82, RULE_eos);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(613);
					match(SEMI_COLON);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
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
		enterRule(_localctx, 84, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(619);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(625);
				match(XML);
				}
			}

			setState(631);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(628);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(633);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(634);
				match(DTD);
				}
			}

			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(637);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEA_WS || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 1677123L) != 0)) {
				{
				{
				setState(643);
				htmlElements();
				}
				}
				setState(648);
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
		enterRule(_localctx, 86, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
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
		enterRule(_localctx, 88, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 54043195528445953L) != 0)) {
				{
				{
				setState(651);
				htmlMisc();
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
			htmlElement();
			setState(661);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					htmlMisc();
					}
					} 
				}
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 90, RULE_htmlElement);
		int _la;
		try {
			int _alt;
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(TAG_OPEN);
				setState(665);
				match(TAG_NAME);
				setState(669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(666);
						htmlAttribute();
						}
						} 
					}
					setState(671);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				}
				setState(673);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(672);
					binding();
					}
					break;
				}
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(675);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DIRECTIVE) {
					{
					setState(678);
					directive();
					}
				}

				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(681);
					htmlAttribute();
					}
					}
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINDING) {
					{
					setState(687);
					binding();
					}
				}

				setState(700);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(690);
					match(TAG_CLOSE);
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						setState(691);
						htmlContent();
						setState(692);
						match(TAG_OPEN);
						setState(693);
						match(TAG_SLASH);
						setState(694);
						match(TAG_NAME);
						setState(695);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(699);
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
				setState(702);
				match(SCRIPTLET);
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(703);
				script();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(704);
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
		enterRule(_localctx, 92, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(707);
			match(DIRECTIVE);
			setState(708);
			match(TAG_EQUALS);
			setState(709);
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
		enterRule(_localctx, 94, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(BINDING);
			setState(712);
			match(TAG_EQUALS);
			setState(713);
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
		enterRule(_localctx, 96, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(715);
				htmlChardata();
				}
				break;
			}
			setState(728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(721);
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
						{
						setState(718);
						htmlElement();
						}
						break;
					case CDATA:
						{
						setState(719);
						match(CDATA);
						}
						break;
					case HTML_COMMENT:
					case HTML_CONDITIONAL_COMMENT:
						{
						setState(720);
						htmlComment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(724);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(723);
						htmlChardata();
						}
						break;
					}
					}
					} 
				}
				setState(730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 98, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(TAG_NAME);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(732);
				match(TAG_EQUALS);
				setState(733);
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
		enterRule(_localctx, 100, RULE_htmlChardata);
		int _la;
		try {
			setState(743);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HTML_TEXT) {
					{
					setState(736);
					match(HTML_TEXT);
					}
				}

				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERPOLATION) {
					{
					setState(739);
					match(INTERPOLATION);
					}
				}

				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(742);
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
		enterRule(_localctx, 102, RULE_htmlMisc);
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				htmlComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(746);
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
		enterRule(_localctx, 104, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
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
		enterRule(_localctx, 106, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(SCRIPT_OPEN);
			setState(752);
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
		enterRule(_localctx, 108, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(STYLE_OPEN);
			setState(755);
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
		case 29:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0093\u02f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"6\u0001\u0000\u0004\u0000p\b\u0000\u000b\u0000\f\u0000q\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0004\u0001w\b\u0001\u000b\u0001\f\u0001x\u0001\u0001"+
		"\u0005\u0001|\b\u0001\n\u0001\f\u0001\u007f\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0084\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0003"+
		"\u0003\u008e\b\u0003\u0001\u0003\u0003\u0003\u0091\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u0095\b\u0003\u0001\u0003\u0003\u0003\u0098\b"+
		"\u0003\u0001\u0003\u0003\u0003\u009b\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00a5\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00ab\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00b3\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00bb\b\b\n\b\f\b\u00be\t\b\u0003\b\u00c0\b"+
		"\b\u0001\b\u0001\b\u0003\b\u00c4\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00ca\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d7\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00eb\b\f\u0001\r\u0003\r\u00ee\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00f8\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ff\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0106\b\u000e\n\u000e\f\u000e\u0109\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u0110\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0116\b\u0010\n\u0010\f\u0010"+
		"\u0119\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0003\u0012\u0122\b\u0012\u0001\u0012\u0003\u0012"+
		"\u0125\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u012a\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0003\u0013\u012f\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0004\u0014\u0139\b\u0014\u000b\u0014\f\u0014\u013a"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0004\u0015\u0144\b\u0015\u000b\u0015\f\u0015\u0145\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u014a\b\u0015\n\u0015\f\u0015\u014d\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0157\b\u0015\n\u0015\f\u0015\u015a"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u015e\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0165\b\u0016"+
		"\n\u0016\f\u0016\u0168\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u016d\b\u0016\n\u0016\f\u0016\u0170\t\u0016\u0001\u0016\u0003\u0016"+
		"\u0173\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u017a\b\u0017\n\u0017\f\u0017\u017d\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0198\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u019d"+
		"\b\u001a\n\u001a\f\u001a\u01a0\t\u001a\u0001\u001a\u0003\u001a\u01a3\b"+
		"\u001a\u0001\u001a\u0003\u001a\u01a6\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u01b7\b\u001c\n\u001c\f\u001c\u01ba\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01c3\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01d5\b\u001d\n\u001d\f\u001d\u01d8\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01df\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u01e5\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ea\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01f5\b \n "+
		"\f \u01f8\t \u0001 \u0001 \u0001 \u0003 \u01fd\b \u0001!\u0001!\u0005"+
		"!\u0201\b!\n!\f!\u0204\t!\u0001!\u0003!\u0207\b!\u0001!\u0001!\u0001!"+
		"\u0001\"\u0003\"\u020d\b\"\u0001\"\u0003\"\u0210\b\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0217\b\"\n\"\f\"\u021a\t\"\u0003\"\u021c\b"+
		"\"\u0001\"\u0001\"\u0001\"\u0003\"\u0221\b\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0005#\u0227\b#\n#\f#\u022a\t#\u0001#\u0001#\u0001$\u0003$\u022f\b$"+
		"\u0001$\u0001$\u0001$\u0003$\u0234\b$\u0001$\u0001$\u0001%\u0003%\u0239"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0005%\u023f\b%\n%\f%\u0242\t%\u0001%"+
		"\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u024b\b&\n&\f&\u024e"+
		"\t&\u0003&\u0250\b&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u025a\b\'\n\'\f\'\u025d\t\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0003)\u0267\b)\u0001)\u0003)\u026a"+
		"\b)\u0001*\u0005*\u026d\b*\n*\f*\u0270\t*\u0001*\u0003*\u0273\b*\u0001"+
		"*\u0005*\u0276\b*\n*\f*\u0279\t*\u0001*\u0003*\u027c\b*\u0001*\u0005*"+
		"\u027f\b*\n*\f*\u0282\t*\u0001*\u0005*\u0285\b*\n*\f*\u0288\t*\u0001+"+
		"\u0001+\u0001,\u0005,\u028d\b,\n,\f,\u0290\t,\u0001,\u0001,\u0005,\u0294"+
		"\b,\n,\f,\u0297\t,\u0001-\u0001-\u0001-\u0005-\u029c\b-\n-\f-\u029f\t"+
		"-\u0001-\u0003-\u02a2\b-\u0001-\u0003-\u02a5\b-\u0001-\u0003-\u02a8\b"+
		"-\u0001-\u0005-\u02ab\b-\n-\f-\u02ae\t-\u0001-\u0003-\u02b1\b-\u0001-"+
		"\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02ba\b-\u0001-\u0003"+
		"-\u02bd\b-\u0001-\u0001-\u0001-\u0003-\u02c2\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u00010\u00030\u02cd\b0\u00010\u00010\u0001"+
		"0\u00030\u02d2\b0\u00010\u00030\u02d5\b0\u00050\u02d7\b0\n0\f0\u02da\t"+
		"0\u00011\u00011\u00011\u00031\u02df\b1\u00012\u00032\u02e2\b2\u00012\u0003"+
		"2\u02e5\b2\u00012\u00032\u02e8\b2\u00013\u00013\u00033\u02ec\b3\u0001"+
		"4\u00014\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u0000\u0001"+
		":7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\b\u0001\u0000"+
		"\n\u000b\u0002\u0000TTZZ\u0002\u0000  <<\u0001\u0000\f\r\u0002\u0000="+
		"=yy\u0001\u0000st\u0001\u0000\u008c\u008d\u0001\u0000\u008e\u008f\u033f"+
		"\u0000o\u0001\u0000\u0000\u0000\u0002\u0083\u0001\u0000\u0000\u0000\u0004"+
		"\u0085\u0001\u0000\u0000\u0000\u0006\u008d\u0001\u0000\u0000\u0000\b\u009c"+
		"\u0001\u0000\u0000\u0000\n\u00a0\u0001\u0000\u0000\u0000\f\u00a6\u0001"+
		"\u0000\u0000\u0000\u000e\u00ac\u0001\u0000\u0000\u0000\u0010\u00b4\u0001"+
		"\u0000\u0000\u0000\u0012\u00c5\u0001\u0000\u0000\u0000\u0014\u00cb\u0001"+
		"\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000\u0018\u00ea\u0001"+
		"\u0000\u0000\u0000\u001a\u00ed\u0001\u0000\u0000\u0000\u001c\u00f7\u0001"+
		"\u0000\u0000\u0000\u001e\u010f\u0001\u0000\u0000\u0000 \u0111\u0001\u0000"+
		"\u0000\u0000\"\u011c\u0001\u0000\u0000\u0000$\u0121\u0001\u0000\u0000"+
		"\u0000&\u012e\u0001\u0000\u0000\u0000(\u0135\u0001\u0000\u0000\u0000*"+
		"\u015d\u0001\u0000\u0000\u0000,\u015f\u0001\u0000\u0000\u0000.\u0174\u0001"+
		"\u0000\u0000\u00000\u0181\u0001\u0000\u0000\u00002\u0197\u0001\u0000\u0000"+
		"\u00004\u01a5\u0001\u0000\u0000\u00006\u01a7\u0001\u0000\u0000\u00008"+
		"\u01b1\u0001\u0000\u0000\u0000:\u01c2\u0001\u0000\u0000\u0000<\u01d9\u0001"+
		"\u0000\u0000\u0000>\u01e4\u0001\u0000\u0000\u0000@\u01eb\u0001\u0000\u0000"+
		"\u0000B\u01fe\u0001\u0000\u0000\u0000D\u020c\u0001\u0000\u0000\u0000F"+
		"\u0224\u0001\u0000\u0000\u0000H\u022e\u0001\u0000\u0000\u0000J\u0238\u0001"+
		"\u0000\u0000\u0000L\u0245\u0001\u0000\u0000\u0000N\u0254\u0001\u0000\u0000"+
		"\u0000P\u0263\u0001\u0000\u0000\u0000R\u0269\u0001\u0000\u0000\u0000T"+
		"\u026e\u0001\u0000\u0000\u0000V\u0289\u0001\u0000\u0000\u0000X\u028e\u0001"+
		"\u0000\u0000\u0000Z\u02c1\u0001\u0000\u0000\u0000\\\u02c3\u0001\u0000"+
		"\u0000\u0000^\u02c7\u0001\u0000\u0000\u0000`\u02cc\u0001\u0000\u0000\u0000"+
		"b\u02db\u0001\u0000\u0000\u0000d\u02e7\u0001\u0000\u0000\u0000f\u02eb"+
		"\u0001\u0000\u0000\u0000h\u02ed\u0001\u0000\u0000\u0000j\u02ef\u0001\u0000"+
		"\u0000\u0000l\u02f2\u0001\u0000\u0000\u0000np\u0003\u0002\u0001\u0000"+
		"on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0003R)\u0000"+
		"t\u0001\u0001\u0000\u0000\u0000uw\u0003N\'\u0000vu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000y}\u0001\u0000\u0000\u0000z|\u0003N\'\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0084\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0084\u0003\u0004\u0002\u0000\u0081\u0084\u0003\u0014\n\u0000"+
		"\u0082\u0084\u0003\u0018\f\u0000\u0083v\u0001\u0000\u0000\u0000\u0083"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0003\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005\u0002\u0000\u0000\u0086\u0087\u0005C\u0000\u0000\u0087\u0088"+
		"\u0005G\u0000\u0000\u0088\u0089\u0003\u0006\u0003\u0000\u0089\u008a\u0005"+
		"H\u0000\u0000\u008a\u008b\u0005D\u0000\u0000\u008b\u0005\u0001\u0000\u0000"+
		"\u0000\u008c\u008e\u0003\n\u0005\u0000\u008d\u008c\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0003\b\u0004\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0095\u0003\f\u0006\u0000\u0093\u0095\u0003\u000e\u0007\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000\u0000\u0000\u0096\u0098"+
		"\u0003\u0010\b\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u009b\u0003"+
		"\u0012\t\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u0007\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0005"+
		"\u0000\u0000\u009d\u009e\u0005[\u0000\u0000\u009e\u009f\u0005<\u0000\u0000"+
		"\u009f\t\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0006\u0000\u0000\u00a1"+
		"\u00a2\u0005[\u0000\u0000\u00a2\u00a4\u0005T\u0000\u0000\u00a3\u00a5\u0005"+
		"\\\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u000b\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\t\u0000"+
		"\u0000\u00a7\u00a8\u0005[\u0000\u0000\u00a8\u00aa\u0005T\u0000\u0000\u00a9"+
		"\u00ab\u0005\\\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\r\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0007\u0000\u0000\u00ad\u00ae\u0005[\u0000\u0000\u00ae\u00af\u0005\u0001"+
		"\u0000\u0000\u00af\u00b0\u0003T*\u0000\u00b0\u00b2\u0005r\u0000\u0000"+
		"\u00b1\u00b3\u0005\\\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u000f\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\b\u0000\u0000\u00b5\u00b6\u0005[\u0000\u0000\u00b6\u00b7"+
		"\u0005E\u0000\u0000\u00b7\u00bf\u0005Z\u0000\u0000\u00b8\u00bc\u0005\\"+
		"\u0000\u0000\u00b9\u00bb\u0005Z\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0005F\u0000\u0000\u00c2\u00c4\u0005\\\u0000\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u0011\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0005[\u0000\u0000\u00c7\u00c9\u0005T\u0000\u0000\u00c8\u00ca"+
		"\u0005\\\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0003\u0000\u0000\u00cc\u00cd\u0005C\u0000\u0000\u00cd\u00ce\u0005G\u0000"+
		"\u0000\u00ce\u00cf\u0003\u0016\u000b\u0000\u00cf\u00d0\u0005H\u0000\u0000"+
		"\u00d0\u00d1\u0005D\u0000\u0000\u00d1\u0015\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0004\u0000\u0000\u00d3\u00d4\u0005[\u0000\u0000\u00d4\u00d6"+
		"\u0005T\u0000\u0000\u00d5\u00d7\u0005\\\u0000\u0000\u00d6\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u0017\u0001"+
		"\u0000\u0000\u0000\u00d8\u00eb\u0003H$\u0000\u00d9\u00eb\u0003J%\u0000"+
		"\u00da\u00eb\u0003D\"\u0000\u00db\u00eb\u0003L&\u0000\u00dc\u00eb\u0003"+
		"\u001a\r\u0000\u00dd\u00eb\u0003\u001c\u000e\u0000\u00de\u00eb\u0003$"+
		"\u0012\u0000\u00df\u00eb\u0003&\u0013\u0000\u00e0\u00eb\u0003,\u0016\u0000"+
		"\u00e1\u00eb\u00036\u001b\u0000\u00e2\u00eb\u00038\u001c\u0000\u00e3\u00eb"+
		"\u0003:\u001d\u0000\u00e4\u00eb\u0003(\u0014\u0000\u00e5\u00eb\u0003*"+
		"\u0015\u0000\u00e6\u00eb\u0003<\u001e\u0000\u00e7\u00eb\u0003\u001e\u000f"+
		"\u0000\u00e8\u00eb\u0003@ \u0000\u00e9\u00eb\u0003P(\u0000\u00ea\u00d8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00d9\u0001\u0000\u0000\u0000\u00ea\u00da"+
		"\u0001\u0000\u0000\u0000\u00ea\u00db\u0001\u0000\u0000\u0000\u00ea\u00dc"+
		"\u0001\u0000\u0000\u0000\u00ea\u00dd\u0001\u0000\u0000\u0000\u00ea\u00de"+
		"\u0001\u0000\u0000\u0000\u00ea\u00df\u0001\u0000\u0000\u0000\u00ea\u00e0"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea\u00e2"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e3\u0001\u0000\u0000\u0000\u00ea\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000\u0000\u00ea\u00e6"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u0019"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ee\u0005M\u0000\u0000\u00ed\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005Z\u0000\u0000\u00f0\u00f1\u0005[\u0000"+
		"\u0000\u00f1\u00f2\u0005<\u0000\u0000\u00f2\u00f3\u0005_\u0000\u0000\u00f3"+
		"\u00f4\u0005T\u0000\u0000\u00f4\u00f5\u0003R)\u0000\u00f5\u001b\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f8\u0005M\u0000\u0000\u00f7\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fe\u0005Z\u0000\u0000\u00fa\u00fb\u0005[\u0000\u0000"+
		"\u00fb\u00fc\u0005<\u0000\u0000\u00fc\u00fd\u0005E\u0000\u0000\u00fd\u00ff"+
		"\u0005F\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"_\u0000\u0000\u0101\u0102\u0005E\u0000\u0000\u0102\u0107\u0003\u001e\u000f"+
		"\u0000\u0103\u0104\u0005\\\u0000\u0000\u0104\u0106\u0003\u001e\u000f\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000"+
		"\u010a\u010b\u0005F\u0000\u0000\u010b\u010c\u0003R)\u0000\u010c\u001d"+
		"\u0001\u0000\u0000\u0000\u010d\u0110\u0005T\u0000\u0000\u010e\u0110\u0003"+
		" \u0010\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u001f\u0001\u0000\u0000\u0000\u0111\u0112\u0005G\u0000"+
		"\u0000\u0112\u0117\u0003\"\u0011\u0000\u0113\u0114\u0005\\\u0000\u0000"+
		"\u0114\u0116\u0003\"\u0011\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0116"+
		"\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0005H\u0000\u0000\u011b!\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005Z\u0000\u0000\u011d\u011e\u0005[\u0000"+
		"\u0000\u011e\u011f\u0005T\u0000\u0000\u011f#\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u00055\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0005M\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0129\u0005"+
		"Z\u0000\u0000\u0127\u0128\u0005[\u0000\u0000\u0128\u012a\u0005<\u0000"+
		"\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c\u0003R)\u0000\u012c"+
		"%\u0001\u0000\u0000\u0000\u012d\u012f\u0005M\u0000\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005Z\u0000\u0000\u0131\u0132\u0005_\u0000"+
		"\u0000\u0132\u0133\u0007\u0001\u0000\u0000\u0133\u0134\u0003R)\u0000\u0134"+
		"\'\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0019\u0000\u0000\u0136\u0138"+
		"\u0005`\u0000\u0000\u0137\u0139\u0005Z\u0000\u0000\u0138\u0137\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u0005_\u0000\u0000\u013d\u013e\u0007\u0001\u0000"+
		"\u0000\u013e\u013f\u0003R)\u0000\u013f)\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0005*\u0000\u0000\u0141\u0143\u0005`\u0000\u0000\u0142\u0144\u0005"+
		"Z\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u014b\u0001\u0000\u0000\u0000\u0147\u0148\u0005`\u0000"+
		"\u0000\u0148\u014a\u0005Z\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0005_\u0000\u0000\u014f"+
		"\u0150\u0007\u0001\u0000\u0000\u0150\u015e\u0003R)\u0000\u0151\u0152\u0005"+
		"*\u0000\u0000\u0152\u0153\u0005C\u0000\u0000\u0153\u0158\u0005Z\u0000"+
		"\u0000\u0154\u0155\u0005\\\u0000\u0000\u0155\u0157\u0005Z\u0000\u0000"+
		"\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000"+
		"\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005D\u0000\u0000\u015c\u015e\u0003R)\u0000\u015d\u0140"+
		"\u0001\u0000\u0000\u0000\u015d\u0151\u0001\u0000\u0000\u0000\u015e+\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005>\u0000\u0000\u0160\u0161\u0005C\u0000"+
		"\u0000\u0161\u0166\u00032\u0019\u0000\u0162\u0163\u0005q\u0000\u0000\u0163"+
		"\u0165\u00032\u0019\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0168"+
		"\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0167"+
		"\u0001\u0000\u0000\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0166"+
		"\u0001\u0000\u0000\u0000\u0169\u016a\u0005D\u0000\u0000\u016a\u016e\u0003"+
		"4\u001a\u0000\u016b\u016d\u0003.\u0017\u0000\u016c\u016b\u0001\u0000\u0000"+
		"\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0172\u0001\u0000\u0000"+
		"\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173\u00030\u0018\u0000"+
		"\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173-\u0001\u0000\u0000\u0000\u0174\u0175\u0005?\u0000\u0000\u0175\u0176"+
		"\u0005C\u0000\u0000\u0176\u017b\u00032\u0019\u0000\u0177\u0178\u0005q"+
		"\u0000\u0000\u0178\u017a\u00032\u0019\u0000\u0179\u0177\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u017f\u0005D\u0000\u0000"+
		"\u017f\u0180\u00034\u001a\u0000\u0180/\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0005@\u0000\u0000\u0182\u0183\u00034\u001a\u0000\u01831\u0001\u0000"+
		"\u0000\u0000\u0184\u0198\u0005Z\u0000\u0000\u0185\u0198\u0005T\u0000\u0000"+
		"\u0186\u0187\u0005T\u0000\u0000\u0187\u0188\u0005g\u0000\u0000\u0188\u0198"+
		"\u0005T\u0000\u0000\u0189\u018a\u0005T\u0000\u0000\u018a\u018b\u0005g"+
		"\u0000\u0000\u018b\u0198\u0005Z\u0000\u0000\u018c\u018d\u0005Z\u0000\u0000"+
		"\u018d\u018e\u0005g\u0000\u0000\u018e\u0198\u0005T\u0000\u0000\u018f\u0190"+
		"\u0005Z\u0000\u0000\u0190\u0191\u0005g\u0000\u0000\u0191\u0198\u0005Z"+
		"\u0000\u0000\u0192\u0193\u0005Z\u0000\u0000\u0193\u0194\u0005g\u0000\u0000"+
		"\u0194\u0195\u0005Z\u0000\u0000\u0195\u0196\u0005`\u0000\u0000\u0196\u0198"+
		"\u0005Z\u0000\u0000\u0197\u0184\u0001\u0000\u0000\u0000\u0197\u0185\u0001"+
		"\u0000\u0000\u0000\u0197\u0186\u0001\u0000\u0000\u0000\u0197\u0189\u0001"+
		"\u0000\u0000\u0000\u0197\u018c\u0001\u0000\u0000\u0000\u0197\u018f\u0001"+
		"\u0000\u0000\u0000\u0197\u0192\u0001\u0000\u0000\u0000\u01983\u0001\u0000"+
		"\u0000\u0000\u0199\u01a6\u0003\u0018\f\u0000\u019a\u019e\u0005G\u0000"+
		"\u0000\u019b\u019d\u0003\u0018\f\u0000\u019c\u019b\u0001\u0000\u0000\u0000"+
		"\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003R)\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a6\u0005H\u0000\u0000\u01a5\u0199\u0001"+
		"\u0000\u0000\u0000\u01a5\u019a\u0001\u0000\u0000\u0000\u01a65\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0005A\u0000\u0000\u01a8\u01a9\u0005C\u0000\u0000"+
		"\u01a9\u01aa\u0003\u001a\r\u0000\u01aa\u01ab\u0005^\u0000\u0000\u01ab"+
		"\u01ac\u00032\u0019\u0000\u01ac\u01ad\u0005^\u0000\u0000\u01ad\u01ae\u0003"+
		":\u001d\u0000\u01ae\u01af\u0005D\u0000\u0000\u01af\u01b0\u00034\u001a"+
		"\u0000\u01b07\u0001\u0000\u0000\u0000\u01b1\u01b2\u0005B\u0000\u0000\u01b2"+
		"\u01b3\u0005C\u0000\u0000\u01b3\u01b8\u00032\u0019\u0000\u01b4\u01b5\u0005"+
		"q\u0000\u0000\u01b5\u01b7\u00032\u0019\u0000\u01b6\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000"+
		"\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005D\u0000\u0000"+
		"\u01bc\u01bd\u00034\u001a\u0000\u01bd9\u0001\u0000\u0000\u0000\u01be\u01bf"+
		"\u0006\u001d\uffff\uffff\u0000\u01bf\u01c3\u0005T\u0000\u0000\u01c0\u01c3"+
		"\u0005Z\u0000\u0000\u01c1\u01c3\u0005\u008b\u0000\u0000\u01c2\u01be\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01d6\u0001\u0000\u0000\u0000\u01c4\u01c5\n\t"+
		"\u0000\u0000\u01c5\u01c6\u0005f\u0000\u0000\u01c6\u01d5\u0003:\u001d\n"+
		"\u01c7\u01c8\n\b\u0000\u0000\u01c8\u01c9\u0005e\u0000\u0000\u01c9\u01d5"+
		"\u0003:\u001d\t\u01ca\u01cb\n\u0007\u0000\u0000\u01cb\u01cc\u0005a\u0000"+
		"\u0000\u01cc\u01d5\u0003:\u001d\b\u01cd\u01ce\n\u0006\u0000\u0000\u01ce"+
		"\u01cf\u0005b\u0000\u0000\u01cf\u01d5\u0003:\u001d\u0007\u01d0\u01d1\n"+
		"\u0005\u0000\u0000\u01d1\u01d5\u0005c\u0000\u0000\u01d2\u01d3\n\u0004"+
		"\u0000\u0000\u01d3\u01d5\u0005d\u0000\u0000\u01d4\u01c4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01c7\u0001\u0000\u0000\u0000\u01d4\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d4\u01cd\u0001\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7;\u0001\u0000\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\u0017\u0000\u0000\u01da\u01db\u0005`\u0000\u0000\u01db"+
		"\u01dc\u0005\u0018\u0000\u0000\u01dc\u01de\u0005C\u0000\u0000\u01dd\u01df"+
		"\u0003:\u001d\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005"+
		"D\u0000\u0000\u01e1\u01e2\u0003R)\u0000\u01e2=\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e5\u00055\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e9\u0005Z\u0000\u0000\u01e7\u01e8\u0005[\u0000\u0000\u01e8\u01ea\u0005"+
		"<\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea?\u0001\u0000\u0000\u0000\u01eb\u01fc\u0005\u0016\u0000"+
		"\u0000\u01ec\u01fd\u0005Z\u0000\u0000\u01ed\u01fd\u0005T\u0000\u0000\u01ee"+
		"\u01fd\u0005\u008b\u0000\u0000\u01ef\u01fd\u0003\u0018\f\u0000\u01f0\u01f1"+
		"\u0005E\u0000\u0000\u01f1\u01f6\u0003 \u0010\u0000\u01f2\u01f3\u0005\\"+
		"\u0000\u0000\u01f3\u01f5\u0003 \u0010\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000"+
		"\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005F\u0000\u0000"+
		"\u01fa\u01fb\u0003R)\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01ec"+
		"\u0001\u0000\u0000\u0000\u01fc\u01ed\u0001\u0000\u0000\u0000\u01fc\u01ee"+
		"\u0001\u0000\u0000\u0000\u01fc\u01ef\u0001\u0000\u0000\u0000\u01fc\u01f0"+
		"\u0001\u0000\u0000\u0000\u01fdA\u0001\u0000\u0000\u0000\u01fe\u0202\u0005"+
		"G\u0000\u0000\u01ff\u0201\u0003\u0018\f\u0000\u0200\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0206\u0001\u0000"+
		"\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0207\u0003@ \u0000"+
		"\u0206\u0205\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0003R)\u0000\u0209\u020a"+
		"\u0005H\u0000\u0000\u020aC\u0001\u0000\u0000\u0000\u020b\u020d\u0005\u0015"+
		"\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e\u0210\u0005\u0014"+
		"\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0005Z\u0000"+
		"\u0000\u0212\u021b\u0005C\u0000\u0000\u0213\u0218\u0003>\u001f\u0000\u0214"+
		"\u0215\u0005\\\u0000\u0000\u0215\u0217\u0003>\u001f\u0000\u0216\u0214"+
		"\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021c"+
		"\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u0213"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0001\u0000\u0000\u0000\u021d\u0220\u0005D\u0000\u0000\u021e\u021f\u0005"+
		"[\u0000\u0000\u021f\u0221\u0007\u0002\u0000\u0000\u0220\u021e\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000"+
		"\u0000\u0000\u0222\u0223\u0003B!\u0000\u0223E\u0001\u0000\u0000\u0000"+
		"\u0224\u0228\u0005G\u0000\u0000\u0225\u0227\u0003\u0018\f\u0000\u0226"+
		"\u0225\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228"+
		"\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229"+
		"\u022b\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0005H\u0000\u0000\u022cG\u0001\u0000\u0000\u0000\u022d\u022f\u0005"+
		"\u000f\u0000\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0005"+
		"\u000e\u0000\u0000\u0231\u0233\u0005Z\u0000\u0000\u0232\u0234\u0005\u0011"+
		"\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0003F#\u0000"+
		"\u0236I\u0001\u0000\u0000\u0000\u0237\u0239\u0005\u000f\u0000\u0000\u0238"+
		"\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239"+
		"\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u00058\u0000\u0000\u023b\u023c"+
		"\u0005Z\u0000\u0000\u023c\u0240\u0005G\u0000\u0000\u023d\u023f\u0003$"+
		"\u0012\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000"+
		"\u0000\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000"+
		"\u0000\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0005H\u0000\u0000\u0244K\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0005\u0013\u0000\u0000\u0246\u024f\u0005C\u0000\u0000\u0247"+
		"\u024c\u0003>\u001f\u0000\u0248\u0249\u0005\\\u0000\u0000\u0249\u024b"+
		"\u0003>\u001f\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024e\u0001"+
		"\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000\u024c\u024d\u0001"+
		"\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001"+
		"\u0000\u0000\u0000\u024f\u0247\u0001\u0000\u0000\u0000\u024f\u0250\u0001"+
		"\u0000\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0005"+
		"D\u0000\u0000\u0252\u0253\u0003B!\u0000\u0253M\u0001\u0000\u0000\u0000"+
		"\u0254\u0255\u0005\u0010\u0000\u0000\u0255\u0256\u0005G\u0000\u0000\u0256"+
		"\u025b\u0005Z\u0000\u0000\u0257\u0258\u0005\\\u0000\u0000\u0258\u025a"+
		"\u0005Z\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u025a\u025d\u0001"+
		"\u0000\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001"+
		"\u0000\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025b\u0001"+
		"\u0000\u0000\u0000\u025e\u025f\u0005H\u0000\u0000\u025f\u0260\u0005\u0012"+
		"\u0000\u0000\u0260\u0261\u0005T\u0000\u0000\u0261\u0262\u0003R)\u0000"+
		"\u0262O\u0001\u0000\u0000\u0000\u0263\u0264\u0007\u0003\u0000\u0000\u0264"+
		"Q\u0001\u0000\u0000\u0000\u0265\u0267\u0005^\u0000\u0000\u0266\u0265\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u026a\u0001"+
		"\u0000\u0000\u0000\u0268\u026a\u0005\u0000\u0000\u0001\u0269\u0266\u0001"+
		"\u0000\u0000\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026aS\u0001\u0000"+
		"\u0000\u0000\u026b\u026d\u0003V+\u0000\u026c\u026b\u0001\u0000\u0000\u0000"+
		"\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000"+
		"\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000\u0000"+
		"\u0270\u026e\u0001\u0000\u0000\u0000\u0271\u0273\u0005u\u0000\u0000\u0272"+
		"\u0271\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273"+
		"\u0277\u0001\u0000\u0000\u0000\u0274\u0276\u0003V+\u0000\u0275\u0274\u0001"+
		"\u0000\u0000\u0000\u0276\u0279\u0001\u0000\u0000\u0000\u0277\u0275\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u027b\u0001"+
		"\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u027a\u027c\u0005"+
		"w\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027c\u0280\u0001\u0000\u0000\u0000\u027d\u027f\u0003V+\u0000"+
		"\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000"+
		"\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000"+
		"\u0281\u0286\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0283\u0285\u0003X,\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0285\u0288"+
		"\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287U\u0001\u0000\u0000\u0000\u0288\u0286\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0007\u0004\u0000\u0000\u028aW\u0001\u0000"+
		"\u0000\u0000\u028b\u028d\u0003f3\u0000\u028c\u028b\u0001\u0000\u0000\u0000"+
		"\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000"+
		"\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0295\u0003Z-\u0000\u0292\u0294"+
		"\u0003f3\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294\u0297\u0001\u0000"+
		"\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296Y\u0001\u0000\u0000\u0000\u0297\u0295\u0001\u0000\u0000"+
		"\u0000\u0298\u0299\u0005}\u0000\u0000\u0299\u029d\u0005\u0086\u0000\u0000"+
		"\u029a\u029c\u0003b1\u0000\u029b\u029a\u0001\u0000\u0000\u0000\u029c\u029f"+
		"\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029d\u029e"+
		"\u0001\u0000\u0000\u0000\u029e\u02a1\u0001\u0000\u0000\u0000\u029f\u029d"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a2\u0003^/\u0000\u02a1\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a5\u0003\\.\u0000\u02a4\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02c2\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a8\u0003\\.\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02ac\u0001\u0000\u0000\u0000"+
		"\u02a9\u02ab\u0003b1\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ad\u02b0\u0001\u0000\u0000\u0000\u02ae\u02ac"+
		"\u0001\u0000\u0000\u0000\u02af\u02b1\u0003^/\u0000\u02b0\u02af\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000\u02b1\u02bc\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b9\u0005\u0082\u0000\u0000\u02b3\u02b4\u0003`0\u0000"+
		"\u02b4\u02b5\u0005}\u0000\u0000\u02b5\u02b6\u0005\u0084\u0000\u0000\u02b6"+
		"\u02b7\u0005\u0086\u0000\u0000\u02b7\u02b8\u0005\u0082\u0000\u0000\u02b8"+
		"\u02ba\u0001\u0000\u0000\u0000\u02b9\u02b3\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb"+
		"\u02bd\u0005\u0083\u0000\u0000\u02bc\u02b2\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bb\u0001\u0000\u0000\u0000\u02bd\u02c2\u0001\u0000\u0000\u0000\u02be"+
		"\u02c2\u0005y\u0000\u0000\u02bf\u02c2\u0003j5\u0000\u02c0\u02c2\u0003"+
		"l6\u0000\u02c1\u0298\u0001\u0000\u0000\u0000\u02c1\u02a7\u0001\u0000\u0000"+
		"\u0000\u02c1\u02be\u0001\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2[\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c4\u0005\u007f\u0000\u0000\u02c4\u02c5\u0005\u0085\u0000\u0000"+
		"\u02c5\u02c6\u0005\u0090\u0000\u0000\u02c6]\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c8\u0005\u0087\u0000\u0000\u02c8\u02c9\u0005\u0085\u0000\u0000\u02c9"+
		"\u02ca\u0005\u0090\u0000\u0000\u02ca_\u0001\u0000\u0000\u0000\u02cb\u02cd"+
		"\u0003d2\u0000\u02cc\u02cb\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000"+
		"\u0000\u0000\u02cd\u02d8\u0001\u0000\u0000\u0000\u02ce\u02d2\u0003Z-\u0000"+
		"\u02cf\u02d2\u0005v\u0000\u0000\u02d0\u02d2\u0003h4\u0000\u02d1\u02ce"+
		"\u0001\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d2\u02d4\u0001\u0000\u0000\u0000\u02d3\u02d5"+
		"\u0003d2\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d5\u02d7\u0001\u0000\u0000\u0000\u02d6\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d7\u02da\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9a\u0001\u0000\u0000"+
		"\u0000\u02da\u02d8\u0001\u0000\u0000\u0000\u02db\u02de\u0005\u0086\u0000"+
		"\u0000\u02dc\u02dd\u0005\u0085\u0000\u0000\u02dd\u02df\u0005\u0090\u0000"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000"+
		"\u0000\u02dfc\u0001\u0000\u0000\u0000\u02e0\u02e2\u0005~\u0000\u0000\u02e1"+
		"\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e3\u02e5\u0005x\u0000\u0000\u02e4\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000\u0000\u02e5\u02e8"+
		"\u0001\u0000\u0000\u0000\u02e6\u02e8\u0005=\u0000\u0000\u02e7\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8e\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ec\u0003h4\u0000\u02ea\u02ec\u0005=\u0000\u0000"+
		"\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ecg\u0001\u0000\u0000\u0000\u02ed\u02ee\u0007\u0005\u0000\u0000\u02ee"+
		"i\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005{\u0000\u0000\u02f0\u02f1\u0007"+
		"\u0006\u0000\u0000\u02f1k\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005|\u0000"+
		"\u0000\u02f3\u02f4\u0007\u0007\u0000\u0000\u02f4m\u0001\u0000\u0000\u0000"+
		"]qx}\u0083\u008d\u0090\u0094\u0097\u009a\u00a4\u00aa\u00b2\u00bc\u00bf"+
		"\u00c3\u00c9\u00d6\u00ea\u00ed\u00f7\u00fe\u0107\u010f\u0117\u0121\u0124"+
		"\u0129\u012e\u013a\u0145\u014b\u0158\u015d\u0166\u016e\u0172\u017b\u0197"+
		"\u019e\u01a2\u01a5\u01b8\u01c2\u01d4\u01d6\u01de\u01e4\u01e9\u01f6\u01fc"+
		"\u0202\u0206\u020c\u020f\u0218\u021b\u0220\u0228\u022e\u0233\u0238\u0240"+
		"\u024c\u024f\u025b\u0266\u0269\u026e\u0272\u0277\u027b\u0280\u0286\u028e"+
		"\u0295\u029d\u02a1\u02a4\u02a7\u02ac\u02b0\u02b9\u02bc\u02c1\u02cc\u02d1"+
		"\u02d4\u02d8\u02de\u02e1\u02e4\u02e7\u02eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}