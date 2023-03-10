// Импорт классов:
import javax.swing.*;
import java.awt.event.*;
// Класс для создания объекта:
class MyFrame extends JFrame{
   // Раскрывающийся список:
   private JComboBox CB;
   // Кнопка:
   private JButton B;
   // Метка:
   private JLabel L;
   // Массив с названиями животных:
   private String[] animals=new String[]{"Лиса","Волк","Медведь","Енот"};
   // Массив с названиями файлов с изображениями:
   private String[] files=new String[]{"fox.jpg","wolf.jpg","bear.jpg","raccoon.jpg"};
   // Путь к каталогу с изображениями:
   private String path="d:/books/pictures/";
   // Массив с изображениями:
   private ImageIcon[] imgs;
   // Конструктор:
   MyFrame(){
      // Настройка параметров окна:
      super("Раскрывающийся список");
      setBounds(250,250,300,150);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setResizable(false);
      setLayout(null);
      // Создание массива из ссылок на объекты изображений:
      imgs=new ImageIcon[files.length];
      // Создание объектов изображений
      // и заполнение массива:
      for(int k=0;k<imgs.length;k++){
         imgs[k]=new ImageIcon(path+files[k]);
      }
      // Создание раскрывающегося списка:
      CB=new JComboBox(imgs);
      // Положение и размеры списка:
      CB.setBounds(10,10,150,100);
      // Задаем выбранный в списке пункт:
      CB.setSelectedIndex(0);
      // Регистрация обработчика в списке:
      CB.addItemListener(e->L.setText(animals[CB.getSelectedIndex()]));
      // Добавление списка в окно:
      add(CB);
      // Создание и добавление в окно метки с текстом:
      JLabel lbl=new JLabel("Ваш выбор:");
      lbl.setBounds(170,10,120,20);
      add(lbl);
      // Создание метки с названием животного:
      L=new JLabel(animals[0],JLabel.CENTER);
      // Положение и размеры метки:
      L.setBounds(170,40,120,30);
      // Рамка вокруг метки:
      L.setBorder(BorderFactory.createEtchedBorder());
      // Добавление метки в окно:
      add(L);
      // Создание кнопки:
      B=new JButton("OK");
      // Положение и размеры кнопки:
      B.setBounds(170,80,120,30);
      // Регистрация обработчика в кнопке:
      B.addActionListener(e->System.exit(0));
      // Добавление кнопки в окно:
      add(B);
      // Отображение окна на экране:
      setVisible(true);
   }
}
// Главный класс:
class MoreComboBoxDemo{
   // Главный метод:
   public static void main(String[] args){
      // Создание объекта окна:
      new MyFrame();
   }
}