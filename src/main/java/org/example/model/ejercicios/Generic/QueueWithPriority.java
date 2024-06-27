package org.example.model.ejercicios.Generic;

import org.example.model.ejercicios.Generic.Interfaces.IGenericQueueWithPriority;

public class QueueWithPriority<Value, Priority extends Comparable<Priority>> implements IGenericQueueWithPriority<Value, Priority> {

    private static final int MAX = 100;
    private final Value[] values;
    private final Priority[] priorities;
    private int count;

    public QueueWithPriority() {
        values = (Value[]) new Object[MAX];
        priorities = (Priority[]) new Object[MAX];
        count = 0;
    }

    @Override
    public void add(final Value item, final Priority priority) {
        // TOPE DE COLA
        if (count == MAX) {
            throw new RuntimeException("La cola está llena.");
        }

        // COLA VACÍA - COMPARO TAMBIÉN CON LA ÚLTIMA PRIORIDAD
        if (count == 0 || priorities[count - 1].compareTo(priority) <= 0) {
            values[count] = item;
            priorities[count++] = priority;
            return;
        }

        // BUSCO DONDE PUEDO INSERTAR EN LAS PRIORIDADES
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (priorities[i].compareTo(priority) > 0) {
                index = i;
                break;
            }
        }

        // INSERTO EN VALORES
        for (int i = count - 1; i >= index; i--) {
            values[i + 1] = values[i];
            priorities[i + 1] = priorities[i];
        }

        values[index] = item;
        priorities[index] = priority;
        count++;
    }

    @Override
    public void remove() {
        if (count == 0) {
            throw new RuntimeException("La cola se encuentra vacía.");
        }
        for (int i = 0; i < count - 1; i++) {
            values[i] = values[i + 1];
            priorities[i] = priorities[i + 1];
        }
        count--;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Value getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("La cola se encuentra vacía.");
        }
        return values[0];
    }

    @Override
    public Priority getPriority() {
        if (isEmpty()) {
            throw new RuntimeException("La cola se encuentra vacía.");
        }
        return priorities[0];
    }

    @Override
    public int size() {
        return count;
    }
}
