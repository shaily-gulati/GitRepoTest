package AssignmentPkg;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		int flag = 0;
		System.out.println("List of Prime between 5 to 50");
		
		for (int num = 5; num <= 50; num++)
		{
				for (int i = 2; i <= num/2; i++)
				{
					if ((num%i) == 0)
					{
						flag = 1;
						
						break;
					}
				}
				
				if (flag == 0)
				{
					System.out.println(num);
				}
				
				flag = 0;
					
		}
				
	}
}
