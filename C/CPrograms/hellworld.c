// Write a program in c to print "Hello world"

#include<stdio.h>
#include<string.h>
int main()
{
    char st[50];
    //fgets("%s",sizeof(st),stdin);
    gets(st);
    printf("Hello, World!\n");
    printf("%s",st);
    return 0;
}
