package fromBook.chapter8.example_1;

class MethodArgumentsDemo{
    static void swap(int a,int b){
        System.out.println("Выполняется метод swap()");
        System.out.println("Аргументы до изменения значений " + a + " и " + b);
        int x=b;
        b=a;
        a=x;
        System.out.println("Аргументы после изменения значений: " + a + " и " + b);
        System.out.println("Завершено выполение swap()");
    }

    public static void main(String[] args){
        int m=100,n=200;
        System.out.println("Переменные до swap(): " + m + " и " + n);
        swap(m,n);
        System.out.println("Переменные после swap(): " + m + " и " + n);
    }
}