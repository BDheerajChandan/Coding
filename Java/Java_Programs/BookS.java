import java.io.*;
import java.util.*;
class BookS extends AuthorS
{
    String Bname;
    double price;
    int quantity;
    BookS(String Aname,String email,char gender,double price,int quantity,String Bname)
    {
        super(Aname,email,gender);
        this.Bname=Bname;
        this.price=price;
        this.quantity=quantity;
    }
    public String getBName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Book : ");
        Bname=sc.next();    // Book name
        return Bname;
    }
    public String getAuthor()
    {
        return super.Aname;
    }
    public double getPrice()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please eneter the Price : ");
        price=sc.nextDouble();
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public int getQty()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please eneter the quantity : ");
        quantity=sc.nextInt();
        return quantity;
    }
    public void setQty(int qty)
    {
        quantity=qty;
    }
    public String toString()
    {
        return super.toString()+"\nPrice : "+price+"\nQuantity : "+quantity;
    }
}