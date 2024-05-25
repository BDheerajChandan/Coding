#include<stdio.h>
void main()
{
	int n;
	printf("enter the range");
	scanf("%d",&n);
	char ch[26]="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	if((n<26)&&(n>=0))
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			printf("%c ",ch[j]);
		}
		printf("\n");
	}
}
