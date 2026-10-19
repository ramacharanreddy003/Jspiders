package exceptionHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\exceptionHandling\\exception.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileReader fr = new FileReader(file);
		FileInputStream fis= new FileInputStream(file);
		InputStreamReader rs = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(rs);
		
		String text = new String();
		String line = new String();
		
		while((line=br.readLine()) != null)
		{
			text +=line+"\n";
		}
		System.out.println(text);
		fr.close();
		fis.close();
		br.close();
		rs.close();
		
		
	}

}
