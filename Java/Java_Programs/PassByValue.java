class PassByValue {
  public void change() {
  int a = 12;
  System.out.println("Original Value of a = " +a);
  System.out.println("Changed  Value of a = " +value(a));
  System.out.println("Again the value of a = " +a);
  }
  public static int value(int x) {
   x=10;
   return x;
  }
}
