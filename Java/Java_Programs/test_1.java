import java.lang.*;
import java.text.NumberFormat;
import java.util.*;
import java.io.*;
import java.awt.*;
public class test_1 
{
	public static void main(String args[])
	{
		double price=1200.56789;
		double perc=12.0;
		NumberFormat defForm_1=NumberFormat.getCurrencyInstance();
		String defCurrForm=defForm_1.format(price);
		System.out.println("Default currency format : "+defCurrForm);
		
		NumberFormat CurrForm_1=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		String IndCurrForm=CurrForm_1.format(price);
		System.out.println("India currency format : "+IndCurrForm);
		
		NumberFormat CurrForm_2=NumberFormat.getCurrencyInstance(Locale.US);
		String UScurrForm=CurrForm_2.format(price);
		System.out.println("US currency format : "+UScurrForm);
		
		NumberFormat Per=NumberFormat.getPercentInstance();
		String percForm=Per.format(perc);
		System.out.println("Percent currency format : "+percForm);
		
		String s=String.format("%.3f", price);
		System.out.println(s);
		
		Date dt=new Date();
		System.out.println(dt);
		
		Point p1=new Point(3,0);
		Point p2=new Point(0,4);
		double dist=p1.distance(p2);
		System.out.println(dist);
		p1.setLocation(0, 0);
		System.out.println(p2.x+p1.y);
	}
}
