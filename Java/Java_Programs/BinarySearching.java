import java.io.*;
class BinarySearching {
private int a[] = new int[10];
public int n,middle;
public int element, pos;
public int first, last;
public static void main (String args[])throws IOException {
int a[]= new int[10];
  int i,j;
  i=j=0;
 InputStreamReader reader = new InputStreamReader(System.in);
  BufferedReader input = new BufferedReader(reader);
  System.out.println("Enter Elements of Array= ");
  for(i=0;i<a.length;i++){
  String x = input.readLine();
  a[i]=Integer.parseInt(x);
  }
System.out.println("Array Elements are = ");
for(i=0;i<a.length;i++){
System.out.println(" " +a[i]);
}
}
int binarysearch(int element) {
System.out.println("Element to be searched = ");
System.out.println(+element);
while((pos==-1) && (first<=last)) {
middle=(first+last)/2;
if(a[middle]== element)
pos = middle;
else
if(a[middle] == element)
first=middle+1;
else
last=middle-1;
}
if(pos>-1)
System.out.println("Position of element=" +(pos+1));
else
System.out.println("Element not present");
return 0;
}
}
