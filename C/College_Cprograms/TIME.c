#include<stdio.h>
int main()
{
	int h1,h2,m1,m2,s1,s2,HR,MNT,SEC;
	printf("enter the time:1\n");
	scanf("%d\t%d\t%d",&h1,&m1,&s1);
	printf("enter the time:2\n");
	scanf("%d\t%d\t%d",&h2,&m2,&s2);
	printf("\n\ntotal time:\n");
	HR=h1+h2;
	MNT=m1+m2;
	SEC=s1+s2;
	if(SEC>59)
	{
		MNT=MNT+1;
		SEC=SEC-60;
		if(MNT>59)
		{
			HR=HR+1;
			MNT=MNT-60;
		}
	}
	printf(" hours\tminutes\tseconds \n");
	printf("%d\t%d\t%d",HR,MNT,SEC);
	return 0;
} 
