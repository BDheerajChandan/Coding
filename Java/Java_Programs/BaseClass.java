import java.io.*;
    class BaseClass {
        int a;
    }
class SubClass extends BaseClass {
    int a;
SubClass(int x, int y) {
    super.a = x;
    a=y;
}
void showdata() {
    System.out.println("a is in super class : " +super.a);
    System.out.println("a is in sub class : " +a);
  }
}
class Ever71 {
    public void main() {
        SubClass s = new SubClass(5,7);
        s.showdata();
    }
}



