class loop2 {
    public void main() {
        int a;
        int n =10;
        double fact;
        fact=1;
        a=1;
        do {
            fact=fact*a;
            a++;
        }
            while(a<=n);
            System.out.println("Factorial of 10=" +fact);
        }   
    }
    
    