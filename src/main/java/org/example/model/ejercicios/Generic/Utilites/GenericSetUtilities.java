package org.example.model.ejercicios.Generic.Utilites;

import org.example.model.ejercicios.Generic.GenericSet;
import org.example.model.ejercicios.Generic.Interfaces.IGenericSet;

public class GenericSetUtilities<Element> {

    public GenericSet<Element> copy(IGenericSet<Element> original) {
        GenericSet<Element> aux1 = new GenericSet<>();
        GenericSet<Element> aux2 = new GenericSet<>();

        while (!original.isEmpty()) {
            Element obj = original.choose();
            aux1.add(obj);
            aux2.add(obj);
            original.remove(obj);
        }

        while (!aux2.isEmpty()) {
            Element obj = aux2.choose();
            original.add(obj);
            aux2.remove(obj);
        }

        return aux1;
    }

    public String print(IGenericSet<Element> set) {
        GenericSet<Element> copySet = copy(set);
        String result = "[";
        boolean firstElement = true;

        while (!copySet.isEmpty()) {
            Element obj = copySet.choose();
            if (!firstElement) {
                result += ", ";
            }
            firstElement = false;
            result += obj;
            copySet.remove(obj);
        }

        result += "]";
        return result;
    }
}
