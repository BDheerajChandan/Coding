#include<stdio.h>
#include<string.h>
void main()
{
	char str1[20],str2[20];
	printf("enter a string");
	scanf("%s",str1);
	int n=strlen(str1),ch;
	printf("press 1 for copying text with using function\n");
	printf("press 2 for copying text without using function\n");
	printf("enter the choice ");
	scanf("%d",&ch);
	switch(ch)
	{
	case 1:	
	strcpy(str2,str1);
	printf("%s",str2);
	break;
	case 2:
	for(int i=0;i<n;i++)
	{
		str2[i]=str1[i];
	}
	printf("%s",str2);
	break;
	default:
	printf("invalid choice");
	}
}
