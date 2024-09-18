import java.io.*;
class ExamScores{
  public static void main(String args[]) throws IOException{
  int arr[] = new int[10];
  BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the number of Students");
  String n = buf.readLine();
  int number = Integer.parseInt(n);
  System.out.println("Enter the Number of Tests");
  String n1 = buf.readLine();
  int t = Integer.parseInt(n1);
  int s = 0;
for(int i = 1; i<= number; i++) {
    int total = 0;
    System.out.println("Enter Name");
    String name = buf.readLine();
        for(int j = 0 ; j<t ; j++) {
        System.out.println("Enter the Test marks:");
        String x = buf.readLine();
        int m = Integer.parseInt(x);
        total = total + m;
     }
     System.out.println(" The average score of " +name + " is " +total/t);
     s = s + total;
     }
    System.out.println(" The class average is "+s/number);
   }
}