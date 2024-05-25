#include<stdio.h>
void main()
{
	int n,a,b;
	float c;
	printf("press 1 for additon\n");
	printf("press 2 for substraction\n");
	printf("press 3 for multiplication\n");
	printf("press 4 for division\n");
	printf("enter the choice\n");
	scanf("%d",&n);
	printf("enter the numbers\n");
	scanf("%d%d",&a,&b);
	switch(n)
	{
		case 1:
		c=a+b;
		break;
		case 2:
		c=a-b;
		break;
		case 3:
		c=a*b;
		break;
		case 4:
		c=a/b;
		break;
		default:
		printf("invalid choice");
	}
	printf("value is=%f",c);
}
