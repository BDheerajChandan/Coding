#include<stdio.h>
int main()
{
	int n,sme=0,smo=0;
	printf("enter the range");
	scanf("%d",&n);
	for(int i=1;i<=n;i++)
	{
		if((i%2)==0)
		{
			sme=sme+i;
		}else{
			smo=smo+i;
		}
	}
	int differ;
	if(sme>smo){
	differ=sme-smo;
	}else{
	differ=smo-sme;}
	printf("difference between sum of all odd and even numbers is=%d",differ);
	return 0;
}
