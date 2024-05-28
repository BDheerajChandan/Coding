#!/bin/bash
read n
fibo()
{
	i=$1
	if (( i==1 || i==0 ))
	then
		echo $i
	else
		a=$(fibo $((i-1)))
		b=$(fibo $((i-2)))
		echo $((a+b))
	fi
}
fibo $n
