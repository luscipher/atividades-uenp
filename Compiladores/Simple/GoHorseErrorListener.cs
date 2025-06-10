using Antlr4.Runtime;
using Antlr4.Runtime.Dfa;

public class GoHorseListener : BaseErrorListener
{
    public void SyntaxError(IRecognizer recognizer, int offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        Console.Error.WriteLine($"Syntax error at line {line}, column {charPositionInLine}: {msg}");
    }

    public void ReportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, bool exact, Antlr4.Runtime.Sharpen.BitSet ambigAlts, Antlr4.Runtime.Atn.ATNConfigSet configs)
    {
        Console.Error.WriteLine($"Ambiguity error at index {startIndex}-{stopIndex}");
    }

    public void ReportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, Antlr4.Runtime.Sharpen.BitSet conflictingAlts, Antlr4.Runtime.Atn.ATNConfigSet configs)
    {
        Console.Error.WriteLine($"Attempting full context error at index {startIndex}-{stopIndex}");
    }

    public void ReportContextSensitivity(Parser recognizer, Antlr4.Runtime.Dfa.DFA dfa, int startIndex, int stopIndex, int prediction, Antlr4.Runtime.Atn.ATNConfigSet configs)
    {
        Console.Error.WriteLine($"Context sensitivity error at index {startIndex}-{stopIndex}");
    }
}
