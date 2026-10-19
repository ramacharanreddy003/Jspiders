package Filehandling;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\A.txt");
		System.out.println(f.mkdir());
		System.out.println(f.createNewFile());
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		
		File f1 = new File("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\c.txt");
		f.renameTo(f1);
		f1.delete();
		
		
	}
}
