package org.example.model.ejercicios.HighOrder;

import org.example.model.definition.Queue;
import org.example.model.ejercicios.HighOrder.Interface.IQueueOfQueue;
import org.example.model.normal.StaticQueue;
import static org.example.model.ejercicios.HighOrder.Utilities.QueueOfQueueUtilities.copy;

public class QueueOfQueue implements IQueueOfQueue {
    private static final int MAX = 10;
    private final Queue[] arrayQueue;
    private int count;

    public QueueOfQueue() {
        arrayQueue = new Queue[MAX];
        count = 0;
    }

    public void add(Queue queue) {
        if (count == MAX) {
            throw new RuntimeException("Limite alcanzado.");
        }
        arrayQueue[count++] = queue;

    }

    public void remove() {
        if (this.isEmpty()) {
            throw new RuntimeException("Cola vacía");
        }
        for (int i = 0; i < count - 1; i++) {
            arrayQueue[i] = arrayQueue[i + 1];
        }
        count--;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public Queue getFirst() {
        if (this.isEmpty()) {
            throw new RuntimeException("No se puede obtener la primer pila de una cola vacía");
        }
        return arrayQueue[0];
    }

    public QueueOfQueue concatenate(QueueOfQueue... queueOfQueues) {
        QueueOfQueue result = new QueueOfQueue();
        for (int i = 0; i < queueOfQueues.length; i++) {
            QueueOfQueue aux1 = copy(queueOfQueues[i]);
            if (aux1.isEmpty()) {
                continue;
            }
            while (!aux1.isEmpty()) {
                Queue aux2 = aux1.getFirst();
                result.add(aux2);
                aux1.remove();
            }
        }
        return result;
    }

    public Queue flat() {
        QueueOfQueue aux = copy(this);
        Queue result = new StaticQueue();

        while (!aux.isEmpty()) {
            Queue queue = aux.getFirst();
            while (!queue.isEmpty()) {
                result.add(queue.getFirst());
                queue.remove();
            }
            aux.remove();
        }
        return result;
    }

    // Como hay repeticiones, se puede utilizar recursividad
    public QueueOfQueue reverse() {
        final QueueOfQueue reversedQoQ = new QueueOfQueue();
        reverseRecursive(this, reversedQoQ);
        return reversedQoQ;
    }

    private void reverseRecursive(final QueueOfQueue original, final QueueOfQueue reversed) {
        if (original.isEmpty()) {
            return;
        }
        final Queue queue = original.getFirst();
        original.remove();
        reverseRecursive(original, reversed);
        reversed.add(queue);
    }

}
