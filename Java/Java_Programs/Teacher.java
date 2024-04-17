import java.io.*;
import java.util.*;
class Teacher extends Person
{
    String Profession="";
    Teacher(int age,String name,String Profession)
    {
        super(age,name);
        this.Profession=Profession;
    }
    public void  MyProfession()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your profession : ");
        Profession=sc.next();
    }
}