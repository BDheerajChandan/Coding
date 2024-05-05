/*Print the greatest of the four integers.
Note: I/O will be automatically handled.

Write a function which reads four arguments and returns the greatest of them.
*/


#include <stdio.h>
int max_of_four(int a, int b, int c, int d)
{
    int max=0;
    if(a>b && a>c && a>d)
    max=a;
    else if(b>a && b>c && b>d)
    max=b;
    else if(c>b && c>a && c>d)
    max=c;
    else
    max=d;
    return max;
}
int main()
{
    int a, b, c, d;
    printf("Please enter the 1st number : ");
    scanf("%d", &a);
    printf("Please enter the 2nd number : ");
    scanf("%d", &b);
    printf("Please enter the 3rd number : ");
    scanf("%d", &c);
    printf("Please enter the 4th number : ");
    scanf("%d", &d);
    int ans = max_of_four(a, b, c, d);
    printf("Maximum of four number is : %d", ans);

    return 0;
}
