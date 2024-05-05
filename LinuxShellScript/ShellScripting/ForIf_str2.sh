#!/bin/bash
# Enter a String

echo "Enter the string"
read s1
for ((i=0;i<${#s1};i++))
do
	#echo "Charater at index $i : ${s1:$i:1}"
	c=${s1:$i:1}
	if [[ $c =~ [0-9] ]]
	then
		echo "Character at index $i: $c is an Integer"
	else
		echo "Character at index $i: $c is a  character"
	fi
done
printf "\n"
