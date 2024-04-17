import java.io.*;
import java.util.*;
import java.math.*;
class AreaShape
{
    public void CalculateArea(double area)
    {
        System.out.println(area);
    }
}
class Circle extends AreaShape
{   
    public void CalculateArea()
    {
        System.out.println("\t\tCIRCLE");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter circle radius : ");
        double radius=sc.nextDouble();
        System.out.print("Area of a circle of radius "+radius+"  : ");
        double area=3.14*Math.pow(radius,2);
        super.CalculateArea(area);
        System.out.println("**********************************************");
    }
}
class Rectriangle extends AreaShape
{   
    public void CalculateArea()
    {
        System.out.println("\t\tRECTRIANGLE");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Rectringle'ś length and breadth : ");
        System.out.print("Lenngth : ");
        double length=sc.nextDouble();
        System.out.print("Breadth : ");
        double breadth=sc.nextDouble();
        System.out.print("Area of a Rectringle of length "+length+" and breadth "+breadth+" : ");
        double area=length*breadth;
        super.CalculateArea(area);
        System.out.println("**********************************************");
    }
}
class Triangle extends AreaShape
{   
    public void CalculateArea()
    {
        System.out.println("\t\tTRIANGLE");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Triangle'ś base and height : ");
        System.out.print("Base : ");
        double base=sc.nextDouble();
        System.out.print("Height : ");
        double height=sc.nextDouble();
        System.out.print("Area of a Rectringle of base "+base+" and height "+height+" : ");
        double area=0.5*base*height;
        super.CalculateArea(area);
        System.out.println("**********************************************");
    }
}
public class AreaMain
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        Rectriangle r=new Rectriangle();
        Triangle t=new Triangle();
        c.CalculateArea();
        r.CalculateArea();
        t.CalculateArea();
    }
}