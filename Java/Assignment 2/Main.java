import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Emp_1 e=new Emp_1();
        e.readEmpData();
        e.displayEmpData();
        
        Electricity_bill_2 eb=new Electricity_bill_2();
        eb.readData();
        eb.computeBill();
        
        Student_3 s=new Student_3();
        s.read();
        String res_1=s.results();
        s.display(res_1);
        
        Account_4 a=new Account_4();
        a.deposit();
        a.interest();
        System.out.println("*******************************************");
        a.withdraw();
        a.interest();
        
        Player_5 p1=new Player_5();
        Player_5 p2=new Player_5();
        Player_5 p3=new Player_5();
        Player_5 p4=new Player_5();
        Player_5 p5=new Player_5();
        System.out.println("Please enter Player 1 details : ");
        p1.read();
        System.out.println("Please enter Player 2 details : ");
        p2.read();
        System.out.println("Please enter Player 3 details : ");
        p3.read();
        System.out.println("Please enter Player 4 details : ");
        p4.read();
        System.out.println("Please enter Player 5 details : ");
        p5.read();
        System.out.println("*********************************************");
        p1.display();
        System.out.println("*********************************************");
        p2.display();
        System.out.println("*********************************************");
        p3.display();
        System.out.println("*********************************************");
        p4.display();
        System.out.println("*********************************************");
        p5.display();
    }
}