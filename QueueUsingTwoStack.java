//using two stack implement the operations of queue

import java.util.*;

public class QueueUsingTwoStack
{
    static class Queue
    {
        //create two stack
        Stack<Integer>st1;   //for storing data using queue manner
        Stack<Integer>st2;   //helping for establish FIFO

        public Queue()      //constructor
        {
            st1=new Stack<>();
            st2=new Stack<>();
        }
        //add element to the queue
        public void add( int data )
        {
            if( st1.isEmpty() )
            {
                st1.push( data );
                return;
            }
            //using helping stack maintain the FIFO order
            while( !st1.isEmpty() )
            {
                st2.push( st1.pop() );
            }
            st1.push( data );
            while( !st2.isEmpty() )
            {
                st1.push( st2.pop() );
            }
        }
        //check queue is empty or not
        public boolean isEmpty()
        {
            return st1.isEmpty() && st2.isEmpty(); 
        }
        //retrive the peek value
        public int peek()
        {
            return st1.peek();
        }
        //remove from the queue
        public int remove()
        {
            return st1.pop();
        }
    }

    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        Queue q=new Queue();
        int n=Sc.nextInt();  //enter how many value you can add
        while( n-->0 )
        {
            //add the values to the queue
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