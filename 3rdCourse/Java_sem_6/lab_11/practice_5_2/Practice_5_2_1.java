package practice_5_2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Practice_5_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("D:/Prog_java_projects/Java_DB_labs/3rdCourse/Java_sem_6");
		Path p1 = Paths.get("files");
		Path p2 = Paths.get("Highscores.txt");
		Path path2 = p.resolve(p1.resolve(p2)); 
		System.out.println(path2); 
	}
	
}
