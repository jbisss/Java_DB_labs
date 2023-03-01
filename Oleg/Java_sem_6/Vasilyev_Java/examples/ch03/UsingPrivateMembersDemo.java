// Класс с закрытыми членами:
class MyClass{
   // Закрытое статическое поле:
   private static int count=0;
   // Закрытые нестатические поля:
   private int number;
   private String name;
   // Конструктор без аргументов:
   MyClass(String n){
      // Увеличение значения статического поля:
      count++;
      // Присваивание значений нестатическим полям:
      name=n;
      number=count;
      // Отображение сообщения:
      System.out.println("Создан объект с именем "+name);
   }
   // Метод для отображения сообщения:
   public void show(){
      System.out.println("Название объекта: "+name);
      System.out.println("Номер объекта: "+number);
      System.out.println("Количество объектов: "+count);
   }
   // Метод для присваивания значения закрытому
   // текстовому полю:
   public void set(String n){
      name=n;
   }
}
// Класс с главным методом программы:
class UsingPrivateMembersDemo{
   // Главный метод программы:
   public static void main(String[] args){
      // Создание объектов:
      MyClass objA=new MyClass("Alpha");
      MyClass objB=new MyClass("Bravo");
      MyClass objC=new MyClass("Charlie");
      // Вызов метода для каждого из объектов:
      objA.show();
      objB.show();
      objC.show();
      // Изменение поля второго объекта:
      objB.set("Второй Объект");
      // Отображение значений полей объекта:
      objB.show();
   }
}