//Simple Calculator Using switch...case
import java.io.*;
import java.util.*;
class Calculator_10
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 2 numbers : ");
        System.out.print("1st number : ");
        int a=sc.nextInt();
        System.out.print("2nd number : ");
        int b=sc.nextInt();
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for substarction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 for reminder");
        System.out.println("Please enter the choice : ");
        int ch=sc.nextInt();
        float result=0;
        switch(ch)
        {
            case 1:
            result=a+b;
            break;
            
            case 2:
            result=a-b;
            break;
            
            case 3:
            result=a*b;
            break;
            
            case 4:
            result=(float)a/(float)b;
            break;
            
            case 5:
            result=a%b;
            break;
            
            default:
            System.out.println("Invalid choice");
        }
        System.out.println("Selected Choice "+ch+" result : "+result);
    }
}