parser grammar PipeLineItParser;

options{
    language=Java;
    tokenVocab=PipeLineItLexer;
}


dependendies
    :
        (dependency)?
    ;

dependency
    :
	 REQUIRE_DETAIL
    ;


tasks
    :
        (task)?
    ;

task
    :
        (LABEL_TASK WHITESPACE WORD)
    ;

jobs
    :
      (job)?
    ;

job
    :
        LABEL_JOB (WHITESPACE WORD)
    ;

header
    :
        ID WORD INTEGER
    ;
	

onSuccess
    :
        
    ;

onError
    :
        
    ;
