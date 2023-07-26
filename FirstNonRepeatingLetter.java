//first non repeating letter in a stream of character
/*
 *      suppose the given stream in lower case
 *      input : aabccxb
 *      output : a -1 b b b b x
 */

import java.util.*;

public class FirstNonRepeatingLetter 
{
    public static void nonRepeatPrint( String str )
    {
        Queue<Character>q=new LinkedList<>();
        int frequency[]=new int[26];    //for counting the frequency of every character

        for( int i=0 ; i<str.length() ; i++ )
        {
            char ch=str.charAt(i);  //character choose
            frequency[ch-'a']++;    //increment frequency
            q.add(ch);              //add character to the queue

            while( !q.isEmpty() && frequency[q.peek()-'a']>1 )
            {
                q.remove(); //when freqency value of character is greter the 1 that repeating character and it removes from the queue
            }

            if( q.isEmpty() )
            {
                System.out.print(-1+" ");
            }
            else
            {
                System.out.print( q.peek()+" " );
            }
        }
    }

    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        String str=Sc.next();  //enter your string
        System.out.println();
        //function call 
        nonRepeatPrint( str );
    }    
}
