import java.io.*;
class measure
{
private float kilometre;
private float metre;
private float centimetre;
private float millimetre;
measure(float a, float b, float c, float d)
{
kilometre = a;
metre = b;
centimetre = c;
millimetre = d;
}
void outputdata()
{
System.out.println("length = " +kilometre+metre+centimetre+millimetre);
}
}
class measurement
{
public void main()
{
measure distance = new measure(10.0, 15.0, 17.5, 35.5);
System.out.println("Total Length = ");
distance.display();
}
}