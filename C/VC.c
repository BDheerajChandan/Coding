#include<stdio.h>
int main()
{
	char ch[20];
	printf("enter a string");
	gets(ch);
	printf("sentence=%s",ch);
	int n=0;
	while(n!=20)
	{
		if((ch[n]=='a')||(ch[n]=='e')||(ch[n]=='i')||(ch[n]=='o')||(ch[n]=='u')||(ch[n]=='A')||(ch[n]=='E')||(ch[n]=='I')||(ch[n]=='O')||(ch[n]=='U'))
		{
			printf("vowel=%c \n ",ch[n]);
		}else{
			printf(" consonent=%c \n",ch[n]);			
		}
	n++;
	}return 0;
}

