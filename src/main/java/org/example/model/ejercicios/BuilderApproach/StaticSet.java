package org.example.model.ejercicios.BuilderApproach;

import org.example.model.ejercicios.BuilderApproach.Interfaces.IStaticSetBuilder;

import java.util.Arrays;
import java.util.Random;

public class StaticSet implements IStaticSetBuilder {
    private static final int MAX = 10000;

    private final int[] array;
    private int count;

    public StaticSet() {
        array = new int[MAX];
        count = 0;
    }

    @Override
    public StaticSet add(final int a) {
        if (count == MAX) {
            throw new RuntimeException("Límite alcanzado.");
        }
        for (int i = 0; i < count; i++) {
            if (array[i] == a) {
                return this;
            }
        }
        array[count++] = a;
        return this;
    }

    @Override
    public void remove(final int a) {
        for (int i = 0; i < count; i++) {
            if (array[i] == a) {
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
    public int choose() {
        if (count == 0) {
            System.out.println("El conjunto está vacío.");
            return -1;
        }
        final int randomIndex = new Random().nextInt(count);
        return array[randomIndex];
    }

    @Override
    public StaticSet addAll(final StaticSet otherSet) {
        if (otherSet instanceof StaticSet) {
            StaticSet staticSet = (StaticSet) otherSet;
            for (int i = 0; i < staticSet.count; i++) {
                add(staticSet.array[i]);
            }
        } else {
            throw new RuntimeException("El tipo del conjunto no es compatible.");
        }
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final StaticSet set = (StaticSet) o;
        if (count != set.count) return false;
        final int[] array1Copy = Arrays.copyOf(array, count);
        final int[] array2Copy = Arrays.copyOf(set.array, count);
        Arrays.sort(array1Copy);
        Arrays.sort(array2Copy);
        for (int i = 0; i < count; i++) {
            if (array1Copy[i] != array2Copy[i]) {
                return false;
            }
        }
        return true;
    }
}
