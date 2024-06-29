package org.example.model.ejercicios.Generic;

import org.example.model.ejercicios.Generic.Interfaces.IGenericQueue;
import org.example.model.ejercicios.Generic.Utilites.GenericStackUtilities;

public class Run {
    public static void main(String[] args) {
        System.out.println("Stack Generico");
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.add(0);
        intStack.add(1);

        GenericStack<String> strStack = new GenericStack<>();
        strStack.add("0");
        strStack.add("STRING");

        GenericStackUtilities genericStackUtils = new GenericStackUtilities();

        GenericStack<String> inverted = genericStackUtils.invert(strStack);
        System.out.println("Stack invertido de strings: " + genericStackUtils.print(inverted));

        IGenericQueue<Integer> intQueue = new GenericQueue<>();
        intQueue.add(0);
        intQueue.add(1);

        IGenericQueue<String> strQueue = new GenericQueue<>();
        strQueue.add("0");
        strQueue.add("STRING");

    }
}
