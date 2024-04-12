: <<'COMMENT'
# Given two integers: X and Y, find their sum, difference, product, and quotient.

Input Format : Two lines containing one integer each (X and Y, respectively).
Constraints : -100<=X , Y<=100 , Y!=100
COMMENT

read X
read Y
if (( X>=-100 && Y<=100 && Y!=0 ))
then
    echo $[$X+$Y]
    echo $[$X-$Y]
    echo $[$X*$Y]
    echo $[$X/$Y]
fi
