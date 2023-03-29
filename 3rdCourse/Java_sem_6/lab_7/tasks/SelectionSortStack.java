package tasks;

import java.util.Random;
import java.util.Stack;

public class SelectionSortStack {
    static void printStack(Stack<Integer> stack){
        for(int i = 0; i < stack.size(); i++){
            System.out.print(stack.elementAt(i) + " ");;
        }
        System.out.println();
    }
    static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        int numItems = stack.size();
        int numUnsorted = numItems;
        for (int i = 0; i < numItems; i++)
        {
            int biggest = stack.pop();
            for (int j = 0; j < numUnsorted - 1; j++)
            {
                int testItem = stack.pop();
                if (testItem < biggest) {
                    tempStack.push(biggest);
                    biggest = testItem;
                } else {
                    tempStack.push(testItem);
                }
            }
            stack.push(biggest);
            while (tempStack.size() > 0){
                stack.push(tempStack.pop());
            }
            numUnsorted--;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 10; i++){
            stack.push(new Random().nextInt(201) - 100);
        }
        printStack(stack);
        sortStack(stack);
        printStack(stack);
        System.out.println(stack.peek());
    }
}
