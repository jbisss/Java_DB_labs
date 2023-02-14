package examples.ex_7;

interface First{
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
    default void bravo(){
        System.out.println("Интерфейс First: метод bravo()");
    }
    default void charlie(){
        System.out.println("Интерфейс First: метод charlie()");
    }
    void delta();
}

interface Second extends First{
    void bravo();
    default void charlie(){
        System.out.println("Интерфейс Second: метод charlie()");
    }
    void echo();
}
class MyClass implements Second{
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

class ExtendingInterfaceDemo{
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.alpha();
        obj.bravo();
        obj.charlie();
        obj.delta();
        obj.echo();
    }
}
