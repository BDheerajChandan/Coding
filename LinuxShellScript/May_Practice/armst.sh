#!/bin/bash
echo "Please enter the number : "
read n
d=$n
s=0
while [ $n -ne 0 ]
do
	t=$(($n%10))
	s=$(($(($t*$t*$t))+$s))
	n=$(($n/10))
done
echo $s
if (( $s==$d ))
then
	echo "$s is an armstrong number"
else
	echo "$s is not an armstrong number"
fi
