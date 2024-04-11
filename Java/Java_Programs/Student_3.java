import java.io.*;
import java.util.*;
class Student_3
{
    int id;
    String name;
    int mark;
    String result;
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Student details");
        System.out.println("Enter Student id : ");
        id=sc.nextInt();
        System.out.println("Enter Student name : ");
        name=sc.next();
        System.out.println("Enter Student marks : ");
        mark=sc.nextInt();
    }
    public String results()
    {
        if(mark>35)
        {
            result="Pass";
        }else{
            result="Fail";
        }
        return result;
    }
    public void display(String res_2)
    {
        System.out.println("Student id : "+id);
        System.out.println("Student name : "+name);
        System.out.println("Studente marks : "+mark);
        System.out.println("Student Result : "+res_2);
    }
    /*public static void main(String args[])throws IOException
    {
        Student_3 s=new Student_3();
        s.read();
        String res_1=s.results();
        s.display(res_1);
    }*/
}    