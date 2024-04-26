import java.io.*;
import java.util.*;
class FileHandleObject_2 implements Serializable
{
    int id;
    String name;
    FileHandleObject_2(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
public class ArrFHObjectPractice_3
{
    public static void main(String args[])throws ClassNotFoundException,IOException
    {
        FileHandleObject_2 fh[]=new FileHandleObject_2[3];
        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1));
            System.out.print("\tEnter ID : ");
            id=sc.nextInt();
            System.out.print("\tEnter Name : ");
            name=sc.next();
            fh[i]=new FileHandleObject_2(id,name);
        }
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        for(int i=0;i<3;i++)
        {
            oo.writeObject(fh[i]);
        }
        System.out.println("************************");
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        for(int i=0;i<3;i++)
        {
            FileHandleObject_2 o=(FileHandleObject_2)oi.readObject();
            o.display();
            
        }
    }
}