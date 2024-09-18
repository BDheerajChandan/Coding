import java.io.*;
class Calculator { 
    private int a; 
    private int b; 
    private int result; 
    public void enter(int x, int y){ 
        a = x; 
        b = y; 
    } 
    public void clear() { 
        a = 0; 
        b = 0; 
        System.out.println("a= " +a); 
        System.out.println("b= " +b); 
    } 
    public int addition(){ 
        return(a+b); 
    } 
    public int subtraction(){ 
        return(a-b); 
    } 
    public int multiplication(){ 
        return(a*b); 
    } 
    public int integerdivision(){ 
        return (a/b); 
    } 
    public int remainder() { 
        return(a%b); 
    } 
    public void unaryminus(){ 
        System.out.println("a= " +(-a)); 
        System.out.println("b= " +(-b)); 
    } 
    public static void main(String args[]) throws IOException { 
        int choice; 
        int p,q; 
        while(true) { 
            InputStreamReader reader=new InputStreamReader(System.in); 
            BufferedReader input=new BufferedReader(reader); 
            System.out.println("l. Addition :: "); 
            System. out.println ("2. Subtraction :: "); 
            System.out.println("3. Multiplication :: "); 
            System.out.println("4. Integer division :: "); 
            System. out.println ("5. Remainder:: "); 
            System. out.println ("6. Unaryminus :: "); 
            System.out.println("7. Clear :: "); 
            System.out.println("8. Exit :: "); 
            System.out.println("Enter One Number : "); 
            String n=input.readLine(); 
            p = Integer. parseInt(n); 
            System.out.println("Enter Second Number : "); 
            String m=input.readLine(); 
            q = Integer.parseInt(m); 
            System.out.println("Enter choice :: "); 
            String o=input.readLine(); 
            choice = Integer.parseInt(o); 
            Calculator R = new Calculator(); 
            R.enter(p,q); 
            switch(choice) { 
                case 1: 
                System.out.println("Addition = " + R.addition()); 
                break; 
                case 2: 
                System.out.println("Subtraction = " + R.subtraction()); 
                break; 
                case 3: 
                System.out.println("Multiplication = " + R.multiplication()); 
                break; 
                case 4: 
                System.out.println("Integer division = " + R.integerdivision()); 
                break; 
                case 5: 
                System.out.println("Remainder = " + R.remainder()); 
                break; 
                case 6: 
                R.unaryminus(); 
                break; 
                case 7: 
                R.clear(); 
                break; 
                case 8: 
                System.out.println(" "); 
                return; 
            } 
        } 
    } 
} 
