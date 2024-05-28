#!/bin/bash
echo "Enter 1st number : "
read n1
echo "Enter 2nd number : "
read n2
while [ true ]
do
	echo "press '+' for addition "
	echo "press '-' for substraction "
	echo "press '*' for multiplication "
	echo "press '/' for division "
	echo "press 0 for exit"
	echo "Enter choice : "
	read ch
	res=0
	case $ch in
		'+') res=$(($n1+$n2));;
		'-') res=$(($n1-$n2));;
		'*') res=$(($n1*$n2));;
		'/') res=$(echo "scale=3;$n1/$n2"|bc);;
		0) break;;
		*) echo "Invalid choice";;
	esac
	echo $res
done
