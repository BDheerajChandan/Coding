class reverseorder {
int i,a,p,j,len;
public reverseorder() {
p=0;
}
public void newstr(String s) {
len=s.length();
System.out.print(s);
for(i=0;i<len;i++) {
char ch=s.charAt(i);
a=(int) ch;
if(a==32 || i==len-1) {
for(j=i;j>=p;j--);
char c=s.charAt(j);
System.out.print(c);
}
System.out.print(" ");
p=i;
}
}
}