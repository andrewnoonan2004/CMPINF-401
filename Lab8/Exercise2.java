/*
	Exercise2.java
	- WRITE A SINGLE DO LOOP THAT DOES THE FOLLOWING UNTIL THE USER ENTERS AN INT IN 1..100 INCLUSIVE
	- 	USE TRY CATCH TO READ AN INT FROM THE KBD SUCH THAT IF USER ENTERS "FOO" IT DOES NOT CRASH
	- 	BE SURE TO MANUALLY THROW AN EXCEPTION & CATCH IT FOR THE CASE OF USER ENTERING AN VALID 
	-	INT THAT HAPPENS TO BE OUT OF RANGE.

*/
import java.io.*;
import java.util.*;

public class Exercise2
{
	public static void main( String args[] )
	{
		// MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("Enter int in range 1..100 inclusive: ");
		System.out.format("Thank you. You entered %d\n", kbd.nextInt() );
		
	} //END main
} //END CLSS