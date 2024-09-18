 //Use of Nested if-else statements

import java.lang.*;   
import java.io.*;   
public class Ever20
{
  public  void main(int marks1, int marks2, int marks3, int marks4, int marks5, 
                                                                     int marks6)

    {
       float percentmarks=0;
       int marks= marks1+marks2+marks3+marks4+marks5+marks6;
       percentmarks = marks/6;
       if(percentmarks>=75)
 {
    System.out.println("PASSED WITH STAR");
    }
        else                                                  
    if(percentmarks >=60 )
   {
    System.out.println("IST DIVISION");
     }
 else
    if( percentmarks >=40  )
     {
     
    System.out.println("IInd DIVISION");
      }
      else 
          System.out.println("FAILED");
     
     }
}       


