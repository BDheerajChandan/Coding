#include<stdio.h>
#include<ctype.h>
void main()
{
	char ch[20];
	printf("enter the string");
	gets(ch);
	int i=0;
	while(ch[i]!='\0')
	{
	printf("%c",toupper(ch[i]));
	i++;
	}
}
