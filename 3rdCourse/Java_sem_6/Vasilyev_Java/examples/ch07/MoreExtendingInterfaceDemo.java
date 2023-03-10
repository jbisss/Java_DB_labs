// Первый интерфейс:
interface First{
   // Описание метода:
   default void alpha(){
      System.out.println("Интерфейс First: метод alpha()");
   }
}
// Второй интерфейс:
interface Second extends First{
   // Описание методов:
   default void alpha(){
      // Вызов версии метода из интерфейса First:
      First.super.alpha();
      System.out.println("Интерфейс Bravo: метод alpha()");
   }
   default void bravo(){
      System.out.println("Интерфейс Bravo: метод bravo()");
   }
}
// Класс реализует интерфейс:
class MyClass implements Second{
   // Описание метода:
   public void bravo(){
      // Вызов версии метода из интерфейса Second:
      Second.super.bravo();
      System.out.println("Класс MyClass: метод bravo()");
   }
}
// Главный класс:
class MoreExtendingInterfaceDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClass obj=new MyClass();
      // Вызов методов:
      obj.alpha();
      obj.bravo();
   }
}