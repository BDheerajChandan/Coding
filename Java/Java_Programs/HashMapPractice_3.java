import java.io.*;
import java.util.*;
class ArrListObj_3
{
    int id;
    String name;
    ArrListObj_3(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
}
public class HashMapPractice_3
{
    public static void main(String args[])
    {
        ArrListObj_3 eo1=new ArrListObj_3(1,"Dheeraj");
        ArrListObj_3 eo2=new ArrListObj_3(2,"Chandan");
        ArrListObj_3 eo3=new ArrListObj_3(3,"Ramesh");
        HashMap<Integer,ArrListObj_3> hm=new HashMap<>();
        hm.put(eo1.id,eo1);
        hm.put(eo2.id,eo2);
        hm.put(eo3.id,eo3);
        for(Map.Entry<Integer,ArrListObj_3> i:hm.entrySet())
        {
            System.out.println(i.getKey());
            ArrListObj_3 ao=(ArrListObj_3)i.getValue();
            ao.display();
        }
        hm.remove(2);
        for(Map.Entry<Integer,ArrListObj_3> i:hm.entrySet())
        {
            System.out.println(i.getKey());
            ArrListObj_3 ao=(ArrListObj_3)i.getValue();
            ao.display();
        }
    }
}
