package org.example.model.ejercicios.Algorithms.Monte;

public class NodeCoordinates {

    private Coordinates value;
    private NodeCoordinates next;

    public NodeCoordinates(Coordinates value, NodeCoordinates next) {
        this.value = value;
        this.next = next;
    }

    public Coordinates getValue() {
        return value;
    }

    public void setValue(Coordinates value) {
        this.value = value;
    }

    public NodeCoordinates getNext() {
        return next;
    }

    public void setNext(NodeCoordinates next) {
        this.next = next;
    }
}
