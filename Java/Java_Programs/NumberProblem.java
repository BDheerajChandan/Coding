import java.io.*;
class NumberProblem {
    private int sumOfFactors(int n) {
        int s=0;
        int i;
        for(i=1;i<n;i++) {
            if(n%i==0)
            s=s+i;
        }
        return s;
       }
    public boolean isPerfect(int n) {
        if(sumOfFactors(n)==n)
        return true;
        else
        return false;
    }
    public void perfectNosBelow(int lim) {
        int k,j;
        int c=1;
        System.out.println("Perfect numbers below " +lim);
          for(k=1;k<lim;k++) {
              if(isPerfect(k)) {
                    System.out.print(+k +"=");
                    for(j=1;j<k;j++) {
                        if(k%j==0)
                        {
                            System.out.print(+j +" " );
                        }
                    }
                    System.out.println(" ");
                }
            }
         System.out.println(" ");
                }
           public static void main(String args[]) throws IOException {
               int lim;
               InputStreamReader reader = new InputStreamReader(System.in);
               BufferedReader input = new BufferedReader(reader);
               System.out.println("Enter number :");
               String n=input.readLine();
               lim=Integer.parseInt(n);
               NumberProblem R = new NumberProblem();
               R.perfectNosBelow(lim);
            }
        }
               


