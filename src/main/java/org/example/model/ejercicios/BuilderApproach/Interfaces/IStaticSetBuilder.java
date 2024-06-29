package org.example.model.ejercicios.BuilderApproach.Interfaces;

import org.example.model.ejercicios.BuilderApproach.StaticSet;

public interface IStaticSetBuilder {

    /**
     * Postcondicion: Agrega un elemento al conjunto.
     *
     * @param a elemento a agregar.
     * @return instancia de IStaticSetBuilder actualizada.
     */
    IStaticSetBuilder add(int a);

    /**
     * Postcondicion: Quita el elemento indicado si existe en el conjunto, de lo contrario no hace nada.
     *
     * @param a valor a quitar.
     */
    void remove(int a);

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve un elemento arbitrario del conjunto.
     *
     * @return elemento arbitrario del conjunto.
     */
    int choose();

    /**
     * Postcondicion: Agrega todos los elementos de otro conjunto al conjunto actual.
     *
     * @param otherSet conjunto con los elementos a agregar.
     * @return el conjunto actualizado después de agregar los valores.
     */
    StaticSet addAll(StaticSet otherSet);
}
