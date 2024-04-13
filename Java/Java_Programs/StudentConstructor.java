import java.io.*;
import java.util.*;
public class StudentConstructor
{
    int age;                // Non-Static variable
    String name;    
    static int ClassStd=10; // Static variable: values is initialised only once.
    StudentConstructor()    // Non parametrised constructor
    {
        System.out.println("Variables(Static/NonStatic ) , Constructors(Parameterise/NonParameterised)");
    }
    StudentConstructor(int AGE,String sname)// Parametrised constructor
    {
        age=AGE;
        name=sname;
    }
    public void display()   
    {
        System.out.println("**************************************");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Class : "+ClassStd);
        System.out.println("**************************************");
    }
}