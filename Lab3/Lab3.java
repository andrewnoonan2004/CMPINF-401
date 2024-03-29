// STARTER FILE LAB #3

import java.util.*;
import java.io.*;

public class Lab3
{
    static final int MAX_CAPACITY = 30;  // HARDOCED PLENTY BIG. WE'LL DO TRIM AFTER
    
    public static void main( String args[] ) throws Exception
    {
        if (args.length < 1 )
        {
            System.out.println("usage: $ java Lab4 <inupt file of random numbers>\n");
            System.exit(0);
        }
        
        int[] arr = new int[ MAX_CAPACITY ];
        int count=0;
        
        Scanner infile = new Scanner( new File( args[0] ) );
        while ( infile.hasNextInt() )
        {
            insertInOrder( arr, count, infile.nextInt() );
            ++count;
        }
        
        arr = trimArray( arr, count );
        printArray( arr ); // NOTE:  NO COUNT PASSED IN
        
    }// END MAIN
    
    // ############################################################################################################
    
    // MUST USE ENHANCED FOR LOOP IN THIS METHOD
    // (YOUR TRIM BETTER HAVE BEEN WRITEN CORRECTLY)
    static void printArray( int[] array )
    {
        for( int val : array )
            System.out.print(val + " ");// PRINT EACH NUMBER WITH A SPACE AFTER IT
        System.out.println(); // LEAVE THIS HERE
    }

    static int[] trimArray( int[] array, int count  )
    {
        int[] slimArr = new int[count];
        for(int i=0; i < count; i++)
            {
               slimArr[i] = array[i];
            }
        return slimArr;
    }
    
   
    // THE CODE IN HERE NOW JUST APPENDS. THIS IS NOT CORRECT
    static void insertInOrder( int[] arr, int count, int newVal)
    {
        int i = count-1 ;
        // notes
        while(i >= 0 && newVal < arr[i] )
            {
                arr[i+1] = arr[i];
                arr[i] = newVal;
                i--;
            }
        arr[i+1] = newVal;
    }
}
//three steps:
//declare a variable i at count -1
//loop:
//repeatedly ask if newVal is less than i
//if it is, copy the value at i and push it up
//decrement i
//ask the same question
