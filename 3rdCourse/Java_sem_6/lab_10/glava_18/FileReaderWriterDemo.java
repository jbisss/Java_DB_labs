package glava_18;

//������ �������:

import java.io.*;

//������� �����:
class FileReaderWriterDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����");
        // ���� � ����������:
        String path = ".\\files\\";
        // ���������� ��� ������ ����� ����������� ��������:
        int sm;
        // �������������� ���:
        try {
            String line = "";
            BufferedReader fileInput = null;
            // ������ ��������� ������ �����:
            FileReader input = new FileReader(path + "employees.txt");
            // ������ ��������� ������ ������:
            FileWriter output = new FileWriter(path + "userNames.txt");
            // ���������� ���� ������� �� �����:
            sm = input.read();
            // ���������� �������� �� ������ �����
            // � ������ � ������ ����:
            while (sm != -1) { // ���� �� ��������� ����� �����
                // ������ ������� � ����:
                output.write(Character.toUpperCase((char) sm));
                // ���������� ���� ������� �� �����:
                sm = input.read();
            }
            // ������ �����������:
            input.close();
            output.close();
        }
        // ��������� ����������:
        catch (FileNotFoundException e) {
            System.out.println("���� �� ������: " + e);
        } catch (IOException e) {
            System.out.println("������ ������� � �����: " + e);
        }
        System.out.println("����������� ����� ���������");
    }
}