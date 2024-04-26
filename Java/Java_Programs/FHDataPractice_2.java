import java.io.*;
import java.util.*;
public class FHDataPractice_2
{
    public static void main(String args[])throws IOException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        DataOutputStream dos=new DataOutputStream(fo);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer input : ");
        int d1=sc.nextInt();
        dos.writeInt(d1);
        System.out.print("Enter Long input : ");
        long d2=sc.nextLong();
        dos.writeLong(d1);
        System.out.print("Enter Float input : ");
        float d3=sc.nextFloat();
        dos.writeFloat(d3);
        System.out.print("Enter Double input : ");
        double d4=sc.nextDouble();
        dos.writeDouble(d4);
        System.out.print("Enter String input : ");
        String d5=sc.next();
        dos.writeUTF(d5);
        System.out.print("Enter Character input : ");
        char d6=sc.next().charAt(0);
        dos.writeChar(d6);
        System.out.println("**********************************");
        FileInputStream fi=new FileInputStream(path+filename);
        DataInputStream dis=new DataInputStream(fi);
        int a1=dis.readInt();
        long a2=dis.readLong();
        float a3=dis.readFloat();
        double a4=dis.readDouble();
        String a5=dis.readUTF();
        char a6=dis.readChar();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
    }
}