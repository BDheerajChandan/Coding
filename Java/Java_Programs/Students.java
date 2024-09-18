import java.io.*;
class Students { 
    private String name; 
    private int rollno; 
    private String classname; 
    private int marks1,marks2,marks3,marks4,marks5,marks6; 
    private float totl;
    private float per; 
    private String grade; 
    public void student() { 
        totl=0; 
        per=0; 
    } 
    public void set() { 
        name="ram"; 
        rollno= 101; 
        classname= "9th"; 
        marks1= 80; 
        marks2=70; 
        marks3=70; 
        marks4=70; 
        marks5=70; 
        marks6=70; 
    } 
    public void get() { 
        System.out.println ("name :"+name);
        System.out.println("Roll No :"  +rollno); 
        System.out.println ("Class  :"  +classname);
        System.out.println("Total marks :" +total()); 
        System.out.println("Percentage : " +percentage());
        System.out.println("Grade   : "+grade()); 
        System.out.println(" "); 
    }
    public float total() { 
        totl = marks1 +marks2 + marks3 + marks4+marks5+ marks6; 
        return(totl); 
    } 
    public float percentage() { 
        per=totl/6; 
        return(per); 
    } 
    public String grade() { 
        if (per >= 90) grade = "a"; 
        else if (per >= 80) grade = "b"; 
        else if (per >= 70) grade = "c"; 
        else if (per >= 60) grade = "d"; 
        else if (per >= 50) grade ="e"; 
        else grade = "f"; 
        return(grade); 
    } 
    public static void main(String args[]) throws IOException { 
        Students R = new Students(); 
        R.set(); 
        R.get(); 
    } 
} 
