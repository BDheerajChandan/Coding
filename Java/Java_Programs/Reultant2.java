class Reultant2
{ 
   
    public static void main(String[] args){ 
         int[]A = {10,19,23,7,8};
         int[]B = {4,6,1,2};
      
        int[]C = new int[A.length + B.length]; 
         
        int i = 0; 
        int aCount = B.length; 
        int cIndex = C.length; 
 
        while (i < aCount){ 
                if(B[i] < A[i]){ 
                     C[i]= B[i]; 
                } 
                i++; 
         
        }
        for(int j = 0; j < A.length; j++){ 
                C[i] = A[j];                 
               i++; 
        } 
         
        for (int k = 0; k < C.length; k++){ 
            System.out.println(C[k]); 
        } 
         
    }//end main 
}//end class
