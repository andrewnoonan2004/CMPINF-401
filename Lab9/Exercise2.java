/*
  Exercise2.java
*/

import java.io.*;
import java.util.*;


public class Exercise2
{

    public static void main( String[] args )
    {
        int[][]m1 = new int[2][3];
        int[][]m2 = new int[2][3];
        int[][]m3 = new int[2][3];

		// put some numbers in m1
		for (int r=0; r<m1.length ; ++r)
		{
			for (int c=0 ; c<m1[r].length ; ++c )
				m1[r][c] = (c+1) * (r+1);
		}

		// put some numbers in m2
		for (int r=0; r<m2.length ; ++r)
		{
			for (int c=0 ; c<m2[r].length ; ++c )
				m2[r][c] = (r+2) * (c+2);
		}

		printMatrix("MATRIX1",m1);
		printMatrix("MATRIX2",m2);
		addMatrices(m3, m1,m2 );     // m3 = m1 + m2

		printMatrix("MATRIX1 + MATRIX2",m3);
    } // END MAIN


    //  - - - - - - - - - - Y O U    W R I T E    T H I S   M E T H O D  -----------

    // When you add two matrices - thos matrices must be identical in size.
    // They must have smae number of rows as each other and same number
    // of colomns as each other BUT they don;t have to be square.
    // The resulting matrix is the sum of the two numbers at the same place in both matrices.
    // In the sum marix, every sum[r][c] = m1[r][c] + m2[r][c]
    // Use loops only and no hardcoded lengths etc.

    private static void addMatrices( int[][] sum, int[][]m1, int[][]m2 )
    {
        for(int row=0; row<m1.length; row++)
        {
            for(int col=0; col< m1[row].length; col++)
            sum[row][col] = m1[row][col] + m2[row][col];
        }
           // YOUR CODE HERE
    }

    //  - - - - - - - - - - D O    N O T    M O D I F Y.     U S E   A S   I S ----------------

    // IMPORTANT: matrix.length produces the number of rows. The num of rows IS the length of matrix
    // IMPORTANT: matrix[i].length produces the number of columns in the i'th row

    private static void printMatrix( String label, int[][] matrix )
    {
        System.out.println(label);
        for (int row=0 ; row<matrix.length ;  ++row)  // matrix.length is the number of rows
            {
                for (int col=0 ; col < matrix[row].length ; ++col )
                    System.out.print( matrix[row][col] + " ");

                System.out.println(); // newline after each row
            } // END FOR EACH ROW

        System.out.println(); // puts a blank line betwen next printout
    } // END PRINTMATRIX

} // END CLASS
