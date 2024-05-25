#include<stdio.h>
struct std
{
	int roll,marks;
	char name[20],gender;
};
void main()
{
	struct std stdnt[1];
	printf("enter roll,name,gender,marks");
	for(int i=0;i<=0;i++)
	{
		scanf("%d %s %c %d",&stdnt[i].roll,stdnt[i].name,&stdnt[i].gender,&stdnt[i].marks);
		printf("roll\tname\tgender\tmarks\n\n");
		printf("%d\t%s\t%c\t%d",stdnt[i].roll,stdnt[i].name,stdnt[i].gender,stdnt[i].marks);
	}
}
