class pureimpure {
private double a,b,c;
    public pureimpure() {
        a=10.0;              //initializing values
        b=10.0;
        c=1.0;              //Here c is equal to 1.0
    }
    public double addition() {
        return (a+b);       //pure function. Returning exact value.
    }
    public void addition1() {
        c=a+b;             //impure function.  Returning changed value of c.
        System.out.println("Sum of values=" +c);
    }
}

