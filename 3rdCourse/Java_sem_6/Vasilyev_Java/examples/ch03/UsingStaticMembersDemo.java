// Класс со статическими членами:
class MyClass{
   // Статическое поле:
   static int count=0;
   // Конструктор без аргументов:
   MyClass(){
      // Увеличение значения статического поля:
      count++;
      // Отображение сообщения:
      System.out.println("Создан объект номер "+count);
   }
   // Статический метод:
   static void show(){
      System.out.println("Количество объектов: "+count);
   }
}
// Класс с главным методом программы:
class UsingStaticMembersDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Вызов статического метода:
      MyClass.show();
      // Создание объектов:
      MyClass objA=new MyClass();
      MyClass objB=new MyClass();
      MyClass objC=new MyClass();
      // Вызов статического метода через ссылку на класс:
      MyClass.show();
      // Вызов статического метода через ссылку на объект:
      objC.show();
      objB.show();
   }
}