import java.io.*;
import java.util.*;
class ArrListObj_6 implements Serializable
{
    int id;
    String name;
    ArrListObj_6(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    /*public String toString()
    {
        return "ID : "+id;
    }*/
    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
public class FHRemovePractice_6
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        ArrListObj_6 ao[]=new ArrListObj_6[3];
        ao[0]=new ArrListObj_6(1,"Dheeraj");
        ao[1]=new ArrListObj_6(2,"Chandan");
        ao[2]=new ArrListObj_6(3,"Ramesh");
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        for(int i=0;i<ao.length;i++)
        {
            oo.writeObject(ao[i]);
        }
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        for(int i=0;i<ao.length;i++)
        {
            ao[i]=(ArrListObj_6)oi.readObject();
            ao[i].display();            
        }
        System.out.println("Length of array object : "+ao.length);
        int c=0;
        for(int i=0;i<ao.length;i++)
        {
            if(i!=1)
            {
                oo.writeObject(ao[i]);
                c++;
            }            
        }
        System.out.println("**********************************");
        for(int i=0;i<c;i++)
        {
            ao[i]=(ArrListObj_6)oi.readObject();
            ao[i].display();            
        }
        System.out.println("Length of array object : "+c);
        System.out.println("**********************************");
    }
}
