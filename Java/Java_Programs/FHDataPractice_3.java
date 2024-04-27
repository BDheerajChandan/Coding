import java.io.*;
import java.util.*;
public class FHDataPractice_3
{
    public static void main(String args[])throws IOException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        DataOutputStream dos=new DataOutputStream(fo);
        int a1;
        long a2;
        float a3;
        double a4;
        String a5;
        dos.writeInt(1);
        dos.writeLong(4);
        dos.writeFloat(2.4f);
        dos.writeDouble(1.4);
        dos.writeUTF("Dheeraj");
        FileInputStream fi=new FileInputStream(path+filename);
        DataInputStream dis=new DataInputStream(fi);
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readUTF());
    }
}
