package examples.ex_4;

interface Base{
    void show();
}
class Alpha implements Base{
    String word;
    Alpha(String txt){
        word=txt;
    }
    public void show(){
        System.out.println("Объект класса Alpha");
        System.out.println("Текстовое поле: "+word);
    }
}
class Bravo implements Base{
    int number;
    Bravo(int n){
        number=n;
    }
    public void show(){
        System.out.println("Объект класса Bravo");
        System.out.println("Целочисленное поле: "+number);
    }
}

class UsingInterfaceVarsDemo{
    public static void main(String[] args){
        Base ref;
        ref=new Alpha("текст");
        ref.show();
        ref=new Bravo(123);
        ref.show();
    }
}
