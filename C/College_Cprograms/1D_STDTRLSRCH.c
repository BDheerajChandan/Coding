#include<stdio.h>
int main()
{
	int roll,n,rl;
	printf("enter the number of students");
	scanf("%d",&n);
	int a[n];
	printf("enter the roll number");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("roll numbers :");
	for(int i=0;i<n;i++)
	{
		printf("%d  ",a[i]);
	}
	printf("enter the roll");
	scanf("%d",&rl);
	for(int i=0;i<n;i++)
	{
		if(a[i]==rl)
		{
			printf("roll present");
		}else{
			printf("roll not present");
		}
	}
	return 0;
}
