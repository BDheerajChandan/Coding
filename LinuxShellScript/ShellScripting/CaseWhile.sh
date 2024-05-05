#!/bin/bash
while true
do
	echo "Press 'a' for printing 'A'"	
	echo "Press 'b' for printing 'B'"
	echo "Press 'c' for printing 'C'"
	echo "Press 0 for Stop"
	printf "Please enter the choice : "
	read choice
	case $choice
	in
		'a') echo "A";;
		'b') echo "B";;
		'c') echo "C";;
		0) break;;
		*)
		echo "Invalid choice ";;
	esac
	for (( i=1;i<50;i++))
	do
		echo -n "*"
	done
	printf "\n"
done
