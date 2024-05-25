#!/bin/bash
echo "Enter the number : "
read n
d=$n
s=0
while [ $n -ne 0 ]
do
	t=$(($n%10))
	s=$(($s+$(($t*$t*$t))))
	n=$(($n/10))
done
echo $s
if [ $s -eq $d ]
then 
	echo "$d is armstrong"
else
	echo "$d is not armstrong"
fi
