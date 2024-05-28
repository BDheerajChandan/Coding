#!/bin/bash
echo "Enter number : "
read n
d=$n
s=0
while [ $n -ne 0 ]
do
	t=$(($n%10))
	s=$(($t+$(($s*10))))
	n=$(($n/10))
done
if (( $s==$d ))
then
	echo "$d is palindrome"
else
	echo "$d is not a palindriome"
fi
