package practice_5_1;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employees = new ArrayList<>();
		String line = "";
		Path path = Paths.get(".\\files\\employees.txt");
		try {
			BufferedReader fileInput = Files.newBufferedReader(path,
					Charset.forName("ISO-8859-1"));
			line = fileInput.readLine();
			while (line != null) {
				employees.add(line);
				line = fileInput.readLine();
			}
			fileInput.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}//end catch
		catch(EOFException eofe) {
			System.out.println("No more lines to read.");
		}//end catch
		catch(IOException ioe) {
			System.out.println("Error reading file.");
		}//end catch
		for(String employee: employees)
			System.out.println(employee);
		}// end method main
}


