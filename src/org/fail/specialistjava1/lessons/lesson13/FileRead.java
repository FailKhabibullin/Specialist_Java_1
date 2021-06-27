package org.fail.specialistjava1.lessons.lesson13;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) {
		File file = new File("test1.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		file.canWrite();

		File dir = new File(".");

		File[] listDir = dir.listFiles(File::isFile);

		for (File f : listDir) {
			System.out.println(f.getName());
		}
	}
}
