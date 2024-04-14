/*
Read 3 numbers from stdin and print their sum to stdout.

Input :
3 inputs from user

Output Format :
Print the sum of the three numbers on a single line.
*/

#include <iostream>
using namespace std;
int main() {
    int sum=0,num;
    for(int i=0;i<3;i++)
    {
        cin>>num;
        sum=sum+num;
    }
    cout<<sum;
    return 0;
}
