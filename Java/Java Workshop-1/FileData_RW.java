import java.io.*;
import java.util.*;
import java.lang.*;
public class FileData_RW 
{
	public static void main(String args[])throws IOException
	{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\KIIT\\Desktop\\TempFile2.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.write(10);
		dos.writeBoolean(true);
		dos.writeChar('a');
		dos.writeUTF("Hi \nI am \n\tDheeraj");
		dos.writeFloat(12.5f);
		dos.writeDouble(12345678.9);
		dos.writeInt(1234);
		dos.writeLong(123456789);
		dos.close();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\KIIT\\Desktop\\TempFile2.txt");
		DataInputStream dis=new DataInputStream(fis);
		boolean bool=dis.readBoolean();
		System.out.println(bool);
		int num1=dis.read();
		System.out.println(num1);
		char ch=dis.readChar();
		System.out.println(ch);
		String s=dis.readUTF();
		System.out.println(s);
		float f=dis.readFloat();
		System.out.println(f);
		double dnum=dis.readDouble();
		System.out.println(dnum);
		int num2=dis.readInt();
		System.out.println(num2);
		long l=dis.readLong();
		System.out.println(l);
		
		fis.close();
		dis.close();
	}
}
