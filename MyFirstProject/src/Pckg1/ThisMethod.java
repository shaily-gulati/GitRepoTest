package Pckg1;

public class ThisMethod {
	
	public void method1()
	{
		System.out.println("method1");
		this.method4();
	}
	public void method2()
	{
		System.out.println("method2");
	}
	public void method3()
	{
		System.out.println("method3");
		this.method1();
	}
	public void method4()
	{
		System.out.println("method4");
		this.method2();
	}
	public static void main(String[] args) {
		
		ThisMethod obj = new ThisMethod();
	
		obj.method3();
	
		
	}

}
