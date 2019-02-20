// Define a grammar called Micro
grammar Micro;

author:'OSAMA ABUAMDAN';
KEYWORD: 'PROGRAM' | 'BEGIN' | 'END' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'ELSE' |'ENDIF' | 'FOR' |'ENDFOR' | 'RETURN' | 'INT' | 'VOID' | 'STRING' | 'FLOAT' ;

IDENTIFIER: ('A'..'Z'|'a'..'z')('A'..'Z'|'a'..'z'|'0'..'9')* ;
WS : (' '|'\t'|'\r'|'\n')+ -> skip ;  // skip spaces, tabs, newlines
INTLITERAL : '0'|('1'..'9')('0'..'9')* ;
FLOATLITERAL : ('0'|(('1'..'9')('0'..'9')*)).('0'|(('0'..'9')*)('1'..'9')) ;
STRINGLITERAL : '"' .*? '"' ;
COMMENT : '--' .*? '\n';

OPERATOR : ':=' | '+' | '-' | '*' | '/' | '=' | '!=' | '<' | '>' | '(' | ')' | ';' | ',' | '<=' | '>=' ;
