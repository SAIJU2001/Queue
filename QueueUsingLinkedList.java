//Queue implementation(Scratch) using Linked List

import java.util.*;

//node class which having a data and a next pointer
class Node
{
    int data;
    Node next;

    public Node( int data ) //constructor
    {
        this.data=data;
        this.next=null;
    }
}

//implements the operations of quque
public class QueueUsingLinkedList
{
    static class Queue
    {
        Node head=null;  //head node pointer
        Node tail=null;  //taile node pointer

        //to add any data in the queue
        public void add( int data )
        {
            Node newNode=new Node( data );
            //check queue is empty or not
            if( head==null )
            {
                head=tail=newNode;
            }
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
        }
        //return true if the queue is empty
        public boolean isEmpty()
        {
            return head==null && tail==null;
        }
        //peek operation returns the top form the Queue
        public int peek()
        {
            if( isEmpty() )
            {
                System.out.print("Queue is Empty");
                return -1;
            }
            return head.data;
        }
        //remove the data from the top of the queue 
        public int remove()
        {
            if( isEmpty() )
            {
                System.out.print("Queue is Empty");
                return -1;
            }
            
            int top=head.data;
            head=head.next;
            //after removing always check head and tails have nodes or not
            if( head==tail )
            {
                tail=null;
            }
            return top;
        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue();
        Scanner Sc=new Scanner(System.in);
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