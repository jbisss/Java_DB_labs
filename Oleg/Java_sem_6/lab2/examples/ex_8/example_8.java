package examples.ex_8;

interface First{
    default void alpha(){
        System.out.println("Интерфейс First: метод alpha()");
    }
}
interface Second extends First{
    default void alpha(){
        First.super.alpha();
        System.out.println("Интерфейс Bravo: метод alpha()");
    }
    default void bravo(){
        System.out.println("Интерфейс Bravo: метод bravo()");
    }
}

class MyClass implements Second{
    public void bravo(){
        Second.super.bravo();
        System.out.println("Класс MyClass: метод bravo()");
    }
}

class MoreExtendingInterfaceDemo{
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.alpha();
        obj.bravo();
    }
}
