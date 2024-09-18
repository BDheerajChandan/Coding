class TwoDim {
    final static int rows=11;
    final static int columns = 11;
    public void main() {
        int prod[][] = new int[rows][columns];  //declaring two dimensional array
        System.out.print("Multi-Table");
        System.out.println(" ");
        int i,j;
        for(i=1;i<rows;i++) {
            for(j=1;j<columns;j++) {
                prod[i][j]=i*j;
                System.out.println(" " +prod[i][j]);
            }
        }
    }
}

