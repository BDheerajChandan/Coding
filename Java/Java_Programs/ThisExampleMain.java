import java.io.*;
import java.util.*;
class ThisExampleMain
{
    public static void main(String args[])
    {
        ThisExample th_1=new ThisExample();
        th_1.display();         // 0 , "Teju" , 10
        ThisExample th_2=new ThisExample(1,"Dheeraj");
        th_2.display();         // 1, Null , 10
        
        ThisExample th_3=new ThisExample();
        th_3.name="Chandan";    // Assigning value to instance variable/object in default constructor
        th_3.display();         // 0 , "Chandan" , 10
    }
}