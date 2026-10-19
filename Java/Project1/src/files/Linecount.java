package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Linecount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\cr.txt");
		int lineCount=0;
	
		BufferedReader br = new BufferedReader(new FileReader(file));
		while(br.readLine() != null) {
			lineCount++;
		}
		System.out.println("No of lines "+lineCount);
	
		
		
		br.close();
		
	}

}
