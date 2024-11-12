package com.flm.programs;

import java.io.*;

public class FileBufferedReaderTest {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\HP\\OneDrive\\Documents\\Hello.txt");
		try(Reader reader = new FileReader(file);
				BufferedReader breader = new BufferedReader(reader);) {
			String line = null;
			while((line = breader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
