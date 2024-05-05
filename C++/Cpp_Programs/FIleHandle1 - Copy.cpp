#include<iostream>
#include<fstream>    // It includes ifstream and of ofstream
using namespace std;
int main()
{
    cout<<"Hi \nHow are you?"<<endl;
    string name;
    int roll;
    cout<<"Enter the name : ";
    cin>>name;
    cout<<"\nEnter the roll : ";
    cin>> roll;
    cout<<endl;

    //system("clear");
    cout<<"Name : "<<name<<endl<<"Roll : "<<roll<<endl;

    ofstream myfile1;
    myfile1.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\CSimple.txt");
    myfile1<<"Name : "<<name<<endl<<"Roll : "<<roll<<endl;
    myfile1.close();

    string data;
    ifstream myfile2;
    myfile2.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\CSimple.txt");
    myfile2>>data;
    cout<<"Text in file : "<<data<<endl;

    if(myfile2.is_open())
    {
        cout<<"File is open so Full text in file : ";
        while(getline(myfile2,data))
            cout<<data;
        cout<<endl;
        cout<<"Closing the file";
        myfile2.close();
    }else{
        cout<<"File is closed!!"<<endl;
    }
    return 0;
}
