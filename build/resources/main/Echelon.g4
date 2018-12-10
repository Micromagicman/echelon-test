grammar Echelon;

@header {
    package parser;
}

program: line* EOF ;
line: ('\n' | expression ('\n' | EOF) | assignment ('\n' | EOF)) ;
assignment : VARIABLE '=' expression ;
expression : '(' expression ')'                   #parenthesisExpression
           | MIN expression                       #unaryExpression
           | left=expression op1 right=expression #firstPriorityExpression // Операции первого приоритета
           | left=expression op2 right=expression #secondPriorityExpression // Операции второго приоритета
           | number=NUMBER                        #numericExpression
           | variable=VARIABLE                    #variableExpression
           ;
op1 : MUL | DIV ;
op2 : ADD | MIN ;

COMMENT : '//' ~[\r\n]* -> skip ;
WHITESPACE : [ \t\r]+ -> skip ;
NUMBER     : [0-9]+ ;
VARIABLE   : [a-zA-Z][a-zA-Z0-9]* ;
MUL        : '*' ;
DIV        : '/' ;
ADD        : '+' ;
MIN        : '-' ;