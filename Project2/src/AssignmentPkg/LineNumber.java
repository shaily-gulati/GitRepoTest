package AssignmentPkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineNumber {

	
	public void Method(int n) throws IOException
	{
		File f1 = new File("C:\\Users\\mohit\\Desktop\\file1.txt");
		
		FileReader fr = new FileReader(f1);
				
		BufferedReader br = new BufferedReader(fr);
		int LineCounter = 1;
		String Line = null;
	
		while (LineCounter < n && ((Line = br.readLine())!= null))
		{
								
			LineCounter++;						
			
		}
		
		if (Line!=null)
		{
		System.out.println(br.readLine());
		}
		else 
		{
			System.out.println("EOF");
		}
	
	}
		

	public static void main(String[] args) throws IOException {
		
		LineNumber object = new LineNumber();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the line number u want to read");
		int n = s.nextInt();
		object.Method(n);
		
		
		System.out.println("Do you want to continue Y/N");
		String input = s.next();
		
		if (input.equals("Y")) {
			System.out.println("Enter the line number u want to read");
			n = s.nextInt();
			object.Method(n);
		}
		else
		{
			System.out.println("Bye Bye");
		}
		
	}
	
	
	
	}
