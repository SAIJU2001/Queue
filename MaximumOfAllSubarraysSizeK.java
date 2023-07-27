/*
    Question 5 :
    Maximum of all subarrays of size k
    We have an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

    Sample Input 1 : N=9, K=3 arr= 1 2 3 1 4 5 2 3 6
    Sample Output 1 : 3 3 4 5 5 5 6
*/

import java.util.*;

public class MaximumOfAllSubarraysSizeK 
{
    //fuction that find Maximum of all subarrays of size k
    public static int[] subArray( int arr[], int k )
    {
        Deque<Integer>dq=new LinkedList<>();
        int n=arr.length;
        int result[]=new int[n-k+1];    //store the max subarray value and return it
        
        //first k value added to deque and find greter element index
        for( int i=0 ; i<k ; i++ )
        {
            if( !dq.isEmpty() && arr[dq.peek()]>=arr[i] )
                dq.addLast( i );    //lesser value added to the last
            else
                dq.addFirst( i );   //greter value added to the peek
        }
        //peek element add to the result
        result[0]=arr[dq.peek()];
        int j=1;    //to indicate the index of the result array
        for( int i=k ; i<n ; i++)
        {
            //check the peek element index in the range of subarray if not then remove
            while( !dq.isEmpty() && dq.peek()<=i-k )
                dq.removeFirst();
            
            //added the index
            if( !dq.isEmpty() && arr[dq.peek()]>=arr[i] )
                dq.addLast( i );    //lesser value added to the last
            else
                dq.addFirst( i );   //greter value added to the peek
            
            result[j++]=arr[dq.peek()];
        }
        return result;
    }
    public static void main( String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); //how many values you can add to the array
        int arr[]=new int[n];

        for( int i=0 ; i<n ; i++ )
        {
            arr[i]=Sc.nextInt();
        }
        int k=Sc.nextInt(); //enter the value of k

        //fuction call
        int result[]=subArray( arr, k );

        //print the result array
        for( int i=0 ; i<result.length ; i++ )
        {
            System.out.print( result[i]+" ");
        }
    }
}
