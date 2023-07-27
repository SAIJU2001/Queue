//Queue using java collection framework(Array Deque)

import java.util.*;

public class QueueUsingJCFAD 
{
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
        //remove and print the values
        while( !q.isEmpty() )
        {
            System.out.println( q.peek() );
            q.remove();
        }
    }    
}

