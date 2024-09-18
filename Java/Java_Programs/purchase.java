import java.io.*;
class purchase {
       public static void main(String args[]) throws IOException{
double amount;
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(reader);
System.out.println(“Enter Amount::”);
String a = input.readLine();
amount=Double.parseDouble(a);
double billamount;
System.out.println(“Enter the amount=” +amount);
if(amount>10000)
billamount=amount-amount*0.5;
else if(amount>5000)
billamount=amount-amount*0.35;
else if(amount>2000)
billamount=amount-amount*0.25;
else 	billamount=amount-amount*0.05;
System.out.println(“Amount to be Paid=” +billamount);
}
}

