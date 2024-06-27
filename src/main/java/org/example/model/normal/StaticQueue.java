package org.example.model.normal;

import org.example.model.definition.Queue;

public class StaticQueue implements Queue {

    private final int[] array;
    private int count;

    public StaticQueue() {
        array = new int[10000];
        count = 0;
    }

    @Override
    public void add(int a) {
        if (count == 10000) {
            throw new RuntimeException("No se puede agregar el elemento");
        }
        array[count] = a;
        count++;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("No se puede desacolar una cola vacia");
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
            throw new RuntimeException("No se puede obtener el primero de una cola vacia");
        }
        return array[0];
    }

    private static int size(Queue queue) {
        Queue aux = copy(queue);
        int count = 0;
        while (!aux.isEmpty()) {
            aux.remove();
            count++;
        }
        return count;
    }

    private static Queue copy(Queue queue) {
        Queue aux = new StaticQueue();
        Queue aux2 = new StaticQueue();

        while (!queue.isEmpty()) {
            aux.add(queue.getFirst());
            aux2.add(queue.getFirst());
            queue.remove();
        }

        while (!aux.isEmpty()) {
            queue.add(aux.getFirst());
            aux.remove();
        }

        return aux2;
    }

}
