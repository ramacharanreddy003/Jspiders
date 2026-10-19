package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file  = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\Program7.txt");
//		if(file.exists())
//			file.delete();
//		file.createNewFile();
		String line ="";
		String existingText = new String();
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((line = br.readLine()) != null)
			existingText += line +"\n";
		String s="How are you boy?";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(existingText+s);
		bw.flush();
		bw.close();
		br.close();
	}

}
