package org.example.model.ejercicios.Generic;

import org.example.model.ejercicios.Generic.Interfaces.IGenericStack;

public class GenericStack<Element> implements IGenericStack<Element> {

    private static final int MAX = 100;
    private final Element[] array;
    private int count;

    public GenericStack() {
        array = (Element[]) new Object[MAX];
        count = 0;
    }

    @Override
    public void add(final Element item) {
        if (count == MAX) {
            throw new RuntimeException("Limite alcanzado.");
        }
        array[count++] = item;
    }

    @Override
    public void remove() {
        if (count == 0) {
            throw new RuntimeException("Pila vacía.");
        }
        count--;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Element getTop() {
        if (count == 0) {
            throw new RuntimeException("Pila vacía.");
        }
        return array[count - 1];
    }

    @Override
    public int size() {
        return count;
    }
}
