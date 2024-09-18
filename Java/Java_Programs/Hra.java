 

//This program finds the total salary and counts the number of 
//employee getting total salary more than Rs.3000.
import java.io.*;
class Hra {
    public static void main(String args[]) throws IOException {
        double bs[], ca,ent,hra,ts[];
        bs=new double[11];
        ts=new double[11];
        int nm=0;
        int i;
        hra=0;
        ca=0;
        ent=0;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter Basic Pay :" );
        for (i=1;i<=10; i++){
            String n = input.readLine();
            bs[i]=Integer.parseInt(n);
        }
        for (i=1;i<=10; i++) {
            hra =0.25*bs[i];
            ca=0.15*bs[i];
            ent=0.10*bs[i];
            ts[i]=bs[i]+hra+ca+ent;
            if (ts[i]>3000) nm++;
            System.out.println("Total Salary = " +ts[i]);}
            System.out.println("Number of Employees Getting Salry >Rs.3000= " +nm);
        }
}

