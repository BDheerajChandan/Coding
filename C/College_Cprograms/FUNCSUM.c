#include<stdio.h>
int main()
{
	int no1,no2,res;
	printf("enter the numbers\n");
	scanf("%d%d",&no1,&no2);
	res=sum(no1,no2);
	printf("sum is %d",res);
	return 0;
}
int sum(int no1,int no2)
{
	int add=no1+no2;
	return add;
}
