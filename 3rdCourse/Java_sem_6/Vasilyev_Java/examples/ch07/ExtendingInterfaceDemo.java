// Наследуемый интерфейс:
interface First{
   // Метод с кодом по умолчанию:
   default void alpha(){
      System.out.println("Интерфейс First: метод alpha()");
   }
   // Метод с кодом по умолчанию:
   default void bravo(){
      System.out.println("Интерфейс First: метод bravo()");
   }
   // Метод с кодом по умолчанию:
   default void charlie(){
      System.out.println("Интерфейс First: метод charlie()");
   }
   // Метод без кода по умолчанию:
   void delta();
}
// Интерфейс-наследник:
interface Second extends First{
   // Объявление метода:
   void bravo();
   // Метод с кодом по умолчанию:
   default void charlie(){
      System.out.println("Интерфейс Second: метод charlie()");
   }
   // Объявление метода:
   void echo();
}
// Класс реализует интерфейс:
class MyClass implements Second{
   // Описание методов:
   public void bravo(){
      System.out.println("Класс MyClass: метод bravo()");
   }
   public void delta(){
      System.out.println("Класс MyClass: метод delta()");
   }
   public void echo(){
      System.out.println("Класс MyClass: метод echo()");
   }
}
// Главный класс:
class ExtendingInterfaceDemo{
   public static void main(String[] args){
      // Создание объекта:
      MyClass obj=new MyClass();
      // Вызов методов:
      obj.alpha();
      obj.bravo();
      obj.charlie();
      obj.delta();
      obj.echo();
   }
}