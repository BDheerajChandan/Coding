import java.io.*;
import java.util.*;
public class FHDataPractice_1
{
    public static void main(String args[])throws IOException,FileNotFoundException
    {
        String path="C:\\Users\\KIIT\\Desktop\\Java";
        String filename="\\ObjectExample.txt";
        FileOutputStream fo=new FileOutputStream(path+filename);
        DataOutputStream dos=new DataOutputStream(fo);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int n=sc.nextInt();
        dos.writeInt(n);
        System.out.print("Enter the Long : ");
        long l=sc.nextLong();
        dos.writeLong(l);
        System.out.print("Enter the float : ");
        float f=sc.nextFloat();
        dos.writeFloat(f);
        System.out.print("Enter the double : ");
        double d=sc.nextDouble();
        dos.writeDouble(d);
        System.out.print("Enter the Character : ");
        char ch=sc.next().charAt(0);
        dos.writeDouble(ch);
        FileInputStream fi=new FileInputStream(path+filename);
        DataInputStream dis=new DataInputStream(fi);
        int num=dis.readInt();
        long ln=dis.readLong();
        float ft=dis.readFloat();
        double dbl=dis.readDouble();
        int chr2=dis.readChar();
        System.out.println("Integer : "+num);
        System.out.println("Long : "+ln);
        System.out.println("Float : "+ft);
        System.out.println("Double : "+dbl);
        System.out.println("Character : "+(char)chr2);
    }
}
