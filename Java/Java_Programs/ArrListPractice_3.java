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
class SortObj_3 implements Comparator<ArrListObj_3>
{
    public int compare(ArrListObj_3 a1,ArrListObj_3 a2)
    {
        if(a1.id<a2.id)
        {
            return 1;
        }else
        {
            return -1;
        }
    }
}
public class ArrListPractice_3
{
    public static void main(String args[])throws ClassNotFoundException,IOException
    {
        ArrListObj_3 ao1=new ArrListObj_3(1,"Dheeraj");
        ArrListObj_3 ao2=new ArrListObj_3(2,"Chandan");
        ArrListObj_3 ao3=new ArrListObj_3(3,"Ramesh");
        ArrayList<ArrListObj_3> al=new ArrayList<>();
        al.add(ao1);
        al.add(ao2);
        al.add(ao3);
        System.out.println("After adding elements : ");
        for(ArrListObj_3 i:al)
        {
            i.display();
        }
        System.out.println("**************************************");
        System.out.println("Insert element : ");
        ArrListObj_3 ao4=new ArrListObj_3(0,"Sunil");
        al.add(1,ao4);
        for(ArrListObj_3 i:al)
        {
            i.display();
        }
        System.out.println("**************************************");
        System.out.println("Remove and Update element : ");
        ao4.id=4;
        al.remove(1);
        al.add(3,ao4);
        for(ArrListObj_3 i:al)
        {
            i.display();
        }
        System.out.println("**************************************");
        System.out.println("Repalce set element : ");
        ArrListObj_3 ao5=new ArrListObj_3(0,"Suresh");
        al.set(3,ao5);
        for(ArrListObj_3 i:al)
        {
            i.display();
        }
        System.out.println("**************************************");
        System.out.println("Sorting elements : ");
        SortObj_3 so=new SortObj_3();
        Collections.sort(al,so);
        for(ArrListObj_3 i:al)
        {
            i.display();
        }
    }
}
