package glava_18;

//Импорт классов:

import java.io.*;

//Главный класс:
class FileInputOutputDemo {
    // Главный метод:
    public static void main(String[] args) {
        System.out.println("Start copying");
        // Путь к директории:
        String path = ".\\files\\";
        // Переменная для записи считываемых байтов:
        int bt;
        // Контролируемый код:
        try {
            // Объект файлового потока ввода:
            FileInputStream input = new FileInputStream(path + "MyCV.pdf");
            // Объект файлового потока вывода:
            FileOutputStream output = new FileOutputStream(path + "MyData.pdf");
            // Считывание байта из файла:
            bt = input.read();
            // Считывание байтов из одного файла
            // и запись в другой файл:
            while (bt != -1) { // Пока не достигнут конец файла
                // Запись байта в файл:
                output.write(bt);
                // Считывание байта из файла:
                bt = input.read();
            }
            // Потоки закрываются:
            input.close();
            output.close();
        }
        // Обработка исключений:
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка доступа к файлу: " + e);
        }
        System.out.println("Success");
    }
}