#include<stdio.h>
#include<stdbool.h>
void main()
{
	bool b1=true,b2=false;
	char c1='a',c2=65;
	int i1=10;
	float f1=62.5;
	long l1=1234567;
	double d1=12.4567;

	printf("Boolean true : %d\n",b1);
	printf("Boolean false : %d\n",b2);
	printf("Character : %c\n",c1);
	printf("Integer : %d\n",i1);
	printf("IntCharacter : %dc\n",c2);
	printf("Float : %f\n",f1);
	printf("Long : %ld\n",l1);
	printf("Double : %lf",d1);

	printf("Size of each ");
	printf("Size of Bool : %ld\n",sizeof(bool));
	printf("Size of Integer : %ld\n",sizeof(char));
	printf("Size of Charcter : %ld\n",sizeof(int));
	printf("Size of Float : %ld\n",sizeof(float));
	printf("Size of Long : %ld\n",sizeof(long));
	printf("Size of Doulble : %ld\n",sizeof(double));
}
