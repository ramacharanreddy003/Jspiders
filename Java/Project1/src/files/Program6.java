package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file  = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\Program2.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		String s="Hello";
		FileWriter fw = new FileWriter(file);
		fw.write(s.toCharArray());
		
		fw.flush();
		fw.close();
		
		
		//FileOutputStream fos = new FileOutputStream(file);//file output stream
//		for(char ch: s.toCharArray()) {
//			fos.write((int)ch);
//		}
		
//		fos.write(75);//to convert num into text
//		fos.write(76);
//		fos.write(67);
		
		//fos.close();
		//fos.flush();
		
//		FileReader fr = new FileReader(file);
//		FileInputStream fis = new FileInputStream(file);
//		InputStreamReader isr = new InputStreamReader(fis);
//		BufferedReader br = new BufferedReader(isr);
//		int asciiCode;
//		String text="";
//		while((asciiCode = fr.read()) != -1) {
//			text += String.valueOf((char)asciiCode);
//			System.out.println((char)asciiCode);
//		}
//		System.out.println();
//		System.out.println(text);

	}

}
