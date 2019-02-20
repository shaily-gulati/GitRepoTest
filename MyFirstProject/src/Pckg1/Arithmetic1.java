package Pckg1;

public class Arithmetic1 {
int a;
int b;
int c;

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
	Arithmetic1 A1 = new Arithmetic1();
	int R1 = A1.sum(10,2);
	int R2 = A1.sub(R1,2);
	int R3 = A1.sum(R2, 2);
	int R4 = A1.mul(R3,2);
	int R5 = A1.div(R4,2);
	
	System.out.println("Result of ((((a+b)-b) + b)*b)/b) = "+ R5);
	
}
}
