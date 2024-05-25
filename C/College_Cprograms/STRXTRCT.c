#include<stdio.h>
#include<stdio.h>
void main()
{
	char str1[20];
	printf("enter the string ");
	scanf("%s",str1);
	char ch;
	for(int i=0;i<20;i++)
	{
		if(str1[i]==' ')
		{
		ch=str1[i+1];
		printf("%c",ch);
		}
	}
}
