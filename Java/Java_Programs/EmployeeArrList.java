import java.util.*;
class Arr
{
    ArrayList<Integer> employees = new ArrayList<>();
    public void addEle()
    {
        employees.add(10);
        employees.add(20);
        employees.add(30);
    }
    public void display()
    {
        for(Integer i:employees)       
        {
            System.out.println(i);
        }
    }
    public void remove()
    {
        employees.remove(1);
    }
    public void addOne()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to be added : ");
        int num=sc.nextInt();
        employees.add(num);
    }
    public void update()
    {
        employees.set(1,100);
    }
    public void insert()
    {
        employees.add(1,300);
    }
    public void Index()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to be added : ");
        int num=sc.nextInt();
        System.out.println(employees.indexOf(num)); // To get index of an element
    }
}
public class EmployeeArrList 
{
    public static void main(String args[]) 
    {
        Arr a=new Arr();
        System.out.println("**************************");
        System.out.println("ADDING NEW ELEMENT");
        a.addEle();
        a.display();
        System.out.println("**************************");
        System.out.println("REMOVING AN ELEMENT");
        a.remove();
        a.display();
        System.out.println("**************************");      
        System.out.println("ADDING SINGLE ELEMENT");
        a.addOne();
        a.display();
        System.out.println("**************************");
        System.out.println("UPDING AN ELEMENT");
        a.update();
        a.display();
        System.out.println("**************************");
        System.out.println("INSERTING AN ELEMENT");
        a.insert();
        a.display();
        System.out.println("**************************");
        System.out.println("GET INDEX POITION OF AN ELEMENT");
        a.Index();
        System.out.println("**************************");
        a.display();
    }
}
