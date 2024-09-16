import java.util.*;
import java.awt.*;
import java.lang.*;
import java.io.*;
import java.text.*;
public class Packages 
{
	public static void main(String args[])throws IOException
	{
		Date currentDate=new Date();
		System.out.println(currentDate);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer input : ");
		//int n=sc.nextInt();
		//System.out.println(n);
		//System.out.println(Integer.toString(n));
		
		Point p1=new Point(10,50);
		Point p2=new Point(50,10);
		p1.setLocation(30,40);
		System.out.println(p1+"\n"+p2);
		double distance=p1.distance(p2);
		System.out.println(distance);
		
		int a=4,b=100;
		double sq=Math.sqrt(a);
		System.out.println("Square root of "+a+" : "+sq);
		double pow=Math.pow(Math.sqrt(a),Math.sqrt(b));
		System.out.println("Power of "+Math.sqrt(a)+" to "+Math.sqrt(b)+" : "+pow);
		int Maxnum=Math.max(a,b);
		System.out.println("Maximum of "+a+","+b+" : "+Maxnum);
		int Minnum=Math.min(a,b);
		System.out.println("Minimum of "+a+","+b+" : "+Minnum);
		double dnum=12.6745643;
		double flr=Math.floor(dnum);
		System.out.println("Floor of "+dnum+" : "+flr);
		double cl=Math.ceil(dnum);
		System.out.println("Ceil of "+dnum+" : "+cl);
		double rnd=Math.round(dnum);
		System.out.println("Round of "+dnum+" : "+rnd);
		double randomnum_1=Math.random();
		System.out.println("Random decimal number between 0,1 : "+randomnum_1);
		double randomnum_2=randomnum_1*100;
		System.out.println("Random decimal number between 0,100 : "+randomnum_2);
		double value = 12.3456789;
        String roundedValue = String.format("%.3f", value);
        System.out.println("Rounded to 3 decimal "+dnum+" : "+roundedValue);
        
        
        
        double price=1200.501;
        NumberFormat Default_currFormat=NumberFormat.getCurrencyInstance();
        String DefaultcurrFormat_1=Default_currFormat.format(price);
        //String DefaultcurrFormat_2=NumberFormat.getCurrencyInstance().format(price);
        System.out.println("Default currency format : "+DefaultcurrFormat_1);
        
        //NumberFormat US_currFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat US_currFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String usFormattedCurrency = US_currFormat.format(price);
        System.out.println("US currency format : " + usFormattedCurrency);

        NumberFormat Ind_currFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String indiaFormattedCurrency = Ind_currFormat.format(price);
        System.out.println("Formatted as currency (India): " + indiaFormattedCurrency);
        
        double per=12.56;
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        String formattedPercent = percentFormatter.format(per);
        System.out.println("Formatted as percentage: " + formattedPercent);
	}
}
