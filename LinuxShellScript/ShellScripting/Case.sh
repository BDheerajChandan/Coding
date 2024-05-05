#!/bin/bash
# Enter the number choice : "
echo "Please give choice : "
read choice
case $choice
in
	0) echo "Zero";;
	1) echo "One";;
	2) echo "Two";;
	3) echo "Three";;
	4) echo "Four";;
	5) echo "Five";;
	6) echo "Six";;
	7) echo "Seven";;
	8) echo "Eight";;
	9) echo "Nine";;
	*)
	echo "Invalid choice"
esac
printf "\n"
