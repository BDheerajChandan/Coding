import java.lang.*;
class test
{
public static void main(String args[])
{
char chars[] = {'a','b','c'};
String s1 = new String(chars);
String s2 = new String(s1);
System.out.println(s1);
System.out.println(s2);
}
}
