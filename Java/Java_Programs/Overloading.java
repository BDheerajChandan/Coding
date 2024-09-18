class Overloading
{
int x;
float y;                			//variables declaration
Overloading()         		//constructor no.1
{
x=0;
y=0;
}
Overloading(int a)      		//constructor no.2
{
x=a;
y=0;
}
Overloading(int a, float b)    	// constructor no.3
{
x=a;
y=b;
}
public static void main(String args[])
{
Overload obj1  = new Overload();        	//constructor no.1
Overload obj2  = new Overload(15);       	//constructor no.2
Overload obj3  = new Overload(10,5.5F);	//constructor no.3
}
}
