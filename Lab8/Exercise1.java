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
        Scanner kbd = new Scanner(System.in);
        boolean done=false;
        while(!done)
        {   // MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW
            try
        {
            infile = new Scanner( new File( args[0] ) );
            done = true;
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.print( args[0] + " not found. Enter valid filename: ");
            args[0] = kbd.next();
        }
        catch (Exception e)
        {
            System.out.println("Unknown exception. Aborting now!");
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
