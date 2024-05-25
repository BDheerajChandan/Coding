#!/bin/bash
echo "Enter the range"
read n
c=0
until [ $c -gt $n ]
do
	echo $c
	c=$(($c+1))
done
