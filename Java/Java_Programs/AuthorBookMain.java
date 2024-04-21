import java.io.*;
import java.util.*;
public class AuthorBookMain
{
    static String Aname;
    static String email;
    static char gender;
    static double price;
    static int quantity;
    static String Bname;
    public static void main(String args[])
    {
        
        Book b=new Book(Aname,email,gender,price,quantity,Bname);
        Aname=b.getAName();  // Athor Name
        Bname=b.getBName();  // Book Name
        System.out.println("***************************************");
        quantity=b.getQty();
        b.setQty(quantity); // Quantity
        price=b.getPrice();
        b.setPrice(price);  // Price
        System.out.println("***************************************");
        b.getEmail();
        b.setEmail();       // EMail
        gender=b.getGender(); 
        System.out.println("***************************************");
        System.out.println("Author : "+Aname+"\nBook Name : "+Bname+"\nGender : "+gender); //Author, Book, Gender
        System.out.println(b.toString());  // Email, Price, Quantity
    }
}