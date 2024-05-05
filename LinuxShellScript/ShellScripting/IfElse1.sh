#!/bin/sh

#Enter 1st integer input for chr is zero or nonzero
echo "Enter 1st number"
read n1
if [ $n1 -eq 0 ]
then 
	echo "Number is zero"
else
	echo "Number is non-zero"
fi
echo "Enter the string: "
read s1
if [ $s1 = "Dheeraj" ]
then
	echo "Entered string is \"Dheeraj\""
else
	echo "Entered string is not \"Dheeraj\""
fi
