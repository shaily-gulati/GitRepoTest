package AssignmentPkg;

import java.util.Scanner;

public class Swapping {
	public void SwapNumbers(int x, int y)
	{
	x = x + y;
	y = x - y;
	x = x - y;
	System.out.println("After Swapping" + x + "," + y);
	
	}
	
	public static void main(String[] args) {
		int x;
		int y;
		Scanner s = new Scanner(System.in);
		System.out.println("Input Number 1");
		x = s.nextInt();
		System.out.println("Input Number 2");
		y = s.nextInt();
		Swapping obj = new Swapping();
		obj.SwapNumbers(x, y);

	}
	
}
