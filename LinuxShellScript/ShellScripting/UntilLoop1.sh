#!/bin/bash
#Enter the range to print numbers within the range

echo "Please enter the range : "
read r
i=0
until [ $i -gt $r ]
do
	echo $i
	((i++))
done
printf "\n"
