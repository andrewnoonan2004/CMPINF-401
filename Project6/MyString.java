public class MyString
{
	private char[] letters;
	
/* 	NEXT 3 METHODS GIVEN AS IS DO NOT MODIFY

	public MyString( String other )
	{
		letters = other.toCharArray();
	}
	
	public MyString( MyString other )
	{
		this( other.toString() );
	}
	
	public String toString()
	{
		return new String(letters);
	}

        END OF GIVEN METHODS.  YOU WRITE (FILL IN)  ALL THOSE BELOW
*/	

	public int length()
	{
		return 0;  // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE
	}

	public char charAt(int index)
	{
		if(index<0 || index>letters.length())
		{
			System.out.println("The index: " + index + "is invalid!");
			System.exit(0);
		}
		else
		{
			return letters[index];
		}
		 // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE
	}
	int compareTo(MyString other)
	{
		return 0; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE 
		//ms1 h e  l l  o
		//-
		//ms2 h e  l i  c  o   p  t   e  r
		//----------
		//    0  0 0 -2 12 0
		//if (ms1.compareTo(ms2) == 0)
		//identical letter for letter and case by case and length
		// else if (ms1.compareTo(ms2)> 0)
		//ms1 is lexically greater than ms2
		//else
		//ms1 is lexically less than ms2

	}	
	public boolean equals(MyString other)
	{
		return false;  // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE 

	}
	// LOOKING for c but starting at [startIndex],  not at [0]
	// You should use this in your other Indexof Method
	public int indexOf(int startIndex, char ch)	
	{
		return -1; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE 
 
	}
	public int indexOf(MyString other)
	{	// RE-USE the indexOf( int startIndex, char ch) method above in here
		return -1; // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE 
		
	}
} // END MYSTRING CLASS
// this: "the quick brown fox jumped over the lazy dog"
//key: "dog"
// look for the first occurrence of letter 'd' in the big string
// use the indexOf(int startIndex, char ch)
// see if the word dog matches inside of the big word starting at this index
// you might want to write a little helper function that just compares the corresponding letters to those in the big string at that index
// if we don't find dog, go back to the top of the loop and find the next occurrence of d
// if there are no more occurrences of d, return -1;
