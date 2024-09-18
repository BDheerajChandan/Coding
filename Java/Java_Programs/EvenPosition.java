//Write a program which accepts a word from keyboard and displays the 
//characters present in even position of this number.
class EvenPosition {
    public void even(String s){
        s=s+"";
        int i,len;
        int x=0;
        System.out.print("You have entered the string=" +s);
        System.out.print("\n");
        len=s.length();
        System.out.print("Characers at Even Position ");
        for(i=0;i<len;i++){
            if((i-1)%2 ==0)
            System.out.print(s.charAt(i));
            System.out.print(" ");
        }
    }
}


