class InsSort {
 public void sorting() {
    int len=10;    
    int ar[] = {33,11,21,3,7,31,23,21,17,66};
    int i,j,k,temp;
    i=j=k=temp=0;
    System.out.print("Array Elements are = ");
    for(i=0;i<len;i++){
        System.out.print(ar[i] +" ");
    }
    for(k=1;k<len;k++){
        temp = ar[k];
        j=k-1;
        while(temp<ar[j] ){
            ar[j+1] = ar[j];
            j=j-1;
            if (j<0) 
            break;
        }
            ar[j+1]= temp;
        }
        System.out.println();
        System.out.println("Elements in Sorted Order are = ");
        for(i=0;i<len;i++){
            System.out.print(ar[i]+" ");
        }
    }   
}



            