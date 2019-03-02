package AssignmentPkg;

import java.util.Scanner;

public class PrimeChecker {
	
	public void primecheckerfunc(int a)
	{
		if (a % 2 == 0)
		{
			
			System.out.println("number is not Prime ");
		}
		else 
		{
			System.out.println("Number is prime");
		}
	}

	public static void main(String[] args) {
		PrimeChecker obj = new PrimeChecker();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to check Prime");
		int a =  s.nextInt();
		obj.primecheckerfunc(a);
	}
	
}
