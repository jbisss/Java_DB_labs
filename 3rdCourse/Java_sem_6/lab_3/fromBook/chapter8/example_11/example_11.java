package fromBook.chapter8.example_11;

abstract class Base{
    private String name;
    Base(String txt){
        name=txt;
    }
    void show(){
        System.out.println("Имя объекта: "+name);
    }
    abstract void hello();
}

class AnonymousClassDemo{
    public static void main(String[] args){
        Base obj=new Base("Красный"){
            void hello(){
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();
        new Base("Зелёный"){
            void hello(){
                System.out.println("Анонимный объект");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }
}
