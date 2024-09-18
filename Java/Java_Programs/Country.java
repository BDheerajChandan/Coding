//Look at the following program.  What will be the result of this program.

class Country {
    public void main(){
        int i,j;
        i=9;
        j=2;
        String A[][]={{"India","1.7"},{"Japan","14.6"},{"USA","36.0"},{"Germany","17.4"},
              {"Singapore","20.4"},{"UK","21.5"},{"Mexico","3.5"},{"",""},{"",""}};
              A[7][0] = "China";
              A[7][1] = "0.2";
              A[8][0] = "Israel";
              A[8][1] = "14.3";
              for(i=0; i<9; i++){
                  for(j=0; j<2; j++){
                      System.out.print(" " +A[i][j]);
                    }
                    System.out.print("\n");
                }
            }
        }
        
