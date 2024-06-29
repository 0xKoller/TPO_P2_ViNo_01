package org.example.model.ejercicios.Matrix.Utilities;

import org.example.model.definition.Stack;
import org.example.model.ejercicios.Matrix.QueueOfStacks;
import org.example.model.normal.StaticStack;
import org.example.model.utilities.StackUtilities;

import static org.example.model.utilities.StackUtilities.invert;
import static org.example.model.utilities.StackUtilities.size;

public class QueueOfStacksUtilities {

    public static int calculateTrace(final QueueOfStacks queueOfStacks) {
        if (queueOfStacks.isEmpty()) {
            throw new RuntimeException("La matriz está vacía.");
        }

        int trace = 0;
        boolean isSymmetric = true;
        QueueOfStacks aux1 = new QueueOfStacks();
        QueueOfStacks aux2 = QueueOfStacksUtilities.copy(queueOfStacks);
        int columns = 0;
        int rows = 0;

        // Calcula propiedades de la matriz y verifica simetría
        while (!aux2.isEmpty()) {
            Stack column = aux2.getFirst();
            aux1.add(StackUtilities.copy(column));
            aux2.remove();
            int countedRows = 0;

            while (!column.isEmpty()) {
                column.remove();
                countedRows++;
            }

            if (rows != 0 && countedRows != rows) {
                isSymmetric = false;
            }

            rows = countedRows;
            columns++;
        }

        if (!isSymmetric || rows != columns) {
            throw new RuntimeException("La matriz ingresada no es simétrica.");
        }

        // Calcula la traza sumando los elementos de la diagonal principal
        for (int i = 0; i < columns; i++) {
            QueueOfStacks aux = QueueOfStacksUtilities.copy(queueOfStacks);
            for (int j = 0; j < i; j++) {
                aux.remove();
            }
            Stack row = aux.getFirst();
            for (int k = 0; k < i; k++) {
                row.remove();
            }
            trace += (int) row.getTop();
        }

        return trace;
    }

    public static QueueOfStacks traspuesta(final QueueOfStacks qos) {
        // Precondición: la matriz no debe estar vacía
        if (qos.isEmpty()) {
            throw new RuntimeException("Matriz vacía");
        }

        int size = 0;
        int max = 0;
        QueueOfStacks aux1;
        QueueOfStacks traspuesta = new QueueOfStacks();
        QueueOfStacks aux2 = copy(qos);

        // Calcula la matriz traspuesta
        while (!aux2.isEmpty()) {
            int range = 0;
            Stack aux3 = aux2.getFirst();
            Stack aux4 = new StaticStack();

            // Invierte cada fila de la matriz
            while (!aux3.isEmpty()) {
                aux4.add(aux3.getTop());
                aux3.remove();
                range++;
            }

            while (!aux4.isEmpty()) {
                aux3.add(aux4.getTop());
                aux4.remove();
            }

            if (range > max) {
                max = range;
            }
            aux2.remove();
            size++;
        }

        // Construye la matriz traspuesta
        for (int i = 0; i < max; i++) {
            aux1 = copy(qos);
            Stack transposeStack = new StaticStack();
            for (int j = 0; j < size; j++) {
                Integer element = null;
                final Stack temp = new StaticStack();
                final Stack actualStack = aux1.getFirst();
                while (!actualStack.isEmpty()) {
                    int value = actualStack.getTop();
                    actualStack.remove();
                    temp.add(value);
                    if (size(temp) == i + 1) {
                        element = value;
                    }
                }
                while (!temp.isEmpty()) {
                    actualStack.add(temp.getTop());
                    temp.remove();
                }
                if (element == null) {
                    transposeStack.add(0);
                } else {
                    transposeStack.add(element);
                }
                aux1.remove();
                aux1.add(actualStack);
            }
            traspuesta.add(transposeStack);
        }
        return traspuesta;
    }

    public static QueueOfStacks matrixSum(final QueueOfStacks qos1, final QueueOfStacks qos2) {
        QueueOfStacks aux1 = copy(qos1);
        QueueOfStacks aux2 = copy(qos2);
        QueueOfStacks result = new QueueOfStacks();

        // Suma elemento a elemento de las matrices
        while (!aux1.isEmpty() && !aux2.isEmpty()) {
            Stack auxS1 = aux1.getFirst();
            Stack auxS2 = aux2.getFirst();
            Stack resultS = new StaticStack();

            while (!auxS1.isEmpty() && !auxS2.isEmpty()) {
                resultS.add(auxS1.getTop() + auxS2.getTop());
                auxS1.remove();
                auxS2.remove();
            }

            resultS = invert(resultS);
            result.add(resultS);
            aux1.remove();
            aux2.remove();
        }

        return result;
    }

    public static QueueOfStacks copy(final QueueOfStacks queueOfStacks) {
        final QueueOfStacks aux1 = new QueueOfStacks();
        final QueueOfStacks aux2 = new QueueOfStacks();

        // Copia cada elemento de la matriz original a la matriz auxiliar
        while (!queueOfStacks.isEmpty()) {
            aux1.add(StackUtilities.copy(queueOfStacks.getFirst()));
            aux2.add(StackUtilities.copy(queueOfStacks.getFirst()));
            queueOfStacks.remove();
        }

        // Restaura la matriz original
        while (!aux1.isEmpty()) {
            queueOfStacks.add(aux1.getFirst());
            aux1.remove();
        }
        return aux2;
    }

    public static void print(final QueueOfStacks qos) {
        final QueueOfStacks aux = copy(qos);

        // Imprime cada fila de la matriz
        while (!aux.isEmpty()) {
            final Stack stack = aux.getFirst();
            while (!stack.isEmpty()) {
                System.out.print(stack.getTop() + " ");
                stack.remove();
            }
            System.out.println();
            aux.remove();
        }
    }
}

