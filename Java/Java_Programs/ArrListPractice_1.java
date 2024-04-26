import java.io.*;
import java.util.*;
class ObjPractice_1// implements Serializable
{
    int id;
    String name;
    float sal;
    ObjPractice_1(int id,String name,float sal)
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
class SortObjPractice_1 implements Comparator<ObjPractice_1>
{
    public int compare(ObjPractice_1 o1,ObjPractice_1  o2)
    {
        if(o1.sal>o2.sal)
        {
            return 1;
        }else{
            return -1;
        }
    }
}
public class ArrListPractice_1
{
    public static void main(String args[])
    {
        ObjPractice_1 o1=new ObjPractice_1(1,"Dheeraj",2000);
        ObjPractice_1 o2=new ObjPractice_1(2,"Chandan",2700);
        ObjPractice_1 o3=new ObjPractice_1(3,"Ramesh",1700);
        ObjPractice_1 o4=new ObjPractice_1(4,"Suresh",2500);
        ObjPractice_1 o5=new ObjPractice_1(5,"Sunil",1500);
        ArrayList<ObjPractice_1> al=new ArrayList<>();
        al.add(o1);
        al.add(o2);
        al.add(o3);
        al.add(o4);
        al.add(o5);
        System.out.println("******************************");
        for(ObjPractice_1 o:al)
        {
            o.display();
        }
        System.out.println("******************************");
        ObjPractice_1 n1=al.get(2);
        System.out.println("At index position 2 : ");
        n1.display();
        System.out.println("******************************");
        System.out.println("Remove At index position 2 : ");
        al.remove(2);
        for(ObjPractice_1 o:al)
        {
            o.display();
        }
        System.out.println("******************************");
        ObjPractice_1 o6=new ObjPractice_1(3,"Cnd",5500);
        al.add(2,o6);
        for(ObjPractice_1 o:al)
        {
            o.display();
        }
        System.out.println("******************************");
        o6.sal=500;
        al.set(2,o6);
        for(ObjPractice_1 o:al)
        {
            o.display();
        }
        System.out.println("******************************");
        
        SortObjPractice_1 so=new SortObjPractice_1();
        Collections.sort(al,so);
        for(ObjPractice_1 o:al)
        {
            o.display();
        }
    }
}