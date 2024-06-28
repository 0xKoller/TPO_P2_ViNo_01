package org.example.model.ejercicios.HighOrder.Utilities;

import org.example.model.definition.Queue;
import org.example.model.ejercicios.HighOrder.QueueOfQueue;
import org.example.model.utilities.QueueUtilities;

public class QueueOfQueueUtilities {

    public static QueueOfQueue copy(final QueueOfQueue qos) {
        QueueOfQueue aux1 = new QueueOfQueue();
        QueueOfQueue aux2 = new QueueOfQueue();

        while (!qos.isEmpty()) {
            aux1.add(QueueUtilities.copy(qos.getFirst()));
            aux2.add(QueueUtilities.copy(qos.getFirst()));
            qos.remove();
        }
        while (!aux1.isEmpty()) {
            qos.add(aux1.getFirst());
            aux1.remove();
        }
        return aux2;
    }

    public static void printQoQ(final QueueOfQueue qoq) {
        QueueOfQueue aux = copy(qoq);
        while (!aux.isEmpty()) {
            Queue queue = aux.getFirst();
            while (!queue.isEmpty()) {
                System.out.print(queue.getFirst() + " ");
                queue.remove();
            }
            aux.remove();
        }
    }
}
