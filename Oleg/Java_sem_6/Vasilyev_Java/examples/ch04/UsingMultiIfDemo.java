// Импорт классов:
import javax.swing.*;
// Класс с главным методом программы:
class UsingMultiIfDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Объектная переменная для пиктограммы:
      ImageIcon img;
      // Текстовая переменная для записи
      // названия животного:
      String animal;
      // Текстовая переменная с начальным значением,
      // определяющим путь к файлу с изображением:
      String file="d:/books/pictures/";
      // Текстовые переменные с названиями животных:
      String wolf="Волк";
      String fox="Лиса";
      String bear="Медведь";
      String raccoon="Енот";
      // Считывание названия животного:
      animal=JOptionPane.showInputDialog(null,
         // Текст над полем ввода:
         wolf+", "+fox+" или "+bear+"?",
         // Название окна:
         "Укажите название животного",
         // Тип пиктограммы:
         JOptionPane.QUESTION_MESSAGE
         );
      // Вложенные условные операторы:
      if(animal==null){ // Если пользователь отменил ввод
         System.exit(0); // Завершение выполнения программы
      }
      // Если животное "Волк":
      else if(animal.equalsIgnoreCase(wolf)){
         file+="wolf.jpg";
         animal=wolf;
      }
      // Если животное "Лиса":
      else if(animal.equalsIgnoreCase(fox)){
         file+="fox.jpg";
         animal=fox;
      }
      // Если животное "Медведь":
      else if(animal.equalsIgnoreCase(bear)){
         file+="bear.jpg";
         animal=bear;
      }
      // Неизвестное животное:
      else{
         file+="raccoon.jpg";
         animal=raccoon;
      }
      // Создание объекта для пиктограммы:
      img=new ImageIcon(file);
      // Отображение диалогового окна:
      JOptionPane.showMessageDialog(null,
         img,    // В окне отображается изображение
         animal, // Название окна
         // Тип диалогового окна:
         JOptionPane.PLAIN_MESSAGE
      );
   }
}