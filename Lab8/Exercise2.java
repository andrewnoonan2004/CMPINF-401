import java.io.*;
import java.util.*;

public class Exercise2
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
                if(num <1 || num > 100) throw new Exception( "Number: " + num + " out of range." + " Must be in 1..100");
                System.out.format("Thank you. You entered %d\n", num);
                done = true;
            }
            catch(InputMismatchException ime)
            {
                System.out.println("Input was not an integer");
                kbd.nextLine();
            }
            catch(Exception e)
            {
                String msg = "" + e;
                msg = msg.replaceFirst("java.lang.Exception: ","");
                System.out.println(msg);
                kbd.nextLine();
            }
        }
        // MODIFY, REPLACE, ADD LOOP CODE, ADD TRY CATCH BLOCK(S) AS NEEDED BELOW

    }//END main
} //END CLSS
