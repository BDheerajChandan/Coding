echo "Please enter the number : "
read n
echo "Entered value : $n"
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
	echo "$s is a palindrome"
else
	echo "$s is not a palindrome"
fi
