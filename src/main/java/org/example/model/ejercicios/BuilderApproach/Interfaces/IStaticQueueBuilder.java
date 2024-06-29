package org.example.model.ejercicios.BuilderApproach.Interfaces;

import org.example.model.ejercicios.BuilderApproach.StaticQueue;

public interface IStaticQueueBuilder {

    /**
     * Postcondicion: Acola (coloca en el final de la cola) un valor.
     *
     * @param a valor a acolar.
     * @return la cola actualizada después de agregar el valor.
     */
    StaticQueue add(int a);

    /**
     * Precondicion: La cola no está vacía.
     * Postcondicion: Desacola (quita el primer elemento) de la cola.
     */
    void remove();

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve el primer elemento de la cola.
     *
     * @return el primer elemento de la cola.
     */
    int getFirst();
}
