#include<stdio.h>
int main()
{
	int n,num1,num2;
	printf("enter the range");
	scanf("%d",&n);
	int a[n];
	printf("enter the elemnts\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	printf("largest and smallest number in araray is :");
	for(int j=1;j<n;j++)
	{
		if(a[j]>a[j-1])
		{
			num1=a[j],num2=a[j-1];		
		}else{
			num1=a[j-1],num2=a[j];
		}
	}
	printf(" %d %d",num1,num2);
	return 0;
}
