class LabeledCountDemo {
    public static void main() {
        //again is the label name.
        again: for(int j =1; j<10;j++) {
            for(int k =1; k<10;k++) {
                if(k>j)  {
                    System.out.println();
                    continue again;
                }
                System.out.print(" " +j);
            }
        }
    }
}

