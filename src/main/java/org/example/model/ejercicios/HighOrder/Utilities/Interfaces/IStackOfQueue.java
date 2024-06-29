package org.example.model.ejercicios.HighOrder.Utilities.Interfaces;

import org.example.model.definition.Queue;

public interface IStackOfQueue {

    /**
     * Postcondicion: Añade una cola a la estructura de pila de colas.
     *
     * @param queue cola a añadir.
     */
    void add(Queue queue);

    /**
     * Precondicion: La estructura de pila de colas no está vacía.
     * Postcondicion: Elimina la cola en el tope de la estructura.
     */
    void remove();

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve la cola en el tope de la estructura.
     *
     * @return la cola en el tope de la estructura.
     */
    Queue getTop();
}
