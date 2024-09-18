class whileloop
{
public void whileloop(int value)
{
int r_digit;
if (value <=0)
return;
while(value !=0)
{
r_digit = value%10;
System.out.print(r_digit);
value = value/10;
}
}
}


