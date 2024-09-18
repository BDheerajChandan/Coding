class volume {
    private int side;
    private double rad;
    private double len;
    private double br;
    private double ht;
//method calculate() to calculate volume of cube
    int calculate(int s) {
        side=s;
        return(side*side*side);
    }
//method calculate() to calculate volume of sphere
    double calculate(double r) {
        rad=r;
        return(22*4*rad*rad)/21;
    }
//method calculate() to calculate volume of cuboid
    double calculate(double l, double b, double h) {
        len=l;
        br=b;
        ht=h;
        return(len*br*ht);
    }
public void main() {
    System.out.println("Volume of a cube is=" +calculate(side));
    System.out.println("Volume of a sphere is=" +calculate(rad));
    System.out.println("Volume of a cuboid is=" +calculate(len,br,ht));
  }
}



