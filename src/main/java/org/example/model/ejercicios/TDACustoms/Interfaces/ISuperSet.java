package org.example.model.ejercicios.TDACustoms.Interfaces;

import org.example.model.normal.StaticSet;

public interface ISuperSet {

    void add(int a);

    void remove(int a);

    boolean isEmpty();

    int choose();

    boolean isSuperSet(StaticSet set);

    StaticSet complement(StaticSet set);
}
