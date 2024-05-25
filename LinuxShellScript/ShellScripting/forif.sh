echo "Enter a range : "
read n
for((i=0;i<$n;i++))
do
	if (($i%2==0))
	then
		echo "$i is even"
	else	
		echo "$i is odd"
	fi
done
