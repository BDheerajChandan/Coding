#include<stdio.h>
#include<string.h>
void main()
{
	char str1[50],str2[20];
	printf("enter the string\n");
	scanf("%s%s",str1,str2);
	int len2=strlen(str2),len1=strlen(str1),n;
	printf("enter the 1st positions of string\n");
	scanf("%d",&n);
	printf("1st string is %s\n",str1);
	if((len2+n)<len1)
	{
		for(int i=0;i<len1;i++)
		{
			if((i>=n)&&(i<len2+n))
			{
				str1[i]=str2[i-n];
			}
		}
	}
	printf("replaced string is %s\n",str1);
}
