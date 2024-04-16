import java.io.*;
import java.util.*;

public class MyLinkedListTester // THE LAB#10 VERSION
{
	public static void main( String args[] ) throws Exception
	{
		if ( args.length < 1 )
			die( "FATAL ERROR: must enter 1 filename on command line.\njava MyLinkedListTester set1.txt\n" );

		BufferedReader infile = null;
		MyLinkedList list1 = new MyLinkedList();


		// READ set1 INTO list1
		infile = new BufferedReader( new FileReader( args[0] ) );
		while ( infile.ready() )
				list1.insertAtTail( infile.readLine() );
		infile.close();

		MyLinkedList list2 = new MyLinkedList( list1 );  // WE aRE CALLING THE COPY CONSTRUCTOR

		// ECHO THE 2 LISTS  THEY SHOULD COME OUT IDENTICAL IF YOU WROTE THE COPY CONSTRUCTOR CORRECTLY
		System.out.println("PRINTING THE 2 LISTS. THEY SHOULD BE IDENTICAL");
		System.out.format( "list1 loaded from %s contains %d elements: %s\n", args[0], list1.size(), list1 ); // invokes toString
		System.out.format( "list2 copied from list1 contains %d elements: %s\n", list2.size(), list2 ); // invokes toString

		String[] keys = { "india", "bravo", "baker", "delta", "echo", "xray", "charlie", "alpha", "golf", "hotel" }; // RANDOM ORDER

		// TEST REMOVE METHOD BY REMOVING RANDOM KEY EACH TIME. LIST SHOULD BE EMPTY AT LAST PRINT

		System.out.println("REMOVING RANDOM ELEMENTS FROM LIST1 UNTIL IT IS EMPTY");
		for ( String key : keys )
		{	list1.remove( key);
			System.out.format( "removed %-7s now list1= %s\n", key, list1 ); // invokes toString
		}

		// TEST REMOVE AT FRONT BY REPEATEDLY CALLNG IT UNTIL LIST2 is EMPTY

		System.out.println("CALLING REMOVE AT FRONT ON LIST2 UNTIL IT IS EMPTY");
		while ( !list2.isEmpty() )
		{	list2.removeAtFront();
			System.out.format( "removedAtFront  now list2= %s\n", list2 ); // invokes toString
		}

	} // END MAIN

	static void die( String errMsg )
	{	System.out.println( errMsg );
		System.exit(0); // kills program
	}
} // EOF