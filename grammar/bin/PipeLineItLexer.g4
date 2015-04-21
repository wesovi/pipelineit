lexer grammar PipeLineItLexer;
options{
     
}
tokens {
    
}
OPEN_PAREN      : '(' -> pushMode(NON_CONJUNCTION) ;
CLOSE_PAREN     : ')' -> popMode;
OPEN_BRACKET    : '[' -> pushMode(NON_CONJUNCTION) ;
CLOSE_BRACKET   : ']' -> popMode ;
OPEN_CURLY      : '{' -> pushMode(JOB) ;
CLOSE_CURLY     : '}' -> popMode ;
DASH            : '-' ;
SINGLE_QUOTE    : '\'' ;
DOUBLE_QUOTE    : '"' ;
SPACE           : ' ' ;
ENDLINE         : '\n';


//Operations
AND             :   '&&'    ; 
OR              :   '||'    ;
THEN            :   '->'    ;

SYMBOLS         :  (OPEN_PAREN | CLOSE_PAREN | OPEN_BRACKET | CLOSE_BRACKET | OPEN_CURLY | CLOSE_CURLY |DASH )+ ;

OPERATOR        :  (AND || OR);

ID              : [a-zA-Z0-9]* ;
INTEGER         : ('0'..'9')+;
WORD            : (LETTER)+;
TEXT            : (WORD | INTEGER | SYMBOLS |SPACE)+;



//Expressions
EXPRESSIONS     :   (EXPRESSION)+;
EXPRESSION      :   FUNCTION (OPERATOR EXPRESSIONS)?;

//Types
C_ENDLINE       : '\n' -> type(ENDLINE);
C_SINGLE_QUOTE  : '\'' -> type(SINGLE_QUOTE);
C_DOUBLE_QUOTE  : '"' -> type(DOUBLE_QUOTE);



FUNCTION        :   ;
    

LABEL_REQUIRE   : 'require';
LABEL_TASK      : 'task';
LABEL_JOB       : 'job';




OPEN_COMMENT         : '#'->pushMode(COMMENT_MODE);
mode COMMENT_MODE;
COMMENT_CLOSE   : (TEXT)? -> popMode ;


NC_OPEN_CURLY : '{' -> type(OPEN_CURLY), pushMode(task) ;
NC_CLOSE_CURLY : '}' -> type(CLOSE_CURLY), popMode ;


mode STEP_MODE;





fragment DIGIT: '0'..'9';
fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;