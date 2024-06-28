package org.example.model.ejercicios.Matrix;

import org.example.model.definition.Stack;
import org.example.model.ejercicios.Matrix.Interfaces.IQueueOfStacks;

public class QueueOfStacks implements IQueueOfStacks {
    private static final int MAX = 10;
    private final Stack[] arrayStack;
    private int count;

    public QueueOfStacks() {
        arrayStack = new Stack[MAX];
        count = 0;
    }
    public void add(Stack stack) {
        if (count == MAX) {
            throw new RuntimeException("No se pueden agregar mas elementos.");
        }
        arrayStack[count++] = stack;

    }
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("Cola vacía");
        }
        recursiveRemove(0);
        count--;
    }

    private void recursiveRemove(int index) {
        if (index < count - 1) {
            arrayStack[index] = arrayStack[index + 1];
            recursiveRemove(index + 1);
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Stack getFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("Cola vacía");
        }
        return arrayStack[0];
    }
}
