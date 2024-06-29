package org.example.model.ejercicios.PriorityQueueEditable.Utilities;

import org.example.model.definition.PriorityQueue;
import org.example.model.dynamic.DynamicPriorityQueue;


public class PriorityQueueUtilities {

    public static PriorityQueue copy(final PriorityQueue queue) {
        final PriorityQueue aux = new DynamicPriorityQueue();
        final PriorityQueue result = new DynamicPriorityQueue();

        while (!queue.isEmpty()) {
            final int value = queue.getFirst();
            final int priority = queue.getPriority();
            aux.add(value, priority);
            result.add(value, priority);
            queue.remove();
        }

        while (!aux.isEmpty()) {
            queue.add(aux.getFirst(), aux.getPriority());
            aux.remove();
        }

        return result;
    }


    public static String print(final PriorityQueue queue) {
        final PriorityQueue aux = copy(queue);
        String result = "[";
        boolean firstElement = true;

        while (!aux.isEmpty()) {
            if (!firstElement) {
                result += ", ";
            }
            firstElement = false;

            result += "(" + aux.getFirst() + ", " + aux.getPriority() + ")";
            aux.remove();
        }

        result += "]";
        return result;
    }


    public static PriorityQueue editQueue(final PriorityQueue queue, final int value, final int op, final int np) {
        final int diff = np - op;
        final PriorityQueue newQueue = new DynamicPriorityQueue();
        boolean found = false;
        int index = 0;

        // Recorre la cola original para encontrar y marcar el elemento a modificar
        while (!queue.isEmpty()) {
            final int val = queue.getFirst();
            final int prio = queue.getPriority();

            if (val == value && prio == op && !found) {
                found = true;
            }

            newQueue.add(val, prio);
            queue.remove();

            if (!found) {
                index++;
            }
        }

        if (!found) {
            throw new RuntimeException("No se encuentra el valor a intercambiar.");
        }

        if (diff == 0) {
            return copy(newQueue);
        }

        // Ajusta la prioridad del elemento encontrado
        for (int i = 0; i < newQueue.size(); i++) {
            final int val = newQueue.getFirst();
            final int prio = newQueue.getPriority();

            if (i == index) {
                newQueue.add(val, prio + diff);
            } else {
                newQueue.add(val, prio);
            }
            newQueue.remove();
        }

        return newQueue;
    }

}

