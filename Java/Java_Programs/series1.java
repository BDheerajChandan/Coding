//to find the sum of series x/1! +x/2! +x/3! +.....+x/n!
import java.lang.*;
class series2
{
public void series(int x, int n)
{
double p;
p=1;
int i,j=1;
double sum1=1;
for(i=1; i<=n; i++)
p=Math.pow(x,n);

sum1=sum1+p;
System.out.println("Sum of the Series=" +sum1);

}
}
