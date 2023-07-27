//Queue reverse
/*
 *      input : 1 2 3 4 5
 *      output : 5 4 3 2 1
 */

import java.util.*;

public class QueueReversal 
{
    public static void reverse( Queue<Integer>q )
    {
        Stack<Integer>st=new Stack<>();

        //remove the element from the top of the queue and add to the stack
        while( !q.isEmpty() )
        {
            st.push( q.remove() );
        } 

        //now pop from the stack and add to the queue
        while( !st.isEmpty() )
        {
            q.add( st.pop() );
        }
    }

    public static void main(String args[])
    {
        Queue<Integer>q=new LinkedList<>();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); //how many values you can add to the quque
        while( n-->0 )
        {
            int data=Sc.nextInt();
            q.add( data );
        }
        System.out.println();
        //function call to reverse the queue
        reverse( q );
        //remove and print the values
        while( !q.isEmpty() )
        {
            System.out.println( q.peek() );
            q.remove();
        }
    }    
}


