package org.example;

import org.example.model.*;
import org.example.model.ejercicios.matrices.QueueOfStacks;

import static org.example.model.ejercicios.matrices.utilities.QueueOfStacksUtil.calcularTraza;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        stack1.add(1);
        stack1.add(1);
        stack1.add(1);

        stack2.add(1);
        stack2.add(1);
        stack2.add(1);

        stack3.add(1);
        stack3.add(1);
        stack3.add(1);

        QueueOfStacks queueOfStacks = new QueueOfStacks(3);
        queueOfStacks.addStack(stack1);
        queueOfStacks.addStack(stack2);
        queueOfStacks.addStack(stack3);
        int trace = calcularTraza(queueOfStacks);
        System.out.println(trace);

    }

}