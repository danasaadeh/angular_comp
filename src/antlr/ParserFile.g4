parser grammar ParserFile;
options {
	tokenVocab = LexerFile;
}
program: instruction+ eos;



//ANGULAR GRAMMAR:
instruction:
	import_statement+ import_statement*  #IMPORT_INSTRUCT
	| component                          #COMPONENT_INSTRUCT
	| inject                             #INJECT_INSTRUCT
	| statements                         #STATEMENTS_INSTRUCT
	;

component:COMPONENT OPEN_B CURLY_OPEN componentBody CURLY_CLOSE CLOSE_B ;

componentBody: selector? (template_Url|template)? imports? (style_Urls)?;

selector: SELECTOR COLON VAL COMMA?;

template_Url: TEMPLATE_URL COLON VAL COMMA?;

template:TEMPLATE COLON BACKTICK htmlDocument BACKTICK_CLOSE COMMA?;

imports:IMPORTS COLON SQUARE_OPEN ID (COMMA ID*)? SQUARE_CLOSE COMMA?;

style_Urls: (STYLE_URL | STYLE_URLS) COLON VAL COMMA?;

inject:INJECTABLE OPEN_B CURLY_OPEN provided_in CURLY_CLOSE CLOSE_B ;

provided_in: PROVIDED_IN COLON VAL COMMA?;

statements:
   class_decl               #CLASS_DECLAR_STATE
  |interface                #INTERFACE_STATE
  | function_decl           #FUNC_DECL_STATE
  | constructor             #CONSTR_STATE
  | init                    #INIT_STATE
  |init_array               #INIT_ARRAY_STATE
  | declaration             #DECLARE_STATE
  | assign                  #ASSIGN_STATE
  | if_condition            #IF_CONDITION_STATE
  | for                     # FOR_LOOP_STATE
  | while                   #WHILE_LOOP_STATE
  |expr                     #EXPR_STATE
  | this_exp                #THIS_EXPR_STATE
  |super_exp                #SUPER_EXPR_STATE
  | print                   #PRINT_STATE
  |value                    #VALUE_STATE
  |return                   #RETRUN_STATE
  | comment                 #COMMENT_STATE;

init:HELPERS?  ID COLON DATA_TYPE EQUAL VAL  eos;
init_array:HELPERS? ID (COLON DATA_TYPE SQUARE_OPEN SQUARE_CLOSE)? EQUAL SQUARE_OPEN value (COMMA value)* SQUARE_CLOSE eos;
value:  VAL
      | object;

object:CURLY_OPEN objectProperty (COMMA objectProperty)* CURLY_CLOSE;

objectProperty: ID COLON VAL;



declaration:MODIFIER? HELPERS? ID (COLON DATA_TYPE)? eos	;

assign:
 HELPERS? ID EQUAL (VAL | ID ) eos;


this_exp: THIS DOT ID+ EQUAL (VAL | ID) eos;

super_exp: SUPER DOT ID+(DOT ID)* EQUAL (VAL|ID) eos
          | SUPER OPEN_B ID (COMMA ID)* CLOSE_B eos;

if_condition:IF OPEN_B condition (LOGICAL_OPERATION condition)* CLOSE_B body else_if_condition*else_condition?;

else_if_condition:
	ELSE_IF OPEN_B condition (LOGICAL_OPERATION condition)* CLOSE_B body;

else_condition: ELSE body;

condition:
	 ID                           #ID_COND
	| VAL                         #VAL_COND
	| VAL OPERATION VAL           #VAL_OPERA_VAL
	| VAL OPERATION ID            #VAL_OPERA_ID
	| ID OPERATION VAL            #ID_OPERA_VAL
	| ID OPERATION ID             #ID_OPERA_ID
	| ID OPERATION ID DOT ID      #ID_OPERA_DOT_ID;


body: statements
        | CURLY_OPEN (statements)*  eos? CURLY_CLOSE
        ;

for:FOR OPEN_B init SEMI_COLON condition SEMI_COLON expr CLOSE_B body;

while:
	WHILE OPEN_B condition (LOGICAL_OPERATION condition)* CLOSE_B body;

expr:
	  expr MUL expr      #MULTI
	| expr DIV expr      #DIV
	| expr PLUS expr     #PLUS
	| expr MINUS expr    #MINUS
	| expr PLUS_PLUS     #PLUS2
	| expr MINUS_MINUS   #MINUS2
	| VAL                #VAL_EXPR
	| ID                 #ID_EXPR
	| SENTENCE           #SENT_EXPR
	 ;

print: CONSOLE DOT LOG OPEN_B (expr)? CLOSE_B eos;

parameter: MODIFIER? ID (COLON DATA_TYPE)?;

return:
	RETURN (ID
	       | VAL
	       | SENTENCE
	       |statements
	       |SQUARE_OPEN object(COMMA object)* SQUARE_CLOSE eos )
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

comment: SL_COMMENT
         | ML_COMMENT;

eos: SEMI_COLON?
     | EOF;


//HTML GRAMMAR:
htmlDocument:
	scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*;

scriptletOrSeaWs: SCRIPTLET
                  | SEA_WS;

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


htmlMisc: htmlComment
          | SEA_WS;

htmlComment: HTML_COMMENT
             | HTML_CONDITIONAL_COMMENT;

script: SCRIPT_OPEN (SCRIPT_BODY
                     | SCRIPT_SHORT_BODY);

style: STYLE_OPEN (STYLE_BODY
                   | STYLE_SHORT_BODY);