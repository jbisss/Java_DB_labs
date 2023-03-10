package example31;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericMethodDriver {
    public static void main(String[] args) {
        GenericMethodClass gmc = new GenericMethodClass();
        Integer[] integers = {1, 2, 3};
        String[] strings = {"This", "is", "fun"};

        gmc.printArray(integers);
        gmc.printArray(strings);

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30));
        gmc.printList(arr);

        System.out.println(gmc.sumOfList(arr));

        ArrayList<Integer> intArray = new ArrayList<>();
        gmc.addNumbers(intArray);
        gmc.printList(intArray);
    }
}
