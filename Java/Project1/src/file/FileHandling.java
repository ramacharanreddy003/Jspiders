package file;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		//File f = new File("./Testfiles.txt");//file creation
		//File f = new File("./Resources/Test/");
		//System.out.println(f.mkdir());
		//System.out.println(f.mkdirs());
		
		//System.out.println(f.createNewFile());
		//f.delete();
		//System.out.println(f.delete());
		//System.out.println(f.exists());
//		if(f.exists())
//			f.delete();
//		System.out.println(f.exists());
//		System.out.println(f.createNewFile());
//		//System.out.println(f.isHidden());
//		System.out.println(f.canWrite());
//		f.setWritable(true);
//		System.out.println(f.canWrite());
		File f = new File("C:\\Users\\ckram\\eclipse-workspace\\Project1\\Textfiles.txt");
//		for(String fleName:f.list());
//		{
//		}
		//System.out.println(Arrays.toString(f.list()));
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		File f2 = new File(f.getParent()+"/resume2.docx");//docx file create
		f2.createNewFile();
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
	}

}
