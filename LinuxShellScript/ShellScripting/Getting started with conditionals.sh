: <<'COMMENT'
Read in one character from STDIN.
If the character is 'Y' or 'y' display "YES".
If the character is 'N' or 'n' display "NO".
No other character will be provided as input.
COMMENT

read s

if [[ "$s" == "Y" || "$s" == "y" ]]; then
    echo "YES"
elif [[ "$s" == "N" || "$s" == "n" ]]; then
    echo "NO"
else
    echo "Invalid input"
fi