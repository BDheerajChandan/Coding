import java.util.Scanner;
import java.io.*;          
public class Scan {
  public void scanning(){
    Scanner in = new Scanner(System.in);
    int integer;
    long longInteger;
    float realNumber;
    String string1;
    String string2;
    System.out.println("Enter an integer");
    integer = in.nextInt();
    System.out.println("Enter a Long integer");
    longInteger = in.nextLong();
    System.out.println("Enter a Float Number");
    realNumber = in.nextFloat();
    System.out.println("Enter a string.");
    string1 = in.nextLine();
    System.out.println("Now enter another value.");
    string2 = in.next();
    System.out.println("You have entered: ");
    System.out.println(integer + " " + longInteger + " " + realNumber +" "  + " " + string1 + " and " + string2);
    }
}

