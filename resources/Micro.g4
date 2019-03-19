// Define a grammar called Micro
grammar Micro;

authors:'OSAMA ABUAMDAN' 'SAAD JALOWDI';

KEYWORD: 'PROGRAM1' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' |'ENDIF' | 'FOR' |'ENDFOR' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;
IDENTIFIER: ('A'..'Z'|'a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')* ;
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines
INTLITERAL : '0'|('1'..'9')('0'..'9')* ;
FLOATLITERAL : ('0'|(('1'..'9')('0'..'9')*)).('0'|(('0'..'9')*)('1'..'9')) ;
STRINGLITERAL : '"' .*? '"' ;
COMMENT : '--' .*? '\n'  -> skip ;

OPERATOR : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ;


//PARSER RULES

/*	Program	*/
program	:	'PROGRAM'	id	'BEGIN'   pgm_body    'END' ;
id	:	IDENTIFIER ;
pgm_body    :	decl    func_declarations ;
decl    :	string_decl	decl        #StringDecl
            |var_decl	decl	    #StringDecl
            |	                    #NoDecl
            ;

/*	String	Declaration	*/
string_decl	:	'STRING'	id	':='	str	';';
str	    :	STRINGLITERAL ;


/*	Variable	Declaration	*/
var_decl    :	var_type	id_list	';';
var_type	:	'FLOAT'         #FloatKeyWord
                |'INT'          #FloatKeyWord
                ;

any_type	:	var_type        #FloatOrIntVarType
	            |'VOID'         #VoidKeyWord
	            ;

id_list	    :	id	id_tail ;
id_tail		:	','	id	id_tail         #IDTail
                |                       #NoTail
                ;

/*	Function	Parameter	List	*/
param_decl_list		:param_decl	param_decl_tail     #ParamDeclList
                     |                              #NoParamList
                     ;
param_decl  :	var_type	id ;
param_decl_tail	    :',' param_decl	param_decl_tail     #ParamDeclTail
	                 |                                  #NoParamTail
	                 ;

/*	Function	Declarations	*/
func_declarations		:func_decl	func_declarations       #FuncDecl
	                    |                                   #NoFuncDecl
	                    ;

func_decl	:	'FUNCTION'	any_type	id	'(' param_decl_list ')'	'BEGIN'	func_body	'END' ;
func_body	:	decl	stmt_list ;

/*	Statement	List	*/
stmt_list	:stmt	stmt_list	        #StatmnetList
             |                          #NoStatmnetList
             ;

stmt	    :basic_stmt                 #BasicStatment
		    |if_stmt                    #IfStatment
		    |for_stmt                   #ForStatment
		    ;

basic_stmt	:assign_stmt            #AssignStatment
	        |read_stmt              #ReadStatment
	        |write_stmt             #WriteStatment
	        |return_stmt            #ReturnStatment
	        ;

/*	Basic	Statements	*/
assign_stmt		:	assign_expr	';' ;
assign_expr	    :	id	':='	expr ;
read_stmt	    :	'READ'	'('id_list')' ';';
write_stmt	    :	'WRITE'	'(' id_list	')' ';';
return_stmt	    :	'RETURN'	expr  ';';

/* if_stmt */
if_stmt : 'IF' '(' cond ')' decl stmt_list else_part 'ENDIF' ;
else_part : 'ELSE' decl stmt_list           #ElsePart
            |                               #NoElsePart
            ;

cond : expr compare expr ;
compare : '='               #Equals
        | '!='              #NotEquals
        | '<='              #LE
        | '>='              #GE
        | '<'               #LT
        | '>'               #GT
        ;

/* for_stmt */
for_stmt : 'FOR' '(' init_expr ';' cond ';' incr_expr ')' decl stmt_list 'ENDFOR' ;
init_expr : assign_expr         #InitAssignExpr
            |                   #NoInitAssignExpr
            ;
incr_expr : assign_expr         #IncrAssignExpr
            |                   #NoIncrAssignExpr
            ;

/* Expressions */
expr : expr_prefix term  ;
expr_prefix : expr_prefix term addop        #ExprPrefix
            |                               #NoExprPrefix
            ;
term : factor_prefix factor ;
factor_prefix : factor_prefix factor mulop          #FactorPrefix
              |                                     #NoFactorPrefix
              ;
factor : primary                #PrimaryFactor
       | call_expr              #CallExpr
       ;
primary : '(' expr ')'              #Expr
        | id                        #Id
        | INTLITERAL                #IntLit
        | FLOATLITERAL              #FloatLit
        ;
call_expr : id '(' expr_list ')'  ;
expr_list : expr expr_list_tail     #ExprList
           |                        #NoExprList
           ;
expr_list_tail : ',' expr expr_list_tail        #ExprTail
               |                                #NoExprTail
               ;
addop : '+'                                     #Plus
      | '-' ;                                   #Minus
mulop : '*'                                     #Mul
      | '/' ;                                   #Div