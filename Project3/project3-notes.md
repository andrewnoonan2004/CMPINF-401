## Notes for Project three
## Binary Search Algorithm
```java
    0 1 2 3  4  5  6  7  8  9
arr 2 5 7 11 23 45 47 58 69 88          Target = 11 count = 10

int Low=0, High=count -1
LOOP
while (low <=high)
{
    int MID = index of the middle element; i.e 4
    make our guess to be MID.
    our guess is 4.
    if(arr[MID] == target) BINGO
    we feed it the array, we feed it the count of the array
    the job of the function is to return the index of the array where the target is located
    if(our guess was too low)
    {
        adjust your low marker
        adjust it to midpoint + 1
    }
    else // don't even need to test for it
    {
        adjust your high marker
        adjust it to midpoint -1
    }
}
what value do return back to the caller if the value is not here?:
-(index of where it belongs)
problem: what if the index was supposed to be zero?
```
return -(lo+1);
-------------------------------------------------
back in insert in order
caller gets back a -1.
if(returnVal < 0)
returnVal = -returnVal +1;


one of our variables, low mid or high will always be sitting on the index where it belongs.
It is always Low!!!

