//using deque implement stack(FILO)

import java.util.*;

public class StackImplementUsingDeque 
{
    //stack operation implement
    static class Stack
    {
        Deque<Integer>dq;

        public Stack()      //constructor
        {
            dq=new LinkedList<>();
        }

        //to add any data in the stack
        public void push( int data )
        {
            dq.addLast( data);
        }

        //check stack is empty or not
        public boolean isEmpty()
        {
            return dq.isEmpty(); 
        }

        //peek operation returns the top form the stack
        public int peek()
        {
            return dq.getLast();
        }

        //remove the data from the top of the stack 
        public int pop()
        {
            return dq.removeLast();
        }
    }
    public static void main(String args[])
    {
        Stack st=new Stack();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt(); // enter how many values you can add to the stack
        while( n-->0 )
        {
            st.push( Sc.nextInt() );
        }
        System.out.println();
        //remove and print the values
        while( !st.isEmpty() )
        {
            System.out.println( st.peek() );
            st.pop();
        }
    }
}