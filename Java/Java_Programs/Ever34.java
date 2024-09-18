//Extracting Characters from a String.
import java.lang.*;
public class Ever34
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

}
}                 

