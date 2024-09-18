//Write a program to store 10 numbers in an array. Create another array to contain squared values of all the 
//elements of the first array.count the number of prime numbers

class Squared {
    private int ar[] = new int[10];
    public void data(int array[]){
        for(int i=0;i<ar.length;i++)
        ar[i]=array[i];
    }
    public void squared(){
        int i=0;
        System.out.println("Array Elements are = ");
        for(i=0;i<ar.length;i++){
            System.out.println(ar[i] + " ");
        }
        int x[]=new int[10];
        System.out.println("The squared array is ");
        for(i=0;i<ar.length;i++){
            x[i]=ar[i]*ar[i];
            System.out.print(x[i]+ " ");
        }
    }
} 





