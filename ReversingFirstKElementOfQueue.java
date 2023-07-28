/*
    Question 4 :
    Reversing the ﬁrst K elements of a Queue
    We have an integer k and a queue of integers, we need to reverse the order of the ﬁrst k elements of the queue, leaving the other elements in the same relative order.


    Sample Input 1 : Q = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] ,k=5
    Sample Output 1 : Q = [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
*/

import java.util.*;

public class ReversingFirstKElementOfQueue 
{
    //fuction that reverse the first k elemnet of queue
    public static void reverse( Queue<Integer>q, int k )
    {
        Stack<Integer>st=new Stack<>(); //additional data structure to help reversing
        
        for( int i=0 ; i<k ; i++ )
        {
            //k element remove from the queue and add to the stack
            st.push(q.remove());
            //in the stack the value are reversed
        }
        int size=q.size();

        for( int i=0 ; i<k ; i++)
        {
            //pop the values from stack and add the values to the queue 
            q.add( st.pop());
        }

        //size-k nos of values added to to last of the queue
        for( int i=0 ; i<size ; i++ )
        {
            q.add(q.remove());
        }
    }
    public static void main( String args[])
    {
        Queue<Integer>q=new LinkedList<>();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); //how many values you can add the queue
        //add the values to the queue
        while( n-->0 )
        {
            q.add( Sc.nextInt() );
        }

        int k=Sc.nextInt(); //enter the value of k

        //fuction call
        reverse( q, k );

        //print and remove the elements from the queue
        while( !q.isEmpty())
        {
            System.out.print(q.remove()+" ");
        }
    }
}
