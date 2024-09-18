import java.lang.*;
class Arrworking
{
public  void main()
{
int[] number = new int[51];
for(int i=0; i<number.length; i++)
number[i] = i;
int sum =0;
for(int i=0; i<number.length; i++)
sum +=number[i];
System.out.println(sum);
}
}
