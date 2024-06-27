package org.example.model.ejercicios.Generic.Utilites;

import org.example.model.ejercicios.Generic.GenericStack;
import org.example.model.ejercicios.Generic.Interfaces.IGenericStack;

public class GenericStackUtilities<Element> {

    public GenericStack<Element> invert(IGenericStack<Element> stack) {
        GenericStack<Element> copy = copy(stack);
        GenericStack<Element> invertedStack = new GenericStack<>();
        while (!copy.isEmpty()) {
            invertedStack.add(copy.getTop());
            copy.remove();
        }
        return invertedStack;
    }

    public GenericStack<Element> copy(IGenericStack<Element> originalStack) {
        GenericStack<Element> aux1 = new GenericStack<>();
        GenericStack<Element> aux2 = new GenericStack<>();

        while (!originalStack.isEmpty()) {
            aux1.add(originalStack.getTop());
            aux2.add(originalStack.getTop());
            originalStack.remove();
        }
        while (!aux1.isEmpty()) {
            originalStack.add(aux1.getTop());
            aux1.remove();
        }
        while (!aux2.isEmpty()) {
            aux1.add(aux2.getTop());
            aux2.remove();
        }
        return aux1;
    }
}
