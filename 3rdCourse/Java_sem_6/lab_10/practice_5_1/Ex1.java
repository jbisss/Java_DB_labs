package practice_5_1;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Ex1 {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Path path = fs.getPath(".\\files\\NIO2\\demoFile.txt"); //задаём путь
		System.out.println(path); //выводим путь
	}

}
