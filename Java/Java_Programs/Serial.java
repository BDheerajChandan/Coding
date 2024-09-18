
class Serial
{
private int Serialcode;
private int Noofepisodes;
private char Title[] = new char[20];
private double Duration;
public Serial()
{
Duration = 30.0;
Noofepisodes = 10;
}
void Newserial()
{
System.out.println("Serial Code");
System.out.println("Title");
}
void Otherentries(double a, int b)
{
a=Duration;
b=Noofepisodes;
}
void Dispdata()
{
System.out.println("Serial Code=" +Serialcode);
System.out.println("Title is ");
System.out.println(Title);
System.out.println("Duration is " +Duration);
System.out.println("No of Episodes= " +Noofepisodes);
}
}
