//Storing Bytes to a File
import java.io.*;
class Writing1
{
public void Writing1()
{
byte name[] = {'P','R','A','T','I','K','\n', 'R','I','T','I','K','\n'};
FileOutputStream outputfile = null;
try
{
outputfile = new FileOutputStream("Names.txt");
outputfile.write(name);
outputfile.close();
}
catch(IOException e)
{
System.out.println(e);
System.exit(-1);
}
}
}