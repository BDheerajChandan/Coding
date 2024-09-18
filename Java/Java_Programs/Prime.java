import java.io.*;
class Prime {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, sum=0;
        int num=100;
        for(i=2;i<=num-1;i++)
        sum=sum + i;
        System.out.println("Sum=" +sum);
    }
}