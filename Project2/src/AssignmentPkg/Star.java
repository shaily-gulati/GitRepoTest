package AssignmentPkg;

public class Star {

	public static void main(String[] args) {
		int  i = 0; int j = 0;int k=1;
		for (i=1; i<=5; i++)
		{
			for (j=1; j<=i; j++)
			{
				System.out.print(k + " ");
				k++;
			}
			System.out.print("\n");
		}
	}
}
