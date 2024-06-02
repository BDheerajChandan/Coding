interface Employee 
{
    double calculateSalary();
}
// BaseEmployee.java
abstract class BaseEmployee implements Employee 
{
    String name;
    int id;
    public BaseEmployee(String name, int id) 
    {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() 
    {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
// Manager.java
class Manager extends BaseEmployee {
    double baseSalary;
    double bonus;
    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    public double calculateSalary() 
    {
        return baseSalary + bonus;
    }
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Role: Manager, Salary: " + calculateSalary());
    }
}
// Programmer.java
class Programmer extends BaseEmployee 
{
    double baseSalary;
    double overtimePay;
    int overtimeHours;
    public Programmer(String name, int id, double baseSalary, double overtimePay, int overtimeHours) 
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
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Role: Programmer, Salary: " + calculateSalary());
    }
}
// EmployeeSystem.java
public class EmployeeSystem 
{
    public static void main(String[] args) 
    {
        Manager manager = new Manager("Alice", 101, 80000, 20000);
        Programmer programmer = new Programmer("Bob", 102, 60000, 50, 10);
        manager.displayInfo();
        programmer.displayInfo();
    }
}