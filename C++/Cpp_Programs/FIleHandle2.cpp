#include<iostream>
#include<fstream>    // It includes ifstream and of ofstream
using namespace std;
int main()
{

    ofstream myfile1;
    string data,data2;
    ifstream myfile2;

    myfile1.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt");
    myfile1<<"Hi How_re_you"<<endl;
    myfile1.close();


    myfile2.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt");
    myfile2>>data;
    cout<<"\nText in file : "<<data<<endl;


    myfile1.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt",ios::app);
    myfile1<<"I'm_fine"<<endl;
    //myfile1.close();

    myfile2.open("C:\\Users\\KIIT\\Desktop\\PROGRAM LANGUAGES\\C++\\FileDataAppend.txt");
    if(myfile2.is_open())
    {
        cout<<"File is open so Full text in file : \n";
        myfile2.seekg(0);
        while(getline(myfile2,data))
        {
            cout<<data;
        }
        cout<<endl;
        cout<<"Closing the file"<<endl;
        myfile2.close();
    }else{
        cout<<"File is closed!!"<<endl;
    }
    return 0;
}
