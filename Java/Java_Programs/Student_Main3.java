import java.io.*;
import java.util.*;
class Student_Main3
{
    public static void main(String args[])throws IOException
    {
        Student_3 s=new Student_3();
        s.read();
        String res_1=s.results();
        s.display(res_1);
    }
}