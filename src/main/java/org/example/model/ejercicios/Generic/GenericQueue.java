package org.example.model.ejercicios.Generic;

import org.example.model.ejercicios.Generic.Interfaces.IGenericQueue;

public class GenericQueue<Element> implements IGenericQueue<Element> {

    private static final int MAX = 100;
    private final Element[] array;
    private int count;

    public GenericQueue() {
        array = (Element[]) new Object[MAX];
        count = 0;
    }

    @Override
    public void add(final Element item) {
        if (count == MAX) {
            throw new RuntimeException("La cola está llena, no es posible agregar nuevos elementos.");
        }
        array[count++] = item;
    }

    @Override
    public void remove() {
        if (count == 0) {
            throw new RuntimeException("La cola se encuentra vacía.");
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
    public Element getFirst() {
        if (count == 0) {
            throw new RuntimeException("La cola se encuentra vacía.");
        }
        return array[0];
    }

    @Override
    public int size() {
        return count;
    }
}
