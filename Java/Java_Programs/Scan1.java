import java.util.Scanner;  
public class Scan1 {
    public  void scanning() {
    Scanner input = new Scanner(System.in);
    int n;
    double d;
    String word;
    String line;
    System.out.print("Enter integer number, double type number, Word, Line");
    n = input.nextInt();
    d = input.nextDouble();
    word = input.next();     // returns a String up to next whitespace
    line = input.nextLine(); // returns rest of line & vanishes the '\n'
        System.out.println(+n + ":" + d + ":" + word + ":" + line); 
    }
}



