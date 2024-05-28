#!/bin/bash
echo "Enter the range : "
read n
for i in $(seq 1 $n)
do
	if (($(($i%2))==0))
	then 
		echo "$i is even"
	else
		echo "$i is odd"
	fi
done
