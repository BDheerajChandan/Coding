#include<iostream>
#include<fstream>    // It includes ifstream and of ofstream
using namespace std;
int main()
{
    ofstream myfile1;
    myfile1.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt");
    myfile1<<"Name : Dheerj\nRoll : 21"<<endl;
    myfile1.close();

    string data;
    ifstream myfile2;
    myfile1.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt",ios::app);
    myfile1<<"\nI'm_fine"<<endl;
    myfile1.close();

    myfile2.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt");
    myfile2>>data;
    myfile2.seekg(0);
    cout<<"Text in file : "<<data<<endl;

    if(myfile2.is_open())
    {
        cout<<"File is open so Full text in file : \n";
        myfile2.seekg(0);
        while(getline(myfile2,data))
            cout<<data;
        cout<<endl;
        cout<<"Closing the file"<<endl;
        myfile2.close();
    }else{
        cout<<"File is closed!!"<<endl;
    }
    return 0;
}
