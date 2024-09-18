class ExchangeSelection {
 public void sorting() {
    int len=10;    
    int ar[] = {32,19,21,3,7,31,23,21,17,68};
    int i,j,temp,loc,small;
    i=j=temp=0;
    System.out.print("Array Elements are = ");
    for(i=0;i<len;i++){
        System.out.print(ar[i] +" ");
    }
    for(i=0;i<len;i++){
        small=ar[i];
        loc=i;
        for(j=i+1;j<len;j++){
            if(ar[j]<small){
                small=ar[j];
                loc=j;
            }
        }
        temp=ar[i];
        ar[i]=ar[loc];
        ar[loc]=temp;
        }
        System.out.println();
        System.out.println("Elements After Exchange Sort are = ");
        for(i=0;i<len;i++){
            System.out.print(ar[i]+" ");
        }
    }   
}




