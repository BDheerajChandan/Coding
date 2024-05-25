#!/bin/bash
echo "Enter the basicSal : "
read bsal
echo "Enter the HRA : "
read hra
echo "Enter the Transport Allowance"
read transall
echo "total sal : "
totsal=$(($bsal+$hra+$transall))
echo $totsal
