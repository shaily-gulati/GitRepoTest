package Pckg1;

public class InheritanceChild extends InheritanceExample{
	
	public InheritanceChild()
	{
		super(1,2);
		System.out.println("Child Default");	
	}
	public InheritanceChild(int a)
	{
		this (1,2);
		System.out.println("Child 1 parameter");	
	}
	public InheritanceChild(int a, int b)
	{
		this();
		System.out.println("Child 2 parameter");	
	}
	public InheritanceChild(int a, int b, int c)
	{
		this(1);
		System.out.println("Child 3 parameter");	
	}
public static void main(String[] args) {
	InheritanceChild obj = new InheritanceChild(3, 2, 1);
}
}
