package org.example.model.ejercicios.Algorithms.Monte.Interfaces;

import org.example.model.ejercicios.Algorithms.Monte.Coordinates;

public interface ISetOfCoordinates {
    void add(Coordinates a);

    void remove(Coordinates a);

    boolean isEmpty();

    Coordinates choose();
}
