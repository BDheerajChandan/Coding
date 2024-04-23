import java.io.*;
import java.util.*;
class QueueExample
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);                 // TO add/push new elements to Queue
        pq.add(30);
        pq.add(40);
        pq.add(50);
        System.out.println("After adding/pushing new elements to Queue");
        System.out.println(pq);//s.toString(); toString() is in stck class
        for(Integer i:pq)
        {
            System.out.println(i);
        }
        System.out.println("\tDELETING AN FIRST ELEMENT");
        Integer ele=pq.poll();        // To delete an first element/recently added element
        System.out.println(ele+"\n");    // To display deleted first element/recently added element
        for(Integer i:pq)
        {
            System.out.println(i);
        }
        System.out.println("\tREMOVING AN ELEMENT BY VALUE");
        pq.remove(50);                // To remove an element by value
        for(Integer i:pq)
        {
            System.out.println(i);
        }
        System.out.println("\tSIZE OF QUEUE :");
        int size=pq.size();
        System.out.println(size+"\n");
        for(Integer i:pq)
        {
            System.out.println(i);  // class Printstrem{println(),print()}
        }
    }
}