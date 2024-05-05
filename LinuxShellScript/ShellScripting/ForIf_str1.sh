#!/bin/bash
# Enter a String

echo "Enter the string"
read s1
for ((i=0;i<${#s1};i++))
do
	echo "Charater at index $i : ${s1:$i:1}"
done
printf "\n"
