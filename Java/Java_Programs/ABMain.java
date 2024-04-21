import java.util.Scanner;
class Author 
{
    String Aname;
    String email;
    char gender;
    public Author(String name, String email, char gender) 
    {
        this.Aname = Aname;
        this.email = email;
        this.gender = gender;
    }
    public String getName() 
    {
        return Aname;
    }
    public String getEmail() 
    {
        return email;
    }
    public char getGender() 
    {
        return gender;
    }
}
class Book
{
    String name;
    Author author;
    double price;
    int quantity;
    public Book(String name, Author author, double price, int quantity) 
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() 
    {
        return name;
    }
    public Author getAuthor() 
    {
        return author;
    }
    public double getPrice() 
    {
        return price;
    }
    public void setPrice(double price) 
    {
        this.price = price;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public String toString() 
    {
        return  "Author : "+author.getName()+"\nBook : "+name +"\nPrice : "+price+"\nQuantity : "+quantity;
    }
}

public class ABMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Plee enter author's nme : ");
        String aName = sc.nextLine();
        System.out.print("Plee enter author's email: ");
        String aEmail = sc.nextLine();
        System.out.print("Plee enter gender : ");
        char aGender = sc.next().charAt(0);
        
        Author author = new Author(aName, aEmail, aGender);
        System.out.print("Enter book name: ");
        String bookName = sc.next();
        System.out.print("Enter book price: ");
        double Price = sc.nextDouble();
        System.out.print("Enter book quantity: ");
        int bookQuantity = sc.nextInt();
        Book book = new Book(bookName, author, Price, bookQuantity);
        System.out.println("***************************************");
        System.out.println(book.toString());
    }
}
