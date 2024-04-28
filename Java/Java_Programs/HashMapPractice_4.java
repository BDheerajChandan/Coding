
import java.io.*;
import java.util.*;
class ArrListObj_6 implements Serializable
{
    int id;
    String name;
    ArrListObj_6(int id,String name)
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
public class HashMapPractice_4
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        ArrListObj_6 ao1=new ArrListObj_6(1,"Dheeraj");
        ArrListObj_6 ao2=new ArrListObj_6(2,"Chandan");
        ArrListObj_6 ao3=new ArrListObj_6(3,"Ramesh");
        HashMap<Integer,ArrListObj_6> hm=new HashMap<>();
        hm.put(ao1.id,ao1);
        hm.put(ao2.id,ao2);
        hm.put(ao3.id,ao3);
        for(Map.Entry<Integer,ArrListObj_6> i:hm.entrySet())
        {
            System.out.println("Keys : "+i.getKey());
            ArrListObj_6 a=(ArrListObj_6)i.getValue();
            a.display();
        }
        System.out.println("******************************************");
        
        hm.remove(3);
        for(Map.Entry<Integer,ArrListObj_6> i:hm.entrySet())
        {
            System.out.println("Keys : "+i.getKey());
            ArrListObj_6 a=(ArrListObj_6)i.getValue();
            a.display();
        }
        System.out.println("******************************************");
        
        hm.remove(3);
        for(Map.Entry<Integer,ArrListObj_6> i:hm.entrySet())
        {
            System.out.println("Keys : "+i.getKey());
            ArrListObj_6 a=(ArrListObj_6)i.getValue();
            a.display();
        }
        System.out.println("******************************************");
        
        for(Map.Entry<Integer,ArrListObj_6> i:hm.entrySet())
        {
            if(i.getKey()==2)
            {
                i.getValue().name="Chandu";
            }
            ArrListObj_6 a=(ArrListObj_6)i.getValue();
            a.display();
        }
        System.out.println("******************************************");
    }
}
