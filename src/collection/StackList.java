package collection;

import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //princip FILO -> first in last out
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
