lexer grammar LexerFile;

import TSLexer ;

BACKTICK: '`' -> pushMode(TEMPLATE_MODE);

mode TEMPLATE_MODE;

BACKTICK_CLOSE: '`' -> popMode;

HTML_COMMENT: '<!--' .*? '-->';

HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';

XML: '<?xml' .*? '>';

CDATA: '<![CDATA[' .*? ']]>';

DTD: '<!' .*? '>';

INTERPOLATION: '{{' ~('}' | '{')* '}}';
SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

SEA_WS2: (' ' | '\t' | '\r'? '\n')+ ->skip;

SCRIPT_OPEN: '<script' .*? '>' -> pushMode(SCRIPT);

STYLE_OPEN: '<style' .*? '>' -> pushMode(STYLE);


TAG_OPEN: '<' -> pushMode(TAG);
HTML_TEXT: ~('<' | '`'|'{'|'}') + ;


mode TAG;

DIRECTIVE:IF_DIRECTIVE|FOR_DIRECTIVE  ;
IF_DIRECTIVE:'*ngIf';
FOR_DIRECTIVE:'*ngFor';
TAG_CLOSE: '>' -> popMode;

TAG_SLASH_CLOSE: '/>' -> popMode;

TAG_SLASH: '/';



TAG_EQUALS: '=' -> pushMode(ATTVALUE);

TAG_NAME: TAG_NameStartChar TAG_NameChar*;
BINDING:EVENT|PROPERTY;
EVENT: OPEN_B TAG_NAME CLOSE_B;
PROPERTY: SQUARE_OPEN TAG_NAME SQUARE_CLOSE;

TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);

fragment HEXDIGIT: [a-fA-F0-9];

fragment DIGIT: [0-9];

fragment CHAR :[a-zA-Z] ;
fragment SIGN:'-'
             | '+'
             |'='
             |'_'
             |')'
             |'('
             |'*'
             | '&'
             |'^'
             |'%'
             |'$'
             |'#'
             |'@'
             |'!'
             |'?'
             |'.'
             |','
             |';'
             |':'
             |'"'
             |']'
             |'['
             |'{'
             |'}'
             |'`'
             |'~'
             |'\\'
             |'/'
             |'>'
             |'<';
SENTENCE : '\'' (CHAR|DIGIT|SIGN|' ')* '\'' ;

fragment TAG_NameChar:
	TAG_NameStartChar
	| '-'
	| '_'
	| '.'
	| DIGIT
	| '\u00B7'
	| '\u0300' ..'\u036F'
	| '\u203F' ..'\u2040';

fragment TAG_NameStartChar:
	[:a-zA-Z]
	| '\u2070' ..'\u218F'
	| '\u2C00' ..'\u2FEF'
	| '\u3001' ..'\uD7FF'
	| '\uF900' ..'\uFDCF'
	| '\uFDF0' ..'\uFFFD';



mode SCRIPT;

SCRIPT_BODY: .*? '</script>' -> popMode;

SCRIPT_SHORT_BODY: .*? '</>' -> popMode;


mode STYLE;

STYLE_BODY: .*? '</style>' -> popMode;

STYLE_SHORT_BODY: .*? '</>' -> popMode;



mode ATTVALUE;


ATTVALUE_VALUE: ' '* ATTRIBUTE -> popMode;

ATTRIBUTE:
    FOR_VAL
    |IF_VAL
	|DOUBLE_QUOTE_STRING
	| SINGLE_QUOTE_STRING
	| ATTCHARS
	| HEXCHARS
	| DECCHARS;
FOR_VAL: DOUBLE_QUOTE LET ID OF ID DOUBLE_QUOTE;
IF_VAL :DOUBLE_QUOTE  ID DOUBLE_QUOTE;
fragment ATTCHARS: ATTCHAR+ ' '?;

fragment ATTCHAR:
	'-'
	| '_'
	| '.'
	| '/'
	| '+'
	| ','
	| '?'
	| '='
	| ':'
	| ';'
	| '#'
	| [0-9a-zA-Z];

fragment HEXCHARS: '#' [0-9a-fA-F]+;

fragment DECCHARS: [0-9]+ '%'?;

fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';

fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\'';


