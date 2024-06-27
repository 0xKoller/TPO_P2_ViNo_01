package org.example.model.ejercicios.BuilderApproach.Interfaces;


import org.example.model.ejercicios.BuilderApproach.StaticStack;

public interface IStaticStackBuilder {

    /**
     * Postcondicion: Apila (coloca en el tope) un valor.
     *
     * @param a valor a apilar.
     * @return la pila después de agregar el valor.
     */
    StaticStack add(int a);

    /**
     * Precondicion: La pila no esta vacia.
     * Postcondicion: Desapila (quita el tope).
     */
    void remove();

    /**
     * @return <code>true</code> si la pila esta vacia, <code>false</code> en otro caso.
     */
    boolean isEmpty();

    /**
     * @return tope de la pila
     */
    int getTop();
}
