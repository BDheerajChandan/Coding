#!/bin/bash
#Get all even numbers between 1 to 10
printf "Even numbers between 1 to 10\n"
for i in {1..10}
do 
	if [ $((i%2)) -eq 0 ]
	then
		echo $i
	fi
done
printf "\n"

#Get all odd numbers between 1 to 10
printf "Odd numbers between 1 to 10\n"
for i in {1..10}
do
	if [ $((i%2)) -eq 1 ]
	then
		echo $i
	fi
done
