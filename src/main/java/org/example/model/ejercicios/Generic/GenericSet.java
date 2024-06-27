package org.example.model.ejercicios.Generic;

import org.example.model.ejercicios.Generic.Interfaces.IGenericSet;

import java.util.Arrays;
import java.util.Random;

public class GenericSet<Element> implements IGenericSet<Element> {

    private static final int MAX = 100;
    private final Element[] array;
    private int count;

    public GenericSet() {
        array = (Element[]) new Object[MAX];
        count = 0;
    }

    @Override
    public void add(final Element element) {
        if (count == MAX) {
            throw new RuntimeException("Límite de elementos alcanzado.");
        }
        for (int i = 0; i < count; i++) {
            if (array[i].equals(element)) {
                return;
            }
        }
        array[count++] = element;
    }

    @Override
    public void remove(final Element element) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(element)) {
                array[i] = array[count - 1];
                count--;
                return;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Element choose() {
        if (count == 0) {
            System.out.println("No se puede elegir un elemento del conjunto vacío.");
            return null;
        }
        final int randomIndex = new Random().nextInt(count);
        return array[randomIndex];
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericSet<?> set = (GenericSet<?>) o;
        if (count != set.count) return false;

        final Object[] aux1 = Arrays.copyOf(array, count);
        final Object[] aux2 = Arrays.copyOf(set.array, count);
        Arrays.sort(aux1);
        Arrays.sort(aux2);

        return Arrays.equals(aux1, aux2);
    }
}
