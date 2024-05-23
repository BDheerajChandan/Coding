/*
Design a vehicle rental system that allows customers to rent vehicles such as cars, motorcycles, and bicycles. 
Implement the system using inheritance and method overriding to handle specific functionalities for each type of vehicle.

The Vehicle class is the superclass, representing a generic vehicle with properties like vehicle number and availability status. 
It provides methods for renting and returning vehicles .Subclasses Car, Motorcycle, and Bicycle inherit from the Vehicle class and 
override the toString() method to include specific details about each type of vehicle.
Each subclass can also override the rent() and returnVehicle() methods if specific behaviors are required for renting or returning that type of vehicle.
In the Main class, instances of each type of vehicle are created and their details are displayed. They are then rented and returned, demonstrating method 
overriding and inheritance in action.*/
import java.util.*;
import java.io.*;
class Vehicle
{
    String vehicleNumber;
    int vehicleAvl;
    public void tostring()
    {
        System.out.println("Entering vehicle number and v");
    }
    public void rent()
    {
        System.out.println("Entering number of vehicle to be rented");
    }
    public void returnVehicle()
    {
        System.out.println("Entering number of vehicle to be returned");
    }
}
class cars extends Vehicle
{
    String vehicleNumber;
    int vehicleAvl;
    public void tostring()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Vehicle Number :");
        vehicleNumber=sc.next();
        System.out.println("Please enter the Vehicle avaliability :");
        vehicleAvl=sc.nextInt();
        System.out.println("Vehicle Number : "+vehicleNumber+"\nVehicle avaliability : "+vehicleAvl);
    }
    public void rent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of vehicles to be rented");
        int vehicleRentCount=sc.nextInt();
        vehicleAvl=vehicleAvl-vehicleRentCount;
        System.out.println("Number of Vehicles : " + vehicleAvl);
    }
    public void returnVehicle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number of vehicles to be returned : ");
        int vehicleReturnCount=sc.nextInt();
        vehicleAvl=vehicleAvl+vehicleReturnCount;
        System.out.println("Number of Vehicles : " + vehicleAvl);
    }
}
class motorcycles extends Vehicle
{
    String vehicleNumber;
    int vehicleAvl;
    public void tostring()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Vehicle Number :");
        vehicleNumber=sc.next();
        System.out.println("Please enter the Vehicle avaliability :");
        vehicleAvl=sc.nextInt();
        System.out.println("Vehicle Number : "+vehicleNumber+"\nVehicle avaliability : "+vehicleAvl);
    }
    public void rent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of vehicles to be rented");
        int vehicleRentCount=sc.nextInt();
        vehicleAvl=vehicleAvl-vehicleRentCount;
        System.out.println("Number of Vehicles : " + vehicleAvl);
    }
    public void returnVehicle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number of vehicles to be returned : ");
        int vehicleReturnCount=sc.nextInt();
        //System.out.println("Number of Vehicles : " + vehicleAvl);
        vehicleAvl=vehicleAvl+vehicleReturnCount;
        System.out.println("Number of Vehicles : " + vehicleAvl);
    }
}
class bicycles extends Vehicle
{
    String vehicleNumber;
    int vehicleAvl;
    public void tostring()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the Vehicle Number :");
        vehicleNumber=sc.next();
        System.out.println("Please enter the Vehicle avaliability :");
        vehicleAvl=sc.nextInt();
        System.out.println("Vehicle Number : "+vehicleNumber+"\nVehicle avaliability : "+vehicleAvl);
    }
    public void rent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of vehicles to be rented");
        int vehicleRentCount=sc.nextInt();
        //System.out.println("Number of Vehicles : " + vehicleAvl);
        vehicleAvl=vehicleAvl-vehicleRentCount;
        System.out.println("Number of Vehicles : " + vehicleAvl);
    }
    public void returnVehicle()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number of vehicles to be returned : ");
        int vehicleReturnCount=sc.nextInt();
        //System.out.println("Number of Vehicles : " + vehicleAvl);
        vehicleAvl=vehicleAvl+vehicleReturnCount;
        System.out.println("Number of Vehicles : " + vehicleAvl);
    }
}
public class VehicleMain
{
    public static void main(String args[])
    {
        cars c=new cars();
        motorcycles m=new motorcycles();
        bicycles b=new bicycles();
        System.out.println("\t\tCARS");
        c.tostring();
        c.rent();
        c.returnVehicle();        
        System.out.println("************************************************");
        System.out.println("\t\tMOTORCYCLE");
        m.tostring();
        m.rent();
        m.returnVehicle();        
        System.out.println("************************************************");
        System.out.println("\t\tBICYCLE");
        b.tostring();
        b.rent();
        b.returnVehicle();        
        System.out.println("************************************************");
    }
}