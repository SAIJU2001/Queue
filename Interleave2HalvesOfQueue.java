//Intervals 2 Halves of a Queue(even length)
/*
 *      input : 1 2 3 4 5 6 7 8 9 10
 *      output : 1 6 2 7 3 8 4 9 5 10
 */

import java.util.*;

public class Interleave2HalvesOfQueue 
{
    public static void interleave( Queue<Integer>q )
    {
        Queue<Integer>firstHalf=new LinkedList<>();

        int size=q.size();
        //first half value of the queue add to the firstHalf queue
        for( int i=0 ; i<size/2 ; i++ )
        {
            firstHalf.add( q.remove() );
        } 

        //now remove from the both queue and added the the main queue(q) 
        while( !firstHalf.isEmpty() )
        {
            q.add( firstHalf.remove() );
            q.add( q.remove() );
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
        //function call 
        interleave( q );
        //remove and print the values
        while( !q.isEmpty() )
        {
            System.out.println( q.peek() );
            q.remove();
        }
    }    
}



    

