import java.io.*;
import java.util.*;

public class lab0
{
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0, i<20, i++)
		list.add(i); //append onto the end just like arrays
		//SMART WAY
		for(int val:list)
			System.out.print( val + " ");
		System.out.println();
		/* old way
		for( int i=0, i < list.size(), i++)
			System.out.print(list.get(i) + " ");
		System.out.println(); *\
	}
}
 
 
