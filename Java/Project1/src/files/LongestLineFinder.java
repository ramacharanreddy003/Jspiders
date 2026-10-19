package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
	
public class LongestLineFinder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\cr.txt");
		String longestline="";
		int maxLength=0;
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line="";
		while((line=br.readLine()) != null) {
			if(line.length()>maxLength) {
				maxLength=line.length();
				longestline=line;
				
			}
		}
		System.out.println("Longest line: "+longestline);
		System.out.println("Length: "+maxLength);
		br.close();
	}

}
