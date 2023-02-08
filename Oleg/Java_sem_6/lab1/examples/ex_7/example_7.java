package examples.ex_7;

class Alpha{
    String name;
}
class Bravo extends Alpha{
    String name;
    void show(){
        System.out.println("Из класса Alpha: "+super.name);
        System.out.println("Из класса Bravo: "+name);
    }
    Bravo(String a,String b){
        super();
        super.name=a;
        name=b;
    }
}
class HidingFieldDemo{
    public static void main(String[] args){
        Bravo obj=new Bravo("alpha","bravo");
        obj.show();
    }
}