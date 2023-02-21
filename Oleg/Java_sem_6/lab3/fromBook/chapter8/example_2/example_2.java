package fromBook.chapter8.example_2;

class MyClass{
    int number;
    MyClass(int n){
        number=n;
    }
}

class SwapFieldsDemo{
    static void swap(MyClass A,MyClass B){
        System.out.println("Выполнеятся метод swap()");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        int number=B.number;
        B.number=A.number;
        A.number=number;
        System.out.println("Значения полей изменены");
        System.out.println("Объект A: "+A.number);
        System.out.println("Объект B: "+B.number);
        System.out.println("Завершён метод swap()");
    }

    public static void main(String[] args){
        MyClass A=new MyClass(100);
        MyClass B=new MyClass(200);
        System.out.println("До вызова swap(): A.number="+A.number+" и B.number="+B.
                number);
        swap(A,B);
        System.out.println("После вызова swap(): A.number="+A.number+" и "+B.
                number+"+B.number");
    }
}

