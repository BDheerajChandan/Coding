
/*2) Employee Management System
    a) create Employee interface defining the calculateSalary() method.
    b) create a class called BaseEmployee  implements the Employee interface and serves as the base class for all types of employees.
    c) Manager and Programmer classes inherit from BaseEmployee and provide their own implementations of the calculateSalary() method based on 
        their specific roles.Both Manager and Programmer classes have constructors that initialize their attributes.
    d)Demonstrate the usage of these classes in EmployeeSystem class  by creating instances of Manager and Programmer objects and 
        displaying their information using the displayInfo(),finding their salary using calculateSalary method.
 */

interface Employee_3
{    
    public void calculateSalary();
}
class BaseEmployee implements Employee_3
{
    public void calculateSalary()
    {
    }
}
class Manager_2 extends BaseEmployee
{
    Manager_2()
    {
    }
    public void calculateSalary()
    {
    }
    public void displayInfo()
    {
    }
}
class Programmer_2 extends BaseEmployee
{
    Programmer_2()
    {
    }
    public void calculateSalary()
    {
    }
    public void displayInfo()
    {
    }
}
