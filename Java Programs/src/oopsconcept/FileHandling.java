package oopsconcept;

import java.io.*;
/* Program's aim is to create a text file and add personal details in this file. */
public class FileHandling {
	
	public static void main(String args[]) {
		File fileName = new File("myTestFile.txt");
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			fileWriter.write("Name : Darji Vandan");
			fileWriter.write(System.lineSeparator());
			fileWriter.write("Age : 23");
			fileWriter.write(System.lineSeparator());
			fileWriter.write("Location : Ahmedabad");
			fileWriter.close();
			System.out.println("Personal details added to the file");
			System.out.println("Your File Read Status = " + fileName.canRead());
			System.out.println("Your File Write Status = " + fileName.canWrite());
			System.out.println("Your File Executable Status = " + fileName.canExecute());
			System.out.println("Your File Exists Status = " + fileName.exists());
			System.out.println("Your File Name = " + fileName.getName());
			System.out.println("Your File Size in Bytes = " + fileName.length());
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}