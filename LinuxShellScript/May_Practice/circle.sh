#!/bin/bash
circle()
{
	echo "scale=3;3.14*$1*$1"|bc
}
echo "Enter the radius : "
read n
a=$(circle $n)
echo $a
