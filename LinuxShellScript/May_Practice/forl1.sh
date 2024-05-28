echo "Enter the choise : "
read n
d=$n
s=0
t=0
while [ $n -ne 0 ]
do
	t=$(($n%10))
	s=$(($(($t*$t*$t))+$s))
	n=$(($n/10))
done
if (( $s==$d ))
then
	echo "$s is armstrong number "
else
	echo "$s is not a armstrong number "
fi
