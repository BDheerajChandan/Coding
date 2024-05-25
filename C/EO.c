#include<stdio.h>
int main()
{
	int a;
	printf("enter anumber");
	scanf("%d",&a);
	if((a%2)==0)	
	{
		printf("even number =%d",a);
	}else{
		printf("odd number=%d",a);
	}
	return 0;
}
