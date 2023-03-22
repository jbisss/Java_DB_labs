package practice;

public class GenericStackDriver {
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.showStack();
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        stack.showStack();
    }
}
