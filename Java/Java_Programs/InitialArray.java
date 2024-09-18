class InitialArray
{
public void main()
{
String pubname = "EVERGREEN PUBLICATIONS";

double sales[] = {20.0,35.2,75.0};
double average = 0.0;

for (int i = 0; i<3; i++)

average = average +sales[i];
average = average/(float)3;
System.out.println(pubname + " has Sales Average =" +average);
}
}
