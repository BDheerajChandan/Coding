#!/bin/bash
echo "Enter the range : "
read n
i=0
while [ $i -lt $n ]
do
	echo $i
	i=$(($i+1)) #((i++))
done
