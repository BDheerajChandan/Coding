#!/bin/bash
echo "Enter the number : "
read n
d=$n
s=0
while [ $n -ne 0 ]
do
	t=$(($n%10))
	s=$(($t+$(($s*10))))
	n=$(($n/10))
done
if [ $s -eq $d ]
then
	echo "$d is a palindrome"
else
	echo "$d is not a palindrome"
fi
