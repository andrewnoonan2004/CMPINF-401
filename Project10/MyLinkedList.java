import java.io.*;
import java.util.*;

public class MyLinkedList
{
	private Node head;  // pointer to the front (first) element of the list

	public MyLinkedList()
	{
		head = null; // compiler does this anyway. just for emphasis
	}

	// COPY ALL NODES FROM OTHER LIST INTO THIS LIST. WHEN COMPLETED THIS LIST IDENTICAL TO OTHER

	// INSERTS NEW NODE AT FRONT PUSHING EXISTING NODES BACK ONE PLACE
	public void insertAtFront(String data)
	{
		head = new Node(data,head);
	}

	// USE THE TOSTRING AS OUR PRINT
	public String toString()
	{
		String toString = "";
		for (Node curr = head; curr != null; curr = curr.next)
		{	toString += curr.data;
			if (curr.next != null)
				toString += " ";
		}
		return toString;
	}

	// ########################## Y O U   W R I T E    T H E S E    M E T H O D S ########################

	// TACK A NEW NODE (CABOOSE) ONTO THE END OF THE LIST
	public void insertAtTail(String data)
	{
		// MAKE TEST FOR EDGE CASE:  what if the head is null?   i.e. what if list is empty?
		// if list is empty then an insertAtFront is the operation you can do THEN RETURN
		if(head == null)
		{	
			insertAtFront(data);
			return;
		}
		Node curr = head;
		while(curr.next != null)
		{
			curr = curr.next;
		}
		curr.next = new Node(data, curr);
		// otherwise drop down to here and run a curr pointer across the list until stops
		// wehn pointing at the tail node.

		// now just tack a new node with the data in it onto the end of the list handing off the tail node

	}

	// OF COURSE MORE EFFICIENT TO KEEP INTERNAL COUNTER BUT WE MAKE YOU
	// COMPUTE IT DYNAMICALLY WITH A TRAVERSAL LOOP
	public int size()
	{
		
		int size = 0;
		if(head == null)
		return size;
		// again make a edge case test: what if the list is empty. return what?
		for (Node curr = head; curr != null; curr = curr.next)
		{
			size++;
		}
		return size;
	}

	// MUST CALL SEARCH AND IF SEARCH RETURNS NULL, THIS METHOD RETURNS FALSE,
	// OTHERWIASE RETURN TRUE
	public boolean contains( String key )
	{
		if(search(key) == null)
		{
			return false;
		}
		
		return true;// CALL the contains function and if that call return a null you must return a false back to main
		// otherwise return true back to main
		
		// N O  L O O P S  A L L O W E D.   C O D E  R E U S E,  N O T  R E W R I T E ! // just to make it compile.
	}

	// TRAVERSE LIST FRONT TO BACK LOOKING FOR THIS DATA VALUE.
	// RETURN REF TO THE FIRST NODE THAT CONTAINS THIS KEY.
	// DO NOT- RETURN REF TO KEY ISIDE NODE
	// RETURN NULL IF NOT FOUND
	public Node search( String key ) // 	GOTTA WRITE A LOOP IN THIS ONE
	{
		// make edge case tst first. if list empty return what?
		if(head == null)
		return null;
		for(Node curr = head; curr != null; curr = curr.next)
		{
			if(curr.data.equals(key))
			return curr;
		}
		// otherwise run a curr pointer from head to tail and each time you lan on a node
		// test to see if the data in that node .equals() the incoming key
		// if you find node with data equals to key then immedately return that node (you probably named it curr)

		// if you make it out of the loop it means you never matched and thus never returned - so return what?

		return null;  // just to make it compile
	}
} //END OF LINKEDLIST CLASS DEFINITION

// ############################ N O D E    C L A S S   D E F I N I T I O N

class Node // GIVEN AS IS DO NOT MODUFY IN ANY WAY
{
	String data;
	Node next;

	Node(String data, Node next)
	{
		this.data = data; // scenario where you MUST use this dot
		this.next = null;
	}
	public String toString()
	{
		return "" + data;
	}
} // END NODE CLASS DEFINTION