package org.example.model.ejercicios.HighOrder.Interface;

import org.example.model.definition.Queue;
import org.example.model.ejercicios.HighOrder.QueueOfQueue;

public interface IQueueOfQueue {

    /**
     * Postcondicion: Añade una cola de colas a la estructura.
     *
     * @param queueOfQueue cola de colas a añadir.
     */
    void add(Queue queueOfQueue);

    /**
     * Precondicion: La estructura no está vacía.
     * Postcondicion: Elimina la primera cola de la estructura.
     */
    void remove();

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve la primera cola de la estructura.
     *
     * @return la primera cola de la estructura.
     */
    Queue getFirst();

    /**
     * Postcondicion: Devuelve una cola plana que contiene todos los elementos de la estructura.
     *
     * @return una cola plana que contiene todos los elementos de la estructura.
     */
    Queue flat();

    /**
     * Postcondicion: Concatena varias estructuras de colas en una sola estructura de colas.
     *
     * @param queueOfQueues estructuras de colas a concatenar.
     * @return la estructura de colas resultante después de concatenar.
     */
    QueueOfQueue concatenate(QueueOfQueue... queueOfQueues);

    /**
     * Postcondicion: Invierte el orden de las colas en la estructura.
     *
     * @return la estructura de colas invertida.
     */
    QueueOfQueue reverse();
}
