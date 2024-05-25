#include<stdio.h>
struct std
{
	int roll,marks;
	char name[20];char gender[1];
};
void main()
{
	printf("enter the number of students\n");
	int n,i,j;
	scanf("%d",&n);
	struct std s[n];
	printf("enter roll,name,gender,marks\n");
	for(i=0;i<n;i++)
	{
		scanf("%d%s%s%d",&s[i].roll,s[i].name,s[i].gender,&s[i].marks);
	}
	printf("\nroll\tname\tgender\tmarks\n\n");
	for(int i=0;i<n;i++)
	{
		printf("%d\t%s\t%s\t%d\n",s[i].roll,s[i].name,s[i].gender,s[i].marks);
	}
}
