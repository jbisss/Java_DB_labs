package tasks;

import java.util.Random;
import java.util.Stack;

public class Stacks {
    static void printStack(Stack<Double> stack){
        for(int i = 0; i < stack.size(); i++){
            System.out.printf("%.2f ", stack.elementAt(i));;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Double> stack_1 = new Stack<>();
        Stack<Double> stack_2 = new Stack<>();

        for(int i = 0; i < 10; i++){
            stack_1.push(new Random().nextDouble(201) - 100);
        }

        printStack(stack_1);

        while(!stack_1.isEmpty()){
            stack_2.push(stack_1.pop());
        }

        printStack(stack_2);
    }
}
