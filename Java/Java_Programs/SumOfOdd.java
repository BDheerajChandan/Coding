//Write a program which accepts a number from keyboard and displays the sum
//of odd digits present in this number.

class SumOfOdd
{
public void odd(int number)
{
int n,s=0;
System.out.print("You have entered the number=" +number);
System.out.print("\n");
while(number>0)
{
n=number%10;
if(n%2 != 0)
s=s+n;
number=number/10;
    }
    System.out.println("Sum of Even Digits of the number=" +s);
}
    }