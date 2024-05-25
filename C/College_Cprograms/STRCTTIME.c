#include<stdio.h>
struct time
{
	int hr,mn,sc;
};
int main()
{
	struct time t[2];
	int H=0,M=0,S=0;
	printf("enter hours minutes seconds\n");
	for(int i=0;i<2;i++)
	{
		scanf("%d%d%d",&t[i].hr,&t[i].mn,&t[i].sc);
	}
	printf("HH\tMN\tSC\n\n");
	for(int i=0;i<2;i++)
	{
		H=H+t[i].hr;
		M=M+t[i].mn;
		S=S+t[i].sc;
		if(S>=60)
		{
			S=S-60;
			M=M+1;
			if(M>=60)
			{
				M=M-60;
				H=H+1;
			}
		}
		printf("%d\t%d\t%d\n",t[i].hr,t[i].mn,t[i].sc);
	}
	printf("total time taken :\n");
	printf("%d\t%d\t%d",H,M,S);
}
