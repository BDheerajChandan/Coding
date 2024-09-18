class VoidType {
    //Argument as void in the function cal()
    public void cal() {
        int i,product=1;
        for(i=1;i<6;i++)
        product=product*i;
        System.out.println("Product is=" +product);
    }
public void main() {
    VoidType p = new VoidType();
    p.cal();
  }
}

