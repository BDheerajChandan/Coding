import java.util.Scanner;  
public class Scan_1 {
    public  void scanning() {

	Scanner input = new Scanner(System.in);
	int a;
	double x;
	String word;
	String line;

	System.out.print("Enter int, double, word, line: ");
	a = input.nextInt();
	x = input.nextDouble();
	word = input.next();     // returns a String up to next whitespace
        line = input.nextLine(); // returns rest of line & eats the '\n'

        System.out.println(a + ":" + x + ":" + word + ":" + line); 
    }
}
