import java.io.*;
class Wordcount {
  public void count(String text){
  int andcount = 0;
  int thecount = 0;
  int index=-1;
  String andstr ="and";
  index=text.indexOf(andstr);
  while(index>=0){
     ++andcount;
     index += andstr.length();
     index = text.indexOf(andstr,index);
     }
  String thestr = "the";
  index=text.indexOf(thestr);
  while(index>=0){
    ++thecount;
    index += thestr.length();
    index = text.indexOf(thestr,index);
    }
  System.out.println("Number of 'and' =" +andcount);
  System.out.println("Number of 'the' =" +thecount);
  }
}
    
