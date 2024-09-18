import java.io.*;
class AreaSquars {
    public static void main(String args[]) throws IOException {
        double x,y,z;
        x=2.0;
        y=5.5;
        z=x+3*y;
        char choice;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.print("Enter Choice::");
        System.out.println("1 for Square1");
        System.out.println("2 for Square2");
        System.out.println("3 for Square3");
        System.out.flush();
        {
            switch(choice=(char)System.in.read()) {
                case '1':
                case 'a': System.out.println("Area of Square 1="+(x*x));
                break;
                case '2':
                case 'b': System.out.println("Area of Square 2="+(y*y));
                break;
                case '3':
                case 'c': System.out.println("Area of Square 3="+(z*z));
                break;
                default: System.out.println("Wrong Choice");
            }
        }
    }
}