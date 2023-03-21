package queue;

import java.util.LinkedList;

public class LettersS {
    public static void main(String[] args) {
        // Queue
        LinkedList<String> lettersQ = new LinkedList<>();
        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");
        System.out.println("Linked list: " + lettersQ);
        System.out.println("Queue size: " + lettersQ.size());
        while(!lettersQ.isEmpty()){
            System.out.println(lettersQ.removeFirst());
        }
        System.out.println("Linked list: " + lettersQ);

        // Stack
        LinkedList<String> letterStack = new LinkedList<>();
        letterStack.push("A");
        letterStack.push("B");
        letterStack.push("C");
        letterStack.push("D");
        System.out.println("Linked list: " + letterStack);
        System.out.println("Stack size: " + letterStack.size());
        while(!letterStack.isEmpty()){
            System.out.println(letterStack.pop());
        }
        System.out.println("Linked list: " + letterStack);
    }
}
