class IntArgument {
    //int as argument in the function cal()
    public void cal(int len, int breadth) {
        int area =len*breadth;
              
        System.out.println("Area of Rectangle is=" +area);
    }
public void main() {
   IntArgument p = new IntArgument();
   int l=0;
   int b=0;
   p.cal(l,b);        
  }
}







