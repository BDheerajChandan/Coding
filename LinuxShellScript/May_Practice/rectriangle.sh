#!/bin/bash
rect()
{
	echo "scale=2;$1*$2"|bc
}
echo "Enter lenght : "
read l
echo "Enter bredth : "
read b
area=$(rect $l $b)
echo $area
