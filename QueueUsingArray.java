//Queue implementation(Scratch) using Array

import java.util.*;

//implement queue
public class QueueUsingArray 
{
    static int arr[];
    static int size;
    static int rear;

    static class Queue
    {
        Queue( int n )  //constructor
        {
            arr=new int[n];
            size=n;
            rear=-1;
        }

        //to add any data in the queue
        public void add( int data )
        {
            if( isFull() )
            {
                System.out.print("Queue is full");
            }
            rear++;
            arr[rear]=data;
        }
        //return true if the queue is empty
        public boolean isEmpty()
        {
            return rear==-1;
        }
        //return true if the queue is full
        public boolean isFull()
        {
            return rear==size-1;
        }
        //peek operation returns the top form the peek
        public int peek()
        {
            if( isEmpty() )
            {
                System.out.print("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
        //remove the data from the top of the queue 
        public int remove()
        {
            if( isEmpty() )
            {
                System.out.print("Queue is Empty");
                return -1;
            }
            
            int top=arr[0];
            //shifting the elements
            int i=0;
            while( i<rear )
            {
                arr[i]=arr[i+1];
                i++;
            }
            rear--;
            return top;
        }
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int length=Sc.nextInt();    //enter the length
        Queue q=new Queue( length );
        int n=Sc.nextInt(); // enter how many values you can add to the quque
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

