lexer grammar MileLexer;

fragment TRUE	: 'v'		;
fragment FALSE	: 'f'		;
fragment NAT		: [0-9]		;
fragment DOT		: '.'		;
 
PLUS 	: '+'	;
MINUS	: '-'	;
AND		: 'and'	;
OR		: 'or'	;
EQUAL	: '='	;
NQUAL	: '<>'	;
GT		: '>'	;
ASSIGN 	: '<-'	;
LPAR		: '('	;
RPAR		: ')'	;
LBRACE	: '{'	;
RBRACE	: '}'	;

BEGIN_RW		: 'inicio'	;
END_RW		: 'fin'		;
IF_RW		: 'si'		;
ELIF_RW		: 'sino_si'	;
ELSE_RW		: 'sino'		;
ENDIF_RW		: 'fin_si'	;
READ_RW		: 'leer'		;
WRITE_RW		: 'escribir'	;
INTEGER_RW	: 'entero'	;
STRING_RW	: 'cadena'	;
REAL_RW		: 'real'		;
BOOLEAN_RW	: 'logico'	;

NUMBER	: NAT+				;
FLOAT 	: NUMBER DOT NUMBER	;
BOOLEAN 	: TRUE | FALSE		;
STRING 	: '"' .*? '"'		;

ID		: [a-zA-Z]+						;
COMMENT	:  '!' .*? '\r'? '\n' -> skip	;
WS 		: [ \t\r\n]+ -> skip 			;