//Method Return Values

import java.io.*;
class CalAverage
{float average(int n1, int n2, int n3, int n4)
{
float localaverage;
localaverage = (float)(n1+n2+n3+n4)/4;
System.out.println(localaverage);
return localaverage;
}
}
class findAvg
{
public void main() 
{
CalAverage a = new CalAverage();
int n1=10;
int n2=20;
int n3=30;
int n4=40;

float meanval;
meanval = a.average(n1,n2,n3,n4);
System.out.println("Average =" +meanval);
}
}
