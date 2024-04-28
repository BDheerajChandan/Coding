import java.io.*;
import java.util.*;
class ArrListObj_4 implements Serializable
{
    int id;
    String name;
    ArrListObj_4(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String toString()
    {
        return "ID : "+id;
    }
    /*public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }*/
}
public class FHObjectPractice_5
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        ArrListObj_4 ao1=new ArrListObj_4(1,"Dheeraj");
        ArrListObj_4 ao2=new ArrListObj_4(2,"Chandan");
        ArrListObj_4 ao3=new ArrListObj_4(3,"Ramesh");
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(ao1);
        oo.writeObject(ao2);
        oo.writeObject(ao3);
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        ArrListObj_4 ai1=(ArrListObj_4)oi.readObject();
        //ai1.display();
        String str=ai1.toString();
        System.out.println(str);
        ArrListObj_4 ai2=(ArrListObj_4)oi.readObject();
        //ai2.display();
        ArrListObj_4 ai3=(ArrListObj_4)oi.readObject();
        //ai3.display();
    }
}