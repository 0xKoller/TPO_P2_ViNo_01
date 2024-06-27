package org.example.model.ejercicios.GrafoNoGrafo;

import org.example.model.ejercicios.GrafoNoGrafo.Interfaces.IDirectedGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Grafo dirigido, no se que tan bien esta.
public class DirectedGraph implements IDirectedGraph {
    private final Map<Integer, List<Integer>> adjList = new HashMap<>();
    private final boolean directed = true;

    @Override
    public void addEdge(int from, int to) {
        adjList.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
    }

    @Override
    public List<Integer> getVertices() {
        return new ArrayList<>(adjList.keySet());
    }

    @Override
    public List<Integer> getAdjacentVertices(int vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }

    @Override
    public boolean isDirected() {
        return directed;
    }
}
