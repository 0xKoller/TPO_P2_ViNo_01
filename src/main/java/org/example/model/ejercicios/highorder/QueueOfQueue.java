package org.example.model.ejercicios.highorder;

import java.util.ArrayList;
import java.util.List;

public class QueueOfQueue implements IQueueOfQueue {
    private List<Queue> listOfQueues;

    public QueueOfQueue() {
        this.listOfQueues = new ArrayList<>();
    }

    @Override
    public void acolar(Queue queue) {
        listOfQueues.add(queue);
    }

    @Override
    public Queue desacolar() {
        if (!listOfQueues.isEmpty()) {
            return listOfQueues.remove(0);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return listOfQueues.isEmpty();
    }

    @Override
    public int size() {
        return listOfQueues.size();
    }

    @Override
    public Queue flat() {
        return null;
    }
}
