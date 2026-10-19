package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\datawrite.txt");
		FileInputStream f = new FileInputStream(file);
		if(file.canRead()) {
			int n=f.read();
			while(n!=-1) {
				System.out.print((char)n);
				n=f.read();
			}
		}else {
			System.out.println("can't read");
		}
		f.close();	
	}

}
