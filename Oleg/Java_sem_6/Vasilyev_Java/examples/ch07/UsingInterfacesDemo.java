// Первый интерфейс:
interface First{
   void hello();
}
// Второй интерфейс:
interface Second{
   void hi();
}
// Класс реализует два интерфейса:
class MyClass implements First, Second{
   // Описание метода из первого интерфейса:
   public void hello(){
      System.out.println("Метод из интерфейса First");
   }
   // Описание метода из второго интерфейса:
   public void hi(){
      System.out.println("Метод из интерфейса Second");
   }
}
// Главный класс:
class UsingInterfacesDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClass obj=new MyClass();
      // Вызов методов из объекта:
      obj.hello();
      obj.hi();
   }
}