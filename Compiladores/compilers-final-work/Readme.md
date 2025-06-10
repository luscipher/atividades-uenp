# Grammar Documentation for Lang
This is the documentation for the grammar Lang, which defines a programming language. The grammar is defined using Extended Backus-Naur Form (EBNF) notation.

## Program Structure
A program in Lang consists of a series of functions and a series of statements.

```
prog: functions line+;
```
functions represents a series of functions, and line+ represents one or more statements. The prog rule is the top-level rule of the grammar.

## Functions
Functions in Lang are defined with the following syntax:
```
function: FUNCTION VAR '(' params ')' fnBlock;
```
A function definition starts with the keyword function, followed by the function name (VAR) and a list of parameters (params) in parentheses. The function body is enclosed in curly braces (fnBlock).

## Function Body
A function body consists of one or more lines of code, separated by semicolons. A function body can also contain a return statement.
```
fnBody: line | line fnBody | RETURN expr EOL | RETURN EOL;
```
A function body can be a single line (line), or it can be multiple lines (line fnBody). The RETURN statement is used to return a value from the function. It can be followed by an expression (expr) or it can be alone.

## Parameters
Function parameters are defined as a comma-separated list of variable names.
```
params: VAR | VAR SEP params;
```
The params rule allows for a single variable name (VAR), or a comma-separated list of variable names (VAR SEP params). The rule also allows for an empty list of parameters.

## Statements
Lang supports several types of statements, including variable assignment, input/output, and function invocation.
```
stmt: atrib | input | output | funcInvoc;
```
The stmt rule can represent a variable assignment (atrib), an input statement (input), an output statement (output), or a function invocation (funcInvoc).

## Input and Output
Lang supports several types of input/output statements, including reading a variable from the user, printing a string, and printing a variable or expression.
```
input: tipo READ VAR;
output: WRITE VAR | WRITE STR | WRITE expr;
```
The input rule consists of a type (tipo), the READ keyword, and a variable name (VAR). The output rule can print a variable (WRITE VAR), a string (WRITE STR), or an expression (WRITE expr).

## Types
Lang supports several basic types, including int, float, string, and bool.
```
tipo: 'int' | 'string' | 'float' | 'bool';
```
The tipo rule defines the basic types that are supported in Lang.

## Control Flow
Lang supports several types of control flow statements, including if, while, and for.

## If Statement
An if statement allows for conditional execution of code.
```
ifst: IF '(' cond ')' THEN block | IF '(' cond ')' THEN b1=block ELSE b2=block;
```
The ifst rule consists of the keyword IF, followed by a condition (cond) in parentheses, and a block of code (block). The THEN keyword separates the condition from the block. An if statement can also include an ELSE block (b2=block).

## While Statement
A while statement allows for repeated execution of code as long as a condition is true.
```
whilest:
      WHILE '(' cond ')' block                    # whilestWhile
    | DO block WHILE '(' cond ')'                 # whilestDoWhile
```
## For loop
A for loop allows the program to execute a set of statements repeatedly for a fixed number of times.
```
forst:
      FOR '(' atrib? ';' cond? ';' atrib? ')' block  # forstFor
```
## Blocks
A block is a set of statements enclosed within curly braces.
```
block:
     '{' line+ '}'                # blockLine
```

## Conditionals
A conditional statement allows the program to execute a set of statements based on a certain condition.
```
cond: 
      expr                        # condExpr
    | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr       # condRelop
    | c1=cond AND c2=cond         # condAnd
    | c1=cond OR c2=cond          # condOr
    | NOT cond                    # condNot
```
## Assignments
An assignment statement allows the program to assign a value to a variable.
```
atrib: 
     tipo VAR '=' expr            # atribVar
    | tipo VAR '=' STR            # atribVarStr
```
## Expressions
An expression is a combination of one or more terms.
```
expr: 
      term '+' expr         # exprPlus
    | term '-' expr         # exprMinus
    | term                  # exprTerm
```
## Terms
A term is a combination of one or more factors.
```
term: 
      factor '*' term       # termMult
    | factor '/' term       # termDiv
    | factor                # termFactor
```
## Factors
A factor is a basic unit of expression, which can be a variable, a number or a sub-expression enclosed within parentheses.
```
factor: 
     '(' expr ')'           # factorExpr
    | VAR                   # factorVar
    | NUM                   # factorNum
```
## Exemples
```
function fat (fatorial,n){

      for (int i = 1;i <= n; int i = (i + 1)) {
          int fatorial = fatorial * i;
        }

      write fatorial;

}


int fatorial = 1;
int n = 5;

write "fatorial de: ";
write n;

fat(fatorial, n);

write "verificação de tipo:";
int read a;
```
