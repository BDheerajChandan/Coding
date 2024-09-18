//4. Write a program to store 10 numbers in an array.
//Print the product of all odd values of that array. 

class OddValues {
    private int ar[] = new int[10];
    public void data(int array[]){ 
        for(int i=0;i<ar.length;i++)
        ar[i]=array[i];
    }
    public void oddproduct(){
        int i=0;
        System.out.println("Array Elements are = ");
        for(i=0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("The product of odd values is ");
        int product=1;
        for(int j=0;j<ar.length;j=j+2) {
            product=product*ar[j];
            System.out.print(product+" ");
        }
    }
} 


