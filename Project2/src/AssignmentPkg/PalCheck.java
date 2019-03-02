package AssignmentPkg;

import java.util.Scanner;

public class PalCheck {
	public void	getreverse(int num) {
		
		int original = num;
		int rev = 0;
		int rem = 0;
		while (num > 0)
		{
		rem = num%10;
		rev = rev * 10 + rem;
		num = num /10;
		}
		
		
		if (rev == original)
		{
			System.out.println("Reverse is same");
			System.out.println("this is a Palindrome");
		}
		else 
		{
			System.out.println("Reverse is:" + rev);
			System.out.println("this is not Palindrome");
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Please Enter a number");
	int num = s.nextInt();
	PalCheck p = new PalCheck();
	p.getreverse(num);
}
	
}
