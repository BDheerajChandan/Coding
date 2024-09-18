class MethodOverloading {
       //method to add two integer variables
int addition(int x, int y) {
    return(x+y);
}
      //method to add two float variables
      float addition(float x, float y) {
          return (x+y);
        }
        public void main() {
            int n1=10;
            int n2=15;
            int r1;
            float x1=12;
            float x2=9;
            float r2;
            r1=addition(n1,n2);
            r2=addition(x1,x2);
            System.out.println("r1=" +r1);
            System.out.println("r2=" +r2);
        }
}






