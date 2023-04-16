package olegpoprosil.practice4_2.src.practice4_2;

import java.util.regex.*;
import java.io.*;

public class AnswerKeyProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader codedAnswers = new BufferedReader(new FileReader("D:\\PolyProjects\\3rdCourse\\Java_sem_6\\lab_9\\olegpoprosil\\practice4_2\\src\\practice4_2\\CodedAnswerKey.txt"));
        String line = codedAnswers.readLine();
        String answer = "";
        while (line != null) {
            line = codedAnswers.readLine();
            if (line != null && line.matches("[a-fA-F]")) {
                answer += line;
            }
        }
        answer = finalAnswers(answer);
        System.out.println(answer);
    }

    public static String finalAnswers(String answer) {
        answer.replaceAll("e", "b");
        answer.replaceAll("E", "A");
        answer.replaceAll("f", "c");
        answer.replaceAll("F", "D");
        answer = answer.toLowerCase();
        return answer;
    }
}
