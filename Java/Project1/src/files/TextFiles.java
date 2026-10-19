package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFiles {

	public static void main(String[] args) throws IOException{
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\fileHandling\\ram.txt");
		
		FileInputStream fis = new FileInputStream(file);
		int asciiCode;
		String text="";
		while((asciiCode = fis.read()) != -1) {
			text += String.valueOf((char)asciiCode);
			//System.out.println((char)asciiCode);
		}
		System.out.println();
		System.out.println(text);
		fis.close();
		
		

	}

}
