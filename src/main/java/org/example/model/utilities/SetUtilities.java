package org.example.model.utilities;

import org.example.model.definition.Set;
import org.example.model.normal.StaticSet;

public class SetUtilities {
    public static Set copy(Set set) {
        Set aux = new StaticSet();
        Set aux2 = new StaticSet();

        while (!set.isEmpty()) {
            int n = set.choose();
            aux.add(n);
            aux2.add(n);
            set.remove(n);
        }

        while (!aux.isEmpty()) {
            int n = aux.choose();
            set.add(n);
            aux.remove(n);
        }
        return aux2;

    }

    public static void print(Set set) {
        Set copy = copy(set);
        while (!copy.isEmpty()) {
            int n = copy.choose();
            System.out.println(n);
            copy.remove(n);
        }
    }
}
