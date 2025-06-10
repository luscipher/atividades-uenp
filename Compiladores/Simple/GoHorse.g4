grammar GoHorse;

// Tokens
EOL: [\r\n]+;                           //Fim de Linha
NUMBER: [0-9]+('.'[0-9]+)?;
INT : [0-9]+;
FLOAT_NUM : [0-9]+ '.' [0-9]*;
INTEGER : 'integer';              
FLOAT : 'float';                    
BOOLEAN : 'boolean';
BOOL_TRUE : 'true';
BOOL_FALSE : 'false';
STRING : 'string'| '"' .*? '"';
ARRAY : 'array';
CUSTOM_TYPE : [A-Z][a-zA-Z0-9]*;        //dados personalizados 
REFERENCE : '&';                        //Referencia
READ : 'readln';                        //Lê Entrada
WRITE : 'writeln';                      //Imprime Valor
ID : [a-zA-Z][a-zA-Z0-9]*;              //Identificador
ARRAY_SIZE : '[' INT ']';
COMMA : ',';
COLON : ':';
ASSIGN : '=';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '{';
RBRACKET : '}';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
AND : '&&';
OR : '||';
NOT : '!';
EQ : '==';
NEQ : '!=';
LT : '<';
GT : '>';
LTE : '<=';
GTE : '>=';

// Parser rules
program:( stat     
        | func)*;           
//declarçoes
stat: readln      
    | writeln     
    | ifStat      
    | whileStat     
    | untilStat     
    | forStat       
    | varDecl     
    | assignment; 
readln : READ LPAREN ID (REFERENCE)? RPAREN                                     //Lê Entrada :: readln(ID Referencia)
       | 'writeln' LPAREN (expr | STRING)? RPAREN ';';                              // :: writeln(expreçao) (nome);
writeln : WRITE LPAREN expr RPAREN                                              //Imprime Saida writeln(expreçao)
        | 'readln' LPAREN ID RPAREN ';';                                            // :: readln(ID Referencia) (nome);
ifStat: 'if' LPAREN expr RPAREN program ('else' program)?;                      //Laço de Repetiçao IF :: if(expreçao)program else programa
whileStat: 'while' LPAREN expr RPAREN program;                                  //Laço de Repetiçao While :: while(expreçao)program 
untilStat: 'repeat' program 'until' LPAREN expr RPAREN (';' | EOL);             //Laço de Repetiçao Until :: repeat program until(expreçao);
forStat: 'for' LPAREN assign ';' expr ';' assign RPAREN program;                //Condiçao FOR :: for
assign: ID ('[' expr ']')? '=' expr ';';                                        //Atribuição
varDecl : type ID (ARRAY_SIZE)? (ASSIGN expr)?                                  //Declaração Variavel :: string nome 5 =
        | type ID ';' ;                                                             //:: string luisa;
assignment : refeExpr ASSIGN expr                                               //Atribui  ::  lusc& = 
           | ID '=' expr ';';                                                       // nome = luisa;
refeExpr : ID REFERENCE?;                                                       //Expreção Referencia :: Lusc &
func: 'func' ID LPAREN params RPAREN (':' type)? program;                       //Funçoes :: func create(13:int):intwriteln
params: param (COMMA param)* | ;                                                //Parametros :: 13:int,13:int ????
param: ID ':' type;                                                             //Parametro :: 13:int
orExpr : andExpr (OR andExpr)*;                                                 //Expreção OU
andExpr : equalExpr (AND equalExpr)*;                                           //Expreção E
equalExpr : relatExpr ((EQ | NEQ) relatExpr)*;                                  //Expreção Igualdade
relatExpr : addExpr ((LT | GT | LTE | GTE) addExpr)*;                           //Expreção relacional, exp:
addExpr : multExpr ((PLUS | MINUS) multExpr)*;                                  //Expreção adiçao, exp:
multExpr : unary_expr ((MULT | DIV | MOD) unary_expr)*;                         //Expreção multicional, exp:

//Expreçao Unaria
unary_expr : (PLUS | MINUS) unary_expr                                  
           | NOT unary_expr
           | primary_expr;

//Expreçoes Primarias :: (expreçao)
primary_expr: LPAREN expr RPAREN
            | refeExpr
            | INT
            | FLOAT_NUM
            | BOOL_TRUE
            | BOOL_FALSE;

//Expreçoes:
expr: orExpr           
    | term                     
    | expr '+' term     
    | expr '-' term;
//termos:
term:
     factor                      
     | term '*' factor           
     | term '/' factor          
     | term '%' factor;
//fatores:
factor:
       ID
     | NUMBER
     | STRING
     | LPAREN expr RPAREN;
//tipos:
type : INTEGER
     | FLOAT
     | BOOLEAN
     | STRING
     | ARRAY type
     | CUSTOM_TYPE
     | ID;

// Lexer rules
COMMENT : '//' ~[\r\n]* -> skip;
WS : [ \t\r\n]+ -> skip;