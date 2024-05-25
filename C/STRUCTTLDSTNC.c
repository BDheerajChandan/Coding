#include<stdio.h>
struct dst
{
	int d1,d2;
};
int main()
{
	struct dst d[2];
	printf("enter the distance \n");
	for(int i=0;i<2;i++)
	{
		scanf("%d%d",&d[i].d1,&d[i].d2);
	}
	printf("D1\tD2\ttotdst \n");
	for(int i=0;i<2;i++)
	{
		printf("%d\t%d\t",d[i].d1,d[i].d2);
		int totdst=d[i].d1+d[i].d2;
		printf("%d\n",totdst);
	}
}
