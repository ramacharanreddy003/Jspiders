package files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\Program2.txt");
		if(!file.exists())
			file.createNewFile();
		FileReader fr = new FileReader(file);
		
		int asciiCode;
		String text="";
		while((asciiCode = fr.read()) != -1) {
			text += String.valueOf((char)asciiCode);
//			System.out.println((char)asciiCode);
		}
		System.out.println();
		System.out.println(text);
		
		fr.close();
		
	}

}
