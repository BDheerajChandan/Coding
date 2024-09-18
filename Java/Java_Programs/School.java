class School
{
private String name;
private String father; 
School(String a, String b)
{
name = a;
father = b;
}
public void outputdata()
{
System.out.println( "Name of the Student = "  +name);
System.out.println( "Father's Name  = "  +father);
}
}

//First derived class
class Student extends Stu
{
int rollno;
double average;

Student(String a, int b, int c, double v)
{
super(a,b);
roll=c;
average = v;
}
void showdata()
{
System.out.println("Roll Number = " +rollno);
System.out.println("Name = " +name);
System.out.println("Average Marks = " +average);
}
}

class Ever71
{
public  void main()
			
{
Student s = new Student("Pratiek", "Sh.T.Malhotra", 123, 88.66);
s.showdata();
s.outputdata();
}
}

