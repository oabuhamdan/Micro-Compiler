// Define a grammar called Micro
grammar Micro;
osama:;
IDENTIFIER : (('A'..'Z')|('a'..'z'))(('A'..'Z')|('a'..'z')|('0'..'9'))* ;
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines
INTLITERAL : ('1'..'9')('0'..'9')* ;
FLOATLITERAL : INTLITERAL.('0'..'9')('1'..'9')* ;
STRINGLITERAL : '"' .*? '"' ;
COMMENT : '--' .*? ;
KEYWORD: 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' |'ENDIF' | 'FOR' |'ENDFOR' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;

OPERATOR : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ;
