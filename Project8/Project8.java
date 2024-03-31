import java.io.*;
import java.util.*;

public class Project8
{
	  public static void main( String args[] )
    {
        int num;
        boolean done = false;
        Scanner kbd = new Scanner( System.in);
        while(!done)
        {
            try
            {
                System.out.print("Enter int in range 1..100 inclusive:");
                num = kbd.nextInt();
                if(num <1 || num > 100) throw new NumberOutOfRangeException();
                System.out.format("Thank you. You entered %d\n", num);
                done = true;
            }
            catch(InputMismatchException ime)
            {
                System.out.println("Input was not an integer");
                kbd.nextLine();
            }
            catch( NumberOutOfRangeException e)
            {
                System.out.println(e.getMessage());
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.exit(0);
                
            }
        }
        // MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW

    }
    private static class NumberOutOfRangeException extends Exception
    {
        private NumberOutOfRangeException()
        {
            super("Number out of range. Must be be in 1..100");
        }
        
    }
    //END main
} //END CLSS
