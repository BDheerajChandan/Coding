import java.io.*;
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
public class FHObjectPractice_2
{
    public static void main(String args[])throws FileNotFoundException,IOException,ClassNotFoundException
    {
        FileHandleObject_2 fh1=new FileHandleObject_2(1,"Dheeraj");
        FileHandleObject_2 fh2=new FileHandleObject_2(2,"Chandan");
        FileHandleObject_2 fh3=new FileHandleObject_2(3,"Ramesh");
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        ObjectOutputStream oo=new ObjectOutputStream(fo);
        oo.writeObject(fh1);
        oo.writeObject(fh2);
        oo.writeObject(fh3);
        FileInputStream fi=new FileInputStream(path+filename);
        ObjectInputStream oi=new ObjectInputStream(fi);
        FileHandleObject_2 fho1=(FileHandleObject_2)oi.readObject();
        fho1.display();
        FileHandleObject_2 fho2=(FileHandleObject_2)oi.readObject();
        fho2.display();
        FileHandleObject_2 fho3=(FileHandleObject_2)oi.readObject();
        fho3.display();
    }
}