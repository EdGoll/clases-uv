lexer grammar MileLexer;

fragment TRUE	: 'v'		;
fragment FALSE	: 'f'		;
fragment NAT	: [0-9]		;
fragment DOT	: '.'		;
 
NUMBER			: NAT+				;
FLOAT 			: NUMBER DOT NUMBER	;
BOOLEAN 		: TRUE | FALSE		;
STRING 			: '"' .*? '"'		;

ID				: [a-zA-Z]+						;
COMMENT			:  '!' .*? '\r'? '\n' -> skip	;
WS 				: [ \t\r\n]+ -> skip 			;

BEGIN_RW		: 'inicio'    	;
END_RW			: 'end'    		;
FOR_RW			: 'for'    		;