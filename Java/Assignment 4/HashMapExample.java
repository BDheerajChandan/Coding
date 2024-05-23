import java.io.*;
import java.util.*;
class EmployeeObj
{
    int id;
    String name;
    EmployeeObj(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
    }
}
public class HashMapExample
{
    public static void main(String args[])
    {
        EmployeeObj eo1=new EmployeeObj(1,"Dheeraj");
        EmployeeObj eo2=new EmployeeObj(2,"Chandan");
        EmployeeObj eo3=new EmployeeObj(3,"Ramesh");
        EmployeeObj eo4=new EmployeeObj(4,"Teju");
        EmployeeObj eo5=new EmployeeObj(5,"Maouni");
        HashMap<Integer,EmployeeObj> hm=new HashMap<>();
        hm.put(eo1.id,eo1);
        hm.put(eo2.id,eo2);
        hm.put(eo3.id,eo3);
        hm.put(eo4.id,eo4);
        hm.put(eo5.id,eo5);
        for(Map.Entry<Integer,EmployeeObj> i: hm.entrySet()) 
        {
            System.out.println("Keys : "+i.getKey());
            EmployeeObj eo=i.getValue();
            System.out.print("Values : ");
            eo.display();
        }
        System.out.println("*********************************");
        System.out.println("TO UPDATE VALUE IN HASHMAP");
        System.out.print("Values after updating : ");
        for(Map.Entry<Integer,EmployeeObj> i: hm.entrySet()) 
        {
            //System.out.println("Keys : "+i.getKey());
            EmployeeObj eo=i.getValue();
            if(i.getKey()==3)
            {
                eo.name="Chandu";
            }
            eo.display();
        }
        System.out.println("TO GET <KEY,VALUE>OBJECT FROM HASHMAP");
        System.out.println("At position 2 in HashMap : "+hm.get(2)+"\nValue : ");
        hm.get(2).display();
        System.out.println("TO REMOVE <KEY,VALUE>OBJECT FROM HASHMAP");
        int rm=0;
        for(Map.Entry<Integer,EmployeeObj> i: hm.entrySet()) 
        {
            //System.out.println("Keys : "+i.getKey());
            EmployeeObj eo=i.getValue();
            if(i.getKey()==3)
            {
                rm=i.getKey();
            }
            eo.display();
        } 
        System.out.println("*********************************");
        hm.remove(rm);
        for(Map.Entry<Integer,EmployeeObj> i: hm.entrySet()) 
        {
            EmployeeObj eo=i.getValue();
            eo.display();
        }
    }
}