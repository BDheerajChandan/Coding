#!/bin/bash
printf "Enter the range : "
read n
printf "\n"
for ((i=0;i<$n;i++ ))
do
	echo $i
	sleep 1
done

