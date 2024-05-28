#!/bin/bash
echo "Enter the range : "
read n
echo "Factorial range : "
fact()
{
	i=$1
	if (( i<=1 ))
	then
		echo 1
	else
		a=$i
		b=$(fact $((i-1)))
		echo $((a*b))
	fi
}
fact $n
