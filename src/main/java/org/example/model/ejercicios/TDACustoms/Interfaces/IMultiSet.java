package org.example.model.ejercicios.TDACustoms.Interfaces;

public interface IMultiSet {

    /**
     * Postcondicion: Añade un elemento al multi-conjunto.
     *
     * @param a elemento a añadir.
     */
    void add(int a);

    /**
     * Postcondicion: Elimina una ocurrencia del elemento especificado del multi-conjunto, si existe.
     *
     * @param a elemento a eliminar.
     */
    void remove(int a);

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve un elemento arbitrario del multi-conjunto.
     *
     * @return un elemento arbitrario del multi-conjunto.
     */
    int choose();

    /**
     * Postcondicion: Devuelve la cantidad de ocurrencias del elemento especificado en el multi-conjunto.
     *
     * @param a elemento cuya cantidad se desea conocer.
     * @return la cantidad de ocurrencias del elemento en el multi-conjunto.
     */
    int count(int a);
}
