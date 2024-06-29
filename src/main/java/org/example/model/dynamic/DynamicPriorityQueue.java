package org.example.model.dynamic;

import org.example.model.definition.PriorityQueue;
import org.example.model.dynamic.nodes.PriorityNode;

import java.util.Objects;

public class DynamicPriorityQueue implements PriorityQueue {

    private PriorityNode first;
    private int size; // Variable para mantener el tamaño de la cola de prioridad

    @Override
    public void add(int a, int priority) {
        if (this.isEmpty() || this.first.getPriority() > priority) {
            this.first = new PriorityNode(a, priority, this.first);
            size++;
            return;
        }

        PriorityNode last = this.getLast();
        if (last.getPriority() <= priority) {
            last.setNext(new PriorityNode(a, priority, null));
            size++;
            return;
        }

        PriorityNode candidate = this.first;
        PriorityNode current = this.first.getNext();
        while (current != null) {
            if (current.getPriority() > priority) {
                candidate.setNext(new PriorityNode(a, priority, current));
                size++;
                break;
            }
            candidate = current;
            current = current.getNext();
        }
    }

    @Override
    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede desencolar una cola de prioridad vacía");
        }

        this.first = this.first.getNext();
        size--;
    }

    @Override
    public int getFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede obtener el primer elemento de una cola de prioridad vacía");
        }
        return this.first.getValue();
    }

    @Override
    public int getPriority() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede obtener la prioridad del primer elemento de una cola de prioridad vacía");
        }
        return this.first.getPriority();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(this.first);
    }

    private PriorityNode getLast() {
        PriorityNode current = this.first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }
}
