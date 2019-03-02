package AssignmentPkg;

import java.io.*;
import java.util.Scanner;

public class WriteInput {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\mohit\\Desktop\\file2.txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner s = new Scanner(System.in);	
		int i = 1;
			
		String input;
		System.out.println("How many inputs?");
		int n = s.nextInt();
		
		System.out.println("Please press enter after every line data for " + n + " lines");
		while (i<=n)
		{
			System.out.println("Enter Line " + i + " Data");
			input = s.next();
			
			bw.write(input);
			bw.newLine();
			i++;
			
		}
		
		bw.close();
		
	}

}
