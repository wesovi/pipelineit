lexer grammar PipeLineItLexer;
options{
     
}
tokens{
    LABEL_REQUIRE
}

WS : [ \t\r\n]+ -> skip ;
ID : [a-zA-Z] [a-zA-Z0-9]* ;
DASHBRACK : [\-\]]+ ;
LABEL_REQUIRE     : 'require';
LABEL_TASK        : 'task';
LABEL_JOB         : 'job';
EOL               : '\n';

INTEGER     : ('0'..'9')+;
WORD        : (LETTER)+;

WHITESPACE  : [ \t]+ ;

COMMENT     : '#' ((WORD | INTEGER | WHITESPACE)+)? -> skip ;
JOB_DETAIL  : (LABEL_JOB WHITESPACE WORD);
REQUIRE_DETAIL  : (LABEL_REQUIRE WHITESPACE WORD);


fragment DIGIT: '0'..'9';
fragment LETTER : [a-zA-Z\u0080-\u00FF_] ;