// Use of toCharArray()
import java.lang.*;
public class Ever35
{
public void main()
{
String str =    "I am Poonam Mehta. " +
                "I read in O P J Senior Model School, " +
                "Fatehabad, Haryana";
int beginning = 5;
int end = 17;
char a [] = new char [end - beginning];
byte b [] = new byte[20];
str.getChars(beginning, end, a, 0); 
str.getBytes(5,17,b, 0);         
System.out.println("The getBytes characters are = " +b);
String str1 = "Malhotra & Malhotra";
System.out.println(str1.toCharArray());
}
}

