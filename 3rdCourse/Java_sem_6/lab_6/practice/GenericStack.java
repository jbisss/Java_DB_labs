package practice;

import java.util.ArrayList;
import java.util.Objects;

public class GenericStack<T> {
    private ArrayList<T> items = new ArrayList<>();
    private int top;
    public GenericStack(){
        top = 0;
    }
    public void push(T item){
        top = (int) item;
        items.add(item);
    }
    public void pop(){
        if(items.isEmpty()){
            throw new GenericStackException("Underflow Error");
        }
        items.remove(items.size() - 1);
        if(items.isEmpty()){
            top = 0;
        } else {
            top = (int) items.get(items.size() - 1);
        }
    }

    public int getTop() {
        return top;
    }
}
