package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericStack<Element> {

    /**
     * Postcondicion: Devuelve el elemento en el tope de la pila.
     *
     * @return el elemento en el tope de la pila.
     */
    Element getTop();

    /**
     * Postcondicion: Apila (añade) un elemento en el tope de la pila.
     *
     * @param item elemento a apilar.
     */
    void add(Element item);

    /**
     * Precondicion: La pila no está vacía.
     * Postcondicion: Desapila (quita) el elemento en el tope de la pila.
     */
    void remove();

    boolean isEmpty();

    /**
     * @return el tamaño actual de la pila.
     */
    int size();
}
