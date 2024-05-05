#!/bin/bash
echo "Enter the range : "
read n
#print "\n"
for i in $(seq 1 $n)
do
	if [ $((i%2)) -eq 0 ]
	then
		echo $i
	fi
	#sleep 1
done

