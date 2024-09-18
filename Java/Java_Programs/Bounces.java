public class Bounces
{
public  void bounces(double height)
{
int count = 0;
System.out.println("Enter Value of height =" +height);
do
{
height = height*0.9;
count++;
}
while(height>0.5);
System.out.println("Number of Bounces =" +count);
}
}

