import java.io.*;
import java.util.Scanner;
class JavaInputs
{
    public static void main(String args[])throws IOException
    {
        //InputStreamReader reader=new InputStreamReader(System.in);
        //BufferedReader input=new BufferedReader(reader);
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter the integer : ");                
        int size=Integer.parseInt(input.readLine());  // integer
        System.out.print("Enter the  Long : ");
        long l=Long.parseLong(input.readLine());  // Long
        System.out.print("Enter the  string : ");
        String str=input.readLine();   // String
        System.out.print("Enter the  Double : ");
        double d=Double.parseDouble(input.readLine()); // Double
        System.out.print("Enter the  Float : ");
        float f=Float.parseFloat(input.readLine()); // Float
        //System.out.print("Enter the  Charater : ");
        //char c=Character.parseChar(input.readLine()); // Character
        System.out.println(size+" \n"+l+"\n "+str+"\n "+d+" \n"+f+"");
    }
}