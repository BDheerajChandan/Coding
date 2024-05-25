#include<stdio.h>
int main()
{
int a,s=0,d;
printf("enter the number\n");
scanf("%d",&a);
int t=a;
while(a!=0)
{
	d=a%10;
	s=(s*10)+d;
	a=a/10;
}
printf("%d",s);
if(t==s)
{
printf("Palindrome");
}
else{
printf("not a palindrome");
}
return 0;
}
