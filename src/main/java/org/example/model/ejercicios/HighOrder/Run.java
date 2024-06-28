package org.example.model.ejercicios.HighOrder;


import org.example.model.definition.Queue;
import org.example.model.normal.StaticQueue;

import static org.example.model.ejercicios.HighOrder.Utilities.QueueOfQueueUtilities.printQoQ;
import static org.example.model.utilities.QueueUtilities.print;


public class Run {
    public static void main(String[] args) {

        QueueOfQueue qoq = new QueueOfQueue();
        Queue aux1 = new StaticQueue();
        aux1.add(0);
        aux1.add(1);
        aux1.add(2);
        Queue aux2 = new StaticQueue();
        aux2.add(10);
        aux2.add(11);
        aux2.add(12);
        qoq.add(aux1);
        qoq.add(aux2);
        QueueOfQueue qoqAux = new QueueOfQueue();

        Queue aux3 = new StaticQueue();
        aux3.add(1111);
        aux3.add(2222);
        aux3.add(3333);

        Queue aux4 = new StaticQueue();
        aux4.add(44444);
        aux4.add(55555);
        aux4.add(6666);
        qoqAux.add(aux3);
        qoqAux.add(aux4);
        QueueOfQueue resultConcat = new QueueOfQueue();
        QueueOfQueue concatenatedResult = resultConcat.concatenate(qoq, qoqAux);
        System.out.println("Concatenate");
        printQoQ(concatenatedResult);
        System.out.println();


        QueueOfQueue qoqAux2 = new QueueOfQueue();
        qoqAux2.add(aux1);
        qoqAux2.add(aux2);
        qoqAux2.add(aux3);
        qoqAux2.add(aux4);
        Queue flatted = qoqAux2.flat();
        System.out.println("Flat");
        print(flatted);
        System.out.println();
        System.out.println("========================");

        System.out.println("Reverse");
        QueueOfQueue qoqAux3 = new QueueOfQueue();
        qoqAux3.add(aux3);
        qoqAux3.add(aux4);
        QueueOfQueue reversed = qoqAux3.reverse();
        printQoQ(reversed);
        System.out.println();
    }
}
