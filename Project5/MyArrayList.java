// 2002 - Formatted by JFormat - jlbalder at netscape.net
import java.io.*;
import java.util.*;

public class MyArrayList
{
    private String[] theArray;
    private int count; // THIS IS THE COUNT. NOT THE PYHSICAL .length of theArray
    private int INITIAL_CAPACITY = 1;

    public MyArrayList()
    {
        // dimension theArray to be this initial capacity
        theArray = new String[INITIAL_CAPACITY];
        count = 0;
    }

    public MyArrayList(MyArrayList other)
    throws Exception
    {
        // dimension theArray to be this initial capacity
        theArray = new String[INITIAL_CAPACITY];
        count = 0; // initalise to same default intial capacity and clear the count
        for (int i = 0; i < other.size(); i++)
        {
            this.add(other.get(i));
        }// copy all the inialized elems from other array into this array

        // use other.size(), this.add() and other.get(i)

    }//~throws Exception...

    public boolean add(String key)
    throws Exception
    {
        // appends specified element to the end of this list. BUT, if is a dupe, reject
        // and return false
        for (int i = 0; i < count; i++)
        {
            if (theArray[i] != null
            && theArray[i].equals(key)) // test to see if key already contained in this array.
            return false; // if so return false immed
        }

        if (theArray.length == count) // test for need to upSize ? if so do it
        upSizeArr();
        theArray[count++] = key; // tack incoming key onto end of your array, incr count++

        return true;
    }//~throws Exception...

    public String get(int index) throws Exception // returns elem at that index
    {
        if (index < 0 || index > size() - 1)
        throw new Exception("indexOf(" + index + ") OUT Of BOUNDS!");

        return theArray[index];
    }

    public void clear()
    {
        // removes all of the elements from this list. Shallow deletion, not a deep deletion
        // O(1) operation
        count = 0; // the RIGHT WAY to do a shallow deletion of an array's elements
    }

    public boolean contains(String key) throws Exception
    {
        for (int i = 0; i < this.size(); i++)
        {
            // loop thru your own array doing .equals test against key
            if (this.get(i).equals(key))
            {
                return true;
            }
        }

        // use .size() and use .get(i)
        return false;
    }//~...

    public int indexOf(String key)
    throws Exception
    {
        // returns  index of  first occurrence of key, or -1 if not found.
        for (int i = 0; i < this.size(); i++)
        {
            // loop thru your own array doing .equals test against key
            if (this.get(i).equals(key))
            {
                return i;
            }
        }

        // same as above but return the index wehre matched or -1
        return -1;
    }//~throws Exception...

    public boolean remove(int index)
    throws Exception
    {
        // removes 1st occurrence of key. True if succeeds else false
        if (index < 0 || index > size() - 1) return false;
        for (int i = index; i < size() - 1; i++)
        {
            theArray[i] = theArray[i + 1];
        }

        count--;
        return true;
    }//~throws Exception...

    public boolean remove(String key)
    throws Exception
    {
        // removes first occurrence of specified key. True if succeeds else false not
        // found
        for (int i = 0; i < this.size(); i++)
        {
            // loop thru your own array doing .equals test against key
            if (this.get(i).equals(key))
            {
                this.remove(i);
                return true;
            }
        }

        // same as above but return true if you removed it or false if not found
        return false;
    }//~throws Exception...

    public boolean addAll(MyArrayList other) throws Exception
    {
        boolean hasAdded=false;
        for (int i = 0; i < other.size(); i++)
        {
            if ( this.add(other.get(i)) )
            hasAdded = true;
        }

        return hasAdded;
    }//~public boolean addAll(My...

    public boolean retainAll(MyArrayList other) throws Exception
    {
        boolean hasRetained = false;
        for (int i=0; i<size() ; i++)
        if ( !other.contains(this.get(i)) )
        {
            this.remove(i);
            --i;
            hasRetained = true;
        }

        return hasRetained;
    }//~public boolean retainAll...

    public boolean removeAll(MyArrayList other)
    throws Exception
    {
        // remove from this list all elements contained in other list
        boolean hasRemoved;
        for (int i = 0; i < other.size(); i++)
        {
            if (this.remove(other.get(i)))
            hasRemoved = true;
        }

        // remove from this list all elements contained in other list
        // only return true of you actually removed at least one elem
        hasRemoved = false;
        return hasRemoved;
    }//~throws Exception...

    public String
    toString()
    {
        // print all the elem in array on same line with 1 space between then a newline
        // i.e a printArray like function
        String toString = "";
        for (int i = 0; i < size(); ++i)
        {
            try
            {
                toString += get(i) + " ";
            }

            catch (Exception e)
            {
            }
        }//~for (int i = 0; i < size...

        return toString;
    }//~toString()...

    public void sortMe()
    {
        Arrays.sort(theArray, 0, size());
    }

    // GIVEN TO YOU AS A MODEL FOR THE OPTHER 3
    public MyArrayList union(MyArrayList other) throws Exception
    {
        MyArrayList unionResult = new MyArrayList(this); // start with a dupe of this list
        unionResult.addAll(other);
        return unionResult;
    }

    public MyArrayList intersection(MyArrayList other) throws Exception
    {
        MyArrayList interResult = new MyArrayList(this);
        interResult.retainAll(other);
        return interResult; //
    }

    public MyArrayList difference(MyArrayList other) throws Exception
    {
        MyArrayList diffResult = new MyArrayList(this);
        diffResult.removeAll(other);
        return diffResult; // ONLY 3 LINES OF CODE NEEDED!
    }

    public MyArrayList xor(MyArrayList other) throws Exception
    {
        MyArrayList xorResult = new MyArrayList(this);
		xorResult = xorResult.union(other).difference(this.intersection(other));
		return xorResult; // ONLY 3 LINES OF CODE NEEDED!
    }

    public int size()
    {
        // retrieves the member variable count. The real arraylist call the method size() too
        return count;
    }

    private void upSizeArr()
    throws Exception /* d o u c y we dont need pass the array in AND dont return the ref?  */
    {
        String[] biggerArray = new String[size() * 2];
        for (int i = 0; i < size(); ++i) biggerArray[i] = get(i);
        theArray = biggerArray;
    }
}// END CLASS MyArrayList

