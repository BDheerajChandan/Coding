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
        return "ID : "+id+" , Name : "+name;
    }
}
public class ArrListObjMain
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        ArrListObj_4 a1=new ArrListObj_4(1,"Dheeraj");
        ArrListObj_4 a2=new ArrListObj_4(2,"Chandan");
        ArrayList<ArrListObj_4> al=new ArrayList<>();
        al.add(a1);
        al.add(a2);
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        oo.writeObject(a1);
        oo.writeObject(a2);
        ArrListObj_4 b1=(ArrListObj_4)oi.readObject();
        String str1=b1.toString();
        System.out.println(str1);
        ArrListObj_4 b2=(ArrListObj_4)oi.readObject();
        String str2=b2.toString();
        System.out.println(str2);
    }
}