class Average {
  public void min(int n){
  int digit,j;
  int s=0;
  double average;
  int i=0;
  System.out.print("The Number is =" +n);
  System.out.print("\n");
  while(n>0){
  digit=n%10;
  s=s+digit;
  n=n/10;
  i=i+1;
  }
  System.out.print("The sum of digits of the number =" +s);
  System.out.print("\n");
  average=(double)s/i;
  System.out.println("Average of Digits=" +average);
  }
}


