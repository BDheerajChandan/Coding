#include<stdio.h>
#include<math.h>
int main()
{
	int y=1,x,n;
	printf("enter a number");
	scanf("%d%d",&n,&x);
	for(int i=1;i<=n;i++)
	{
		y=y*x;
	}
	printf("%d to the power of %d =%d",n,x,y);
	return 0;
}

