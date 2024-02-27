import java.io.*;
import java.util.*;

public class ComparableFractionTester
{
	public static void main( String args[] )
	{
		Random generator = new Random( 17 );

		// POPULATE AN ARRAYLIST OF ComparableFraction WITH RANDOM VALUES

		ArrayList<ComparableFraction> AList = new ArrayList<ComparableFraction>();
		for (int i=5 ; i>=0 ; --i )
			AList.add(  new ComparableFraction(1+generator.nextInt(100), 1+generator.nextInt(100)) ); // numer and denom in [1..99]

		// MAKE DEEP COPY OF THOSE ComparableFraction IN THE ARAYLIST ABOVE,  BUT STORE INTO PLAIN ARRAY OF ComparableFraction

		ComparableFraction[] plainArr = new ComparableFraction[ AList.size() ];
		for ( int i = 0 ; i < plainArr.length ; ++i )
			plainArr[i] = new ComparableFraction( AList.get(i) );

		// PRINT BOTH CONTAINERS TO VERIFY THEY MATCH

		System.out.println("\nArrayList of ComparableFraction UNSORTED:");
		for ( ComparableFraction f : AList )
			System.out.println( f );

		System.out.println("\nplainArr of ComparableFraction UNSORTED:");
		for ( ComparableFraction f : plainArr )
			System.out.println( f );

		// SORT BOTH CONTAINERS USING APPROPRIATE LIBRARY

		Collections.sort( AList );
		Arrays.sort( plainArr );

		//RE-PRINT BOTH AND THEY SHOULD BE IDENTICAL AND IN SORTED ORDER

		System.out.println("\nArrayList of ComparableFraction SORTED:");
		for ( ComparableFraction f : AList )
			System.out.println( f );

		System.out.println("\nplainArr of ComparableFraction SORTED:");
		for ( ComparableFraction f : plainArr )
			System.out.println( f );
	}// END MAIN
} // END