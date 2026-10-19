package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./File.txt");
		if(!file.exists())
			file.createNewFile();

		
		
		FileInputStream fis = new FileInputStream(file);
		int asciiCode;
		while((asciiCode = fis.read()) != -1) {
			System.out.print((char)asciiCode);

		}
		fis.close();
		
	}

}
