// Первый интерфейс:
interface First{
   default void hello(){
      System.out.println("Метод из интерфейса First");
   }
}
// Второй интерфейс:
interface Second{
   default void hello(){
      System.out.println("Метод из интерфейса Second");
   }
}
// Класс реализует два интерфейса:
class MyClass implements First, Second{
   // Описание метода:
   public void hello(){
      // Вызов версии метода из интерфейса First:
      First.super.hello();
      // Вызов версии метода из интерфейса Second:
      Second.super.hello();
   }
}
// Главный класс:
class MoreDefaultMethodsDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClass obj=new MyClass();
      // Вызов метода:
      obj.hello();
   }
}