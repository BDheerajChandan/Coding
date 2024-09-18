
//Extracting Characters from a String.
import java.lang.*;
public class Ever33
{
public void main()
{
String str =    "I am Poonam Mehta. " +
                "I read in O P J Senior Model School, " +
                "Fatehabad, Haryana";
int beginning = 5;
int end = 17;
char a [] = new char [end - beginning];
str.getChars(beginning, end, a, 0);         
System.out.println(a);
}
}

