package org.example.model.ejercicios.matrices;

import org.example.model.definition.Queue;
import org.example.model.normal.StaticQueue;
import org.example.model.normal.StaticStack;
import org.example.model.utilities.StackUtilities;

//Correcion realizada por Juan.
public class QueueOfStacks implements IQueueOfStacks {
    private StaticQueue queueOfStacks;
    private int n; // Tamaño de cada pila y número de pilas

    public QueueOfStacks(int n) {
        this.queueOfStacks = new StaticQueue();
        this.n = n;
    }

    @Override
    public void addStack(StaticStack stack) {
        if (StackUtilities.size(stack) != n) {
            throw new RuntimeException("Cada pila debe tener exactamente " + n + " elementos.");
        }
        queueOfStacks.add(stack);

    }

    @Override
    public Queue getQueueOfStacks() {
        return queueOfStacks;
    }

    @Override
    public int size() {
        return queueOfStacks.size(); // Número de pilas en la cola
    }

    @Override
    public int getN() {
        return n;
    }
}
