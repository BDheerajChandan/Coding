
class Circle 
{
    private double radius;
    public Circle(double radius) 
    {
        this.radius = radius;
    }
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}
// Rectangle.java
class Rectangle {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() 
    {
        return width + height;
    }
}
// Triangle.java
class Triangle
{
    double base;
    double height;
    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() 
    {
        return 0.5 * base * height;
    }
}
// Main.java
public class Area 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());
    }
}
