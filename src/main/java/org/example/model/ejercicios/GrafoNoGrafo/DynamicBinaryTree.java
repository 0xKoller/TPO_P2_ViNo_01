package org.example.model.ejercicios.GrafoNoGrafo;

import org.example.model.ejercicios.GrafoNoGrafo.Interfaces.BinaryTree;

public class DynamicBinaryTree implements BinaryTree {

    private int root;
    private DynamicBinaryTree left;
    private DynamicBinaryTree right;

    public DynamicBinaryTree(int root) {
        this.root = root;
    }

    @Override
    public int getRoot() {
        return this.root;
    }

    @Override
    public BinaryTree getLeft() {
        return left;
    }

    @Override
    public BinaryTree getRight() {
        return right;
    }

    @Override
    public void addLeft(int a) {
        if(this.getLeft() != null) {
            throw new RuntimeException("No se puede agregar un hijo izquierdo porque ya existe");
        }
        this.left = new DynamicBinaryTree(a);
    }

    @Override
    public void addRight(int a) {
        if(this.getRight() != null) {
            throw new RuntimeException("No se puede agregar un hijo derecho porque ya existe");
        }
        this.right = new DynamicBinaryTree(a);
    }
}
