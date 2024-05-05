#!/bin/bash

#Execute 1 to 10 with while loop

echo "Please enter the range : "
read r
i=0
while [ $i -le $r ]
do
	echo $i
	i=$((i+1))
done
