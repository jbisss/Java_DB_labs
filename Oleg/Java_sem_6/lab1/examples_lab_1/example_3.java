package examples;

class Alpha_1 {
    private int code;
    public void set(int code){
        this.code=code;
    }
    public void show(){
        System.out.println("Поле code: "+code);
    }
    Alpha_1(int code){
        set(code);
    }
}
class Bravo_1 extends Alpha_1{
    Bravo_1(int code){
        super(code);
    }
}
class UsingPrivatesDemo {
    public static void main(String[] args) {
        Bravo_1 obj = new Bravo_1(100);
        obj.show();
        obj.set(200);
        obj.show();
    }
}
