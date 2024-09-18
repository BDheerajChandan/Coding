//Use of If-else statement

import java.lang.*;  
import java.io.*;   
public class Ever21
{
  public void main(int PREP, int time) 
                    
        {
   
    double x,PO;
    x=1.06;
    System.out.println("Present Population of the Country =" +PREP);
    System.out.println("Number of Years =" +time);
    if(time==1)
    {
    PO=PREP*x;
    System.out.println("Population of the Country After One Year =" +PO);
    }
        else                                                  
    if(time==2 )
   {
 PO=PREP*x*x;
    System.out.println("Population of the Country After Two Years =" +PO);
    }
    if(time==3 )
   {
 PO=PREP*x*x*x;
    System.out.println("Population of the Country After Three Years =" +PO);
   }
     }
}       


