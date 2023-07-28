//using two Queue implement the operations of stack

import java.util.*;

public class StackUsingTwoQueue 
{
    static class Stack
    {
        //create two Queue
        Queue<Integer>q1;   //for storing data 
        Queue<Integer>q2;   //helping for establish stack

        public Stack()      //constructor
        {
            q1=new LinkedList<>();
            q2=new LinkedList<>();
        }

        //add element to the stack
        public void push( int data )
        {
            if( !q1.isEmpty() )
            {
                q1.add( data );
            }
            else
            {
                q2.add( data );
            }
        }
        //check stack is empty or not
        public boolean isEmpty()
        {
            return q1.isEmpty() && q2.isEmpty(); 
        }
        //retrive the peek value
        public int peek()
        {
            if( isEmpty() )
            {
                //this is empty we created
                System.out.print("Stack is empty");
                return -1;
            }

            int top=-1;
            if( !q1.isEmpty() )
            {
                while( !q1.isEmpty() )
                {
                    top=q1.remove();
                    q2.add( top);
                }
            }
            else
            {
                while( !q2.isEmpty() )
                {
                    top=q2.remove();
                    q1.add( top);
                }
            }
            return top;
        }
        //remove from the queue
        public int pop()
        {
            if( isEmpty() )
            {
                //this is empty we created
                System.out.print("Stack is empty");
                return -1;
            }

            int top=-1;
            if( !q1.isEmpty() )
            {
                while( !q1.isEmpty() )
                {
                    top=q1.remove();
                    if( q1.isEmpty() )
                    {
                        break;
                    }
                    q2.add( top);
                }
            }
            else
            {
                while( !q2.isEmpty() )
                {
                    top=q2.remove();
                    if( q2.isEmpty() )
                    {
                        break;
                    }
                    q1.add( top);
                }
            }
            return top;
        }
    }

    public static void main(String args[])
    {

        Scanner Sc=new Scanner(System.in);
        Stack st=new Stack();
        int n=Sc.nextInt();  //enter how many value you can add
        while( n-->0 )
        {
            //add the values to the stack
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

