//Write a Program in Jave that initialised as two dimensional array and 
//prints the lower half of the array.
//   for example        1 2 1 4             1
//                      0 0 1 2       as    0 0
//                      6 7 3 2             6 7 3
//                      4 3 2 1             4 3 2 1

public class LowerHalf {
    public static void main(String [] args){
      int arr[][] ={{1,2,1,4},{0,0,1,2},{6,7,3,2},{4,3,2,1}};
      for (int i=0;i<arr.length; i++){
          for (int j=0;j<arr[i].length;j++){
              if(i>=j)
              System.out.print(" " +arr[i][j]);
              else
              System.out.println(" ");
            }
        }
    }
}













