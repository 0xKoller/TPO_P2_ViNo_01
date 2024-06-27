package org.example.model.ejercicios.BuilderApproach.Interfaces;

import org.example.model.ejercicios.BuilderApproach.StaticQueue;

public interface IStaticQueueBuilder {
    /**
     * Postcondicion: Acola (coloca en el final de la cola) un valor.
     *
     * @param a valor a acolar.
     * @return la cola después de agregar el valor.
     */
    StaticQueue add(int a);

    /**
     * Precondicion: La cola no esta vacia.
     * Postcondicion: Desacola (quita el primer elemento).
     */
    void remove();

    /**
     * @return <code>true</code> si la cola esta vacia, <code>false</code> en otro caso.
     */
    boolean isEmpty();

    /**
     * @return Devuelve el primero.
     */
    int getFirst();
}
