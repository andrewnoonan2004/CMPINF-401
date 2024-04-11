import java.io.*;
import java.util.*;

public class Graph 
{
    private final int NO_EDGE = -1; // all real edges are positive
    private int G[][];              // will point to a 2D array to hold our graph data

    private int numEdges;
    public Graph( String graphFileName ) throws Exception  // since readFild doesn't handle them either
    {
        loadGraphFile( graphFileName );
    }

    private void loadGraphFile( String graphFileName ) throws Exception
    {
        Scanner graphFile = new Scanner( new File( graphFileName ) );

        int dimension = graphFile.nextInt();   	// THE OF OUR N x N GRAPH
        G = new int[dimension][dimension]; 		// N x N ARRAY OF ZEROS
        numEdges=0;

        for (int r=0 ; r < G.length ; ++r )
            for (int c=0 ; c < G[r].length ; ++c )
                if( r != c )
                    G[r][c] = NO_EDGE;
                else
                    G[r][c] = 0;

        while ( graphFile.hasNextInt() )
        {
            int row = graphFile.nextInt();
            int col = graphFile.nextInt();
            int weight = graphFile.nextInt();
            addEdge( row, col, weight );
        }

    } // END readGraphFile

    private void addEdge( int r, int c, int w )
    {
        G[r][c] = w;
        ++numEdges; // only this method adds edges so we do increment counter here only
    }
    
    private boolean hasEdge(int fromNode, int toNode)
    {
        return G[fromNode][toNode] != NO_EDGE; 
    }

    private int inDegree(int node)
    {
        int inDegree = 0;
        for (int r=0 ; r < G.length ; ++r )
            if ( G[r][node] > 0 )
                ++inDegree;
                return inDegree;
    }

    private int outDegree(int node)
    {
        int outDegree = 0;
        for (int c=0 ; c < G[node].length ; ++c )
            if ( G[node][c] > 0 )
                ++outDegree;
                return outDegree;	
    }

    private int degree(int node)
    {
        return inDegree(node) + outDegree(node);
    }

    public int maxOutDegree()
    {
        int maxOutDegree = 0;
        for(int r=0; r< G.length; r++)
        {
            int outDegree = outDegree(r);
            if(outDegree > maxOutDegree)
            {
                maxOutDegree = outDegree;
            }
        }
        return maxOutDegree;
    }

    public int maxInDegree()
    {
        int maxInDegree = 0;
        for(int c=0; c< G.length; c++)
        {
            int inDegree = inDegree(c);
            if(inDegree > maxInDegree)
            {
                maxInDegree = inDegree;
            }
        }
        return maxInDegree;
    }

    public int minOutDegree()
    {
        int minOutDegree = Integer.MAX_VALUE;
        for(int r=0; r< G.length; r++)
        {
            int outDegree = outDegree(r);
            if(outDegree < minOutDegree && outDegree != 0)
            {
                minOutDegree = outDegree;
            }
        }
        return minOutDegree;
    }

    public int minInDegree()
    {
        int minInDegree = Integer.MAX_VALUE;
        for(int c=0; c< G.length; c++)
        {
            int inDegree = inDegree(c);
            if(inDegree < minInDegree)
            {
                minInDegree = inDegree;
            }
        }
        return minInDegree;
    }	
    
    public int maxDegree()
    {
        int maxDegree = 0;
        for(int node = 0; node < G.length; node++)
        {
            int degree = degree(node);
            if(degree > maxDegree)
            {
                maxDegree = degree;
            }
        }
        return maxDegree;
    }

    public int minDegree()
    {
        int minDegree = Integer.MAX_VALUE;
        for(int node = 0; node < G.length; node++)
        {
            int degree = degree(node);
            if(degree < minDegree)
            {
                minDegree = degree;
            }
        }
        return minDegree;
    }
    
    public void removeEdge(int fromNode, int toNode)
    {
        try
		{
			if(hasEdge(fromNode, toNode))
            {
                G[fromNode][toNode] = NO_EDGE;
                numEdges--;
            
			}
    	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			String msg = "" + e;
			msg = msg.replaceFirst("java.lang.ArrayIndexOutOfBoundsException: ", "");
			System.out.println("java.lang.Exception: Non Existent Edge Exception: " + "removeEdge(" + fromNode + "," + toNode + ")" );
		}
	}
    
    public String toString()
    {	
        String the2String = "";
        for (int r=0 ; r < G.length ;++r )
        {
            for ( int c=0 ; c < G[r].length ; ++c )
                the2String += String.format("%3s",G[r][c] + " ");
            the2String += "\n";
        }
        return the2String;
    } // END TOSTRING

} //EOF