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

componentBody: selector? stanalone? (template_Url|template)? imports? (style_Urls)?;
stanalone:STANDALONE COLON VAL COMMA?;
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
  |readOnly                #READ_ONLY_STATE
  |instance                  #INSTANCE_STATE
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


value:  VAL
      | object;
init:MODIFIER? HELPERS?  ID COLON DATA_TYPE EQUAL value  eos;
init_array :EXPORT? HELPERS?   ID (COLON typeReference (SQUARE_OPEN SQUARE_CLOSE)?)? EQUAL SQUARE_OPEN value (COMMA value)* SQUARE_CLOSE eos;


object:CURLY_OPEN objectProperty (COMMA objectProperty)* COMMA? CURLY_CLOSE COMMA?;

objectProperty: ID COLON (VAL|ID);


readOnly:declaration EQUAL this_exp;
instance : declaration EQUAL NEW ID OPERATION DATA_TYPE SQUARE_OPEN SQUARE_CLOSE OPERATION OPEN_B array CLOSE_B SEMI_COLON;
declaration:MODIFIER? HELPERS? ID (COLON DATA_TYPE)? eos	;

assign:
 HELPERS? ID EQUAL (VAL | ID ) eos;




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

expr
  : expr EQUAL expr          #ASSIGN_EXPR
  | expr MUL expr            #MULTI
  | expr DIV expr            #DIV
  | expr PLUS expr           #PLUS
  | expr MINUS expr          #MINUS
  | expr PLUS_PLUS           #PLUS2
  | expr MINUS_MINUS         #MINUS2
  | VAL                      #VAL_EXPR
  | ID                       #ID_EXPR
  | SENTENCE                 #SENT_EXPR
  | object                   #OBJECT_EXPR
  | array                    #ARRAY_EXPR
  | method_call              #METHOD_CALL_EXPR
  | THIS DOT property_chain  #THIS_PROP_EXPR
  | NEW ID (LESS_THAN DATA_TYPE GREATER_THAN)? OPEN_B (expr (COMMA expr)*)? CLOSE_B   #NEW_EXPR
  | arrowFunction            #ARROW_FUNC_EXPR
  ;





//this_exp: THIS DOT ID+ EQUAL (VAL | ID) eos;
this_exp
  : THIS DOT property_chain (assignment | post_op)? eos
  ;


// property_chain supports nested method and property access
property_chain
  : ID (DOT ID)* (DOT method_call)?
  ;
// method call like: .next(), .addItem(arg)

method_call
  : ID OPEN_B (expr (COMMA expr)*)? CLOSE_B
  ;


// supports assignments like = [], = new Something(), etc.
assignment
  : EQUAL expr
  ;


// ++ or -- after the expression
post_op
  : PLUS_PLUS
  | MINUS_MINUS
  ;




array
  : SQUARE_OPEN (arrayElement (COMMA arrayElement)*)? SQUARE_CLOSE
  ;



arrayElement
  : spreadElement
  | expr
  ;

  spreadElement
    : SPREAD expr
    ;

arrowFunction
  : OPEN_B ID CLOSE_B ARROW OPEN_B (expr | assignment) CLOSE_B
  ;


print: CONSOLE DOT LOG OPEN_B (expr)? CLOSE_B eos;

parameter: MODIFIER? ID COLON typeReference;

typeReference: DATA_TYPE | ID; // DATA_TYPE includes primitives

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
	TAG_OPEN TAG_NAME htmlAttribute* binding? hash? directive?
	| directive? htmlAttribute* binding?  hash?(
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
hash:HASH TAG_EQUALS ATTVALUE_VALUE;

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
