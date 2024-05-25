#include<stdio.h>
int main()
{
	int i,j,a,b,c,D,s1=1,n1,s3,n2,n=1,num1,num,num2,s2;
	printf("enter the numbers for finding HCF \n");
	scanf("%d%d%d%d",&a,&b,&c,&D);
	if(a>b)
	{
		num1=a;
	}else{
		num1=b;
	}
	for(i=1;i<=num1;i++)
	{
		if(((a%i)==0)&&((b%i)==0))
		{
			s1=i;
		}
	}
	n1=(a*b)/s1;
	printf("n1 =%d\n",n1);
	if(c>D)
	{
		num2=c;
	}else{
		num2=D;
	}
	for(j=1;j<=num2;j++)
	{
		if(((c%j)==0)&&((D%j)==0))
		{
			s2=j;
		}
	}
	n2=(c*D)/s2;
	printf("n2 =%d\n",n2);
	if(n1>n2)
	{
		num=n1;
	}else{
		num=n2;
	}
	for(j=1;j<=num;j++)
	{
		if(((n1%j)==0)&&(n2%j)==0)
		{
			s3=j;
		}
	}
	float lcm=(n1*n2)/s3;/*relation between LCM and HCF*/
	printf(" LCMof 4 numbers is =%f ",lcm);
}
