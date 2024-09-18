//Parameterised Constructor

import java.io.*;
class measure {
  private double kilometre;
  private double metre;
  private double centimetre;
  private double millimetre;

    //Initialisation of values by paratmertised class constructor

measure(double a, double  b, double c, double d) {
  kilometre = a;
  metre = b;
  centimetre = c;
  millimetre = d;
  }
void outputdata(){
  System.out.println("length = " +(+kilometre*1000+metre+centimetre/100+millimetre/1000));
  }
 }
class measurement {
public static void main(String args[]){
        //Constructor calls automatically

  measure distance = new measure(10.0,15.0, 17.5, 35.5);
  System.out.println("Total Length = ");
  distance.outputdata();              //Call member function
  }
}







