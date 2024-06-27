package org.example.model.ejercicios.GrafoNoGrafo;

import org.example.model.definition.PriorityQueue;
import org.example.model.dynamic.DynamicPriorityQueue;
import org.example.model.ejercicios.GrafoNoGrafo.Utilities.PriorityQueueUtilities;

public class Run {
    public static void main(String[] args) {
        PriorityQueue queue = new DynamicPriorityQueue();
        queue.add(0, 1);
        queue.add(1, 1);
        queue.add(2, 2);
        queue.add(3, 3);
        PriorityQueue newQueue = PriorityQueueUtilities.editQueue(queue, 1, 1, 5);
        System.out.println("Cola con prioridad vieja");
        System.out.println(PriorityQueueUtilities.print(queue));
        System.out.println("======================================");
        System.out.println("Cola con prioridad EDITED");
        System.out.println(PriorityQueueUtilities.print(newQueue));
    }
}
