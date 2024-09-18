class Fraction {
int num;
int den;
public Fraction(int a, int b) {
num=a;
den=b;
}

private int hcf(int y1, int y2) {
num=y1;
den=y2;
return 0;
}
private int lcm(int y3, int y4) {
int p=0, i,lcm=0,hcf=0;
p=num*den;
for(i=1;i<p;i++) {
if(num%i == 0 && den%i ==0)
hcf=i;
}
lcm=p/hcf;
System.out.println("LCM=" +lcm);
System.out.println("HCF=" +hcf);
return 0;
}
}
