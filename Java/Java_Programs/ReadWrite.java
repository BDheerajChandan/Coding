//Writing stock items and quantity into a file
import java.io.*;
import java.lang.*;
class ReadWrite
{

String fileName = "Stock.txt";
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader stdin = new BufferedReader(reader);
public void readwrite()
{
try
{
int productcode=0;
int quantity=0;
float price=0;
FileOutputStream outfile = new FileOutputStream(fileName);
DataOutputStream doutfile = new DataOutputStream(outfile);
for (int i = 0; i<6; i++)
{
outfile.write(productcode);
System.out.print("Product Code :");
productcode = Integer.parseInt(stdin.readLine());
System.out.print("Quantity:");
outfile.write(quantity);
quantity = Integer.parseInt(stdin.readLine());
System.out.print("Price:");
doutfile.writeFloat(price);
price=Float.parseFloat(stdin.readLine());
}
outfile.close();
doutfile.close();
}
catch(IOException ioe)
{
System.out.println(ioe);
System.exit(-1);
}
}
}




