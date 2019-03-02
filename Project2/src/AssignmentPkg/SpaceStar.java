package AssignmentPkg;

public class SpaceStar {
public static void main(String[] args) {
	int i;
	int j;
	int k;
	int count1 = 1;
	
	
	for (i = 5; i>=1;i-- )
	{
		for (j = 1; j <= (i-1); j++)
		{
			System.out.print(" ");
					}
		
		for (k=1; k<=count1; k++)
			{
				System.out.print("*");
				
			}
		count1 = count1 + 2;
		
		System.out.print("\n");
	}
}
}
