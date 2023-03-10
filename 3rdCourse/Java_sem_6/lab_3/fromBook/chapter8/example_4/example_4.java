package fromBook.chapter8.example_4;

class MyClass{
    private int code;
    private String name;
    MyClass(int n,String s){
        System.out.println("Создание объекта:");
        set(n,s).show();
    }
    MyClass set(int n){
        code=n;
        return this;
    }

    MyClass set(String s){
        name=s;
        return this;
    }
    MyClass set(int n,String s){
        return set(n).set(s);
    }

    void show(){
        System.out.println("Поле code="+code);
        System.out.println("Поле name="+name);
        System.out.println("-----------------");
    }
}

class ObjectAsResultDemo{
    static MyClass createObject(int n,String s){
        return new MyClass(n,s);
    }

    public static void main(String[] args){
        MyClass obj=createObject(100,"alpha");
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();
        createObject(300,"charlie").set(400,"delta").show();
    }
}
