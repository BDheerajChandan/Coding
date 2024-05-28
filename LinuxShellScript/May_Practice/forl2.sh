#!/bin/bash
echo "Enter range"
read n
for((i=0;i<n;i++))
do
	echo $i
done
echo "*************"
for i in $(seq 1 $n)
do
	echo $i
done
echo "*************"
for i in {1..5}
do
	echo $i
done
