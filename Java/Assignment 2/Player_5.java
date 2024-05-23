import java.io.*;
import java.util.*;
class Player_5
{
    String name;
    int age;
    String countryName;
    int runs;
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Player details : ");
        System.out.println("Enter name : ");
        name=sc.next();
        System.out.println("Enter age : ");
        age=sc.nextInt();
        System.out.println("Enter Country name : ");
        countryName=sc.next();
        System.out.println("Enter runs made : ");
        runs=sc.nextInt();
    }
    public void display()
    {
        System.out.println("Player name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Country name : "+countryName);
        if(runs>5000)
        {
            System.out.println("Runs more than 5000 : "+runs);
        }else{
            System.out.println("Runs less than 5000 : "+runs);
        }
    }
    /*public static void main(String args[])throws IOException
    {
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
    }*/
}    