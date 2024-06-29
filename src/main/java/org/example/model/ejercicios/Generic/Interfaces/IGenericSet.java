package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericSet<Element> {

    /**
     * Postcondicion: Devuelve un elemento arbitrario del conjunto.
     *
     * @return un elemento arbitrario del conjunto.
     */
    Element choose();

    /**
     * Postcondicion: Añade un elemento al conjunto.
     *
     * @param item elemento a añadir.
     */
    void add(Element item);

    /**
     * Postcondicion: Elimina un elemento del conjunto si está presente.
     *
     * @param item elemento a eliminar.
     */
    void remove(Element item);

    boolean isEmpty();

    /**
     * @return el tamaño actual del conjunto.
     */
    int size();
}

