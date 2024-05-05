/*
Task:
You have to print the character, 'ch', in the first line. Then print 's' in next line. In the last line print the sentence, 'sen'.

Input Format:
First, take a character, 'ch' as input.
Then take the string, 's' as input.
Lastly, take the sentence 'sen' as input.

Constraints:
Strings for 's' and 'sen' will have fewer than 100 characters, including the newline.

Output Format:
Print three lines of output. The first line prints the character, 'ch'.
The second line prints the string, 's' .
The third line prints the sentence, 'sen' .

*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char ch;
    char s[100];
    char sen[100];
    printf("Enter the character : ");
    scanf("%c",&ch);
    printf("Enter the String (s) : ");
    gets(s);
    printf("Enter the String sentence (s) : ");
    gets(sen);
    printf("Entered character : %c\nEntered sentence : %s\n",ch,sen);
    return 0;
}


