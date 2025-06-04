lexer grammar TSLexer;

COMPONENT: '@Component';
INJECTABLE: '@Injectable';
PROVIDED_IN: 'providedIn';
SELECTOR: 'selector';
TEMPLATE: 'template';


IMPORTS:'imports';
TEMPLATE_URL:'templateUrl';
STYLE_URL:'styleUrl';
STYLE_URLS:'styleUrls';


SL_COMMENT: '//' ~[\r\n]* -> skip;
ML_COMMENT: '/*' .*? '*/' -> skip;
CLASS:'class';
EXPORT:'export';
IMPORT:'import';
EXTENDS:'extends';
FROM:'from';
CONSTRUCTOR : 'constructor';
FUNCTION:'function';
OVERRIDE:'@override';
RETURN:'return';
CONSOLE: 'console';
LOG: 'log';
THIS:'this';
CASE:'case';
BREAK:'break';
DO:'do';
NEW:'new';
CATCH:'catch';
FINALLY    : 'finally';
VOID       : 'void';
CONTINUE   : 'continue';
SWITCH     : 'switch';
WITH       : 'with';
THROW      : 'throw';
IN         : 'in';
TRY        : 'try';
AS         : 'as';
ASYNC      : 'async';
AWAIT      : 'await';
SUPER   : 'super';

ENUM    : 'enum';
OF      : 'of';
ABSTRACT: 'abstract';
IMPLEMENTS : 'implements';
IS: 'is';
AT: '@';
UNDER_SCORE:'_';
ARROW:'=>';
Q_MARK:'?';
NULL:'null';
MODIFIER
    : PUBLIC
    | PRIVATE
    | PROTECTED
    ;
PRIVATE    : 'private';
PUBLIC     : 'public';
INTERFACE  : 'interface';
PACKAGE    : 'package';
PROTECTED  : 'protected';
STATIC     : 'static';
DATA_TYPE: ANY_TYPE
          | NUMBER_TYPE
          | BOOLEAN_TYPE
          | STRING_TYPE
          | ARRAY_TYPE;

SEA_WS: (' ' | '\t' | '\r'? '\n')+ ->skip;
IF:'if';
ELSE_IF:'else if';
ELSE:'else';
FOR:'for';
WHILE:'while';
OPEN_B:'(';
CLOSE_B:')';
SQUARE_OPEN : '[' ;
SQUARE_CLOSE : ']' ;
CURLY_OPEN:'{';
CURLY_CLOSE:'}';
ARRAY_TYPE     :'array';
ANY_TYPE       : 'any';
NUMBER_TYPE    : 'number';
HELPERS:LET|VAR_TYPE|CONST;
LET:'let';
CONST   : 'const';
VAR_TYPE       :'var';
BOOLEAN_TYPE   : 'boolean';
STRING_TYPE    : 'string';
UNIQUE_TYPE    : 'unique';
VAL:BOOLEAN_VAL
    |NUM_VAL
    |DOUBLE_VAL
    |STRING_VAL
    |UNDEFINED;
UNDEFINED:'undefined';
BOOLEAN_VAL:'TRUE'|'true'|'FALSE'|'false';
STRING_VAL: ('"' (~["\r\n] | '\\"')* '"')
            |('\'' (~['\r\n] | '\\"')* '\'');
NUM_VAL:'0'|'-'?[1-9][0-9]*;
DOUBLE_VAL:NUM_VAL('.' [0-9]+)* ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;
//ID:(('_')?[a-zA-Z])[a-zA-Z0-9]*;
COLON:':';
COMMA:',';
DOUBLE_QUOTE: '"';
SEMI_COLON:';';
EQUAL:'=';
DOT:'.';
//BACKTICK: '`';
PLUS:'+' ;
MINUS:'-' ;
PLUS_PLUS:'++';
MINUS_MINUS:'--';
DIV:'/';
MUL:'*';
OPERATION:GREATER_THAN
          |LESS_THAN
          |GREATER_THAN_EQUALS
          |LESS_THAN_EQUALS
          |EQUALS
          |NOT_EQUALS;
EQUALS: '==';
NOT: '!';
NOT_EQUALS: '!=';
IDENTITY_EQUALS: '===';
IDENTITY_NOT_EQUALS: '!==';
LESS_THAN: '<';
GREATER_THAN: '>';
LESS_THAN_EQUALS: '<=';
GREATER_THAN_EQUALS: '>=';

LOGICAL_OPERATION: '&&'
                  | '||' ;





