grammar SST;

//parser
sstinput : statement*;
statement : (read
           | print
           | assignmentstatement
           | copysignal
           | comparesignals
           | clearsignal
           | identifierbrackets
           | printeigenrays
           | quit
            );

read : Read String;
print : Print (Identifier | String);
clearsignal : ClearSignal Identifier;
quit : Quit;
copysignal : CopySignal copysignalvalue;
assignmentstatement : assignment;
comparesignals : CompareSignals ((Identifier Identifier) | brackets | parenthesis);
identifierbrackets : Identifier (Identifier | parenthesis | brackets);
printeigenrays : (PrintEigenrays | PrintGSMEigenrays) brackets?;

assignment : New? Identifier Equals assignmentvalue;

assignmentvalue : (Identifier | String)
      | ((Double | Float) Colon)? Number
      | (Bool Colon)? (True | False)
      | (Identifier Colon?)? (parenthesis | brackets)
      | Dollar LB Identifier RB //bottom = ${bottom}
      ;

brackets : '{' assignment* '}';
parenthesis : LP (parenthesis | brackets | Number | Identifier (Colon? brackets)? | String)* RP;
copysignalvalue : parenthesis
                | Identifier (Colon? brackets)? Identifier (Colon? brackets)? Number?
                | brackets
                ;



//Lexer
Quit :'quit';
Read : 'read';
Print : 'print';
New : 'new';
Equals : '=';
Colon : ':';
Double : 'double';
Float : 'float';
Bool : 'bool';
True : 'true';
False : 'false';
Dollar : '$';
String : '"' ~('\r' | '\n' | '"')* '"' ;
LP :'(';
RP :')';
LB :'{';
RB :'}';
CopySignal : 'CopySignal';
CompareSignals : 'CompareSignals';
ClearSignal : 'ClearSignal';
PrintEigenrays : 'PrintEigenrays';
PrintGSMEigenrays : 'PrintGSMEigenrays';

Identifier : Letter ValidIdChar*;

Number : ('+' | '-')? (Digit+ ('.' Digit*)? | (Digit* '.')? Digit+) ('e' '-'? Digit+)? ;


fragment
ValidIdChar : Letter|Digit|'_' | '.';

fragment
Letter : [a-zA-z$_];

fragment
Digit : [0-9$_];

WhiteSpace : [ \t\n\r;,.]+ -> skip; // skip spaces, tabs, newlines
MulitlineComment :   '/*' .*? '*/' -> channel(1);
SinglelineComment :   ('//' | '#') ~[\r\n]* -> channel(1);