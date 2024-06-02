// Employee.java
abstract class Employee 
{
    String name;
    int id;
    public Employee(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }
    public abstract double calculateSalary();
    public void displayInfo() 
    {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}
// Manager.java
class Manager extends Employee {
    double baseSalary;
    double bonus;
    public Manager(String name, int id, double baseSalary, double bonus) 
    {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    public double calculateSalary() 
    {
        return baseSalary + bonus;
    }
}
// Engineer.java
class Engineer extends Employee 
{
    double baseSalary;
    double overtimePay;
    int overtimeHours;
    public Engineer(String name, int id, double baseSalary, double overtimePay, int overtimeHours) 
    {
        super(name, id);
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
        this.overtimeHours = overtimeHours;
    }
    public double calculateSalary() 
    {
        return baseSalary + (overtimePay * overtimeHours);
    }
}
// Main.java
public class Salaries 
{
    public static void main(String[] args) 
    {
        Employee manager = new Manager("Alice", 101, 80000, 20000);
        Employee engineer = new Engineer("Bob", 102, 60000, 50, 10);

        manager.displayInfo();
        engineer.displayInfo();
    }
}
