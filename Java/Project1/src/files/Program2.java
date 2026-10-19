package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\src\\files\\Program2.txt");
		
		Scanner scanner = new Scanner(file);
		String text = new String();
		while(scanner.hasNextLine()) {
			text += scanner.nextLine() + "\n";
			//System.out.println(scanner.next());
			//System.out.println(scanner.nextLine());
			
		}
		System.out.println(text);
		scanner.close();
		
		
	}

}
