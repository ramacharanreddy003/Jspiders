package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\a.txt");
		FileWriter f  = new FileWriter(file);
		if(file.canWrite()) {
			f.write("Hello\n");
			f.write("Hi\n");
			f.write("How are you\n");
			
		}else {
			System.out.println("can't write");
		}
		f.close();
	}
}
