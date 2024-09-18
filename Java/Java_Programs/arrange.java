//Write a program to arrange the entered word/string in alphabetic order
class arrange {
    private int a,len,i,j;
    char c;
    public arrange(){
        a=0;
    }
public void alphabetical(String s){
    len=s.length();
    System.out.print("String is=" +s);
    System.out.print("\n");
    for(i=65;i<=90;i++){
        for(j=0;j<len;j++){
            c=s.charAt(j);
            a=c;
            if(a==i||a==i+32)
            System.out.print(c);
        }
    }
  }
}

