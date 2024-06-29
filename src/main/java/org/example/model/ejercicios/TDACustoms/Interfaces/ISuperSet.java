package org.example.model.ejercicios.TDACustoms.Interfaces;

import org.example.model.normal.StaticSet;

public interface ISuperSet {

    /**
     * Postcondicion: Añade un elemento al superconjunto.
     *
     * @param a elemento a añadir.
     */
    void add(int a);

    /**
     * Postcondicion: Elimina un elemento del superconjunto, si existe.
     *
     * @param a elemento a eliminar.
     */
    void remove(int a);

    boolean isEmpty();

    /**
     * Postcondicion: Devuelve un elemento arbitrario del superconjunto.
     *
     * @return un elemento arbitrario del superconjunto.
     */
    int choose();

    /**
     * Postcondicion: Verifica si el superconjunto contiene todos los elementos del conjunto dado.
     *
     * @param set conjunto a verificar.
     */
    boolean isSuperSet(StaticSet set);

    /**
     * Postcondicion: Devuelve el complemento del superconjunto con respecto al conjunto dado.
     *
     * @param set conjunto respecto al cual se desea obtener el complemento.
     * @return el complemento del superconjunto con respecto a <code>set</code>.
     */
    StaticSet complement(StaticSet set);
}
