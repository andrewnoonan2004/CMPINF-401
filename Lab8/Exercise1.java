/*
	Exercise1.java
	
	- WRITE A SINGLE DO LOOP THAT DOES THE FOLLOWING UNTIL THE USER ENTERS A VALID INPUT FILENAME
	- PROMPT THE USER FOR A FILENAME AND USE TRY CATCH TO RE-PROMPT
	- IF INPUT IS NOT AN INT YOU MUST CLERA THE BUFFER BECUASE THAT BOGUS STRING IS STILL IN THERE 
	- ONCE OUT OF THE LOOP JUST DO THE CODE THAT PRINTS THE TOKENS FROM THE FILE.

*/
import java.io.*;
import java.util.*;
public class Exercise1
{
	public static void main( String args[] ) 
	{
		if (args.length < 1)
		{
			System.out.println("\nYou must enter an input filename on cmd line!\n");
			System.exit(0);
		}
		
		
		Scanner infile = null;
		Scanner kbd = new Scanner(System.in);3
		boolean done=false;
		while(!done)
		{	// MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
		try 
		{
			Scanner infile = new Scanner( new File( args[0] ) );
		} 
		catch (FileNotFoundException fnfe) 
		{
			System.out.print("File not found. Try again: ");
			args[0] = kbd.next();
		}
		catch (Exception e)
		{
			System.out.println("Unknown exception. Aborting now!")
			System.exit(0);
		}
	}
		
		

		// THE CODE BELOW IS -AFTER, BELOW AND OUTSIDE OF- THE ABOVE LOOP 
		
		while (infile.hasNext())
		{
			String token = infile.next(); // read a string from infile
			System.out.printf("%s\n", token);
		}
	}
} //END CLASS
