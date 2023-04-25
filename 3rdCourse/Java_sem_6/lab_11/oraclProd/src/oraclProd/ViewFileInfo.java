package oraclProd.src.oraclProd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ViewFileInfo {
	public static void main(String[] args) {
		Path p = Paths.get("C:/LineTests");
		Path p2 = Paths.get("TestResults.txt");
		Path p3 = p.resolve(p2);
		System.out.println(readFile(p3));

	}
	private static String readFile(Path p3) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(p3.toString()))){
			StringBuilder fileContents = new StringBuilder();
			String line = br.readLine();
			
			while (line != null) {

				fileContents.append(line);
				fileContents.append(System.lineSeparator());
				line = br.readLine();
			}
			return fileContents.toString();
		}
		catch (IOException e) {
			System.err.println(e);
		}
		return null;
	}
}
