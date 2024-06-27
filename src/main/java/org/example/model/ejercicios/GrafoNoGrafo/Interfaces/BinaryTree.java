package org.example.model.ejercicios.GrafoNoGrafo.Interfaces;

public interface BinaryTree {

    int getRoot();
    BinaryTree getLeft();
    BinaryTree getRight();

    /**
     * Precondicion: No se puede agregar un hijo izquierdo si ya existe.
     * @param a, valor que contendrá el nodo raíz del hijo izquierdo
     */
    void addLeft(int a);

    /**
     * Precondicion: No se puede agregar un hijo derecho si ya existe.
     * @param a, valor que contendrá el nodo raíz del hijo derecho
     */
    void addRight(int a);


}
