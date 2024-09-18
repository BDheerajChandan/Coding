import java.io.*;
import java.util.*;
class Token
{
public void Token() throws Exception
{
FileReader f = new FileReader("Stock.txt");
BufferedReader input = new BufferedReader(f);
String n;
int i;
int token=0;
while(( n = input.readLine())!= null)
{
StringTokenizer data = new StringTokenizer(n);
token = token + data.countTokens();
}
System.out.println("Number of Tokens = " +token);
input.close();
}
}
