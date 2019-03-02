package AssignmentPkg;

import java.util.Scanner;

public class Swapping1 {
	
	public void SwapNumber(int a, int b)
	{
		int c;
		c = a;
		a = b;
		b= c;
		System.out.println("After Swap" + a + "," + b);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = s.nextInt();
		
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		
		Swapping1 obj =  new Swapping1 ();
		obj.SwapNumber(a, b);
		
		
		
	}

}
