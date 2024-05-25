echo "Enter two numbers : "
echo "Number 1 : "
read n1
echo "Number 2 : "
read n2
while [ True ]
do
	echo "Press 1 for add "
	echo "Press 2 for substract "
	echo "Press 3 for multiplication "
	echo "Press 4 for division"
	echo "Press 5 for exit"
	echo "Enter choice : "

	read ch
	case $ch in
		1) echo $(($n1+$n2));;
		2) echo $(($n1-$n2));;
		3) echo $(($n1*$n2));;
		4) echo $(echo "scale=2;$n1/$n2"|bc);;
		5) break;;
		*) echo "Invalid Choice";;
	esac
done
