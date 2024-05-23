import java.io.*;
import java.util.*;
public class MainPerson
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age=sc.nextInt();
        System.out.println("Enter the name : ");
        String name=sc.next();
        Person p=new Person(age,name);
        Teacher teacher = new Teacher("Alice", 30);
        PermanentEmployee permEmployee = new PermanentEmployee("Bob", 40);
        ContractEmployee contractEmployee = new ContractEmployee("Charlie", 35);

        teacher.dispPerson();
        teacher.MyProfession();

        permEmployee.dispPerson();
        permEmployee.MyProfession();

        contractEmployee.dispPerson();
        contractEmployee.MyProfession();
    }
}