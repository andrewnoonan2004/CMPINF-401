
import java.io.*;
import java.util.*;

public class MyArrayListTester
{
	public static void main( String[] args) throws Exception
	{
		MyArrayList list1 = new MyArrayList();
		BufferedReader infile = new BufferedReader( new FileReader( args[0] ) );
		while ( infile.ready() )
			list1.add( infile.readLine() );
		infile.close();
		list1.sortMe();
		System.out.println( "set1.txt: " + list1 );

/*   LEAVE THIS BLOCK COMMENTED OUT UNTIL YOUR add METHOD IS WRITTEN, COMPIlES AND CORRECTLY OUTPUTS

		MyArrayList copyOfList1 = new MyArrayList( list1 ); // Copy C'Tor deep copies contents of list 1 into the copyList
		System.out.println( "copy1:    " + list1 );

		MyArrayList list2 = new MyArrayList();
		infile = new BufferedReader( new FileReader( args[1] ) );
		while ( infile.ready() )
			list2.add( infile.readLine() );
		infile.close();
		list2.sortMe();
		System.out.println( "set2.txt: " + list2 );

		MyArrayList copyOfList2 = new MyArrayList( list2 ); // Copy C'Tor deep copies contents of list 2 into the copyList
		System.out.println( "copy2:    " + list2 );

		MyArrayList union = list1.union(list2);
		union.sortMe();
		System.out.println( "union(list1,list2):        " + union );

		MyArrayList intersection = list1.intersection(list2);
		intersection.sortMe();
		System.out.println( "intersection(list1,list2): " + intersection );

		MyArrayList difference = list1.difference(list2);
		difference.sortMe();
		System.out.println( "difference(list1,list2):   " + difference );

		MyArrayList xor = list1.xor(list2);
		xor.sortMe();
		System.out.println( "xor(list1,list2):          " + xor );
*/

	} // END main
} // END CLASS MyArrayListTester