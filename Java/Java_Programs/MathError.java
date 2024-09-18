
class MathError
{
    public void main()
    {
    int numerator,denominator;
    try
    {
    denominator = 0;
    numerator = 100/denominator;
    System.out.println("I can't print what you asked!");
    }
    catch(ArithmeticException e)
    {
    System.out.println("Division by Zero is Not Acceptable");
    }
    System.out.println("Statement After Catch ");
    }
    }
	