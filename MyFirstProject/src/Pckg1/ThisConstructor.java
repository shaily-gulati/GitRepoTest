package Pckg1;

public class ThisConstructor {

	ThisConstructor()
	{
		this (1,2,3);
		System.out.println("Default Constructor");
	}
	
	ThisConstructor(int a)
	{
		this(1,2);
		System.out.println("One Parameter Constructor" + a);
	}
	
	ThisConstructor(int a, int b)
	{
		this();
		System.out.println("Two Parameter Constructor" + "a:" + a + "b:" + b);
	}
	
	ThisConstructor(int a, int b, int c)
	{
		System.out.println("Three Parameter Constructor" + "a:" + a + "b:" + b + "c:" + c);
	}
	
	public static void main(String[] args) {
		ThisConstructor obj1 = new ThisConstructor(1);
	}
	
}
