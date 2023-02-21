package fromBook.chapter8.example_5;

abstract class Base{
    abstract void show();
}
class Alpha extends Base{
    void show(){
        System.out.println("Объект класса Alpha");
    }
}
class Bravo extends Base{
    void show(){
        System.out.println("Объект класса Bravo");
    }
}
class Charlie extends Base{
    void show(){
        System.out.println("Объект класса Charlie");
    }
}

class ObjectFactoryDemo{
    static Base createObject(int n){
        if(n==1) return new Alpha();
        if(n==2) return new Bravo();
        return new Charlie();
    }

    public static void main(String[] args){
        Base obj;
        for(int k=1;k<=3;k++){
            obj=createObject(k);
            obj.show();
        }
    }
}
