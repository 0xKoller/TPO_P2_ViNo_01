package org.example.model.ejercicios.TDACustoms;

import org.example.model.ejercicios.TDACustoms.Interfaces.ISuperSet;
import org.example.model.normal.StaticSet;

import java.util.Random;

public class SuperSet implements ISuperSet {

    private final int[] array;
    private int count;

    public SuperSet() {
        array = new int[10000];
        count = 0;
    }

    @Override
    public void add(final int a) {
        if (count == 10000) {
            throw new RuntimeException("Límite alcanzado.");
        }
        for (int i = 0; i < count; i++) {
            if (array[i] == a) {
                return;
            }
        }
        array[count++] = a;
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
            throw new RuntimeException("No se puede elegir un valor de un conjunto vacío.");
        }
        return array[new Random().nextInt(count)];
    }

    @Override
    public boolean isSuperSet(final StaticSet set) {
        boolean sub = true;
        StaticSet aux = new StaticSet();
        while (!set.isEmpty()) {
            boolean found = false;
            int value = set.choose();
            for (int j = 0; j < count; j++) {
                if (array[j] == value) {
                    found = true;
                    aux.add(value);
                    set.remove(value);
                }
            }
            if (!found) {
                sub = false;
                break;
            }
        }
        while (!aux.isEmpty()) {
            int value = aux.choose();
            set.add(value);
            aux.remove(value);
        }
        return sub;
    }

    @Override
    public StaticSet complement(final StaticSet set) {
        if (!isSuperSet(set)) {
            throw new RuntimeException("No es subconjunto del superset.");
        }
        boolean coincidence = false;
        StaticSet aux1 = new StaticSet();
        StaticSet aux2 = new StaticSet();
        StaticSet complement = new StaticSet();

        while (!isEmpty()) {
             int choose = choose();
            while (!set.isEmpty()) {
                 int value = set.choose();
                if (choose == value) {
                    coincidence = true;
                    break;
                }
                aux2.add(value);
                set.remove(value);
            }
            while (!aux2.isEmpty()) {
                int value = aux2.choose();
                set.add(value);
                aux2.remove(value);
            }
            if (!coincidence) {
                complement.add(choose);
            }
            aux1.add(choose);
            remove(choose);
        }
        while (!aux1.isEmpty()) {
            int chooseAux = aux1.choose();
            add(chooseAux);
            aux1.remove(chooseAux);
        }
        return complement;
    }
}

