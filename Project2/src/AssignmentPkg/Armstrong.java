package AssignmentPkg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter 3 digit number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		int original = num;
		
		do 
		{
			int rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
			 
		} while (num!=0);
		
		if (original == sum) {
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
		
		
		
		
		
	}
	
}
