import java.io.*;
import java.util.*;

public class MyArrayList
{
	private String[] theArray; private int count; // THIS IS THE COUNT. NOT THE PYHSICAL .length of theArray
	private int INITIAL_CAPACITY = 1;

	public MyArrayList( ) // dimension theArray to be this initial capacity
	{
		theArray = new String[ INITIAL_CAPACITY ];
		count = 0;
	}
	public MyArrayList( MyArrayList other ) throws Exception // dimension theArray to be this initial capacity
	{
		theArray = new String[INITIAL_CAPACITY];
		count = 0;// initalise to same default intial capacity and clear the count
		for(int i =0; i<other.size(); i++)
		{
			this.add(other.get(i));
		}// copy all the inialized elems from other array into this array
		// use other.size(), this.add() and other.get(i)

	}
	public boolean add(String key) throws Exception // appends specified element to the end of this list. BUT, if is a dupe, reject and return false
	{
		for(int i=0; i < count; i++)
		{
			if(theArray[i] != null && theArray[i].equals(key))// test to see if key already contained in this array. 		
				return false;// if so return false immed
		}
		if(theArray.length == count)// test for need to upSize ? if so do it
		upSizeArr();
		theArray[count++] = key;// tack incoming key onto end of your array, incr count++

		return true;
	}
	public String get( int index ) throws Exception// returns elem at that index
	{	if (index < 0 || index > size()-1) 
			throw new Exception( "indexOf("+index+") OUT Of BOUNDS!" );

		return theArray[index];
	}
	public void clear() // removes all of the elements from this list. Shallow deletion, not a deep deletion O(1) operation
	{
		count = 0;  // the RIGHT WAY to do a shallow deletion of an array's elements
	}
	public boolean contains( String key) throws Exception
	{
		for(int i=0;i<this.size();i++) // loop thru your own array doing .equals test against key
		{
			if(this.get(i).equals(key))
			{
				return true;
			}
		}
		// use .size() and use .get(i)
		return false;
	}

	public int indexOf(String key) throws Exception// returns  index of  first occurrence of key, or -1 if not found.
	{
		for(int i=0;i<this.size();i++) // loop thru your own array doing .equals test against key
		{
			if(this.get(i).equals(key))
			{
				return i;
			}
		}
		// same as above but return the index wehre matched or -1
		return -1;
	}
	public boolean remove(int index ) throws Exception // removes 1st occurrence of key. True if succeeds else false
	{
		// BASE/EDGE CASES
		if (index < 0 || index >= size() ) throw new Exception( "indexOf("+index+") OUT Of BOUNDS!" );

		for(int i = size() -1; i>index;i--) //loop through starting at index
		{
			theArray[i-1] = theArray[i];
			return true;
		}
			// copy everything AT and above index, DOWN one slot
		return false;
	}
	public boolean remove(String key ) throws Exception // removes first occurrence of specified key. True if succeeds else false not found
	{
		for(int i=this.size(); i>0;i--)// find index where this key is. if not found ret false else copy everything AT and above index, DOWN one slot
    {
      int index = this.indexOf(key);
      this.remove(index);
    } 
		return false;
	}
	public boolean addAll( MyArrayList other ) throws Exception // add all elems of other list into this list (BUT no dupes allowed)
	{
		// append all of the stuff in incomoint/other array onto the end of yours
    boolean hasAdded;
    for(int i=0; i<other.size();i++)
    {
      if(this.add(other.get(i)))
        hasAdded = true;
    }
		// if other list empty OR all were dupes then you cant add anything
		//thus return false in this case
		// ret true only if you added at least 1 elem
    hasAdded = false;
		return hasAdded;
	}

	public boolean retainAll( MyArrayList other ) throws Exception // only keep elems in this list that are contained in other list
	{
		// only keep elems in this list that are contained in other list
    //loop through this array
    //if(!other.contains(get(i)))
    //
		// only return true if your list was modified
		return false;

	}
	public boolean removeAll( MyArrayList other ) throws Exception // remove from this list all elements contained in other list
	{
		boolean hasRemoved;
    for(int i =0; i<this.size();i++)
    {
      if(this.remove(other.get(i)))
        hasRemoved = true;
    }
    // remove from this list all elements contained in other list
		// only return true of you actually removed at least one elem
		hasRemoved = false;
    return hasRemoved;
	}
	public String toString() // print all the elem in array on same line with 1 space between then a newline  i.e a printArray like function
	{
		String toString = "";
		for ( int i=0 ; i<size() ; ++i )
		{	try
			{ toString += get(i) + " " ;
			}
			catch( Exception e) {}
		}
		return toString;
	}

	public void sortMe()
	{
		Arrays.sort( theArray,0,size() );
	}

	// GIVEN TO YOU AS A MODEL FOR THE OPTHER 3
	public MyArrayList union( MyArrayList other ) throws Exception
	{
		MyArrayList unionResult = new MyArrayList(this); // start with a dupe of this list
		unionResult.addAll( other );
		return unionResult;
	}
	public MyArrayList intersection( MyArrayList other ) throws Exception
	{
		MyArrayList interResult = new MyArrayList(this);
		interResult.removeAll( other);
		return interResult; //
	}
	public MyArrayList difference( MyArrayList other ) throws Exception
	{
		MyArrayList diffResult = new MyArrayList(this);
		diffResult.retainAll(other)
		return diffResult;// ONLY 3 LINES OF CODE NEEDED!
	}
	public MyArrayList xor( MyArrayList other ) throws Exception
	{
		return null; // ONLY 3 LINES OF CODE NEEDED!
	}
	public int size() // retrieves the member variable count. The real arraylist call the method size() too
	{
		return count;
	}

	private void upSizeArr() throws Exception  /* d o u c y we dont need pass the array in AND dont return the ref?  */
	{
		String[] biggerArray = new String[ size() * 2 ];
		for ( int i=0 ; i<size() ; ++i )
			biggerArray[i] = get(i);
		theArray = biggerArray;
	}



} // END CLASS MyArrayList
