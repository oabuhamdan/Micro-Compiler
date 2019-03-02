// Define a grammar called Micro
grammar Micro;

authors:'OSAMA ABUAMDAN' 'SAAD JALOWDI';

KEYWORD: 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' |'ENDIF' | 'FOR' |'ENDFOR' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;
IDENTIFIER: ('A'..'Z'|'a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')* ;
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines
INTLITERAL : '0'|('1'..'9')('0'..'9')* ;
FLOATLITERAL : ('0'|(('1'..'9')('0'..'9')*)).('0'|(('0'..'9')*)('1'..'9')) ;
STRINGLITERAL : '"' .*? '"' ;
COMMENT : '--' .*? '\n'  -> skip ;

OPERATOR : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ;


//PARSER RULES

/*	Program	*/
program	:	KEYWORD	id	KEYWORD   pgm_body    KEYWORD ;
id	:	IDENTIFIER ;
pgm_body    :	decl    func_declarations ;
decl    :	string_decl	decl	|	var_decl	decl	|	  ;

/*	String	Declaration	*/
string_decl	:	KEYWORD	id	OPERATOR	str	OPERATOR;
str	    :	STRINGLITERAL ;


/*	Variable	Declaration	*/
var_decl    :	var_type	id_list	OPERATOR;
var_type	:	KEYWORD	|	KEYWORD ;
any_type	:	var_type	|	KEYWORD ;
id_list	    :	id	id_tail ;
id_tail		:	OPERATOR	id	id_tail	|	  ;

/*	Function	Parameter	List	*/
param_decl_list		:	param_decl	param_decl_tail	|	  ;
param_decl  :	var_type	id ;
param_decl_tail	    :	OPERATOR	param_decl	param_decl_tail	|	  ;

/*	Function	Declarations	*/
func_declarations		:	func_decl	func_declarations	|	  ;
func_decl	:	KEYWORD	any_type	id	OPERATOR param_decl_list OPERATOR	KEYWORD	func_body	KEYWORD ;
func_body	:	decl	stmt_list ;

/*	Statement	List	*/
stmt_list	:	stmt	stmt_list	|	  ;
stmt	    :	basic_stmt		|	if_stmt	|	for_stmt ;
basic_stmt	:	assign_stmt	|	read_stmt	|	write_stmt	|	return_stmt ;

/*	Basic	Statements	*/
assign_stmt		:	assign_expr	OPERATOR ;
assign_expr	    :	id	OPERATOR	expr ;
read_stmt	    :	KEYWORD	OPERATOR id_list OPERATOR OPERATOR;
write_stmt	    :	KEYWORD	OPERATOR id_list	OPERATOR OPERATOR;
return_stmt	    :	KEYWORD	expr  OPERATOR;

/* if_stmt */
if_stmt : KEYWORD OPERATOR cond OPERATOR decl stmt_list else_part KEYWORD ;
else_part : KEYWORD decl stmt_list |  ;
cond : expr compare expr ;
compare :OPERATOR ;

/* for_stmt */
for_stmt : KEYWORD OPERATOR init_expr OPERATOR cond OPERATOR incr_expr OPERATOR decl stmt_list KEYWORD ;
init_expr : assign_expr |  ;
incr_expr : assign_expr |  ;

/* Expressions */
expr : expr_prefix term  ;
expr_prefix : expr_prefix term addop |  ;
term : factor_prefix factor ;
factor_prefix : factor_prefix factor mulop |  ;
factor : primary | call_expr ;
primary : OPERATOR expr OPERATOR | id | INTLITERAL | FLOATLITERAL ;
call_expr : id OPERATOR expr_list OPERATOR  ;
expr_list : expr expr_list_tail |  ;
expr_list_tail : OPERATOR expr expr_list_tail |  ;
addop : OPERATOR ;
mulop : OPERATOR ;