package Filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class DataWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\datawrite.txt");
		//f.write("A");
		String s="Programming language\n";
		byte[] b = s.getBytes();
		f.write(b);
		f.write(65); 
		f.write(68);
		f.write(69);
		f.close();
		
	}
}
