class dowhileloop
{
public void main(float N)
{
int i;

double fact;
fact=1;
i = 1;
while(i <=N)
{
fact = fact*i;
i++;
}
System.out.print("The factorial of the Number is" +fact);
}
}