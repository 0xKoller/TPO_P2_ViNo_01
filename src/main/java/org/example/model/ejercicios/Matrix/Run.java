package org.example.model.ejercicios.Matrix;

import org.example.model.definition.Stack;
import org.example.model.ejercicios.Matrix.Utilities.QueueOfStacksUtilities;
import org.example.model.normal.StaticStack;

import static org.example.model.ejercicios.Matrix.Utilities.QueueOfStacksUtilities.print;

public class Run {
    public static void main(String[] args) {
        Stack s1 = new StaticStack();
        Stack s2 = new StaticStack();
        QueueOfStacks qos = new QueueOfStacks();
        System.out.println("Cargando pilas...");
        s1.add(1);
        s1.add(2);
        s2.add(3);
        s2.add(4);
        System.out.println("Cargando colas...");
        qos.add(s1);
        qos.add(s2);
        print(qos);
        int trace = QueueOfStacksUtilities.calculateTrace(qos);
        System.out.println("Valor de la traza: " + trace);
        System.out.println("==============================");
        QueueOfStacks traspuesta = QueueOfStacksUtilities.traspuesta(qos);
        System.out.println("Matrix traspuesta");
        print(traspuesta);
        System.out.println("==============================");
        QueueOfStacks sumaMatricialResult = QueueOfStacksUtilities.matrixSum(qos, qos);
        System.out.println("Suma de matrices");
        print(sumaMatricialResult);
    }
}
