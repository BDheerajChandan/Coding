#include<stdio.h>
int main()
{
	int f=1,d,t,n,s=0;
	printf("enter the number");
	scanf("%d",&n);
	t=n;
	while(n!=0)
	{
		d=n%10;
		for(int i=1;i<=d;i++)
		{
			f=f*i;
		}
		s=s+f;
		f=1;
		n=n/10;
	}
	if(s==t)
	{
		printf("%d is a strong number",t);
	}else{
		printf("%d is not astrong number",t);
	}
	return 0;
}
