class OddEvenPrime {
public void main(int number){
    int count=0;
    int i;
    System.out.println("Number=" +number);
if(number%2 == 0)
    System.out.println("The number is even");
    else
    System.out.println("The number is odd");
if(number == 1)
    System.out.println("The number is also prime");
for(i=2; i<=number/2; ++i){
    if(number%2 == 0)
    count++;
    }
if(count>0)
    System.out.println(+number +" is not a Prime Number");
    else
    System.out.println(+number + " is a Prime Number");
    }
}
