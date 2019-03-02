package AssignmentPkg;

public class String3 {
public static void main(String[] args) {
	
	String s = "My name is Deepak";
	char c;
	int l;
	int count = 0;
	l = s.length();
	for (int i = 0; i < l; i ++)
	{
		
		c = s.charAt(i);
		if (c == 'e')
		{
			count ++;
		}
	}
	System.out.println("Letter e found " + count + " times" );
	
}
}
