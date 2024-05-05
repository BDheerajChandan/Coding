#!/bin/sh

#Check for = , == with integer and string

# Please enter the 1st string input
#echo "1st String input"
#read s1
#if [ "$s1" = "Dheeraj" ]
#then 
#	echo "\"==\" : $s1 and $s2 are equal"
#else
#	echo "\"==\" : $s1 and $s2 are not equal"
#fi

s1="Dheeraj"
s2="dheerAJ"
if [ "$s1" = "$s2" ]
then
	echo "$s1 and $s2 are equal"
else
	echo "$s1 and $s2 are not equal"
fi


