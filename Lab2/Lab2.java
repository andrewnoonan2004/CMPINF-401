//converting a decimal number to java
	public String toBinary( int n);
	{
		String bitString = "";
		
		while(n>0)
		{
			if(n%2 > 0)
			{
				bitString = ("1" + bitString);
				//prepend a 0 
			}
			if(n%2 == 0)
			{
				bitString = ("0" + bitString); //prepend a 1
			}
		}
		
		
		return bitString;
	}
