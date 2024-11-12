package com.flm.programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			File file = new File("output.txt");
			FileWriter writer = new FileWriter(file);
			writer.write("Hello, World!");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
