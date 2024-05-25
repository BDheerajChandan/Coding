#include<stdio.h>
#include<math.h>
float main()
{
	float a,b,c,n,n1=0;
	float x1,x2,x;
	printf("enter the numbers");
	scanf("%f%f%f",&a,&b,&c);
	n=(b*b)-(4*a*c);	
	x1=(-b+n)/(2*a);
	x2=(-b-n)/(2*a);
	printf("roots are =%f",x1);
	printf(" and %f",x2);
}
