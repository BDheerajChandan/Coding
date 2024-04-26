import java.io.*;
import java.util.*;
class ObjPractice_2// implements Serializable
{
    int id;
    String name;
    float sal;
    ObjPractice_2(int id,String name,float sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public void display()
    {
        System.out.print("ID : "+id);
        System.out.print(" ; NAME : "+name);
        System.out.println(" ; SALARY : "+sal);
       // System.out.println("****************************");
    }
}
public class HashMapPactice_1
{
    public static void main(String args[])
    {
        ObjPractice_2 o1=new ObjPractice_2(1,"Dheeraj",2000);
        ObjPractice_2 o2=new ObjPractice_2(2,"Chandan",2700);
        ObjPractice_2 o3=new ObjPractice_2(3,"Ramesh",1700);
        ObjPractice_2 o4=new ObjPractice_2(4,"Suresh",2500);
        ObjPractice_2 o5=new ObjPractice_2(5,"Sunil",1500);
        HashMap<Integer,ObjPractice_2> hm=new HashMap<>();
        hm.put(o1.id,o1);
        hm.put(o2.id,o2);
        hm.put(o3.id,o3);
        hm.put(o4.id,o4);
        hm.put(o5.id,o5);
        for(Map.Entry<Integer,ObjPractice_2> i:hm.entrySet())
        {
            System.out.println("Keys : "+i.getKey());
            ObjPractice_2 o=(ObjPractice_2)i.getValue();
            o.display();
        }
        System.out.println("**********************************************");
        hm.remove(5);
        for(Map.Entry<Integer,ObjPractice_2> i:hm.entrySet())
        {
            System.out.println("Keys : "+i.getKey());
            ObjPractice_2 o=(ObjPractice_2)i.getValue();
            o.display();
        }
        System.out.println("**********************************************");
        hm.put(o5.id,o5);
        o5.sal=5000;
        hm.put(o5.id,o5);
        for(Map.Entry<Integer,ObjPractice_2> i:hm.entrySet())
        {
            System.out.println("Keys : "+i.getKey());
            ObjPractice_2 o=(ObjPractice_2)i.getValue();
            o.display();
        }
        System.out.println("**********************************************");
    }
}