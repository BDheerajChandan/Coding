import java.util.*;
class ArrObj
{
    int id;
    String name;
    ArrayList<ArrObj> al=new ArrayList<>();
    ArrObj(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void addEle()
    {
        ArrObj a1=new ArrObj(1,"Dheeraj");
        ArrObj a2=new ArrObj(2,"Chandan");
        ArrObj a3=new ArrObj(3,"Teju");
        al.add(a1);
        al.add(a2);
        al.add(a3);  
    } 
    public void display()
    {
        for(ArrObj obj:al) 
        {
            System.out.println("ID : " + obj.id + " ; Name : " + obj.name);
        }
    }    
    public void remove()
    {
        al.remove(1);
    }
    public void addOne()
    {
        ArrObj a=new ArrObj(4,"Ramesh");
        al.add(a);
    }
    public void update()
    {
        ArrObj a=new ArrObj(20,"Cndn");
        al.set(1,a);
    }
    public void insert()
    {
        ArrObj a=new ArrObj(20,"Chandu");
        al.add(1,a);
    }
    public void Index()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to get index : ");
        int num=sc.nextInt();
        System.out.println(al.indexOf(num)); // To get index of an element
    }  
}
/////////////////////////////////////////////////////////////////////////////////////
public class ArrayObjlist 
{
    public static void main(String[] args) 
    {
        ArrObj a1=new ArrObj(1,"Dheeraj");
        ArrObj a2=new ArrObj(2,"Chandan");
        ArrObj a3=new ArrObj(3,"Teju");
        ArrObj a=new ArrObj(0,"");
        System.out.println("*******************************");
        System.out.println("ADDING NEW ELEMENT");
        a.addEle();
        a.display();
        System.out.println("**************************");
        System.out.println("REMOVING AN ELEMENT");
        a.remove();
        a.display();
        System.out.println("**************************");      
        System.out.println("ADDING SINGLE ELEMENT");
        a.addOne();
        a.display();
        System.out.println("**************************");
        System.out.println("UPDING AN ELEMENT");
        a.update();
        a.display();
        System.out.println("**************************");
        System.out.println("INSERTING AN ELEMENT");
        a.insert();
        a.display();
        System.out.println("**************************");
        System.out.println("GET INDEX POITION OF AN ELEMENT");
        a.Index();
        System.out.println("**************************");
        a.display();
    }
}