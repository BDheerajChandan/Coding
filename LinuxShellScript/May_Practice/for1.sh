#!/bin/bash
echo "enter the range : "
read n
for((i=0;i<$n;i++))
do
	echo $i
done
for i in $(seq 1 $n)
do
	echo $i
done
for i in 1 2 3 4
do
	echo $i
done
