import java.io.*;
import java.util.*;
class Teacher extends Person
{
    Teacher(String name,int age)
    {
        super(age,name);
    }
    public void  MyProfession()
    {
        System.out.println("I am a Teacher.");
    }
}