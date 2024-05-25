#!/bin/bash
echo "Enter 1st number : "
read n1
echo "Enter 2nd number : "
read n2
mult=$(($n1*$n2))
div=$(echo "scale=2;$n1/$n2"|bc)
echo "Multiplication of $n1 and $n2 : $mult "
echo "Division of $n1 and $n2 : $div"
