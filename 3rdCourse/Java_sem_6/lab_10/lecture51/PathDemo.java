package lecture51;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path[] paths = new Path[5];

        paths[0] = Paths.get("D:\\PolyProjects\\3rdCourse\\Java_sem_6\\files\\employees.txt");
        paths[1] = Paths.get("D:/PolyProjects/3rdCourse/Java_sem_6/files/employees.txt");
        paths[2] = Paths.get("D:", "PolyProjects", "3rdCourse", "Java_sem_6", "files", "employees.txt");
        paths[3] = Paths.get("employees.txt");
        paths[4] = Paths.get(URI.create("file:///~/employees.txt"));

        for(int i = 0; i < paths.length; i++) {
            System.out.println("Default File Path p[" + i + "] - " + paths[i]);
        }

        System.out.println(paths[0].getFileSystem());
        System.out.println(paths[0].getParent());
        System.out.println(paths[0].getNameCount());
        System.out.println(paths[0].isAbsolute());
        System.out.println(paths[3].toAbsolutePath());
        System.out.println(paths[0].toUri());

        Path rp = Paths.get("D:/PolyProjects/3rdCourse/Java_sem_5/../Java_sem_6/files/employees.txt");
        System.out.println("rp.normalize() [" + rp.normalize() + "]");

        Path sp = Paths.get("D:/PolyProjects/3rdCourse/Java_sem_6/files/IO/..//NIO/demoFiles.txt");
        System.out.println("path.subpath() [" + sp.getNameCount() + "][" + sp.subpath(0, 5) + "]");
        System.out.println("path.subpath() [" + sp.getNameCount() + "][" + (sp.normalize()).subpath(0, 3) + "]");
        System.out.println("path.subpath() [" + sp.getNameCount() + "][" + (sp.normalize()).subpath(0, sp.normalize().getNameCount() - 1) + "]");
    }
}
