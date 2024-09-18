//Insertion Sort
class InsertionSort {
 private int a[] = new int[8];
 public void inputdata(int array[]){
  for(int i=0;i<a.length;i++)
  a[i]=array[i];
  }
public void sorting(){
  int x=0,i=0,j=0;
  int temp=0;
  System.out.println("Array Elements are = ");
  for(i=0;i<a.length;i++){
   System.out.println(a[i] + " ");
  }
  for(int k=1;k<a.length;k++){
    temp = a[k];
    j=k-1;
    while(temp<a[j] ){
        a[j+1] = a[j];
        j=j-1;
        if (j<0) 
        break;
        }
        a[j+1]= temp;
       }
      System.out.println("Elements in Sorted Order are = ");
      for(i=0;i<a.length;i++){
      System.out.println(a[i]+ " ");
     }
   }   
}



            