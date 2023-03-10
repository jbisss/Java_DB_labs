package examples_lab_1.ex_5;

class Alpha{
    String name;
    void show(){
        System.out.println("Объект класса Alpha:");
        System.out.println("Поле name — "+name);
    }
    Alpha(String name){
        this.name=name;
    }
}
class Bravo extends Alpha{
    int code;
    void show(){
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name — "+name);
        System.out.println("Поле code — "+code);
    }
    Bravo(String name,int code){
        super(name);
        this.code=code;
    }
}
class OverrideMethodDemo{
    public static void main(String[] args){
        Alpha objA=new Alpha("objA");
        Bravo objB=new Bravo("objB",123);
        objA.show();
        objB.show();
    }
}
