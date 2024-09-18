//Write a program which accepts a number from keyboard and counts the 
//frequency of each digit in that number.

class Frequency {
    public void Frequency(int n) {
        int number[]=new int[9];
        int digit;
        int s=0;
        int i=0;
        System.out.println("Number is="+n);
        while(n>0){
            digit=n%10;
            s=s+digit;
            n=n/10;
            number[i]=digit;
            i=i+1;
        }
        int count=0;
        for (int j=0;j<=9;j++){
            for(int k=0;k<i;k++){
                if(number[k] == j)
                count++;
            }
            System.out.println("The digit" +j+ "occurs" +count+ "times");
            count=0;
        }
    }
}

