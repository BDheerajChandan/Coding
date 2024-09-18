//multiple level of nesting
class App {
    public static void main(String args[]) {
        int row=1;
        do {
            int column=1;
            do {
                if((row*column)<10) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print((row*column));
                column++;
            }
            while(column<=9);
            System.out.print(" ");
            row++;
        }
        while(row<=9);
    }
}

