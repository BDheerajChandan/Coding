import java.io.*;
class FileHandleObject_1 implements Serializable
{
    int id;
    String name;
    FileHandleObject_1(int id,String name)
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
public class FHObjectPractice_1
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileHandleObject_1 fh1=new FileHandleObject_1(1,"Dheeraj");
        FileHandleObject_1 fh2=new FileHandleObject_1(2,"Chandan");
        FileHandleObject_1 fh3=new FileHandleObject_1(3,"Ramesh");
        
        FileOutputStream fos=new FileOutputStream(path+filename);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(fh1);
        oos.writeObject(fh2);
        oos.writeObject(fh3);
        
        FileInputStream fis=new FileInputStream(path+filename);
        ObjectInputStream ois=new ObjectInputStream(fis);
        FileHandleObject_1 fhr1=(FileHandleObject_1)ois.readObject();
        fhr1.display();
        FileHandleObject_1 fhr2=(FileHandleObject_1)ois.readObject();
        fhr2.display();
        FileHandleObject_1 fhr3=(FileHandleObject_1)ois.readObject();
        fhr3.display();
    }
}
