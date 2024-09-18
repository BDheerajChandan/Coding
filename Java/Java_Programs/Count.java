import java.io.*;
class Count
{
int ch,word,line;
public void Word(Reader read) throws Exception
{
StreamTokenizer t = new StreamTokenizer(read);
t.whitespaceChars(0, ' ');  
t.eolIsSignificant(true);
while(t.nextToken() != t.TT_EOF)
{
if(t.ttype == t.TT_EOL)
{
ch++;
line++;
}
else if(t.ttype == t.TT_WORD)
{
word++;
}
else 
ch = ch+t.sval.length();
}
}
public void result(String s) throws Exception
{
Word(new FileReader(s));
System.out.println("Total  Lines,  Words and  Characters  are  =" 
+line + " " +word +" " +ch);
}
}











