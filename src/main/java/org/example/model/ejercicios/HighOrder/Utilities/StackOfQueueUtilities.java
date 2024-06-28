package org.example.model.ejercicios.HighOrder.Utilities;

import org.example.model.definition.Queue;
import org.example.model.ejercicios.HighOrder.Utilities.Interfaces.IStackOfQueue;

public class StackOfQueueUtilities implements IStackOfQueue {

    private final Queue[] array;
    private int count;

    public StackOfQueueUtilities() {
        array = new Queue[10000];
        count = 0;
    }

    @Override
    public void add(final Queue queue) {
        if (count >= 10000) {
            throw new RuntimeException("Límite alcanzado.");
        }
        array[count++] = queue;
    }

    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        count--;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Queue getTop() {
        if (this.isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return array[count - 1];
    }
}
