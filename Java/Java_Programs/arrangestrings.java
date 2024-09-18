import java.io.*;
public class arrangestrings
{
public static void main(String args[ ]) throws IOException 
{
String s1,s2,s3;
int l1,l2,l3;
DataInputStream d=new DataInputStream (System.in);
System.out.println("Enter three strings");

s1 = d.readLine();
s2 = d.readLine();
s3 = d.readLine();

System.out.println("You entered "+s1+" , "+s2+" and "+s3);	

l1 = s1.length();
l2 = s2.length();
l3 = s3.length();

if(l1<=l2 && l2<=l3)
 System.out.println(s1+", "+s2+","+s3);
if(l1<=l3 && l3<=l2)
 System.out.println(s1+", "+s3+","+s2);
if(l2<=l1 && l1<=l3)
 System.out.println(s2+", "+s1+","+s3);
if(l2<=l3 && l3<=l1)
 System.out.println(s2+", "+s3+","+s1);
if(l3<=l1 && l1<=l2)
 System.out.println(s3+", "+s1+","+s2);
if(l3<=l2 && l2<=l1)
 System.out.println(s3+", "+s2+","+s1);
}
}