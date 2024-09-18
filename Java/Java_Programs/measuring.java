//Default  Constructor with initialisation of values.
import java.io.*;
class measuring
{
private double kilometre;
private double metre;
private double centimetre;
private double millimetre;
measuring()
{
kilometre = 10.0;
metre = 120;
centimetre = 12.0;
millimetre = 5.0;
}
void outputdata()
{
System.out.println("Length = "  +kilometre + " Kilometre " +metre + " Metre ");
System.out.print(+centimetre + " Centimeter " +millimetre + " Millimetre");
}
}                   
