package org.example.model.ejercicios.BuilderApproach;

import static org.example.model.utilities.StackUtilities.print;
import static org.example.model.utilities.SetUtilities.print;
import static org.example.model.utilities.QueueUtilities.print;

public class Run {
    public static void main(String[] args) {
        // Uso sin encadenar
        StaticStack stack1 = new StaticStack();
        stack1.add(1);
        stack1.add(2);
        stack1.add(3);

        // Uso encadenado
        StaticStack stack2 = new StaticStack().add(4).add(5).add(6);

        // Uso combinado
        StaticStack stack3 = new StaticStack();
        stack3.add(7).add(8);
        stack3.add(9);

        // Imprime los elementos de stack1
        System.out.println("Elementos en stack1:");
        while (!stack1.isEmpty()) {
            System.out.print(stack1.getTop() + " ");
            stack1.remove();
        }

        // Imprime los elementos de stack2
        System.out.println("\nElementos en stack2:");
        while (!stack2.isEmpty()) {
            System.out.print(stack2.getTop() + " ");
            stack2.remove();
        }

        // Imprime los elementos de stack3
        System.out.println("\nElementos en stack3:");
        while (!stack3.isEmpty()) {
            System.out.print(stack3.getTop() + " ");
            stack3.remove();
        }

        System.out.println("==============================");
        StaticSet set1 = new StaticSet().add(1).add(2).add(3).add(4).add(5);
        StaticSet set2 = new StaticSet().addAll(set1).add(1).add(10);

        // Imprime los elementos de set1
        System.out.println("Elementos en set1:");
        for (int i = 0; i < 5; i++) {
            System.out.print(set1.choose() + " ");
        }

        // Imprime los elementos de set2
        System.out.println("\nElementos en set2:");
        for (int i = 0; i < 7; i++) {
            System.out.print(set2.choose() + " ");
        }

        // Uso sin encadenar
        StaticQueue queue1 = new StaticQueue();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);

        // Uso encadenado
        StaticQueue queue2 = new StaticQueue().add(4).add(5).add(6);

        // Uso combinado
        StaticQueue queue3 = new StaticQueue();
        queue3.add(7).add(8);
        queue3.add(9);

        System.out.println("==============================");
        System.out.println("Elementos en queue1:");
        while (!queue1.isEmpty()) {
            System.out.print(queue1.getFirst() + " ");
            queue1.remove();
        }

        System.out.println("\nElementos en queue2:");
        while (!queue2.isEmpty()) {
            System.out.print(queue2.getFirst() + " ");
            queue2.remove();
        }

        System.out.println("\nElementos en queue3:");
        while (!queue3.isEmpty()) {
            System.out.print(queue3.getFirst() + " ");
            queue3.remove();
        }
    }
}
