#!/bin/bash
echo "Enter a range : "
read n
a=0
b=1
c=0
echo $a
echo $b
for((i=2;i<$n;i++))
do
	c=$(($a+$b))
	echo $c
	a=$b
	b=$c
	
done
