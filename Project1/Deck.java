/*
	Deck class
*/

import java.util.*;
import java.io.*;

public class Deck
{
	private int[] deck;
	private final int MAX_DECK_SIZE = 20;
	public Deck( int numCards )
	{	if ( numCards%2 != 0 || numCards > MAX_DECK_SIZE ) 
		{
			System.out.format("\nINVALID DECK SIZE: (" + numCards + "). Must be an small even number <= %d\n", MAX_DECK_SIZE);
			System.exit(0);
		}
		deck = new int[ numCards ];
		for( int i=0; i<deck.length; i++ )
			deck[i] = i;
			 // YOU DO THIS => init deck to be exactly numCards long
		// YOU DO THIS => fill deck with with 0 1 2 3 ... numCards-1 in order
	}
	
	public String toString()
	{
		String deckStr = "";
		for ( int i=0 ; i < deck.length ; ++i )
			deckStr += deck[i] + " ";
		return deckStr;
	}

	// ONLY WORKS ON DECK WITH EVEN NUMBER OF CARDS
	// MODIFIES THE MEMBER ARRAY DECK
	public void inShuffle()
	{
		// 1. (tried to shuffle the deck in place)
		//	very difficult, don't do.
		// 2. make a second array, copy the values into it.
		// copy that reordered sequence back into the original array
		// 3. Make a second array, copy the values into the second array,
		// copy the ref/addr from the second array into the original ref var
		// Example:
		int newDeck[] = new int[deck.length]; // making a second array
		int t=0, m=newDeck.length/2, c=0; // defining variables to help us shuffle
		while (c<newDeck.length)// while loop to copy contents
		{
			newDeck[c++] = deck[m++]; // append deck[m] onto the newDeck[c++]
			newDeck[c++] = deck[t++]; // append deck[t] onto newDeck[c++]
		}
		deck = newDeck;//copy the reference variable to newDeck
	}
	// ONLY WORKS ON DECK WITH EVEN NUMBER OF CARDS
	// MODIFIES THE MEMBER ARRAY DECK
	public void outShuffle()
	{
		int newDeck[] = new int[deck.length]; // making a second array
		int t=0, m=newDeck.length/2, c=0; // defining variables to help us shuffle
		while (c<newDeck.length)// while loop to copy contents
		{
			newDeck[c++] = deck[t++]; // append deck[m] onto the newDeck[c++]
			newDeck[c++] = deck[m++]; // append deck[t] onto newDeck[c++]
		}
	deck = newDeck;
	}
	// RETURNS TRUE IF DECK IN ORIGINAL SORTED:  0 1 2 3 ...
	public boolean inSortedOrder()
	{
		for(int i=0; i<deck.length;i++)
		{
			if(deck[i] == i)
			i++;
			if(deck[i] != i)
			return false;
		}
	return true;
	}
}	// END DECK CLASS
