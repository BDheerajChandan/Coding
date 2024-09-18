class FloatArgument {
    //float as argument in the function cal()
    public void cal(float basic, float da) {
      float gross = basic +basic*da/100;
             
        System.out.println("Gross Salary is=" +gross);
    }
public void main() {
   FloatArgument p = new FloatArgument();
   float r=0;
   float d=0;
   p.cal(r,d);        
  }
}





