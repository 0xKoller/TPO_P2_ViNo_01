package org.example.model.ejercicios.TDACustoms;

public class BiNode {
    private int value;
    private BiNode next;
    private BiNode before;

    public BiNode(final int value, final BiNode before, final BiNode next) {
        this.value = value;
        this.before = before;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public BiNode getNext() {
        return next;
    }

    public BiNode getBefore() {
        return before;
    }

    public void setNext(final BiNode next) {
        this.next = next;
    }

    public void setBefore(final BiNode before) {
        this.before = before;
    }
}
