package org.example.model.ejercicios.TDACustoms;

import org.example.model.ejercicios.TDACustoms.Interfaces.IMultiSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UnrestrictedSet implements IMultiSet {

    private static final int MAX = 10000;
    private int count;
    private final int[] elements;
    private final int[] times;

    public UnrestrictedSet() {
        elements = new int[MAX];
        times = new int[MAX];
        count = 0;
    }

    @Override
    public void add(final int a) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == a) {
                times[i]++;
                return;
            }
        }
        if (count == MAX) {
            throw new RuntimeException("Límite alcanzado.");
        }
        elements[count] = a;
        times[count++] = 1;
    }

    @Override
    public void remove(final int a) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == a) {
                times[i]--;
                if (times[i] == 0) {
                    for (int j = i; j < count - 1; j++) {
                        elements[j] = elements[j + 1];
                        times[j] = times[j + 1];
                    }
                    count--;
                }
                return;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int choose() {
        if (count == 0) {
            System.out.println("Vacío.");
            // Mostrar en pantalla vacío, pero debo devolver un número.
            return -1;
        }
        final List<Integer> a = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < times[i]; j++) {
                a.add(elements[i]);
            }
        }
        final int index = new Random().nextInt(a.size());
        return a.get(index);
    }

    // Juan, esto ahora es lo que devuelve las repeticiones del elemento.
    @Override
    public int count(final int a) {
        for (int i = 0; i < count; i++) {
            if (elements[i] == a) {
                return times[i];
            }
        }
        return 0;
    }
}
