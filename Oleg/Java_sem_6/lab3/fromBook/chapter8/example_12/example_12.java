package fromBook.chapter8.example_12;

interface Base{
    default void show(){
        System.out.println("Интерфейс Base");
    }
    void hello();
}

class MoreAnonymousClassDemo{
    public static void main(String[] args){
        Base obj=new Base(){
            public void hello(){
                System.out.println("Объект анонимного класса");
            }
        };
        obj.show();
        obj.hello();
        new Base(){
            public void hello(){
                System.out.println("Анонимный объект");
            }
            void showAll(){
                hello();
                show();
            }
        }.showAll();
    }
}
