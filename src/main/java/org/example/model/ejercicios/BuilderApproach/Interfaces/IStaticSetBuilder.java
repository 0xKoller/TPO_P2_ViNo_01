package org.example.model.ejercicios.BuilderApproach.Interfaces;


import org.example.model.definition.Set;
import org.example.model.ejercicios.BuilderApproach.StaticSet;

public interface IStaticSetBuilder {

    IStaticSetBuilder add(int a);

    /**
     * Postcondicion: Quita el elemento indicado si existe, de lo contrario no hace nada.
     *
     * @param a valor a quitar.
     */
    void remove(int a);

    /**
     * @return <code>true</code> si es el conjunto vacio, <code>false</code> en otro caso.
     */
    boolean isEmpty();

    /**
     * @return elemento arbitrario del conjunto.
     */
    int choose();

    /**
     * Postcondicion: Agrega todos los elementos de otro conjunto.
     *
     * @param otherSet conjunto con los elementos a agregar.
     * @return el conjunto después de agregar los valores.
     */
    StaticSet addAll(StaticSet otherSet);
}
