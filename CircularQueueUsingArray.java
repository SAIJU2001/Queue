//Circular Queue implementation(Scratch) using Array

import java.util.*;

//circular quque implement
public class CircularQueueUsingArray 
{
    static int arr[];
    static int size;
    static int rear;
    static int front;

    static class Queue
    {
        Queue( int n )  //constructor
        {
            arr=new int[n];
            size=n;
            front=-1;
            rear=-1;
        }

        //to add any data in the queue
        public void add( int data )
        {
            if( isFull() )
            {
                System.out.print("Queue is full");
                return;
            }
            if( front==-1 )
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //return true if the queue is empty
        public boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        //return true if the queue is full
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
        //peek operation returns the top form the peek
        public int peek()
        {
            if( isEmpty() )
            {
                System.out.print("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        //remove the data from the top of the queue 
        public int remove()
        {
            if( isEmpty() )
            {
                System.out.print("Queue is Empty");
                return -1;
            }
            
            int top=arr[front];
            //check 
            if( front==rear )
            {
                front=rear=-1;
            }
            else
            {
                front=(front+1)%size;
            }
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

