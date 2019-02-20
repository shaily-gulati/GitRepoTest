package Pckg1;

public class InheritanceExample {

	public InheritanceExample()
	{
		this(1,2,3);
		System.out.println("Parent Default");
	}
	
	public InheritanceExample(int a)
	{
		this();
		System.out.println("Parent 1 Parameter");
	}
	
	public InheritanceExample(int a, int b)
	{
		this(1);
		System.out.println("Parent 2 Parameter");
	}
	public InheritanceExample(int a, int b, int c)
	{
		System.out.println("Parent 3 Parameter");
	}
}

