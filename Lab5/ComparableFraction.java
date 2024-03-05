public class ComparableFraction implements Comparable<ComparableFraction>
{
    private int numer;
    private int denom;
 
    // ACCESSORS (SETTERS)
    public int getNumer()
    {   return numer;
    }
    public int getDenom()
    {   return denom;
    }
    // MUTATORS (GETTERS)
    public void setNumer( int n )
    {   numer = n;
    }
    public void setDenom( int d )
    {
        if (d==0) { System.out.println("Can't have 0 in denom"); System.exit(0); }
        denom=d;
    }
 
    // COPIED IN YOUR subtract METHOD FROM PROJECT 6 AND CHANGE Fraction to ComparableFraction IN ALL PARTS OF THE FUNCTION
    // COPY IT IN RIGTH HERE
    public ComparableFraction subtract( ComparableFraction other)
    {
        return new ComparableFraction((this.numer * other.denom) - (other.numer * this.denom), (this.denom * other.denom));
 
    }
    // FULL CONSTRUCTOR - an arg for each class data member
    public ComparableFraction( int n, int d )
    {   int gcd = gcd( n, d );
        setNumer(n/gcd);
        setDenom(d/gcd);
    }
    private int gcd( int n, int d ) // NOT AS EFFICIENT AS EUCLID BUT SIMPLE JUST USE THIS ONE FO RTHIS LAB!
    {   int gcd = n<d ? n : d; // same as::  if (n<d) gcd=n; else gcd=d;
        while( gcd > 0 ) if (n%gcd==0 && d%gcd==0) return gcd; else --gcd;
        return 1; // they were co-prime no GCD except 1 :(
    }
    // COPY CONSTRUCTOR - takes ref to some already initialized Comparable<Fraction> object
    public ComparableFraction( ComparableFraction other )
    {
        this( other.getNumer(), other.getDenom() ); // call my full C'Tor with other Fraction's data
    }
    // REQUIRED BY THE COMPARABLE INTERFACE
    // if this == other return 0; if this>other return 1; else return -1
    public int compareTo( ComparableFraction other )
    {
        ComparableFraction diff = this.subtract( other ); // <-- DO THIS!!!
    // is the subtract function above, compare the numerator and denominator
        // DONT LOOK AT THIS OR OTHER FRACTION ANY MORE
        // JUST EMAININE DIFF's numer & denom
        if(diff.getNumer() <0 && diff.getDenom() <0 )
        return 1;
        if(diff.getNumer() <0 && diff.getDenom()>0)
        return -1;
        if(diff.getNumer() >0 && diff.getDenom()<0)
        return -1;
        // NOW carefully examine the numer and denom of the diff and
        // determine if the value of the diff is 0 positive or negative
 
        // return 0 if the diff is 0
        // return -1 if diff is negative value
        // return 1 if diff is a posistive value
        if(diff.getNumer() >0 && diff.getDenom()>0)
          return 1;
      else return 0;
    }
    public String toString()
    {
        return getNumer() +  "/" + getDenom() + "\t=" +  + ((double)getNumer()/(double)getDenom());
    }
}// EOF
 
 
/* 
OUT IN MAIN
 
    ComparableFraction f1 = new ComparableFraction(22,7);
    ComparableFraction f2 = new ComparableFraction(11,4);
 
    this        other
    f1.compareTo(f2) ==>  f1 - f2 BUT you cant reallyu use the - operator
 
    if f1-f2 is 0 then they are identical in value         RETURN 0
    if f1-f2 is POSITIVE then f1 is GREATER than f2        RETURN 1
    if f1-f2 is NEAGATIVE then f1 is LESS THAN than f2     RETURN -1
 
 
    if ( f1.compareTo( f2 ) == 0 )
        print( they are equal in valu
 
 */







