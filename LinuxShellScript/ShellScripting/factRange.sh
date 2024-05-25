#!/bin/bash
echo "Enter the range"
read n
f=1
for((i=0;i<$n;i++))
do
	for j in $(seq 0 $i)
	do
		if [ $j -eq 0 ]
		then
			f=1
		else
			f=$(($f*$j))
		fi
	done
	echo "Factorial of $j : $f"
	f=1
done
