package org.example.model.ejercicios.TDACustoms.Interfaces;

import org.example.model.definition.Set;

public interface IRMDictionary {

    /**
     * Postcondicion: Asocia la clave especificada con el valor especificado en el diccionario.
     *
     * @param key   clave a añadir.
     * @param value valor asociado a la clave.
     */
    void add(int key, int value);

    /**
     * Postcondicion: Elimina la asociación de la clave especificada con el valor especificado del diccionario, si existe.
     *
     * @param key   clave a eliminar.
     * @param value valor asociado a la clave a eliminar.
     */
    void remove(int key, int value);

    /**
     * Postcondicion: Devuelve un conjunto de todas las claves en el diccionario.
     *
     * @return un conjunto de todas las claves en el diccionario.
     */
    Set getKeys();

    /**
     * Postcondicion: Devuelve el valor asociado a la clave especificada en el diccionario.
     *
     * @param key clave cuyo valor se desea obtener.
     */
    Integer get(int key);
}
