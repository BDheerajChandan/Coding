/*
Input Format:
The first line contains two integers.
The second line contains two floating point numbers.

Constraints:
1 <= integer variables <= 10000
1 <= float variables <= 10000

Output Format:
Print the sum and difference of both integers separated by a space on the first line, and the sum and difference of both float (scaled to  decimal place) separated by a space on the second line.
*/


#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int n,m;
    float p,q;
    printf("Please enter the 1st integer number : ");
    scanf("%d", &n);
    printf("Please enter the 2nd integer number : ");
    scanf("%d", &m);
    printf("Please enter the 1st float number : ");
    scanf("%f", &p);
    printf("Please enter the 2nd float number : ");
    scanf("%f", &q);
    if((n>=1 && n<=10000)&&(m>=1 && m<=10000)&&(p>=1.0 && p<=10000.0)&&(q>=1.0 && q<=10000.0))
    {
        printf("Sum of two integers : %d\n",(m+n));
        printf("Difference of two integers : %d\n",(m-n));
        printf("Sum of two floating numbers : %.1f\n",(p+q));
        printf("Difference of two floating numbers : %.1f\n",(p-q));
    }
    return 0;
}
