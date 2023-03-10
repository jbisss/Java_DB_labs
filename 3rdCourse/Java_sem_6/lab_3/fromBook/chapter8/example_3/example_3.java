package fromBook.chapter8.example_3;

class MyClass{
    int number;
    MyClass(int n){
        number=n;
    }
}
class SwapObjectsDemo{
    static void swap(MyClass A,MyClass B){
        System.out.println("До выполнения swap()");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        MyClass X=B;
        B=A;
        A=X;
        System.out.println("Объекты обменяны");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        System.out.println("После выполнения swap()");
    }
    public static void main(String[] args){
        MyClass A=new MyClass(100);
        MyClass B=new MyClass(200);
        System.out.println("До swap(): A.number="+A.number+" и "+B.number+ "B.number");
                swap(A,B);
        System.out.println("После swap(): A.number="+A.number+" и " + B.number+"+B.number");
    }
}
