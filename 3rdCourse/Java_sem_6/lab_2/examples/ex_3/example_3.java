package examples.ex_3;

interface First{
    void hello();
}
interface Second{
    void hi();
}

class MyClass implements First, Second{
    public void hello(){
        System.out.println("Метод из интерфейса First");
    }
    public void hi(){
        System.out.println("Метод из интерфейса Second");
    }
}
class UsingInterfacesDemo{
    public static void main(String[] args){
        MyClass obj=new MyClass();
        obj.hello();
        obj.hi();
    }
}
