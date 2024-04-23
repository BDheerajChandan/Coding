import java.io.*;
import java.util.*;
class StackExample
{
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);                 // TO add/push new elements to Stack
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("After adding/pushing new elements to Stack");
        System.out.println(s);//s.toString(); toString() is in stck class
        for(Integer i:s)
        {
            System.out.println(i);
        }
        System.out.println("\tDELETING AN LAST ELEMENT");
        Integer ele=s.pop();        // To delete an last element/recently added element
        System.out.println(ele+"\n");    // To display deleted last element/recently added element
        for(Integer i:s)
        {
            System.out.println(i);
        }
        System.out.println("\tINSERTING AN ELEMENT : 100 AT 2");
        s.add(2,100);   // To insert an element at index position '2'
        for(Integer i:s)
        {
            System.out.println(i);
        }
        System.out.println("\tREMOVING AN ELEMENT : AT 2");
        s.remove(2);                // To remove an element at index position '2'
        for(Integer i:s)
        {
            System.out.println(i);
        }
        System.out.println("\tUPDATING AN ELEMENT : 300 AT 2");
        s.set(2,300);               // To updte an element as '300' at index position '2'
        for(Integer i:s)
        {
            System.out.println(i);  // class Printstrem{println(),print()}
        }
    }
}