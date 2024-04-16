import java.io.*;
import java.util.*;

public class MyLinkedList // THE LAB #10 VERSION
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

	public boolean isEmpty()
	{
		return head == null;
	}

	public int size()
	{
		int size=0;
		if ( isEmpty() ) return size;
		Node cur=head;
		while ( cur != null )
		{
			++size;
			cur = cur.next;
		}
		return size;
	}
	// ########################## Y O U   W R I T E    T H E S E    M E T H O D S ########################

	// TACK A NEW NODE (CABOOSE) ONTO THE END OF THE LIST
	public void insertAtTail(String data) // TAKE CODE FROM YOUR PROJECT #10 SOLUTON
	{
		// TAKE CODE FROM YOUR PROJECT #10 SOLUTON
	}

	public boolean remove( String key ) // CANN BE CALLED FROM MAIN
	{
/*
		1: edge case. if list empty then return false
		2: if the very first node in list contians key then return removeAtFront()
		3: iteration. define a Node variable named cur (just define a ref dont new a Node)
			set cur var = head;
			advance that cur var until STOPS RIGHT BEFORE the node that contains key
			*** we WILL refer to the node that contains key as the deadNode (since it is to be deleted)
		4: after loop stops. Check to see if cur is pointing at the tail/caboose node
		   if it is then your key is NOT found just return false
		5: otherwise cur wll be sitting on the node BEFORE the deedNode.Use curr to make
		   the node BEFORE deadNode point to the node AFTER deadNode (LEAPFROG OVER IT)
*/
	}

	public boolean removeAtFront() // CAN BE CALLED FROM MAIN
	{
/*		test head for null if so you cant do a remove operation so just return false
		otherwise make hard point at what ever node the fisrt node points to
		then return true
*/
	}

	public MyLinkedList( MyLinkedList otherList ) // THE COPY CONSTRUCTOR
	{
/*		set cur to the orther lists head
		walk the other list using cur and every node you land on
		do an insertAtTail( the other lists data ) onto your own list.
*/
	}


} //END OF LINKEDLIST CLASS DEFINITION

// ############################ N O D E    C L A S S   D E F I N I T I O N (D O  N O T  M O D I F Y)

class Node // GIVEN AS IS DO NOT MODUFY IN ANY WAY
{
	String data;
	Node next;

	Node(String data, Node next)
	{
		this.data = data; // scenario where you MUST use this dot
		this.next = next;
	}
	public String toString()
	{
		return "" + data;
	}
} // END NODE CLASS DEFINTION