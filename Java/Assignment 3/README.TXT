    Write a program in Java for :
============================================================================================================================================================
                                                        PART-1
============================================================================================================================================================
1. To print "Hello world"
2. Find sum of digits of a given number
3. Find reverse of a given number
4. Check the number is even or odd
5. Find Simple Interest
6. Print Right triangle star pattern
7. Pyramid number pattern
8. To print table of a given number
9. Find largrest of given 3 numbers
10. Simple Calculator Using switch...case
11. Sum of values of given array
12. Find max and min of given array
13. To print reverse of a array
14. Find second largest element of an array

============================================================================================================================================================
                                                        PART-2
============================================================================================================================================================
1. class Emp{empno,empname,designation,dept,salary}
   readEmpData() : empno,empname,designation,dept,salary
   displayEmpData() : empno,empname,designation,dept,salary
   Create an employee instance and display its information.

2. class Electricity_bill{cusnum,cusname,units}
    readData() : To read cusnum,cusname,units
    computeBill() : if  [unit<=100 ,         charge=1.2], 
                        [unit<=100+200 ,     charge=2.0],
                        [unit<=100+200+300 , charge=3.0],
                        [unit >100+200+300 , charge=5.0]
                Example:        units=50,   Ebill=(units*1.20)
                units=200,  Ebill=(100*1.20)+((units-100)*2.00)
                units=320,  Ebill=(100*1.20)+(200*2.00)+((units-300)*3.00)
                units=1000, Ebill=(100*1.20)+(200*2.00)+(300*3.00)+((units-600)*5.0)
    showData() : Show total Calculated bill
    
3. class Student{id,name,mark,result}
   read() : name, id and marks
   result() : result is "Pass" if marks>35 else "Fail"
   display() : id,name,mark,result
4. class Account{accno,accname,amount}
   deposit() : read accno,accname,amount
   withdraw() : read withdraw amount
   interest() : read principle, rate, time, Calculate intrest [SI=(p*t*r)/100]
5. class Player{name,age,countryName,runs} , 5 players
   read() : name,age,countryName,runs
   display() : Display if runs>5000
   
============================================================================================================================================================
                                                        PART-3
============================================================================================================================================================   
   
    Problem Statement 1:
Create a Java program to demonstrate method overriding. Define a superclass Animal with a method makeSound(), 
and two subclasses Dog and Cat that override this method to produce different sounds. 
In the main method, create instances of Dog and Cat and call their makeSound() methods.

    Problem Statement 2:
Create a Java program to model different shapes such as Circle, Rectangle, and Triangle. 
Each shape should have a method calculateArea() to calculate its area. 
Implement method overriding to provide specific implementations of calculateArea() for each shape. 
In the main method, create instances of each shape and print their areas.


    Problem Statement 3:
Create a Java program to model different types of employees - Employee, Manager, and Engineer. 
Each type of employee has a different calculateSalary() method. 
Implement method overriding to calculate the salary of each type of employee based on their specific salary calculation rules. 
In the main method, create instances of each type of employee and print their salaries.



    Problem Statement:4
Design a vehicle rental system that allows customers to rent vehicles such as cars, motorcycles, and bicycles. 
Implement the system using inheritance and method overriding to handle specific functionalities for each type of vehicle.

The Vehicle class is the superclass, representing a generic vehicle with properties like vehicle number and availability status. 
It provides methods for renting and returning vehicles.
Subclasses Car, Motorcycle, and Bicycle inherit from the Vehicle class and override the toString() method to include specific details about 
each type of vehicle.
Each subclass can also override the rent() and returnVehicle() methods if specific behaviors are required for renting or returning that type of vehicle.
In the Main class, instances of each type of vehicle are created and their details are displayed. They are then rented and returned, 
demonstrating method overriding and inheritance in action.



    Problem Statement: 5
Design a simple banking system that includes functionality for managing accounts, including savings and checking accounts. 
Implement the system using inheritance and method overriding to handle specific functionalities for each type of account.

The Account class is the superclass, representing a generic bank account with properties like account number and balance. 
It provides methods for depositing, withdrawing, calculateInterest and displaying account details.
Subclasses SavingsAccount and CheckingAccount inherit from the Account class and override methods like withdraw() and display() to include 
specific behaviors for each type of account.
Each subclass can override the calculateInterest()  to find the interest functionalities specific to that type of account.
In the Main class, instances of each type of account are created and transactions like deposits, withdrawals, and interest calculations are performed, 
demonstrating method overriding and inheritance in action.


        Interface assignment

1) Banking Management System
    a) create Account interface that defines basic operations(abstract method) like deposit, withdraw, and getBalance.
    b) create a BankAccount is a base class implementing the Account interface, representing a generic bank account.
    c) SavingsAccount and CurrentAccount are subclasses of BankAccount representing specific types of accounts.
        override methods like deposit and withdraw in SavingsAccount and CurrentAccount to provide specific behavior f for those account types.
    d) Demonstrate the usage of these classes in the BankSystem class(class with main method) by creating object of SavingsAccount and 
        CurrentAccount and access the functionaliy of  deposit and withdrawal getBalance.


2) Employee Management System
    a) create Employee interface defining the calculateSalary() method.
    b) create a class called BaseEmployee  implements the Employee interface and serves as the base class for all types of employees.
    c) Manager and Programmer classes inherit from BaseEmployee and provide their own implementations of the calculateSalary() method based on 
        their specific roles.Both Manager and Programmer classes have constructors that initialize their attributes.
    d)Demonstrate the usage of these classes in EmployeeSystem class  by creating instances of Manager and Programmer objects and 
        displaying their information using the displayInfo(),finding their salary using calculateSalary method.

3) PaymentGatewaySystem
    a) PaymentGateway is an interface defining a method processPayment to process payments.
    b) Bank is an abstract class representing a generic bank, implementing the PaymentGateway interface and providing common functionalities 
        like name and account number.
    c) SBI and HDFC is a concrete class representing a specific bank, extending the Bank class. It implements the processPayment method and 
        provide the specific functionality to the respective bank(SBI,HDFC)
    D) The main method in the BankingPaymentGateway class demonstrates how to use the banking payment gateway by creating an instance of 
        SBI ,HDFC and processing a payment.
  
