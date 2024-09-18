public class PassByReference{
    public static void display(StringBuffer sb){
        sb=sb.insert(8," to ");
        System.out.println(sb);
    }
public void main(){
    StringBuffer sb1=new StringBuffer("Welcome Evergreen");
    System.out.println(sb1);
    System.out.print("The origianl string has become="); 
    display(sb1);
  }
}



