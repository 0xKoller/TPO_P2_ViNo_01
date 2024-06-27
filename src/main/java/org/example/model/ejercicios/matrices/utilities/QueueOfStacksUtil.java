package org.example.model.ejercicios.matrices.utilities;

import org.example.model.definition.Queue;
import org.example.model.definition.Stack;
import org.example.model.ejercicios.matrices.QueueOfStacks;
import org.example.model.normal.StaticStack;

public class QueueOfStacksUtil {
    public static int calcularTraza(QueueOfStacks queueOfStacks) {
        int trace = 0;
        Queue queue = queueOfStacks.getQueueOfStacks();
        if (queue.size() != queueOfStacks.size()) {
            throw new RuntimeException("El número de pilas en la cola no coincide con el tamaño de la cola de pilas.");
        }
        int n = queueOfStacks.getN();
        // Iterar sobre cada pila en la cola
        while (!queue.isEmpty()) {
            Stack stack = queue.removeStack();
            trace += stack.getTop();
            // Desapilar
            for (int i = 0; i < n - 1; i++) {
                stack.remove();
            }
        }

        return trace;
    }

    public static QueueOfStacks calcularTraspuesta(QueueOfStacks queueOfStacks) {
        Queue queue = queueOfStacks.getQueueOfStacks();
        int n = queueOfStacks.getN();

        if (queue.size() != n) {
            throw new RuntimeException("El número de pilas en la cola no coincide con el tamaño de la cola de pilas.");
        }

        QueueOfStacks transposedQueueOfStacks = new QueueOfStacks(n);

        while (!queue.isEmpty()) {
            StaticStack stack = queue.removeStack();
            if (stack.size() != n) {
                throw new RuntimeException("Cada pila debe tener exactamente " + n + " elementos.");
            }
            StaticStack transposedStack = new StaticStack();
            for (int i = 0; i < n; i++) {
                transposedStack.add(stack.getTop());
                stack.remove();
            }
            transposedQueueOfStacks.addStack(transposedStack);
        }

        return transposedQueueOfStacks;
    }
    public static QueueOfStacks sumarMatrices(QueueOfStacks matrix1, QueueOfStacks matrix2) {
        Queue queue1 = matrix1.getQueueOfStacks();
        Queue queue2 = matrix2.getQueueOfStacks();
        int n = matrix1.getN();

        if (queue1.size() != queue2.size() || queue1.size() != n) {
            throw new RuntimeException("Las matrices deben tener el mismo tamaño y número de pilas.");
        }

        QueueOfStacks sumQueueOfStacks = new QueueOfStacks(n);

        while (!queue1.isEmpty()) {
            Stack stack1 = queue1.removeStack();
            Stack stack2 = queue2.removeStack();
            if (stack1.size() != n || stack2.size() != n) {
                throw new RuntimeException("Cada pila debe tener exactamente " + n + " elementos.");
            }
            Stack sumStack = new Stack();
            for (int i = 0; i < n; i++) {
                sumStack.add(stack1.getTop() + stack2.getTop());
                stack1.remove();
                stack2.remove();
            }
            sumQueueOfStacks.addStack(sumStack);
        }

        return sumQueueOfStacks;
    }
}
