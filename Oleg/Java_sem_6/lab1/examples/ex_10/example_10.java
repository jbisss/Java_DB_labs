package examples.ex_10;

class MyClass{
    String name;
    int code;
    MyClass(String txt,int num){
        name=txt;
        code=num;
    }
    public String toString(){
        String txt="Объект класса MyClass\n";
        txt+="Поле name: "+name+"\n";
        txt+="Поле code: "+code+"\n";
        for(int k=1;k<=21;k++){
            txt+="-";
        }
        return txt;
    }
}

class UsingToStringDemo{
    public static void main(String[] args){
        MyClass obj=new MyClass("объект obj",123);
        System.out.println(obj);
    }
}

