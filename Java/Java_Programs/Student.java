
public class Student
{
    
public void Student(String name,int roll,double m1,double m2,double m3,
                                                    double m4,double m5)
{
double sum;
double percent;
double avg;
System.out.println("Marks in Five Subjects=" +m1 +"," +m2 +"," +m3 
                                                +"," +m4 +"," +m5);
sum = m1+m2+m3+m4+m5;
percent= sum*100/500;
avg=sum/5;
System.out.println("Name of the Student=" +name);
System.out.println("Roll No. of Student=" +roll);
System.out.println("Average Marks are=" +avg);
 if (percent >=60 && percent <70)
{
System.out.println("Your Admission in Commerce without Maths");
}
else if
(percent>=70 && percent<80)
{
System.out.println("Your Admission in Commerce with Maths");
}
else if (percent>=80 && percent<90)
{
System.out.println("Your Admission in Science without Computers");
}
else if (percent>90)
{
System.out.println("Your Admission in Science with Computers");
}
}
}


