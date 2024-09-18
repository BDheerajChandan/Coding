//Write a program to the ASCII codes of following characters-
// &, #, +, ^.  Define a method named ASCIICODE() to perform the above job.

class ASCII
{
public void ASCIICODE()
{
char c1='&';
char c2='#';
char c3='+';
char c4='^';
int asc1=c1;
int asc2=c2;
int asc3=c3;
int asc4=c4;
System.out.println("ASCII Code of & ="  +asc1);
System.out.println("ASCII Code of # ="  +asc2);
System.out.println("ASCII Code of + ="  +asc3);
System.out.println("ASCII Code of ^ ="  +asc4);
}
public void display()
{
ASCIICODE();
}
}