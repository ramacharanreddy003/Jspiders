package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataRead {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\WriteData.java");
		BufferedReader bf = new BufferedReader(f);
		String s=bf.readLine();
		while(s!=null) {
			System.out.println(s);
			s=bf.readLine();
		}
		bf.close();
	} 
}
