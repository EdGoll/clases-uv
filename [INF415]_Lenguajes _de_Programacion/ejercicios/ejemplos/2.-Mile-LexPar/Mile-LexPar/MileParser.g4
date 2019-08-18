grammar MileParser;

import MileLexer;

s 		: operation EOF					
		;

program	: start_block stat+	end_block	
		;

stat		: declaration
		| assign
    		| operation
    		| if_block
    		| read_block
    		| write_block 
    		;

start_block : BEGIN_RW	
			;

end_block	: END_RW		
			;

operation  	: operation PLUS operation 				# plus
            | operation ( EQUAL | NQUAL ) operation 	# comp
            | operation AND operation 				# and
            | operation OR operation 				# or
            | operation GT operation 				# comp
            | ID 									# id
            | LPAR operation RPAR 					# parens
            ;


if_block		: IF_RW condition_block 
			  (ELIF_RW condition_block)* 
			  (ELSE_RW else_block)? 
			  ENDIF_RW
			;

condition_block	: LPAR operation RPAR LBRACE block RBRACE
				| LPAR operation RPAR stat
				;

else_block	: LBRACE block RBRACE
            | stat
			;

block		: stat* 
			;

assign 		: ID ASSIGN 
			( operation
			| ID 
			| NUMBER 
			| FLOAT 
			| STRING 
			| BOOLEAN
			) ; 

variable_type	: INTEGER_RW
				| REAL_RW 
				| STRING_RW
				| BOOLEAN_RW
				;

declaration		: variable_type ID
				| variable_type assign  
				;

read_block: READ_RW LPAR ID RPAR # read;

write_block: WRITE_RW LPAR (STRING | ID+) RPAR # print;
