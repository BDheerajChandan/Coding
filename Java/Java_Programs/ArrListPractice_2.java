import java.io.*;
import java.util.*;
class ArrListObj_2
{
    int id;
    String name;
    ArrListObj_2(int id,String name)
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
class SortObjPractice_2 implements Comparator<ArrListObj_2>
{
    public int compare(ArrListObj_2 o1,ArrListObj_2 o2)
    {
        if(o1.id<o2.id)
        {
            return 1;
        }else{
            return -1;
        }
    }
}
public class ArrListPractice_2
{
    public static void main(String args[])
    {
        ArrListObj_2 o1=new ArrListObj_2(1,"Dheeraj");
        ArrListObj_2 o2=new ArrListObj_2(2,"Chandan");
        ArrListObj_2 o3=new ArrListObj_2(3,"Ramesh");
        ArrayList<ArrListObj_2> al=new ArrayList<>();
        al.add(o1);
        al.add(o2);
        al.add(o3);
        System.out.println("****************************************");
        for(ArrListObj_2 i:al)
        {
            i.display();
        }
        SortObjPractice_2 so=new SortObjPractice_2();
        Collections.sort(al,so);
        al.add(3,o3);
        System.out.println("****************************************");
        for(ArrListObj_2 i:al)
        {
            i.display();
        }
        o3.name="Krithi";
        al.add(3,o3);
        System.out.println("****************************************");
        for(ArrListObj_2 i:al)
        {
            i.display();
        }
        al.remove(4);
        System.out.println("****************************************");
        for(ArrListObj_2 i:al)
        {
            i.display();
        }
        al.set(3,o3);
        System.out.println("****************************************");
        for(ArrListObj_2 i:al)
        {
            i.display();
        }
    }
}