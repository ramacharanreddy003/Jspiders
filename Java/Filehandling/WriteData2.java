package Filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData2 {

	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\ckram\\eclipse-workspace\\first\\src\\Filehandling\\datawrite.txt",true);
		BufferedWriter bf = new BufferedWriter(f);
		bf.write("ok ");
		bf.close();
	}

}
