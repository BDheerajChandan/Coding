class Reultant1
{ 
   
    public static void main(String[] args){ 
        int[]A = {4,6,1};
        int[]B = {19,23,7,8};
        int[]C = new int[A.length + B.length]; 
         
        int aIndex = 0; 
        int aCount = A.length; 
        int cIndex = C.length; 
 
        // Copy over array A (but only if the element is less than B) 
        // What if it isn't less than B? 
 
        while (aIndex < aCount){ 
                if(A[aIndex] < B[aIndex]){ 
                     C[aIndex]= A[aIndex]; 
                } 
                aIndex++; 
         
        }//end while 
         
 
        // Copy over B starting where array A left off 
        // But be sure to read the part about copying A above. 
 
        for(int bIndex = 0; bIndex < B.length; bIndex++){ 
                C[aIndex] = B[bIndex];                 
                aIndex++; 
        } 
         
        for (int i = 0; i < C.length; i++){ 
            System.out.println(C[i]); 
        } 
         
    }//end main 
}//end class
