package org.example.model.ejercicios.HighOrder;

public interface IQueueOfQueue {
    void acolar(Queue queue);

    /**
     * Remueve y devuelve la primera cola de la QueueOfQueue.
     * @return la primera cola de la QueueOfQueue
     */
    Queue desacolar();

    /**
     * Devuelve true si la QueueOfQueue está vacía, false de lo contrario.
     * @return true si la QueueOfQueue está vacía, false de lo contrario
     */
    boolean isEmpty();

    /**
     * Devuelve el tamaño de la QueueOfQueue.
     * @return el tamaño de la QueueOfQueue
     */
    int size();

    Queue flat();
}
