#include<stdio.h>
int main()
{
	int n;
	printf("enter the range");
	scanf("%d",&n);
	int a[n];
	printf("enter the elements");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("array is :");
	for(int i=0;i<n;i++)
	{
		printf("%d  ",a[i]);
	}
	printf("\n");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			printf("%d is even\n",a[i]);
		}else{
			printf("%d is odd\n",a[i]);
		}
	}
	return 0;
}

