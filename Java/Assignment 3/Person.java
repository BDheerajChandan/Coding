import java.io.*;
import java.util.*;
class Person
{
    int age;
    String name;
    Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public void dispPerson()
    {
        System.out.println("Age : "+age+"\nName : "+name);
    }
}