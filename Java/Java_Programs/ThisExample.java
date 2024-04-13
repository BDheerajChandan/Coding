import java.io.*;
import java.util.*;
class ThisExample
{
    int age;
    String name;
    static int classStd=10;
    ThisExample()           // Default or no parameterised constructor
    {
        System.out.println("This is defalut/No parameterised constructor");
        int age=100;
        String name="Teju";
        age=age;                // Null to instance variable/object
        this.name=name;         // Local variable to instance variable
    }
    ThisExample(int age,String name)    // Parameterised constructor ,LocalVariable=Instance variable
    {
        System.out.println("This is Parameterised constructor");
        this.age=age;       // Local variable to instance variable
        name=name;          // Null to instance variable/object
    }
    public void display()
    {
        System.out.println("*************************************");
        System.out.println("Age : "+age+"\nName : "+name+"\nClass :"+classStd);
    }
    /*public static void main(String args[])
    {
        ThisExample th_1=new ThisExample();
        th_1.display();         // 0 , "Teju" , 10
        ThisExample th_2=new ThisExample(1,"Dheeraj");
        th_2.display();         // 1, Null , 10
        
        ThisExample th_3=new ThisExample();
        th_3.name="Chandan";    // Assigning value to instance variable/object in default constructor
        th_3.display();         // 0 , "Chandan" , 10
    }*/
}