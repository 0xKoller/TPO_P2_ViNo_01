package org.example.model.ejercicios.Algorithms.Monte.Interfaces;

import org.example.model.ejercicios.Algorithms.Monte.Coordinates;

public interface ISetOfCoordinates {
    /**
     * Postcondicion: Agrega una coordenada a la estructura.
     *
     * @param a coordenada a agregar.
     */
    void add(Coordinates a);

    /**
     * Precondicion: La coordenada a remover está presente en la estructura.
     * Postcondicion: Remueve una coordenada de la estructura.
     *
     * @param a coordenada a remover.
     */
    void remove(Coordinates a);

    boolean isEmpty();

    /**
     * Postcondicion: Elige y devuelve una coordenada de la estructura.
     *
     * @return coordenada elegida.
     */
    Coordinates choose();
}
