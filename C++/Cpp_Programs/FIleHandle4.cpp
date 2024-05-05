#include<iostream>
#include<fstream>
void ReadData();
using namespace std;
int main()
{
    fstream myfile1("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FuncFileHandle.txt",ios::app);
    string name;int age,marks;
    cout<<"Enter your 1st name : ";
    cin>>name;
    cout<<"Enter your age : ";
    cin>>age;
    cout<<"Enter your marks : ";
    cin>>marks;
    myfile1<<"Name - "<<name<<"\nAge - "<<age<<"\nMarks - "<<marks<<endl;
    myfile1.close();
    //system("clear");
    ReadData();
    return 0;
}
void ReadData()
{
    ifstream myfile2;
    myfile2.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FuncFileHandle.txt");
    string name,data;int age,marks;
    //cout<<"NAME"<<"\t"<<"AGE"<<"\t"<<"MARKS"<<endl;
    /*while((myfile2>>name>>age>>marks))
    {
        cout<<name<<"\t"<<age<<"\t"<<marks<<endl;
    }*/
    while(getline(myfile2,data))
    {
        cout<<data<<endl;
    }
    cout<<endl;
}
