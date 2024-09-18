import java.io.*;
class Temperature {
   public void main(int choice)throws IOException {
   float c=0;
   float f=0;
   InputStreamReader reader = new InputStreamReader(System.in);
   BufferedReader input = new BufferedReader(reader);
   System.out.println("Enter 1. Fahrenheit to Celcius ");
   System.out.println("Enter 2. Celcius to Fahrenheit ");
   switch(choice) {
       case 1:
       System.out.println("Enter Temperature in Fahrenheit");
       String a = input.readLine();
       f=Float.parseFloat(a);
       c=5/9F*(f-32);
       System.out.println("Equivalent Temperature in Celcius is="+c);
       break;
       case 2:
       System.out.println("Enter Temperature in Celcius" );
       String b = input.readLine();
       c=Float.parseFloat(b);
       f=(1.8F*c)+32;
       System.out.println("Equivalent Temperature in Fahrenheit="+f);
       break;
       default:
       System.out.println("Inccorect Choice");
        break;
    }
   }
 }
 
 
 
 
