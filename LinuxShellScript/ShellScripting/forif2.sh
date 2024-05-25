#!/bin/bash
echo "Enter range : "
read n
i=0
while [ $i -ne $n ]
do
	if (($(($i%2))==0 ))
	then 
		echo "$i is even"
	else
		echo "$i is odd"
	fi
	i=$(($i+1))
done
