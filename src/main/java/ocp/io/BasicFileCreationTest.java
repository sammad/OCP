package ocp.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicFileCreationTest {

	public static void main(String[] args) {
		createNewFileInCurrentDirectory();
		createNewFileInCurrentDirectory2();
		createDirectory();
		createDirectoryHierarchy();

	}

	private static void createDirectoryHierarchy() {
		File file = new File("parent\\child\\testdir");
		if(!file.exists()){
			file.mkdirs();
			if(file.exists()){
				System.out.println("Directory Structure Created !!!");
			}
		}else{
			System.out.println("Directory Structure already present !!!");
		}
		
	}

	private static void createDirectory() {
		File file = new File("testdir");
		if(!file.exists()){
			file.mkdir();
			if(file.exists()){
				System.out.println("Directory Created !!!");
			}
		}else{
			System.out.println("Directory already present !!!");
		}
	}

	private static void createNewFileInCurrentDirectory2() {
		File file = new File("testfile1.txt");
		if(!file.exists()){
			try(PrintWriter pw = new PrintWriter(file)) {
				pw.println("Howdy");
				if(file.exists()){
					System.out.println("PW creates the file!!!");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("PW file already present !!!");
		}
	}

	private static void createNewFileInCurrentDirectory() {
		File file = new File("testfile.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
				if(file.exists()){
					System.out.println("Simple File created !!!");
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println("Simple File already present !!!");
		}
	}

}
