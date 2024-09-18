import java.io.*;
class CentiFaren {
    public static void main(String args[]) throws IOException {
        double temp, centi;
        temp=0;
        centi=0;
        int choice;
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("T E M P E R A T U R E    C O N V E R S I O N");
        System.out.println("Enter 1 Fahrenheit to Celcius::");
        System.out.println("Enter 2 Celcius to Fahrenheit::");
        String n = input.readLine();
        choice=Integer.parseInt(n);
        if(choice==1) {
            System.out.print("Enter Temperature in Fahrenheit::");
            String v1 = input.readLine();
            temp=Double.parseDouble(v1);
            centi=(temp-32)/1.8;
            System.out.print("Equivalent Temperature in Celcius=" +centi);
        }
        else if(choice==2) {
            System.out.print("Enter Temperature in Celcius::");
            String v2 = input.readLine();
            centi=Double.parseDouble(v2);
            temp=1.8*(centi)+32;
            System.out.print("Equivalent Temperature in Fahrenheit=" +temp);
        }
    }

}



