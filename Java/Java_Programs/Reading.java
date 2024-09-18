//Reading Bytes from a file

import java.io.*;
class Reading
{
public void Reading()
{
byte name[] = {'P','R','A','T','I','K','\n', 'R','I','T','I','K','\n'};
FileInputStream inputfile = null;
int value;
value=0;
try
{
inputfile = new FileInputStream("Names.txt");
while(inputfile.read()!= -1)
{
System.out.println((char)value);
}
inputfile.close();
}
catch(IOException e)
{
System.out.println(e);
System.exit(-1);
}
}
}