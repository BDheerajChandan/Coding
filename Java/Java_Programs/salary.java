import java.io.*;
class salary {
	private String tname;
	private String taddress;
	private int phone;
	private String subject;
	private float salary;
	private float tax;
public void inputdata(String n, String ad, int ph, String sub, float sal) throws IOException {
	tname=n;
	taddress=ad;
	phone=ph;
	subject=sub;
	salary=sal;    
	}
void displaydata(){
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println("Name of the Teacher=" +tname);
        System.out.println("Address" +taddress);
        System.out.println("Phone Number="+phone);
        System.out.println("Subject Specialisation="+subject);
        System.out.println("Monthly Salary="+salary);
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =");
        }
    public void compute() {
        float totalsal;
        totalsal = (float)12.0*salary;
        if (totalsal>175000) {
        tax=(totalsal-175000)*5/100;
        System.out.println("Total Annual Salary is=" +totalsal);
        System.out.println("Annual Income Tax is=" +tax);
    }
    else
       System.out.println("No Tax Amounts on this income");
    }
}











