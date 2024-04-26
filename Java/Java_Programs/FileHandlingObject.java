import java.io.*;
import java.util.*;
class FHObjec implements Serializable 
{
    int id;
    String name;
    FHObjec(int id,String name)
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
public class FileHandlingObject
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        FHObjec fh1=new FHObjec(1,"Dheeraj");
        FHObjec fh2=new FHObjec(2,"Chandan");
        FHObjec fh3=new FHObjec(3,"Ramesh");
        oo.writeObject(fh1);
        oo.writeObject(fh2);
        oo.writeObject(fh3);
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        FHObjec fh_1=(FHObjec)oi.readObject();
        fh_1.display();
        FHObjec fh_2=(FHObjec)oi.readObject();
        fh_2.display();
        FHObjec fh_3=(FHObjec)oi.readObject();
        fh_3.display();
    }
}
