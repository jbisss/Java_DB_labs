package practice;

import java.util.ArrayList;
import java.util.Objects;

public class GenericStack<T> {
    private final ArrayList<T> items = new ArrayList<>();
    private T top;
    public GenericStack(){
        top = null;
    }
    public void push(T item){
        top = item;
        items.add(item);
    }
    public T pop(){
        if(items.isEmpty()){
            throw new GenericStackException("Underflow Error");
        }
        top = items.get(items.size() - 1);
        items.remove(items.size() - 1);
        return top;
    }
    public void showStack(){
        for(int i = items.size() - 1; i >=0; i--){
            System.out.print(items.get(i) + " ");
        }
        System.out.println();
    }

    public T getTop() {
        return top;
    }
}
