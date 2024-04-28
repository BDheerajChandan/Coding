import java.io.*;
import java.util.*;
class ArrListObj_5 implements Serializable
{
    int id;
    String name;
    ArrListObj_5(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void display()
    {
        System.out.print("ID : "+id);
        System.out.println(" ; Name : "+name);
    }
}
class SortObj implements Comparator<ArrListObj_5>
{
    public int compare(ArrListObj_5 a1,ArrListObj_5 a2)
    {
        if(a1.id<a2.id)
        {
            return 1;
        }else{
            return -1;
        }
    }
}
public class ArrListPractice_4
{
    public static void main(String args[])throws IOException,ClassNotFoundException
    {
        ArrListObj_5 a1=new ArrListObj_5(1,"Dheeraj");
        ArrListObj_5 a2=new ArrListObj_5(2,"Chandan");
        ArrListObj_5 a3=new ArrListObj_5(3,"Ramesh");
        ArrayList<ArrListObj_5> al=new ArrayList<>();
        al.add(a1);
        al.add(a2);
        al.add(a3);
        for(ArrListObj_5 i:al)
        {
            i.display();
        }
        ArrListObj_5 a4=new ArrListObj_5(0,"Sunil");
        al.add(1,a4);
        System.out.println("**********************************");
        for(ArrListObj_5 i:al)
        {
            i.display();
        }
        al.set(3,a4);
        System.out.println("**********************************");
        for(ArrListObj_5 i:al)
        {
            i.display();
        }
        al.remove(3);
        System.out.println("**********************************");
        for(ArrListObj_5 i:al)
        {
            i.display();
        }
        System.out.println("**********************************");
        for(ArrListObj_5 i:al)
        {
            if(i.id==2)
            {
                i.id=3;
            }
            if(i.id==0)
            {
                i.id=2;
            }
            i.display();
        }
        SortObj so=new SortObj();
        Collections.sort(al,so);
        System.out.println("**********************************");
        for(ArrListObj_5 i:al)
        {
            i.display();
        }
    }
}