#include<stdio.h>
void main()
{
	int arr1[5]={1,2,3,4,5};
	int arr2[5]={9,8,7,6,5};
	int res;
	for(int i=0;i<5;i++)
	{
		res=arr1[i]+arr2[i];
		printf("%d + %d = %d\n",arr1[i],arr2[i],res);
	}
}
