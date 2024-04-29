
import java.io.*;
import java.util.*;

public class ExamSolution {
    int id;
    String Bookname;
    int TotalCnt;
    int Available;   
    ArrayList<ExamSolution> al;

    ExamSolution(int id, String Bookname, int TotalCnt, int Available) {
        this.id = id;
        this.Bookname = Bookname;
        this.TotalCnt = TotalCnt;
        this.Available = this.TotalCnt;
        this.al = new ArrayList<>(); // Initialize the ArrayList
    }

    public void addBook() {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter ID : ");
            int id = sc.nextInt();
            System.out.print("Please enter Bookname : ");
            String Bookname = sc.next();
            System.out.print("Please enter Total Count : ");
            int TotalCnt = sc.nextInt();
            Available = TotalCnt;
            ExamSolution es = new ExamSolution(id, Bookname, TotalCnt, Available);
            al.add(es);
        }
    }

    public void display() {
        for (ExamSolution es : al) {
            System.out.println("ID: " + es.id);
            System.out.println("Bookname: " + es.Bookname);
            System.out.println("Total Count: " + es.TotalCnt);
            System.out.println("Total Available: " + es.Available);
        }
    }

    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Bookname to be searched : ");
        String BookSearch = sc.next();
        int c = 0;
        boolean found = false;
        for (ExamSolution i : al) {
            if (i.Bookname.equals(BookSearch)) {
                System.out.println("Book Found at index : " + c);
                i.display();
                found = true;
                break;
            }
            c++;
        }
        if (!found) {
            System.out.println("Book not Found");
        }
    }

    public void rent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Book to be rented: ");
        String BookToRent = sc.next();
        boolean found = false;
        for (ExamSolution i : al) {
            if (i.Bookname.equals(BookToRent)) {
                if (i.Available > 0) {
                    i.Available--;
                    System.out.println("Book rented");
                } else {
                    System.out.println("Book not Available");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not Found");
        }
    }

    public void returned() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Book to be returned: ");
        String BookToReturn = sc.next();
        boolean found = false;
        for (ExamSolution i : al) {
            if (i.Bookname.equals(BookToReturn)) {
                if (i.Available < i.TotalCnt) {
                    i.Available++;
                    System.out.println("Book returned");
                } else {
                    System.out.println("Book cannot be returned. It's already at max count.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not Found");
        }
    }

    public static void main(String args[]) throws IOException {
        ExamSolution examSolution = new ExamSolution(0, null, 0, 0);
        examSolution.addBook();
        System.out.println("*****************************************");
        examSolution.display();
        System.out.println("*****************************************");
        examSolution.search();
        System.out.println("*****************************************");
        examSolution.rent();
        System.out.println("*****************************************");
        examSolution.returned();
        System.out.println("*****************************************");
    }
}


/*import java.io.*;
import java.util.*;
public class ExamSolution
{
    int id;
    String Bookname;
    int TotalCnt;
    int Available;   
    ArrayList<ExamSolution> al;
    ExamSolution es[]=new ExamSolution[3];
    ExamSolution(int id,String Bookname,int TotalCnt,int Available)
    {
        this.id=id;
        this.Bookname=Bookname;
        this.TotalCnt=TotalCnt;
        this.Available=this.TotalCnt;
        this.al = new ArrayList<>(); 
    }
    public void addBook()
    {
        ExamSolution es[]=new ExamSolution[3];
        for(int i=0;i<3;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Please enter ID : ");
            int id=sc.nextInt();
            System.out.print("Please enter Bookname : ");
            String Bookname=sc.next();
            System.out.print("Please enter Total Count : ");
            int TotalCnt=sc.nextInt();
            Available=TotalCnt;
            es[i]=new ExamSolution(id,Bookname,TotalCnt,Available);
            al.add(es[i]);
        }
    }
    public void display()
    {
        //System.out.println("ID : "+this.id);
        //System.out.println("Bookname : "+this.Bookname);
        //System.out.println("Total Count : "+this.TotalCnt);
        //System.out.println("Total Available : "+this.Available);
        System.out.println("ID : "+this.id);
        System.out.println("Bookname : "+this.Bookname);
        System.out.println("Total Count : "+this.TotalCnt);
        System.out.println("Total Available : "+this.Available);
    }
    public void search()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter Bookname to be searched : ");
        String BookSearch=sc.next();
        int c=0;
        for(ExamSolution i:al)
        {
            if(i.Bookname.equals(BookSearch))
            {
                System.out.println("Book Found at index : "+c);
                //i.display();
            }else{
                System.out.println("Book not Found");
            }
            c++;
        }
    }
    public void rent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter Book to be rented: ");
        int Bookrent=sc.nextInt();
        if(Bookrent<TotalCnt)
        {
            this.Available=this.Available-Bookrent;
            System.out.println("Book rented");
        }else{
            System.out.println("Book not Available");
        }
    }
    public void returned()
    {
        Scanner sc=new Scanner(System.in);
        //System.out.print("Please enter Book to be rented: ");
        System.out.print("Please enter Book to be returned : ");
        int Bookreturn=sc.nextInt();
        if(Bookreturn<TotalCnt)
        {
            this.Available=this.Available+Bookreturn;
            System.out.println("Book returned");
        }else{
            System.out.println("Book not Available");
        }
    }
    public static void main(String args[])throws IOException,NullPointerException
    {
        //ExamSolution examSolution = new ExamSolution(0, null, 0, 0);
        for(ExamSolution i:es)
        {
            examSolution.addBook();
            examSolution.display();
            System.out.println("*****************************************");
            examSolution.search();
            System.out.println("*****************************************");
            examSolution.rent();
            examSolution.display();
            System.out.println("*****************************************");
            examSolution.returned();
            examSolution.display();
            System.out.println("*****************************************");
        }
    }
}*/
