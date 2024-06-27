package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericQueue<Element> {

    Element getFirst();
    void add(Element item);

    void remove();

    boolean isEmpty();

    int size();
}
