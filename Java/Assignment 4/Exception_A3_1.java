import java.io.*;
public class Exception_A3_1 
{
    public static void riskyMethod() throws Exception {
        throw new Exception("This is a thrown Exception");
    }
    void multiplecatch()
    {
        try {
            int[] array = new int[5];
            array[10] = 30; // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e.getMessage());
        }
    }
    void tryCatchFinally()
    {
        try {
            int num = Integer.parseInt("Dheeraj"); 
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after NumberFormatException");
        }
    }
    void tryFinally()
    {
        try {
            System.out.println("Inside try-finally block");
        } finally {
            System.out.println("Finally block executed in try-finally combination");
        }
    }
    void nestedTry()
    {
        try {
            try {
                String str = null;
                System.out.println(str.length()); // This will cause NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Caught NullPointerException: " + e.getMessage());
            }

            try {
                riskyMethod();
            } catch (Exception e) {
                System.out.println("Caught Exception from riskyMethod: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Caught outer Exception: " + e.getMessage());
        }
    }
    void Demonstratethrows()
    {
        try {
            throw new RuntimeException("This is a thrown RuntimeException");
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws IOException 
    {
        Exception_A3_1 a31=new Exception_A3_1();
        a31.multiplecatch();
        a31.tryCatchFinally();
        a31.tryFinally();
        a31.nestedTry();
        a31.Demonstratethrows();
    }
}
