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
	int num=0;
	for(int i=0;i<n;i++)
	{
		int c=0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
				c++;
			}
		}
		printf("%d repeated %d times\n ",a[i],c);
		c=0;
	}
	return 0;
}
