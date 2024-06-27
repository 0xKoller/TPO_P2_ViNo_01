package org.example.model.ejercicios.TDACustoms.Interfaces;

import org.example.model.definition.Set;

public interface IRMDictionary {

    void add(int key, int value);

    void remove(int key, int value);

    Set getKeys();

    Integer get(int key);
}