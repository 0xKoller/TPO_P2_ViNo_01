package org.example.model.ejercicios.GrafoNoGrafo.Utilities;

import org.example.model.definition.PriorityQueue;
import org.example.model.dynamic.DynamicPriorityQueue;

public class PriorityQueueUtilities {
    public static PriorityQueue copy(final PriorityQueue queue) {
        final PriorityQueue aux1 = new DynamicPriorityQueue();
        final PriorityQueue aux2 = new DynamicPriorityQueue();

        while (!queue.isEmpty()) {
            final int value = queue.getFirst();
            final int priority = queue.getPriority();
            aux1.add(value, priority);
            aux2.add(value, priority);
            queue.remove();
        }
        while (!aux1.isEmpty()) {
            queue.add(aux1.getFirst(), aux1.getPriority());
            aux1.remove();
        }
        return aux2;
    }

    public static String print(final PriorityQueue queue) {
        final PriorityQueue aux = copy(queue);
        String string = "[";
        while (!aux.isEmpty()) {
            if ("[".equals(string)) {
                string += "(" + aux.getFirst() + ", " + aux.getPriority() + ")";
            } else {
                string += ", (" + aux.getFirst() + ", " + aux.getPriority() + ")";
            }
            aux.remove();
        }
        string += "]";
        return string;
    }

    public static PriorityQueue editQueue(final PriorityQueue queue, final int value, final int op, final int np) {
        final int diff = np - op;
        PriorityQueue aux = copy(queue);
        if (aux.isEmpty()) {
            throw new RuntimeException("Cola vacía.");
        }
        int index = 0;
        int counter = 0;
        boolean check = false;
        while (!aux.isEmpty()) {
            if (aux.getFirst() == value && aux.getPriority() == op && !check) {
                index = counter;
                check = true;
            }
            aux.remove();
            counter++;
        }
        if (!check) {
            throw new RuntimeException("No se encuentra el valor a intercambiar.");
        }
        if (diff == 0) {
            return PriorityQueueUtilities.copy(queue);
        }
        counter = 0;
        aux = copy(queue);
        final PriorityQueue newQueue = new DynamicPriorityQueue();
        while (!aux.isEmpty()) {
            final int valor = aux.getFirst();
            int prioridad = aux.getPriority();
            if (diff > 0 && counter >= index) {
                prioridad += diff;
            } else if (diff < 0 && counter <= index) {
                prioridad += diff;
            }
            counter++;
            newQueue.add(valor, prioridad);
            aux.remove();
        }
        return newQueue;
    }
}
