import java.io.*;
import java.util.*;
class ConstructorMain
{
    public static void main(String args[])
    {
        StudentConstructor stc_1=new StudentConstructor();
        stc_1.display();
        StudentConstructor stc_2=new StudentConstructor(1,"Dheeraj");
        stc_2.display();
        StudentConstructor stc_3=new StudentConstructor(2,"Chandan");
        stc_3.display();
        StudentConstructor stc_4=new StudentConstructor(3,"Teja");
        stc_4.display();
    }
}