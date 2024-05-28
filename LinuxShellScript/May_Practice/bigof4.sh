#!/bin/bash
echo "enter 4 numbers : "
echo "1st - "
read n1
echo "2nd - "
read n2
echo "3rd - "
read n3
echo "4th - "
read n4
maxnum=0
if (( $(($n1>=$n2)) && $(($n1>=$n3)) && $(($n1>=$n4)) ))
then
	maxnum=$n1
elif (( $(($n2>=$n1)) && $(($n2>=$n3)) && $(($n2>=$n4)) ))
then
	maxnum=$n2
elif (( $(($n3>=$n1)) && $(($n3>=$n2)) && $(($n3>=$n4)) ))
then
	maxnum=$n3
else
	maxnum=$n4
fi
echo $maxnum
