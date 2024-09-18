class LoopConvertDoWhile {
    public void main() {
        int i = 1, j=2;
        do {
            i=i*j;
        }
        while(++j<10);
        System.out.println(i);
    }
}



