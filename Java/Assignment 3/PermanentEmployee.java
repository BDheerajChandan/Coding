import java.io.*;
import java.util.*;
class PermanentEmployee extends Employee_4
{
    PermanentEmployee(String name,int age)
    {
        super(age,name);
    }
    public void myProfession()
    {
        System.out.println("I am a Permanent Employee.");
    }
}