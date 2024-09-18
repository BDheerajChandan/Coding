//Write a program which accepts a number from keyboard and displays the maximum
//digit present in this number.

class MaxDigit
{
public void max(int number)
{
int n,max=0;
System.out.print("You have entered the number=" +number);
System.out.print("\n");
while(number>0)
{
n=number%10;
{
if(n>max)
max=n;
    }
    ;
number=number/10;
    }
    System.out.println("Maximum digit of the number=" +max);
}
    }