#include<stdio.h>
#include<string.h>
void main()
{
	char str1[20],str2[20];
	int ch,c=0;
	printf("enter a string\n");
	scanf("%s",str1);
	int n=strlen(str1);
	printf("press 1 for reverse of a string by using function\n");
	printf("press 2 for reverse of a string without using function\n");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
		str2[20]=strsep[str1];
		printf("%s",str2);
		break;
		case 2:
		for(int i=n-1;i>=0;i--)
		{
			str2[c]=str1[i];
			printf("%c",str2[i]);
			c++;
		}
		default:
		printf("invalid choice");
	}
}
