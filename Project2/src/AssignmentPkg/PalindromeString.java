package AssignmentPkg;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String input;
		int j = 0;
		String rev = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter string");
		input = s.next();
		int l = input.length();
		
		for (int i =l-1; i>=0; i--)
		{
			
			rev = rev + input.charAt(i);
						
		}
		
		System.out.println(rev);
		if (rev.equals(input))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
	}
}
