package example31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodClass {
    public <T> void printArray(T[] array){
        for(T arrayItem : array){
            System.out.println(arrayItem);
        }
    }
    public void printList(List<?> list){
        for(Object elem : list){
            System.out.println(elem);
        }
        System.out.println();
    }
    public double sumOfList(ArrayList<? extends Number> arrayList){
        double s = 0.0;
        for(Number n : arrayList){
            s += n.doubleValue();
        }
        return s;
    }
    public void addNumbers(ArrayList<? super Integer> arrayList){
        for(int i =0; i < 10; i++){
            arrayList.add(i);
        }
    }
}

