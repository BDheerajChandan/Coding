class ShortForm {
    public void main(String a) {
        int x, y;
        char b;
        System.out.println("You have entered the string=" +a);
        x=a.length();
        char c=Character.toUpperCase(a.charAt(0));
        System.out.print(c+ ".");
        for(y=0; y<x; y++) {
            b=a.charAt(y);
            if(b==' ')
            System.out.print(Character.toUpperCase(a.charAt(y+1))+ ".");
        }
    }
}