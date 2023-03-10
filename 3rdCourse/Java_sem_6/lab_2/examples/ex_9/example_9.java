package examples.ex_9;

interface First{
    String getFirst();
    default void show(){
        System.out.println("Интерфейс First: метод show()");
    }
}
interface Second{
    String getSecond();
    default void show(){
        System.out.println("Интерфейс Second: метод show()");
    }
}
class Base{
    String getBase(){
        return "Класс Base";
    }
    void show(){
        System.out.println("Класс Base: метод show()");
    }
}
class MyClass extends Base implements First, Second{
    public String getFirst(){
        return "Интерфейс First";
    }
    public String getSecond(){
        return "Интерфейс Bravo";
    }
    public void show(){
        System.out.println("Мы используем:");
        System.out.println(getFirst());
        System.out.println(getSecond());
        System.out.println(getBase());
        First.super.show();
        Second.super.show();
        super.show();
    }
}

class ExtendingAndImplementingDemo{
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.show();
    }
}
