package org.example.model.ejercicios.TDACustoms;

import org.example.model.definition.Stack;
import org.example.model.dynamic.nodes.Node;

import java.util.Objects;

public class LimitedStack implements Stack {
    private Node first;
    private final int limit;
    private int count;

    public LimitedStack(final int limit) {
        if (limit <= 0) {
            throw new RuntimeException("El límite no puede ser 0 ni menor a él.");
        }
        this.limit = limit;
        count = 0;
    }

    @Override
    public void add(final int a) {
        if (count >= limit) {
            throw new RuntimeException("Límite alcanzado.");
        }
        first = new Node(a, first);
        count++;
    }

    @Override
    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía.");
        }
        first = first.getNext();
        count--;
    }

    @Override
    public int getTop() {
        if (isEmpty()) {
            throw new RuntimeException("No se puede obtener el tope de una pila vacía.");
        }
        return first.getValue();
    }

    @Override
    public boolean isEmpty() {
        return Objects.isNull(first);
    }
}
