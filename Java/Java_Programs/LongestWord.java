class LongestWord {
  public void WordSize(String str) {
   char ch;
   str=str+" ";
   int len=0;
   int x=str.length();
   System.out.print("Enter the sentence::" +str);
   System.out.print("\n");
   for(int i=0;i<x;i++){
    ch=str.charAt(i);
    if(ch != ' ') {
    System.out.print(ch);
    len=len+1;
    }
  if(ch==' '){
     System.out.println(" : The Size is " +len + " characters");
     len=0;
     System.out.print("\n");
     }
   }
 }
}
