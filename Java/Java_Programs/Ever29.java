public class Ever29
{
public void  reverseIt(String source)
{
int a;
int length;
length=source.length();
StringBuffer dest = new StringBuffer(length);
for( a=(length-1); a>=0; a--)
dest.append(source.charAt(a));
return dest.toString();
}
}