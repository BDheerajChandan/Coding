class ContinueBreak {
public static void main() {
int i,j,k;
    //outer label name
    outer: for(i=1;i<10;i++){  
        System.out.println("Pass:" +i);
        for(k=2;k<6;k++) {
            for(j=1;j<20;j++){
                if(j%k != 1)
                continue;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        if(i==3)
        break outer;
        System.out.println();
    }
 }
}

