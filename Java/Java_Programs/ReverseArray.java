//reverse the array without using temporary variable.

import java.io.*;
class ReverseArray {
    public static void main(String args[]) throws IOException {
        int a[]= new int[10];
        int i=0,j=0;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter Elements of Array= ");
        for(i=0;i<10;i++){
            String x = input.readLine();
            a[i]=Integer.parseInt(x);
        }
        System.out.println("Elements of the Array are=");
        for (i=0;i<10;i++){
            System.out.print(" "+a[i]);
        }
        for(i=0,j=10-1; i<10/2;i++,j--){
            a[i] = a[i]+a[j];
            a[j] = a[i]-a[j];
            a[i] = a[i]-a[j];
        }
        System.out.print("\nReverse Array is=");
        for(i=0; i<10; i++){
            System.out.print(" "+a[i]);
        }
    }
}