# Introduction to Object Oriented Programming
Object-Oriented Programming (OOP) is the use of objects to combine variables and methods in a single unit of abstraction. More concretely, OOP is the writing and use of classes. A class in Java is simply a definition of a data type where that description weds variables and methods which in turn manipulate those variables. We begin with a simple example. 
## How do we represent a Fraction in our program?
1. We want to store a numerator and denominator for our fraction and perform operations such as addition, subtraction, multiplication etcetera on different variables of our Fraction data type.
## Two possibilities:
1. declare 2 ints named numer and denom, then pass them around to various methods from main
2. declare an array of 2 ints and just remember that arr[0] is numerator and arr[1] is denominator
The second is actually a little better than the first. At least it achieves bundling together the numerator and the denominator into a single object. It is still very poor however.
## A better solution:
```java
/* Fraction.java A class(data type) definition file
This file just defines what a Fraction is
This file is NOT a program
*/
public class Fraction
{

    public int numer;
    public int denom;
}
```
Now that we have that fraction class definition file, we can then do the following:
```java
public class FractionTester
{
	public static void main( String args[] )
	{
		// use the word Fraction as if were a Java data type
		Fraction f1 = new Fraction();  // create an object of the fraction type

		f1.numer = 22; // use dot operator to access numer or denom
		f1.denom=7;
		System.out.println("f1=" + f1.numer + "/" + f1.denom); // outputs: "f1=22/7"
	} // END main
} // EOF
```
## Object oriented programming terms

### class
1. a.k.a data type, our new class is named the Fraction class
2. class definition file - the source code file named "Fraction.java" contains the definition of what a Fraction is

### Object
1. the chunk of memory allocated by a statement like: Fraction f1=new Fraction();
2. The object is where the actual data is stored in memory
### reference variable
1. in our case, f1 is the reference by which we access the object
### Members
1. our Fraction class has two members; numer and denom.
## Classes can have methods
1. It is often useful to initialize an object at the time of its creation, In the case of our FractionTester program we would like to be able to do the following:
```java
/*
	FractionTester.java  A program that declares Fraction variables
*/
public class FractionTester
{
	public static void main( String args[] )
	{
		Fraction f1 = new Fraction( 22, 7 );  // 22/7 gets stored in the object
		System.out.println("f1=" + f1.numer + "/" + f1.denom); // outputs: "f1=22/7"
	} // END main
} // EOF


```
2. To do this, we need to make a method called a *constructor*
3. A constructor is responsible for recieving initial values for the object from the declaration statement and copy those values into their respective member variables
## Our Fraction class definition file after adding the consructor method:
```java
/* Fraction.java class (data type) definition file
   This file just defines what a Fraction is
   This file is NOT a program
*/
public class Fraction
{
	public int numer;
	public int denom;

	// CONSTRUCTOR method - initializes object
	// via values passed in from the object's declaration
	public Fraction( int n, int d )
	{
		numer = n;
		denom = d;
	}
}// EOF

```
Notice this method is peculiar in 2 ways. First it does not have a return type. It is not void, it simply has no return type at all. Secondly, it is named after the class. The class is named Fraction and the constructor method is named Fraction. **Constructors  can be overloaded**. In other words *you can have multiple constructor methods** - all named Fraction in your Fraction class. They must however differ in their parameter list. Either they must take a different number of args or take different data type args.
### How to overload our object
```java
/* Fraction.java class (data type) definition file
   This file just defines what a Fraction is
   This file is NOT a program
*/
public class Fraction
{
	public int numer;
	public int denom;

	// DEFAULT CONSTRUCTOR - no args passed in
	public Fraction(  )
	{
		numer = 0;
		denom = 1; // don't put a ZERO here
	}

	// 1 arg CONSTRUCTOR - 1 arg passed in
	// assume user wants whole number
	public Fraction( int n )
	{
		numer = n;
		denom = 1; // don't put a ZERO here
	}

	// FULL CONSTRUCTOR - an arg for each class data member
	public Fraction( int n, int d )
	{
		numer = n;
		denom = d;
	}
}// EOF
```
### Encapsulation and Data Hiding
1. Our above Fraction class achieves one of the important advantages of using classes known as encapsulation.
2. Encapsulation means the bundling together of data(variables) and methods. However, our Fraction class falls short of achieving the second important advantage called *data hiding*
### What is Data Hiding?
1. Data hiding means that we should not allow the users of our class(such as the code in main) to directly access the members of the class(numer and denom)
2. Reason why we should not have our data members declared public
```java
/*
	FractionTester.java  A program that declares Fraction variables
*/
public class FractionTester
{
	public static void main( String args[] )
	{
		// use the word Fraction as if were a Java data type
		Fraction f1 = new Fraction();  // create an object of the fraction type

		f1.numer = 22; // use dot operator to access numer or denom

		f1.denom=0; // BAD! But possible because denom is public !!

		System.out.println("f1=" + f1.numer + "/" + f1.denom); // outputs: "f1=22/7"
	} // END main
} // EOF
```
### Data Hiding is achieved by declaring class data members private instead of public
