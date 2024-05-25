#include<stdio.h>
#include<string.h>
void main()
{
	printf("enter two string\n");
	char str1[20],str2[20];
	scanf("%s%s",&str1,&str2);
	int cmp=strcmp(str1,str2);
	printf("%d",cmp);
}
