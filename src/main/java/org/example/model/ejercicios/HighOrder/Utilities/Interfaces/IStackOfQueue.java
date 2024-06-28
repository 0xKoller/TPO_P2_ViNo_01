package org.example.model.ejercicios.HighOrder.Utilities.Interfaces;

import org.example.model.definition.Queue;

public interface IStackOfQueue {

    void add(Queue queue);

    void remove();

    boolean isEmpty();

    Queue getTop();

}
