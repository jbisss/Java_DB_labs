package fromBook.chapter8.example_6;

class Base{
    String name;
    Base(String txt){
        name=txt;
    }
    Base(Base obj){
        name=obj.name;
    }
}

class MyClass extends Base{
    int code;
    MyClass(String txt,int n){
        super(txt);
        code=n;
    }
    MyClass(MyClass obj){
        super(obj);
        code=obj.code;
    }
    void show(){
        System.out.println("Текстовое поле: "+name);
        System.out.println("Целочисленное поле: "+code);
    }
}

class CopyConstructorDemo{
    public static void main(String[] args){
        MyClass A=new MyClass("Жёлтый",200);
        MyClass B=new MyClass(A);
        A.name="Красный";
        A.code=100;
        MyClass C=new MyClass(new MyClass("Зелёный",300));
        System.out.println("Объект A");
        A.show();
        System.out.println("Объект B");
        B.show();
        System.out.println("Объект C");
        C.show();
    }
}
