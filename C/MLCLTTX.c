#include<stdio.h>
void main()
{
	int n,amt;
	float amtchrg;
	printf("enter the choice ");
	printf("press 1 for mill cloth\n press 2 for handloom items");
	scanf("%d",&n);
	printf("enter the amount ");
	scanf("%d",&amt);
	switch(n)
	{
		case 1:
		if((amt>=0)&&(amt<=100))
		amtchrg=amt;
		else if((amt>=101)&&(amt<=200))
		amtchrg=amt-(amt*(5/100));
		else if((amt>=201)&&(amt<=300))
		amtchrg=amt-(amt*(7.5/100));
		else
		amtchrg=amt-(amt*(10/100));
		break;
		
		case 2:
		if((amt>=0)&&(amt<=100))
		amtchrg=amt-(amt*(5/100));
		else if((amt>=101)&&(amt<=200))
		amtchrg=amt-(amt*(7.5/100));
		else if((amt>=201)&&(amt<=300))
		amtchrg=amt-(amt*(10/100));
		else
		amtchrg=amt-(amt*(15/100));
		break;
		
		default:
		printf("invalid choice");
	}
	printf("total amount charge paid =%f",amtchrg);
}
