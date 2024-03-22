
public class MyString
{
	private char[] letters;
	static final int NOT_FOUND=-1;
// 	NEXT 3 METHODS GIVEN AS IS DO NOT MODIFY

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

     //   END OF GIVEN METHODS.  YOU WRITE (FILL IN)  ALL THOSE BELOW
	

	public int length()
	{
		return letters.length;  // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE
	}

	public char charAt(int index)
	{
		if(index<0 || index>letters.length)
		{
			System.out.println("The index: " + index + "is invalid!");
			System.exit(0);
		}
		return letters[index];
		 // JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE
	}
	int compareTo(MyString other)
	{
		int compLength;
		if(letters.length > other.length())
		{
			compLength = other.length();
		}
		else
		{
			compLength = letters.length;
		}
		for(int i = 0; i < compLength; i++)
		{
			if(letters[i] > other.charAt(i))
			{
				return 1;
			}
			else if(letters[i] < other.charAt(i))
			{
				return -1;
			}
		}
		
		if(letters.length > other.length())
		{
			return 1;
		}
		else if(letters.length < other.length())
		{
			return -1;
		}
		
		return 0;
	}
	public boolean equals(MyString other)
	{
		if(this.compareTo(other) == 0) return true;
		else return false;

	}
	// LOOKING for c but starting at [startIndex],  not at [0]
	// You should use this in your other Indexof Method
	public int indexOf(int startIndex, char ch)	
	{
		for(int i=startIndex; i< letters.length;i++)
		{
			if(letters[i] == ch)
			return i;
		} 
		return NOT_FOUND;// JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE 
 
	}
	public int indexOf(MyString other)
	{	
		int indexOfFirst = indexOf(0, other.charAt(0));
		if(indexOfFirst == NOT_FOUND) return NOT_FOUND;
		while(indexOfFirst != NOT_FOUND)
		{
			if(indexOfSubString(indexOfFirst, other) != NOT_FOUND)
			{
				return indexOfFirst;
			}
			else indexOfFirst = indexOf(indexOfFirst + 1, other.charAt(0));
		}
	return -1;// RE-USE the indexOf( int startIndex, char ch) method above in here
	// JUST TO MAKE IT COMPILE. YOU REPLACE WITH ALL YOUR CODE 
		}
	private int indexOfSubString(int startIndex, MyString other)
	{
		for(int i = 0; i < other.length(); i++)
		{
			if(letters[startIndex + i] != other.charAt(i))
			{
				return NOT_FOUND;
			}
		}
		return startIndex;
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
