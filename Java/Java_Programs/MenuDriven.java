import java.io.*;
class MenuDriven {
 public static void main(String args[]) throws IOException {
      
         System.out.println("********* SUMMATION PROGRAM  **********");
  
         InputStreamReader reader = new InputStreamReader(System.in);
         BufferedReader input = new BufferedReader(reader);
         System.out.println("1. s=1/4 + 1/8 + 1/12 + .......upto n terms");
         System.out.println("2. s=1/1! - 2/2! + 3/3! .......upto n terms");
         System.out.println();
         System.out.println("Enter your choice::");
         String x = input.readLine();
         int ch = Integer.parseInt(x);
         switch(ch) {
             case 1:
            int c=1;
            double y, s=0;
            System.out.println("Enter the no. of terms");
            String a = input.readLine();
            int n = Integer.parseInt(a);
            
            for (int i=4;c<=n;i=i+4)
            {
                y=1.0/i;
                s=s+y;
                c++;
            }
            System.out.println(s);
        break;
        
        
        case 2:
        int j;
        double d=1;
        double sum=0;
        double w=0;
            System.out.println("Enter the no. of terms");
            String t = input.readLine();
            int m = Integer.parseInt(t);

            for(j=1;j<=m;j++)
            {
                
                int p=1;
                for(int k=1;k<=m;k++)
                {
               p=p*k;
            }
            w=(d+j)/p;
            if(j%2==0)
            sum=sum-w;
            else
            sum=sum+w;
        }
        System.out.print(sum);
    
}
}

}