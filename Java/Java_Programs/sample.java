import java.io.*;
import java.math.*;
class sample
{
    public static void main(String args[])throws IOException
    {
       // InputStreamReader reader=new InputStreamReader(System.in);
        //BufferedReader input=new BufferedReader(reader);
        System.out.println("enter number of programmes");
        //int n=Integer.parse(Input.readLine());
        for(int i=1;i<=8;i++)
        {
            int ch=i;
            switch(ch)
   {    
    case 1: 
    System.out.println("program for armstrong");

    InputStreamReader reader= new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a number");
    int n=Integer.parseInt(input.readLine());

    int t=n,sum=0,d;
    while(n!=0)
    {
     d=n%10;
     sum=(sum*10)+(d*d*d);
     n=n/10;
    }
    if(sum==t)
    {
     System.out.println("is an armstrong number");
    }
    else
    {
     System.out.println("is not anarmstrong number");
    }
    break;  

    case 2:
    System.out.println("program to check wether a string is a palindrome");

    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a string");
    string str=input.readLine();

    string s=str.reverse();
    if(s==str)
    {
     System.out.println("string is a palindrome");
    } 
    else 
    {
     System.out.println("string is not a palindrome");
    }
    break; 

    case 3:
    System.out.println("print even numbers and its sum");

    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a range");
    int n=Integer.parseInt(input.readLine());

    System.out.println("even no."+"\t"+"even sum");
    int sum=0;
    for(int i=0;i<=n;i++)
    {
     if(i%2==0)
     {
      sum=sum+i;
      System.out.print(i+"\t"+sum);
     }
    }
    break;

    case 4:
    System.out.println("print odd numbers and its sum");

    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a range");
    int n=Integer.parseInt(input.readLine());

    System.out.println("odd no."+"\t"+"odd sum");
    int sum=0;
    for(int i=0;i<=n;i++)
    {
     if(i%2==1)
     {
      sum=sum+i;
      System.out.print(i+"\t"+sum);
     }
    }
    break;

    case 5:
    System.out.println("factorial of anumber");

    InputStreamReader reader=newInputStream(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a number");
    int n=Integer.parseInt(input.readLine());

    int sum=1;
    for(int i=1;i<=n;i++)
    {
     sum=sum*i;
    }
    System.out.println("factoral of a number"+n+"is ="+sum);
    break;

    case 6:
    System.out.println("print fibonacci series upto the limit");

    InputStreamReader reader=newInputStream(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a number");
    int n=Integer.parseInt(input.readLine());

    int a=0,b=1,c;
    System.out.printa(a+"\n"+b);
    for(int i=3;i<=n;i++)
    {
     c=a+b;
     System.out.println(c);
     a=b;
     b=c;
    }
    break;

    case 6:
    System.out.println("check palindrome or not");
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a number");
    int n=Integer.parseInt(input.readLine());

    int t=n,sum=0,d;
    while(n!=0)
    {
     d=n%10;
     sum=(sum*10)+d;
     n=n/10;
    }
    if(sum==t)
    {
     System.out.println(t+"is a palindrome number");
    }
    else
    {
     System.out.println(t+"is not a palindrome number");
    }
    break;

    case 7:
    System.out.println("check perfect number or not");

    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a number");
    int num=Integer.parseInt(input.readLine());

    int sum=0;
    for(int i=1;i<=num;i++)
    {
     if(i%n==0)
     {
      sum=sum+i;
     }
     if(sum==(n*2))
     {
      System.out.println("it is a perfect number");
     }
    }
    break;

    case 8: 
    System.out.println("prime number");

    InputStreamReader reader= new InputStreamReader(System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a number");
    int n=Integer.parseInt(input.readLine());

    int c=0;
    for(int i=0;i<=n;i++)
    {
     if(i%n==0)
     {
      c++;
     }
    }
    if(c==2)
    {
     System.out.println(i);
    } 
    break;

    case 9:
    System.out.println("print a string in reverse order");

    InputStreamReader reader=new InputStreamReader (System.in);
    BufferedReader input=new BufferedReader(reader);
    System.out.println("enter a string");
    String str=input.readLine();

    char ch;
    int i=str.Length();
    for(int j=i-1;j>=0;j--)
    {
     ch=charAt(j);
     System.out.print(ch);
    }
    break;

    default:
    System.out.println("we can continue the programme.Programme never ends.");
    System.exit(0);
   }
  }
 }
}