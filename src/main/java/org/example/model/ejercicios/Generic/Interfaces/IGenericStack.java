package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericStack<Element> {
    Element getTop();
    void add(Element item);
    void remove();
    boolean isEmpty();
    int size();
}