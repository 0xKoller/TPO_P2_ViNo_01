package org.example.model.ejercicios.Matrix.Interfaces;

import org.example.model.definition.Stack;

public interface IQueueOfStacks {

    void add(Stack stack);

    void remove();

    boolean isEmpty();

    Stack getFirst();

}
