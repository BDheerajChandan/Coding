#include<stdio.h>
#include<string.h>
void main()
{
	char ch1[10]="dfg rt nm";
	int n=0;
	char ch2[10];
	for(int i=0;i<10;i++)
	{
	if(ch1[i]!=' ')
	{
		ch2[n]=ch1[i];
	}
		n++;
	}
	for(int i=0;i<n;i++)
	{
		printf("%c",ch2[i]);
	}
}
