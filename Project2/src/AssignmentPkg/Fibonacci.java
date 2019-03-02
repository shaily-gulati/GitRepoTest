package AssignmentPkg;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Please enter the how many numbers of fibonacci to be displayed");
		int num = s.nextInt();
		int i = 0; int j = 1; int k = 0;
		int count = 1;
		System.out.print(i + " " + j + " ");
		while (count <= num)
		{
			
			
			count++;
			k = i + j;
			i = j;
			j = k;
			System.out.print(k + " " );
			
		}
		
	}
}
