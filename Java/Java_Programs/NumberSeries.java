import java.io.*; 
    class NumberSeries {
        private int num; 
        private boolean IsPrime() { 
            int prime = 1; 
            int i=0; 
            for(i=2; i<num; i++) { 
                if(num%i == 0) 
                prime=0; 
            } 
            if(prime == 1) 
            return true; 
            else 
            return false; 
        } 
        public void Fibbonacci(int n) { 
            int a=1; 
            int b=1; 
            num =a+b; 
            int i; 
            for(i=3; num <n; i++) { 
                if(IsPrime()) { 
                    System.out.println(+num); 
                } 
                a=b; 
                b=num; 
                num=a+b; 
            } 
            System.out.println(" "); 
        } 
        public static void main(String args[]) throws IOException { 
            int lim; 
            InputStreamReader reader = new InputStreamReader(System.in); 
            BufferedReader input=new BufferedReader(reader); 
            System.out.println("Enter number : "); 
            String n=input.readLine(); 
            lim = Integer.parseInt(n); 
            NumberSeries R = new NumberSeries(); 
            System.out.println("Fibonacci primes up to "+lim); 
            R.Fibbonacci(lim); 
        } 
} 



