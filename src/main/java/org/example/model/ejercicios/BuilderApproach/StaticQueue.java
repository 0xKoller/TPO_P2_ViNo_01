package org.example.model.ejercicios.BuilderApproach;


import org.example.model.ejercicios.BuilderApproach.Interfaces.IStaticQueueBuilder;

public class StaticQueue implements IStaticQueueBuilder {
    private static final int MAX = 10000;

    private final int[] array;
    private int count;

    public StaticQueue() {
        array = new int[MAX];
        count = 0;
    }

    @Override
    public StaticQueue add(final int a) {
        if (count == MAX) {
            throw new RuntimeException("Límite alcanzado.");
        }
        array[count++] = a;
        return this;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("Cola vacía.");
        }
        for (int i = 0; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Cola vacía.");
        }
        return array[0];
    }

    public StaticQueue addAll(final StaticQueue otherQueue) {
        for (int i = 0; i < otherQueue.count; i++) {
            add(otherQueue.array[i]);
        }
        return this;
    }
}
