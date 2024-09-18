class Proverb1
{
 void inputstring(String name)
{
int j,k,l,m,n;
j=0;
k=0;
l=0;
m=0;
n=0;

for (int i=0; i<name.length(); i++)
{
char chr = name.charAt(i);
if (chr == 'a' || chr== 'A')
{
j++;
System.out.println("No. of A's = " +j);
}

if (chr == 'e' || chr== 'E')
{
k++;
System.out.println("No. of E's = " +k);
}

if (chr == 'i' || chr== 'I')
{
l++;
System.out.println("No. of I's = " +l);
}

if (chr == 'o' || chr== 'O')
{
m++;
System.out.println("No. of O's = " +m);
}

if (chr == 'u' || chr== 'U')
{
n++;
System.out.println("No. of U's = " +n);
}
}
}
}