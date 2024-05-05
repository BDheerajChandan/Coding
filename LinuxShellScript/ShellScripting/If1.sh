#!/bin/sh
printf "Please enter number input : "
read n
if [ $n -eq 0 ] 
then
	echo " Entered number is zero "
fi
printf "\n"
printf "Please enter the string input : "
read s
if [ $s = "Dheeraj" ] 
then
	echo " Entered string is : \"Dheeraj\" "
	#printf "\n"
fi
