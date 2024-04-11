Write a program in Java for :
=====================================================================================================================================================================
                            							PART-1
=====================================================================================================================================================================
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

=====================================================================================================================================================================
                            							PART-2
=====================================================================================================================================================================
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
                Example:    	units=50,   Ebill=(units*1.20)
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