: <<'COMMENT'
To compare between two numbers.

Given two integers,  and , identify whether  or  or .
Exactly one of the following lines:
- X is less than Y
- X is greater than Y
- X is equal to Y
Input Format
Two lines containing one integer each ( and , respectively).
Output Format
Exactly one of the following lines:
- X is less than Y
- X is greater than Y
- X is equal to Y
COMMENT


read X
read Y
if((X>Y))
then
    echo "X is greater than Y"
elif((X<Y))
then
    echo "X is less than Y"
else
    echo "X is equal to Y"
fi