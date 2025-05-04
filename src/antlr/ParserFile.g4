parser grammar ParserFile;
options {
	tokenVocab = LexerFile;
}
program: instruction+ eos;



//ANGULAR GRAMMAR:
instruction:
	import_statement+ import_statement*
	| component
	| inject
	| statements
	;
component:COMPONENT OPEN_B CURLY_OPEN componentBody CURLY_CLOSE CLOSE_B ;

componentBody: selector (template_Url|template) imports? (style_Urls)?;
selector: SELECTOR COLON VAL COMMA;
template_Url: TEMPLATE_URL COLON VAL COMMA?;
template:TEMPLATE COLON BACKTICK htmlDocument BACKTICK_CLOSE COMMA;
imports:IMPORTS COLON SQUARE_OPEN ID (COMMA ID*)? SQUARE_CLOSE COMMA;

style_Urls: (STYLE_URL | STYLE_URLS) COLON VAL COMMA?;

inject:
	INJECTABLE OPEN_B CURLY_OPEN provided_in CURLY_CLOSE CLOSE_B ;

provided_in: PROVIDED_IN COLON VAL COMMA?;

/*tttt*/
statements:
	class_decl
	|interface
	| function_decl
	| constructor
	| init
	|init_array
	| declaration
	| assign
	| if_condition
	| for
	| while
	|expr
	| this_exp
	|super_exp
	| print
	|value
	|return
	| comment;

init:HELPERS?  ID (COLON DATA_TYPE)? EQUAL VAL eos;
init_array:HELPERS? ID (COLON DATA_TYPE SQUARE_OPEN SQUARE_CLOSE)? EQUAL SQUARE_OPEN value (COMMA value)* SQUARE_CLOSE eos;
value: VAL
      | object;
object:CURLY_OPEN objectProperty (COMMA objectProperty)* CURLY_CLOSE;
objectProperty: ID COLON VAL;

declaration:MODIFIER? HELPERS? ID (COLON DATA_TYPE)? eos	;


assign:HELPERS? ID EQUAL (VAL | ID ) eos;

this_exp: THIS DOT ID+ EQUAL (VAL | ID) eos;

super_exp: SUPER DOT ID+ EQUAL (VAL|ID) eos
         | SUPER OPEN_B ID (COMMA ID)* CLOSE_B eos
         ;

if_condition:IF OPEN_B condition (LOGICAL_OPERATION condition)* CLOSE_B body else_if_condition*else_condition?;

else_if_condition:
	ELSE_IF OPEN_B condition (LOGICAL_OPERATION condition)* CLOSE_B body;

else_condition: ELSE body;

condition:
	ID
	| VAL
	| VAL OPERATION VAL
	| VAL OPERATION ID
	| ID OPERATION VAL
	| ID OPERATION ID
	|ID OPERATION ID DOT ID;

body: statements
        | CURLY_OPEN (statements)*  eos? CURLY_CLOSE
        ;

for:
	FOR OPEN_B init SEMI_COLON condition SEMI_COLON expr CLOSE_B body;

while:
	WHILE OPEN_B condition (LOGICAL_OPERATION condition)* CLOSE_B body;

expr:
	expr MUL expr
	| expr DIV expr
	| expr PLUS expr
	| expr MINUS expr
	| expr PLUS_PLUS
	| expr MINUS_MINUS
	| VAL
	| ID
	| SENTENCE;

print: CONSOLE DOT LOG OPEN_B (expr)? CLOSE_B eos;

parameter: MODIFIER? ID (COLON DATA_TYPE)?;

return:
	RETURN (ID | VAL | SENTENCE|statements|SQUARE_OPEN object(COMMA object)* SQUARE_CLOSE eos )
	 ;

function_body:
	CURLY_OPEN (statements)* return? eos CURLY_CLOSE ;

 function_decl: (OVERRIDE)? FUNCTION ?  ID OPEN_B (parameter(COMMA parameter)*)? CLOSE_B (COLON (VOID|DATA_TYPE))? function_body
    ;



class_body: CURLY_OPEN (statements)* CURLY_CLOSE;
class_decl:EXPORT? CLASS ID (EXTENDS)? class_body ;
interface:EXPORT? INTERFACE ID CURLY_OPEN  (declaration)* CURLY_CLOSE ;
constructor:CONSTRUCTOR OPEN_B (parameter (COMMA parameter)*)? CLOSE_B function_body;


import_statement:
	IMPORT CURLY_OPEN ID (COMMA ID)* CURLY_CLOSE FROM VAL eos;

comment: SL_COMMENT | ML_COMMENT;

eos: SEMI_COLON? | EOF;
//HTML GRAMMAR:
htmlDocument:
	scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*;

scriptletOrSeaWs: SCRIPTLET | SEA_WS;

htmlElements: htmlMisc* htmlElement htmlMisc*;

htmlElement:
	TAG_OPEN TAG_NAME htmlAttribute* binding? directive?
	| directive? htmlAttribute* binding? (
		TAG_CLOSE (
			htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE
		)?
		| TAG_SLASH_CLOSE
	)
	| SCRIPTLET
	| script
	| style;

directive: DIRECTIVE TAG_EQUALS ATTVALUE_VALUE;
binding: BINDING TAG_EQUALS ATTVALUE_VALUE;

htmlContent:
	htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*;

htmlAttribute: TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?;
htmlChardata: HTML_TEXT? INTERPOLATION? | SEA_WS;


htmlMisc: htmlComment | SEA_WS;

htmlComment: HTML_COMMENT | HTML_CONDITIONAL_COMMENT;

script: SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY);

style: STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY);