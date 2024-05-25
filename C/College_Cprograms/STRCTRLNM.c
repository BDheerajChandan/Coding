#include<stdio.h>
struct std
{
	int roll;
	char name[20];
};
int main()
{
	struct std stdnt[3];
	printf("enter the roll number and name \n");
	for(int i=0;i<3;i++)
	{
	scanf("%d%s",&stdnt[i].roll,stdnt[i].name);
	}
	printf("roll\tname\n\n");
	for(int i=0;i<3;i++)
	{
	printf("%d\t%s\n",stdnt[i].roll,stdnt[i].name);
	}
}
