package org.example.model.ejercicios.TDACustoms;

import org.example.model.definition.Set;
import org.example.model.ejercicios.TDACustoms.Interfaces.IRMDictionary;
import org.example.model.normal.StaticSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RMDictionary implements IRMDictionary {
    private static final int MAX = 100;

    private final int[][] array;
    private int count;
    private final Random random;

    public RMDictionary() {
        array = new int[MAX][MAX];
        count = 0;
        random = new Random();
    }

    @Override
    public void add(final int k, final int v) {
        if (count == MAX) {
            throw new RuntimeException("Límite alcanzado.");
        }
        for (int i = 0; i < count; i++) {
            if (array[i][0] == k) {
                array[i][array[i][1] + 2] = v;
                array[i][1]++;
                return;
            }
        }
        array[count] = new int[MAX];
        array[count][0] = k;
        array[count][2] = v;
        array[count][1] = 1;
        count++;
    }

    @Override
    public void remove(final int k, final int v) {
        for (int i = 0; i < count; i++) {
            if (array[i][0] == k) {
                if (array[i][1] == 1) {
                    if (array[i][2] == v) {
                        array[i] = array[count - 1];
                        count--;
                        return;
                    }
                    throw new RuntimeException("No existe el valor para la clave dada.");
                }

                for (int j = 0; j < array[i][1]; j++) {
                    if (array[i][j + 2] == v) {
                        array[i][j + 2] = array[i][array[i][1] + 1];
                        array[i][1]--;
                        return;
                    }
                }
            }
        }
        throw new RuntimeException("No existe la clave.");
    }

    @Override
    public Set getKeys() {
        Set set = new StaticSet();
        for (int i = 0; i < count; i++) {
            set.add(array[i][0]);
        }
        return set;
    }

    @Override
    public Integer get(final int k) {
        for (int i = 0; i < count; i++) {
            if (array[i][0] == k) {
                List<Integer> values = new ArrayList<>();
                for (int j = 0; j < array[i][1]; j++) {
                    values.add(array[i][j + 2]);
                }
                int index = random.nextInt(values.size());
                return values.get(index);
            }
        }
        throw new RuntimeException("No existe la clave.");
    }
}
