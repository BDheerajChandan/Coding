#include<stdio.h>
int main()
{
	int n,d,t,s=0;
	printf("enter the number");
	scanf("%d",&n);
	t=n;
	while(n!=0)
	{
		d=n%10;
		s=s+(d*d*d);
		n=n/10;
	}
	if(s==t)
	{
		printf("%d is palindrome",t);
	}else{
		printf("%d is not palindrome",t);
	}
	return 0;
}

