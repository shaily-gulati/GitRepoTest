package AssignmentPkg;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	System.out.println("Enter Numer for Factorial");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int Fact = 1;
	
	for (int i = 1; i <= n; i++)
	{
		Fact = Fact*i;
	}
	
	System.out.println("Factorial is: " + Fact);
}
}
