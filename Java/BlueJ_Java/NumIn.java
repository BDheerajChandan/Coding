import java.io.*;
class NumIn
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader input=new BufferedReader(reader);
		System.out.print("Please enter the input : ");
		int num=Integer.parseInt(input.readLine());
		System.out.println("Entered number : "+num);
	}
}