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
    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
public class FHObjectPractice_4
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        ArrListObj_4 ao1=new ArrListObj_4(1,"Dheeraj");
        ArrListObj_4 ao2=new ArrListObj_4(2,"Chandan");
        ArrListObj_4 ao3=new ArrListObj_4(3,"Ramesh");
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(ao1);
        oo.writeObject(ao2);
        oo.writeObject(ao3);
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        ArrListObj_4 oa1=(ArrListObj_4)oi.readObject();
        oa1.display();
        ArrListObj_4 oa2=(ArrListObj_4)oi.readObject();
        oa2.display();
        ArrListObj_4 oa3=(ArrListObj_4)oi.readObject();
        oa3.display();
    }
}
