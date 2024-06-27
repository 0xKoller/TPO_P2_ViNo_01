package org.example.model.utilities;


import org.example.model.definition.Stack;
import org.example.model.normal.StaticStack;

public class StackUtilities {

    public static Stack copy(Stack stack) {
        Stack stack1 = new StaticStack();
        Stack stack2 = new StaticStack();

        while (!stack.isEmpty()) {
            stack1.add(stack.getTop());
            stack2.add(stack.getTop());
            stack.remove();
        }

        while (!stack1.isEmpty()) {
            stack.add(stack1.getTop());
            stack1.remove();
        }

        while (!stack2.isEmpty()) {
            stack1.add(stack2.getTop());
            stack2.remove();
        }

        return stack1;
    }

    public static void print(Stack stack) {
        Stack copy = copy(stack);
        while (!copy.isEmpty()) {
            System.out.println(copy.getTop());
            copy.remove();
        }
    }

    public static int filter(Stack stack) {
        Stack copy = copy(stack);
        int count = 0;

        Stack stack1 = new StaticStack();
        Stack stack2 = new StaticStack();
        Stack stack3 = new StaticStack();

        while (!copy.isEmpty()) {
            stack3.add(copy.getTop());
            if (count % 2 == 0) {
                stack1.add(copy.getTop());
            } else {
                stack2.add(copy.getTop());
            }
            count++;
            copy.remove();
        }

        while (!stack2.isEmpty() && !stack3.isEmpty()) {
            stack2.remove();
            stack3.remove();
        }

        return stack3.getTop();
    }

    public static Stack invert(Stack stack) {
        Stack aux = copy(stack);
        Stack inverted = new StaticStack();
        while (!aux.isEmpty()) {
            inverted.add(aux.getTop());
            aux.remove();
        }
        return inverted;
    }

    public static int size(Stack stack) {
        int count = 0;
        Stack auxStack = copy(stack);

        while (!auxStack.isEmpty()) {
            count++;
            auxStack.remove();
        }
        return count;
    }

}