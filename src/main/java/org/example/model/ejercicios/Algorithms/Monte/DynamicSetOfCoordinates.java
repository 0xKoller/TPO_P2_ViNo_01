package org.example.model.ejercicios.Algorithms.Monte;

import org.example.model.ejercicios.Algorithms.Monte.Interfaces.ISetOfCoordinates;

import java.util.Random;

public class DynamicSetOfCoordinates implements ISetOfCoordinates {
    private NodeCoordinates first;
    private int count;

    @Override
    public void add(Coordinates a) {
        NodeCoordinates actual = first;
        while (actual != null && actual.getValue() != a) {
            actual = actual.getNext();
        }
        if (actual == null) {
            first = new NodeCoordinates(a, first);
            count++;
        }
    }

    @Override
    public void remove(Coordinates a) {
        if (this.isEmpty()) {
            return;
        }
        if (first.getNext() == null) {
            if (first.getValue() == a) {
                first = null;
                count--;
            }
            return;
        }

        if (first.getValue() == a) {
            first = first.getNext();
            count--;
            return;
        }

        NodeCoordinates aux1 = first;
        NodeCoordinates actual = first.getNext();
        while (actual != null && actual.getValue() != a) {
            aux1 = actual;
            actual = actual.getNext();
        }

        if (actual != null) {
            aux1.setNext(actual.getNext());
            count--;
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public Coordinates choose() {
        if (count == 0) {
            throw new RuntimeException("Conjunto vacio");
        }
        NodeCoordinates actual = first;
        int index = new Random().nextInt(count);
        for (int i = 0; i < index; i++) {
            actual = actual.getNext();
        }
        return actual.getValue();
    }
}
