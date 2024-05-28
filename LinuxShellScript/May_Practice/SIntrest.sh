#!/bin/bash
echo "Enter the Principle : "
read p
echo "Enter rate : "
read r
echo "Enter time : "
read t
si=$(echo "scale=3;$(($p*$t*$r))/100"|bc)
echo $si
