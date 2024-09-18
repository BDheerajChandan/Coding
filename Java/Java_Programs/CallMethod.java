class CallMethod {
  public double area(double a, double b) {
    double x;
    x=a*b;
    return x;
   }
  public void AccessingMethod(){
    double x = 4.2;
    double y = 3.3;
    double z = 0;
    z = area(x,y);      //Calling the method area().
    System.out.println("Area of a rectangle is=" +z);
  }
}

