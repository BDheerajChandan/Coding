//Find largrest of given 3 numbers
import java.io.*;
import java.util.*;
class BigOf3_9
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        System.out.print("1st number :");
        int n1=sc.nextInt();
        System.out.print("2nd number :");
        int n2=sc.nextInt();
        System.out.print("3rd number :");
        int n3=sc.nextInt();
        System.out.print("\nEntered numbers : "+n1+", "+n2+", "+n3);
        int bigNum;
        if(n1>n2 && n1>n3)
        {
            bigNum=n1;
        }
        else if(n2>n1 && n2>n3)
        {
            bigNum=n2;
        }else{
            bigNum=n3;
        }
        /*if(n1>n2)
        {
            if(n1>n3)
            {
                bigNum=n1;
            }else{
                bigNum=n3;
            }
        }else{
            if(n2>n3)
            {
                bigNum=n2;
            }else{
                bigNum=n3;
            }
        }*/
        System.out.println("\nLargest Number : "+bigNum);
    }
}