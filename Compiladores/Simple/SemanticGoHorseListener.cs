namespace Simple
{
public class GoHorseSemanticListener : GoHorseBaseListener
{
    public override void ExitVarDecl(GoHorseParser.VarDeclContext context)
    {
        string id = context.ID().GetText();
        string type = context.type().GetText();
        int size = 1;
        if (context.ARRAY_SIZE() != null)
        {
            size = int.Parse(context.ARRAY_SIZE().GetText().Trim('[', ']'));
        }
        // TODO: Add code to store the variable declaration
    }

    public override void ExitAssignment(GoHorseParser.AssignmentContext context)
    {
        string id = context.ID().GetText();
        object value = Visit(context.expr());
        // TODO: Add code to store the variable assignment
    }

    public override object VisitExpr(GoHorseParser.ExprContext context)
    {
        if (context.OR() != null)
        {
            bool left = (bool)Visit(context.orExpr());
            bool right = (bool)Visit(context.term());
            return left || right;
        }
        else
        {
            return Visit(context.term());
        }
    }

    public override object VisitTerm(GoHorseParser.TermContext context)
    {
        if (context.MULT() != null)
        {
            object left = Visit(context.term());
            object right = Visit(context.factor());
            if (left is int && right is int)
            {
                return (int)left * (int)right;
            }
            else if (left is double || right is double)
            {
                return Convert.ToDouble(left) * Convert.ToDouble(right);
            }
            else
            {
                throw new Exception("Unsupported operand types for multiplication");
            }
        }
        else
        {
            return Visit(context.factor());
        }
    }

    public override object VisitFactor(GoHorseParser.FactorContext context)
    {
        if (context.ID() != null)
        {
            string id = context.ID().GetText();
            // TODO: Add code to retrieve the value of the variable
        }
        else if (context.NUMBER() != null)
        {
            string number = context.NUMBER().GetText();
            if (number.Contains("."))
            {
                return double.Parse(number);
            }
            else
            {
                return int.Parse(number);
            }
        }
        else if (context.STRING() != null)
        {
            return context.STRING().GetText().Trim('"');
        }
        else
        {
            return Visit(context.expr());
        }
    }
}
}