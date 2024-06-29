package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericQueue<Element> {

    /**
     * Postcondicion: Devuelve el primer elemento de la cola.
     *
     * @return el primer elemento de la cola.
     */
    Element getFirst();

    /**
     * Postcondicion: Añade un elemento al final de la cola.
     *
     * @param item elemento a añadir.
     */
    void add(Element item);

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
