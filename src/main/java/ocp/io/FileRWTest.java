package ocp.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRWTest {

	public static void main(String[] args){
		File file = new File("ocp_tips.txt");
		char[] charArr = new char[200];
		writeToFileUsingFileWriter(file);
		readFileUsingFileReader(file, charArr);
	}

	private static void readFileUsingFileReader(File file, char[] charArr) {
		try(FileReader fileReader = new FileReader(file);) {
			fileReader.read(charArr);
			for(char ch:charArr){
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private static void writeToFileUsingFileWriter(File file) {
		try(FileWriter fwriter=new FileWriter(file);) {
			fwriter.write("This is OCP Tips\n Lets start with basics");
			fwriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
