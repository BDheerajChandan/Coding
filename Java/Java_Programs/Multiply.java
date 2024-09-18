import java.io.*;
class Multiply {
public static void main(String args[]) throws IOException {
    int a[][] = new int[10][10];
    int b[][]= new int[10][10];
    int c[][] = new int[10][10];
    int i,j,k;
    int  r1,c1,r2,c2;
    i=j=k=0;
    r1=c1=r2=c2=0;
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(reader);
    System.out.println("Enter the Number of rows of First Array=");
    String x = input.readLine();
    r1=Integer.parseInt(x);
    System.out.println("Enter the Number of columns of First Array=");
    String y = input.readLine();
    c1=Integer.parseInt(y);
    System.out.println("Enter the Number of rows of Second Array=" );
    String x1 = input.readLine();
    r2=Integer.parseInt(x1);
    System.out.println("Enter the Number of columns of Second Array=");
    String s = input.readLine();
    c2 = Integer.parseInt(s);
    System.out.println("Enter Elements of the First Array=");
    for (i=0;i<r1;i++) {
        for (j=0;j<c1;j++) {
            String y1 = input.readLine();
            a[i][j]=Integer.parseInt(y1);
        }
    }
    System.out.println("Enter Elements of the Second Array=");
    for (i=0;i<r2;i++) {
        for (j=0;j<c2;j++) {
            String s1 = input.readLine();
            b[i][j]=Integer.parseInt(s1);
        }
    }
    System.out.print("Elements of the First Array are=");
    System.out.print("\n");
    for (i=0;i<r1;i++) {
        for (j=0;j<c1;j++) {
            System.out.print(" "+a[i][j]);
        }
    }
    System.out.print("Elements of the Second Array are=");
    for (i=0;i<r2;i++) {
        for (j=0;j<c2;j++) {
            System.out.print(" " +b[i][j]);
            System.out.print("\n");
        }
    }
    System.out.print("Product of Array Elements is =");
    for (i=0;i<r1;i++) {
        for (j=0;j<c2;j++) {
            c[i][j]=0;
            for(k=0;k<c1; k++) {
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
                System.out.print(" "+c[i][j]);
            }
        }
    }
  }
}



