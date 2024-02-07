/*
	Coin.java THIS IS THE ONLY FILE YOU HAND IN
	THERE IS NO MAIN METHOD IN THIS CLASS!
*/
import java.util.Random;
public class Coin
{
    private Random r;
    private int numHeads,numTails;
    private final int HEADS = 1;
    private final int TAILS = 0;
    public Coin(long seed)
    {
            r = new Random(seed);
            reset();
    }
    public String flip()
    {
            int side = r.nextInt(2);
            if (side == HEADS)
                {
                    setNumHeads(getNumHeads() + 1);
                    return "H";
                }
            else
                {
                    setNumTails(getNumTails() +1);
                    return "T";
                }
    }
    private void setNumHeads(int h)
        {
            numHeads = h;

        }
    private void setNumTails(int t)
        {
           numTails = t;
        }
    public int getNumHeads()
        {
            return numHeads;
        }
    public int getNumTails()
        {
            return numTails;
        }
    public void reset()
        {
            numHeads=0;
            numTails=0;
        }
} // END COIN CLASS
