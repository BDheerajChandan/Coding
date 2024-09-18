//Write a program to sum up the square roots of the digits of a given number.

class SumSquareRoot
{
public void ssroot(int number)
{
double n,s=0;
System.out.print("Entered Number is=" +number);
while(number>0)
{
n=number%10;

s=s+Math.sqrt(n);
number=number/10;
    }
    System.out.println("Sum of Square Roots of each digit of number=" +s);
}
    }
