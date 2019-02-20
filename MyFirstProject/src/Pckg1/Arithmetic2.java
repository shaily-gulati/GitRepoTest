package Pckg1;

public class Arithmetic2 {

	int a;
	int b;

	public int sum(int a, int b)
	{
		int c = a + b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c = a - b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c = a * b;
		return c;
	}
	public int div(int a, int b)
	{
		int c = a / b;
		return c;
	}
	public static void main(String[] args) {
		Arithmetic2 A2 = new Arithmetic2();
		int R1 = A2.sum(10,2);
		R1 = A2.sum(R1,2);
		R1 = A2.sub(R1,2);
		R1 = A2.mul(R1, 2);
		R1 = A2.div(R1,2);
		
		
		System.out.println("Result of (((((a+b)+b)-b)*b)/b) = "+ R1);
		
	}
	
}
