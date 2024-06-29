package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericQueueWithPriority<Value, Priority> {

    /**
     * Postcondicion: Devuelve el primer valor de la cola.
     *
     * @return el primer valor de la cola.
     */
    Value getFirst();

    /**
     * Postcondicion: Devuelve la prioridad del primer valor de la cola.
     *
     * @return la prioridad del primer valor de la cola.
     */
    Priority getPriority();

    /**
     * Postcondicion: Añade un valor con su respectiva prioridad a la cola.
     *
     * @param item     valor a añadir.
     * @param priority prioridad del valor a añadir.
     */
    void add(Value item, Priority priority);

    /**
     * Precondicion: La cola no está vacía.
     * Postcondicion: Elimina el primer elemento de la cola.
     */
    void remove();

    boolean isEmpty();

    /**
     * @return el tamaño actual de la cola.
     */
    int size();
}
