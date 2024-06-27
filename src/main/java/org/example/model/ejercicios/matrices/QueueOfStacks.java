package org.example.model.ejercicios.matrices;

public class QueueOfStacks implements IQueueOfStacks {
    private Queue queueOfStacks;
    private int n; // Tamaño de cada pila y número de pilas

    public QueueOfStacks(int n) {
        this.queueOfStacks = new Queue();
        this.n = n;
    }

    @Override
    public void addStack(Stack stack) {
        if (stack.size() != n) {
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
