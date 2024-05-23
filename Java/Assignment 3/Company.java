// Abstract base class Employee2
abstract class Employee2 {
    private String name;
    private String ssn;

    public Employee2(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public abstract double earnings();
}

// CommissionEmployee2 class
class CommissionEmployee2 extends Employee2 {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee2(String name, String ssn, double grossSales, double commissionRate) {
        super(name, ssn);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
}

// HourlyEmployee2 class
class HourlyEmployee2 extends Employee2 {
    private double wage;
    private double hours;

    public HourlyEmployee2(String name, String ssn, double wage, double hours) {
        super(name, ssn);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double earnings() {
        return wage * hours;
    }
}

// SalariedEmployee2 class
class SalariedEmployee2 extends Employee2 {
    private double weeklySalary;

    public SalariedEmployee2(String name, String ssn, double weeklySalary) {
        super(name, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
}

// Payroll class
class Payroll {
    private Employee2[] employees;

    public Payroll(Employee2[] employees) {
        this.employees = employees;
    }

    public void paySalary() {
        for (Employee2 employee : employees) {
            System.out.printf("Paying %s (SSN: %s) - Earnings: $%.2f%n", 
                               employee.getName(), employee.getSsn(), employee.earnings());
        }
    }
}

// Main Company class
public class Company {
    public static void main(String[] args) {
        Employee2[] employees = new Employee2[3];

        employees[0] = new CommissionEmployee2("Alice", "111-11-1111", 10000, 0.1);
        employees[1] = new HourlyEmployee2("Bob", "222-22-2222", 20, 40);
        employees[2] = new SalariedEmployee2("Charlie", "333-33-3333", 3000);

        Payroll payroll1 = new Payroll(employees);
        payroll1.paySalary();
    }
}

