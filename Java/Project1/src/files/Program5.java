package files;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file  = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\Program2.txt");
		if(file.exists())
			file.delete();
		file.createNewFile();
		String s="Hello";
		FileOutputStream fos = new FileOutputStream(file);//file output stream
		for(char ch: s.toCharArray()) {
			fos.write((int)ch);
		}
		
//		fos.write(75);//to convert num into text
//		fos.write(76);
//		fos.write(67);
		
		fos.close();
		fos.flush();
		
		FileReader fr = new FileReader(file);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
//		int asciiCode;
//		String text="";
//		while((asciiCode = fr.read()) != -1) {
//			text += String.valueOf((char)asciiCode);
//			System.out.println((char)asciiCode);
//		}
//		System.out.println();
//		System.out.println(text);
//		
		String line = new String();
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		fr.close();
		br.close();
		isr.close();
		fis.close();
	}

}
