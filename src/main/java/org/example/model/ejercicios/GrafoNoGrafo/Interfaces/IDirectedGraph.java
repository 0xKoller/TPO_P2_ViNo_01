package org.example.model.ejercicios.GrafoNoGrafo.Interfaces;

import java.util.List;


//Ni idea si esto esta bien.
public interface IDirectedGraph {
    void addEdge(int from, int to);
    List<Integer> getVertices();
    List<Integer> getAdjacentVertices(int vertex);
    boolean isDirected();
}
