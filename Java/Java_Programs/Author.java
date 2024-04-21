import java.io.*;
import java.util.*;
/////////////////////////////////////////////////////////////
class Author
{
    String Aname;
    String email;
    char gender;
    Author(String Aname,String email,char gender)
    {
         this.Aname=Aname;
         this.email=email;
         this.gender=gender;
    }
    public String getAName()
    {
        System.out.println("Please enter the Author and Book name ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Author : ");
        Aname=sc.next();     // Author name
        return Aname;
    }
    public String getEmail()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please eneter the email : ");
        email=sc.next();
        return email;
    }
    public void setEmail()
    {
        //System.out.println("Email : "+email);
    }
    public char getGender()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please eneter the gender : ");
        gender=sc.next().charAt(0);
        return gender;
    }
    public String toString()
    {
        return "Email : "+email;
    }
}