//Double ended queue(deque) implement using java collection framework

import java.util.*;

public class DoubleEndedQueue 
{
    public static void main(String args[])
    {
        Deque<Integer>dq=new LinkedList<>();

        //adding values
        dq.addFirst( 1);    //add front to the queue
        dq.addFirst( 2);    //add front to the queue
        dq.addLast( 3);     //add rear to the queue
        dq.addFirst( 4);    //add front to the queue
        dq.addLast( 5);     //add rear to the queue
        
        System.out.println( dq);
        System.out.println( dq.isEmpty());    //check empty or not
        System.out.println( dq.getLast());      //peek from last
        System.out.println( dq.getFirst());     //peek from first

        //remove and print the values
        dq.removeLast();    //remove from last
        dq.removeFirst();   //remove from front
        System.out.print( dq);
    } 
}
