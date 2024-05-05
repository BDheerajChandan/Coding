#include<stdio.h>
void main()
{
	int arr[5]={10,20,30,40,50};
	for(int i=0;i<5;i++)
	{
		printf("Element at index %d in array : %d\n",(i+1),arr[i]);
		sleep(1);
	}
}
