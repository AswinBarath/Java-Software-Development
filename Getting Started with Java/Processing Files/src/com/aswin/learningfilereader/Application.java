package com.aswin.learningfilereader;

import java.io.*;
//import java.io.File;
//import java.io.FileReader;

public class Application {

	public static void main(String[] args) {
		
		File file = new File("myfile.txt");

		try( FileReader fileReader = new FileReader(file);
			 BufferedReader bufferedReader = new BufferedReader(fileReader); ) {
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("Problem reading the file " + file.getName());
		}
		
		/* Finally block is not required, when we use the "try()" syntax
		finally {
			try {
				if(bufferedReader != null) {
					bufferedReader.close();
				}
				if(fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.out.println("Unable to close file " + file.getName() + e);
			}
			// Bad Practice to use NullPointerException 	
			// catch (NullPointerException ex) {
			// System.out.println(" file was  probably never opened " + ex);
			// }
		}
		*/
	}
}
