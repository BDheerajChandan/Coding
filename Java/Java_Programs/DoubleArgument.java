class DoubleArgument {
    //double as argument in the function cal()
    public void cal(double radius ) {
        double area = 22*radius*radius/7;
              
        System.out.println("Area of Circle is=" +area);
    }
public void main() {
   DoubleArgument p = new DoubleArgument();
   float r=0;
   p.cal(r);        
  }
}



