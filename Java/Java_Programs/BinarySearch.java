 // Program using Binary Search method.

public class BinarySearch {
  private int a[]; 
  private int elements; 
  public BinarySearch(int max) {
    a = new int[max];            // creating an array
    elements = 0;
}
  int size() {
    return elements;
  }
  int find(int found) {
    return Locate(found, 0, elements-1);
  }
  int Locate(int found, int first, int last) {
    int middle;
    middle = (first + last)/2;
    if (a[middle] == found)
      return middle;        
      else if (first > last)
      return elements;      
    else {
        if (a[middle] < found) 
        return Locate(found, middle + 1, last);
      else
        return Locate(found, first, middle - 1);
    }
  }
  public void insert(int value) {
    int i;
    for (i = 0; i < elements; i++)
        if (a[i] > value) // (linear search)
        break;
    for (int j = elements; j > i; j--)
    a[j] = a[j - 1];
    a[i] = value; 
   elements++; 
  }
  public void display() {
    for (int i = 0; i < elements; i++)
      System.out.print(a[i] + " "); 
    System.out.println(" ");
  }
  public static void main(String args[]) {
    int maxSize = 20; 
    BinarySearch arr = new BinarySearch(maxSize); 
    arr.insert(22); 
    arr.insert(31);
    arr.insert(18);
    arr.insert(426);
    arr.insert(54);
    arr.insert(91);
    arr.insert(454);
    arr.insert(87);
    arr.insert(-2);
    arr.insert(285);
    arr.insert(839);
    arr.insert(-8);
    arr.display();      // displaying elements of array
    int found = -2;     // locating the element
    if (arr.find(found) != arr.size())
      System.out.println("Element" +found);
    else
      System.out.println("Element does not exist" +found);
  }
}