class ArrayPrint{
    public void arrayprint() {
        int i,j;
        int A[][]={{2,2,2,2,},{1,2,3,4,},{2,4,6,9}};
        for(i=0;i<3;i++) {
            for(j=0;j<4;j++) {
                System.out.print(A[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}