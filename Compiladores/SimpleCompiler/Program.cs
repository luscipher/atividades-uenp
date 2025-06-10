using SimpleComp.Lexer;
using SimpleComp;
using SimpleComp.Parser;

var st = new SymbolTable();
var basicLexer = new BasicLexer("docs/example.lang", st);
var basicParser = new BasicParser(basicLexer, st);

basicParser.Prog();

Console.WriteLine(st);