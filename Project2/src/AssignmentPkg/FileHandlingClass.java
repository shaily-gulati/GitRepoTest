package AssignmentPkg;

import java.io.*;

public class FileHandlingClass {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\mohit\\Desktop\\file1.txt");
		File f2 = new File("C:\\Users\\mohit\\Desktop\\file2.txt");
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2, true);
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s != null)
		{
			System.out.println(s);
			bw.write(s);
			bw.newLine();
			s = br.readLine();
		}
		
		bw.close();
	}
}
