import java.io.*;
import java.util.*;
public class LinkedListExample
{
    public static void main(String args[])
    {
        LinkedList<Integer> l=new LinkedList<>();
        l.add(10);//s.push(10);
        l.add(20);//s.push(20);                 // TO add/push new elements to Stack
        l.add(30);//s.push(30);
        l.add(40);//s.push(40);
        l.add(50);//s.push(50);
        System.out.println("After adding/pushing new elements to Stack");
        System.out.println(l);//s.toString(); toString() is in stck class
        for(Integer i:l)
        {
            System.out.println(i);
        }
        System.out.println("\tDELETING AN FIRST ELEMENT");
        Integer ele=l.pop();        // To delete an first element/recently added element
        System.out.println(ele+"\n");    // To display deleted last element/recently added element
        for(Integer i:l)
        {
            System.out.println(i);
        }
        System.out.println("\tINSERTING AN ELEMENT : 100 AT 2");
        l.add(2,100);   // To insert an element at index position '2'
        for(Integer i:l)
        {
            System.out.println(i);
        }
        System.out.println("\tREMOVING AN ELEMENT : AT 2");
        l.remove(2);                // To remove an element at index position '2'
        for(Integer i:l)
        {
            System.out.println(i);
        }
        System.out.println("\tUPDATING AN ELEMENT : 300 AT 2");
        l.set(2,300);               // To updte an element as '300' at index position '2'
        for(Integer i:l)
        {
            System.out.println(i);  // class Printstrem{println(),print()}
        }
        
        System.out.println("\tADDING AN DELETED ELEMENT AT FIRST");
        l.addFirst(ele);                // To remove an element at index position '2'
        for(Integer i:l)
        {
            System.out.println(i);
        }
        System.out.println("\tADDING AN NEW ELEMENT AT LAST");
        l.addLast(60);               // To updte an element as '300' at index position '2'
        for(Integer i:l)
        {
            System.out.println(i);  // class Printstrem{println(),print()}
        }
    }
}