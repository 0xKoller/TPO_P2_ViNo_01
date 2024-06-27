package org.example.model.ejercicios.BuilderApproach;

import org.example.model.ejercicios.BuilderApproach.Interfaces.IStaticStackBuilder;

public class StaticStack implements IStaticStackBuilder {
    private static final int MAX = 10000;

    private final int[] array;
    private int count;

    public StaticStack() {
        array = new int[MAX];
        count = 0;
    }

    @Override
    public StaticStack add(final int a) {
        if (count >= MAX) {
            throw new RuntimeException("Límite alcanzado.");
        }
        array[count++] = a;
        return this;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        count--;
    }

    @Override
    public int getTop() {
        if (isEmpty()) {
            throw new RuntimeException("Pila vacía");
        }
        return array[count - 1];
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    public StaticStack addAll(final StaticStack otherStack) {
        for (int i = 0; i < otherStack.count; i++) {
            add(otherStack.array[i]);
        }
        return this;
    }
}
