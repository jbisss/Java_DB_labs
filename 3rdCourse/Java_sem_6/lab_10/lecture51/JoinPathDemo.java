package lecture51;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JoinPathDemo {
    public static void main(String[] args) {
        Path basicPath = Paths.get("D:/Prog_java_projects/Java_DB_labs");
        Path newPath = Paths.get("3rdCourse/Java_sem_6/files/employees.txt");

        System.out.println(basicPath);
        System.out.println(newPath);

        Path basicPath2 = basicPath.resolve(newPath);
        Path newPath2 = newPath.resolve(basicPath);

        System.out.println(basicPath2);
        System.out.println(newPath2);

        Path p1 = Paths.get("D:/Prog_java_projects/Java_DB_labs/3rdCourse/Java_sem_6/files/IO/Logs/errorLogs.txt");
        Path p2 = Paths.get("D:/Prog_java_projects/Java_DB_labs/3rdCourse/Java_sem_6/files/IO");
        Path p3 = p2.relativize(p1);
        System.out.println(p3);
    }
}
