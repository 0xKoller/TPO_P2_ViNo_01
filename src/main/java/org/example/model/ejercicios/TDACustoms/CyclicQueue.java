package org.example.model.ejercicios.TDACustoms;

import org.example.model.definition.Queue;

public class CyclicQueue implements Queue {

    private BiNode first;

    @Override
    public void add(final int a) {
        if (isEmpty()) {
            first = new BiNode(a, null, null);
            first.setNext(first);
            first.setBefore(first);
            return;
        }
        BiNode newNode = new BiNode(a, first.getBefore(), first);
        first.getBefore().setNext(newNode);
        first.setBefore(newNode);
        first = newNode;
    }

    @Override
    public void remove() {
//        Se usa el recursive
    }

    public void removeRecur(final BiNode node) {
        if (node.getNext() == first) {
            node.getBefore().setNext(node.getNext());
            node.getNext().setBefore(node.getBefore());
            node.setNext(null);
            node.setBefore(null);
        } else {
            removeRecur(node.getNext());
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int getFirst() {
        return first.getBefore().getValue();
    }
}
