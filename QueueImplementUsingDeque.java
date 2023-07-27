//using deque implement Queue(FIFO)

import java.util.*;

public class QueueImplementUsingDeque 
{
    //Queue operation implement
    static class Queue
    {
        static Deque<Integer>dq;

        public Queue()      //constructor
        {
            dq=new LinkedList<>();
        }

        //to add any data in the Queue
        public void add( int data )
        {
            dq.addLast( data);
        }

        //check Queue is empty or not
        public boolean isEmpty()
        {
            return dq.isEmpty(); 
        }

        //peek operation returns the top form the Queue
        public int peek()
        {
            return dq.getFirst();
        }

        //remove the data from the top of the Queue 
        public int remove()
        {
            return dq.removeFirst();
        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); // enter how many values you can add to the Queue
        while( n-->0 )
        {
            q.add( Sc.nextInt() );
        }
        System.out.println();
        //remove and print the values
        while( !q.isEmpty() )
        {
            System.out.println( q.peek() );
            q.remove();
        }
    }
}
