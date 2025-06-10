using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

class Program {
    static void Main(string[] args) {

        //### input        
        var inputStream = new AntlrFileStream("input.lang");
        var lexer = new GoHorseLexer(inputStream);


        var tokens = new CommonTokenStream(lexer);
        var parser = new GoHorseParser(tokensStream);


        var tree = parser.program();

        var errorListener = new GoHorseErrorListener();
        parser.RemoveErrorListeners();
        parser.AddErrorListener(errorListener);
        parser.ErrorHandler = new DefaultErrorStrategy();

        var semanticListener = new SemanticGoHorseListener();
        parser.RemoveParseListeners();
        parser.AddParseListener(semanticListener);
        try
        {
            tree = parser.program();
            if (errorListener.HasErrors){
                Console.WriteLine("Errors!");
                errorListener.ErrorMessages.ForEach(e => Console.WriteLine(e));
                tree = null;
            }
            if (semanticListener.HasErrors){
                Console.WriteLine("Semantic Errors!");
                semanticListener.ErrorMessages.ForEach(e => Console.WriteLine(e));
                tree = null;
            }
            
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
        }

        if (tree != null)
        {
            var interpreter = new GoHorseInterpreter(semanticListener.Functions);
            interpreter.Visit(tree);
        }
    }
}

internal class GoHorseErrorListener
{
    public GoHorseErrorListener()
    {
    }
}