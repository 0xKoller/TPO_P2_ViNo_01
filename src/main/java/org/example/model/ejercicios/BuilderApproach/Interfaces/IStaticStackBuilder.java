package org.example.model.ejercicios.BuilderApproach.Interfaces;

import org.example.model.ejercicios.BuilderApproach.StaticStack;

public interface IStaticStackBuilder {

    /**
     * Postcondicion: Apila (coloca en el tope) un valor.
     *
     * @param a valor a apilar.
     * @return la pila actualizada después de agregar el valor.
     */
    StaticStack add(int a);

    /**
     * Precondicion: La pila no está vacía.
     * Postcondicion: Desapila (quita el tope) de la pila.
     */
    void remove();

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve el valor en el tope de la pila.
     *
     * @return el valor en el tope de la pila.
     */
    int getTop();
}
