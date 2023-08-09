package oopsconcept;

import java.io.*;
/* Program's aim is to use of file reader for read the data from file */
public class ReadFileHandling {

	public static void main(String args[]) {
		String fileName = "myTestFile.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}