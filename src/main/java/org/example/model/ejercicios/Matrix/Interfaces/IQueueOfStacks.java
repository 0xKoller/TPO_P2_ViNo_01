package org.example.model.ejercicios.Matrix.Interfaces;

import org.example.model.definition.Stack;

public interface IQueueOfStacks {

    /**
     * Postcondicion: Añade una pila a la estructura de cola de pilas.
     *
     * @param stack pila a añadir.
     */
    void add(Stack stack);

    /**
     * Precondicion: La estructura de cola de pilas no está vacía.
     * Postcondicion: Elimina la pila al frente de la estructura.
     */
    void remove();

     boolean isEmpty();

    /**
     * Postcondicion: Devuelve la primera pila de la estructura de cola de pilas.
     *
     * @return la primera pila de la estructura de cola de pilas.
     */
    Stack getFirst();
}
