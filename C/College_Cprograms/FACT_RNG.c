#include<stdio.h>
void main()
{
	int f=1,n;
	float t=1.0,s=0.0;
	printf("enter the range");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		f=f*i;
		t=1/f;
		s=s+t;
	}
	printf("%f",s);
}
