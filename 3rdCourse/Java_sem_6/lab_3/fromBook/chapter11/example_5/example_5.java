package fromBook.chapter11.example_5;

class UsingThrowDemo{
    public static void main(String[] args){
        Exception me=new Exception("Искусственная ошибка");
        try{
            System.out.println("Генерируется ошибка");
            try{
                throw me;
            }
            catch(Exception one){
                System.out.println(one);
                System.out.println("А теперь ещё одна ошибка");
                throw one;
            }
        }
        catch(Exception two){
            System.out.println(two);
        }
        System.out.println("Выполнение программы запрещено");
    }
}

