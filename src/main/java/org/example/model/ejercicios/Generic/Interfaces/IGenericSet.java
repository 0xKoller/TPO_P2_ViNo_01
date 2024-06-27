package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericSet<Element> {

    Element choose();

    void add(Element item);

    void remove(Element item);

    boolean isEmpty();

    int size();
}
