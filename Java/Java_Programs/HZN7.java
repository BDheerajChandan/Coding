/*Program to check whether a number is a Harshad number or not. Harshad 
Number is an integer that is divisible by the sum of its digits.
Input: 1729
Output: Harshad Number*/
class HZN7
{
    void main()
    {
        int n=1729;
        int s=0,d,t=n;
        while(n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        if(t%s==0)
        {
            System.out.print("HZ");
        }else{
            System.out.print("N HZ");
        }
    }
}