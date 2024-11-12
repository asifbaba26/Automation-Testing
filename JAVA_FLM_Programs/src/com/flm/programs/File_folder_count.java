package com.flm.programs;

import java.io.File;

public class File_folder_count {

	public static void main(String[] args) {
		String pathName = "C:\\Users\\HP\\OneDrive\\Documents";
		int countofFiles = 0;
		int countofFolders = 0;
		File file = new File(pathName);
		File[] files = file.listFiles();
		for (File fileName : files) {
			if (fileName.isFile()) {
				countofFiles++;
			} else if (fileName.isDirectory()) {
				countofFolders++;
				System.out.println(fileName);
			}

		}
		System.out.println("Files = "+countofFiles);
		System.out.println("Folders = "+countofFolders);

	}

}
