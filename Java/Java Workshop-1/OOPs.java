import java.io.*;
import java.util.*;
interface Intf
{
	public void animal();
}
class AnimaSound implements Intf
{
	public final int n=10;
	//n=20;
	public void animal()
	{
		System.out.println("Animal Sound");
	}
}
class Dog extends AnimaSound
{
	public void animal()
	{
		System.out.println("Barks");
	}
	public void animal(String sound)
	{
		System.out.println(sound);
	}
}
class Cat extends AnimaSound
{
	public void animal()
	{
		System.out.println("Mewws");
	}
	public void animal(String sound)
	{
		System.out.println(sound);
	}
}

///////////////////////////////////////////////////
abstract class AbsClass
{
	public void func()
	{
		System.out.println("Hi I am Dheeraj");
	}
}


//////////////////////////////////////////////////
public class OOPs 
{
	public static void main(String args[])throws IOException
	{
		AnimaSound a=new AnimaSound();
		a.animal();
		Dog d=new Dog();
		d.animal();
		System.out.println(d.n);
		d.animal("Boww!!");
		Cat c=new Cat();
		c.animal();
		c.animal("Mewwwww!!!");
		//AbsClass ac=new AbsClass();
		//ac.func();
	}
}