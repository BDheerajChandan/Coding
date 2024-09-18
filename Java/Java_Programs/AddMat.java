class AddMat {
public void addmatrix() {
    int i,j;
    int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int arr2[][] = {{3,4,5},{6,7,8},{9,10,11}};
    int arr3[][] = new int[3][3];
    for(i=0;i<3;i++) {
        for(j=0;j<3;j++) {
            arr3[i][j]=arr1[i][j]+arr2[i][j];
        }
    }
    System.out.println("First Array=");
    for(i=0;i<3;i++) {
        for(j=0;j<3;j++) {
            System.out.print(arr1[i][j] +" ");
        }
        System.out.println();
    }
    System.out.println("Second Array=");
    for(i=0;i<3;i++) {
        for(j=0;j<3;j++) {
            System.out.print(arr2[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("New Array=");
    for(i=0;i<3;i++) {
        for(j=0;j<3;j++) {
            System.out.print(arr3[i][j]+ " ");
        }
        System.out.println();
    }
  }
}
