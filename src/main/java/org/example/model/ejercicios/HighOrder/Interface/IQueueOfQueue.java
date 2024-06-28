package org.example.model.ejercicios.HighOrder.Interface;

import org.example.model.definition.Queue;
import org.example.model.ejercicios.HighOrder.QueueOfQueue;

public interface IQueueOfQueue {

    void add(Queue queueOfQueue);

    void remove();

    boolean isEmpty();

    Queue getFirst();

    Queue flat();
    QueueOfQueue concatenate(QueueOfQueue... queueOfQueues);
    QueueOfQueue reverse();
}
