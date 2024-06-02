abstract class Vehicle 
{
    String vehicleNumber;
    boolean isAvailable;
    public Vehicle(String vehicleNumber) 
    {
        this.vehicleNumber = vehicleNumber;
        this.isAvailable = true;
    }
    public boolean rent() 
    {
        if (isAvailable) 
        {
            isAvailable = false;
            return true;
        }
        return false;
    }
    public void returnVehicle() 
    {
        isAvailable = true;
    }
    public String toString() 
    {
        return "Vehicle Number: " + vehicleNumber + ", Available: " + isAvailable;
    }
}
// Car.java
class Car extends Vehicle 
{
    String model;
    int year;
    public Car(String vehicleNumber, String model, int year) 
    {
        super(vehicleNumber);
        this.model = model;
        this.year = year;
    }
    public String toString() 
    {
        return "Car - Model: " + model + ", Year: " + year + ", " + super.toString();
    }
}
// Motorcycle.java
class Motorcycle extends Vehicle 
{
    String type;
    public Motorcycle(String vehicleNumber, String type) 
    {
        super(vehicleNumber);
        this.type = type;
    }
    public String toString() 
    {
        return "Motorcycle - Type: " + type + ", " + super.toString();
    }
}
// Bicycle.java
class Bicycle extends Vehicle 
{
    String brand;
    public Bicycle(String vehicleNumber, String brand) 
    {
        super(vehicleNumber);
        this.brand = brand;
    }
    public String toString() 
    {
        return "Bicycle - Brand: " + brand + ", " + super.toString();
    }
}
// Main.java
public class VehichleRental
{
    public static void main(String[] args) 
    {
        Vehicle car = new Car("CAR123", "Toyota Camry", 2020);
        Vehicle motorcycle = new Motorcycle("MOTO456", "Sport");
        Vehicle bicycle = new Bicycle("BIKE789", "Giant");

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);

        System.out.println("\nRenting vehicles...");
        car.rent();
        motorcycle.rent();
        bicycle.rent();

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);

        System.out.println("\nReturning vehicles...");
        car.returnVehicle();
        motorcycle.returnVehicle();
        bicycle.returnVehicle();

        System.out.println(car);
        System.out.println(motorcycle);
        System.out.println(bicycle);
    }
}
