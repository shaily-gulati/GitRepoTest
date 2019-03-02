package AssignmentPkg;

public class StringHandling {
	public static void main(String[] args) {
		String s = "My name is Deepak";
		String[] s1 = s.split(" ");
		int l = s1.length;
		for (int i = l-1; i >= 0; i --)
		{
		System.out.print(s1[i] + " ");
		}
		
	}

}
