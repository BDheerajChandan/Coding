//Write a program with class Bank with the following specifications-

//Members	               Member Name	                                            Description

//Member Variables	   AccountNumber,AccountName,AccountBalance	Account Number, Account Holder’s Name, 
//                                                                Account Balance
//Default Constructor	    Bank	                                Initialize AccountNumber,AccountName 
  //                                                              and AccountBalance 
                                                                
class Bank
{
long AccountNumber;
String AccountName;
double AccountBalance;
Bank()
{
AccountNumber = 0;
AccountName= " ";
AccountBalance=0.0;
}
Bank(int num,String name, double bal)
{
AccountNumber=num;
AccountName= name;
AccountBalance=bal;

System.out.println("Account Number=" +AccountNumber);
System.out.println("Account Holder=" +AccountName);
System.out.print("Account Balance="+AccountBalance);
}
}
