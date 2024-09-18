import java.io.*;
class Deletion {
    public static void main(String args[]) throws IOException {
        int Number,num,location,prev,i;
        int array[]  = new int[51];
InputStreamReader reader = new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
System.out.print("Enter the total numbers in the array:");
String n = input.readLine();
Number=Integer.parseInt(n);
for(i=0; i<Number;i++) {
    System.out.print("Enter the number" +(i+1) + ":");
    n=input.readLine();
    array[i]=Integer.parseInt(n);
}
    System.out.print("element to be deleted from location?");
    String s=input.readLine();
    location=Integer.parseInt(s);
    location=location-1;
    if(location<Number) {
        num=array[location];
        prev=location;
        while(prev<Number){
            array[prev]=array[prev+1];
            prev=prev+1;
        }
        Number=Number-1;
        System.out.println("The Final List is::");
        for(i=0;i<Number;i++) {
            System.out.println(array[i]);
        }
        System.out.println("The Deleted element from the array is : " +num);
    }
    else
    System.out.println("Invlaid Location!");
  }
}










