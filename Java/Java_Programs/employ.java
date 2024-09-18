class employ {
    private String empname;
    private String pfno;
    void inputdata(String a, String b) {
        empname=a;
        pfno=b;
    }
public void outputdata() {
    System.out.println("=================================");
    System.out.println("Name of Employee:::" +empname);
    System.out.println("PF No.:::" +pfno);
}
}
//First derived class starts here
class derivedemp extends employ {
    double salary, grosspay;
    double da,hra,pf,netpay;
    derivedemp(double value) {
    salary = value;
}
void calculate() {
    da=1.5*salary;
    System.out.println("DA = " +da);
}
void calculatehra() {
    hra=0.1*salary;
    System.out.println("HRA = " +hra);
}
void pfdeduction() {
    pf=0.12*salary;
    System.out.println("PF Deduction =" +pf);
}
void calculategross() {
    grosspay = salary+hra+da;
    System.out.println("Gross Salary of Employee =" +grosspay);
}
void calculatenetpay() {
    netpay = grosspay-pf;
    System.out.println("Net Pay of Employee =" +netpay);
}
}
//Second derived class.  It inherits properties fromn base class.
class derivedsecond extends employ {
    private double bankbalance;
    derivedsecond(double value) {
        bankbalance = value;
}
void calculatebalance() {
    System.out.println("Bank Balance of the Employee =" +bankbalance);
}
}

