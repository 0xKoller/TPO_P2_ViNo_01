package org.example.model.ejercicios.TDACustoms;

import org.example.model.definition.Stack;

import static org.example.model.utilities.StackUtilities.print;

public class Run {
    public static void main(String[] args) {
        System.out.println("Stack limitado: Un stack el cual esta limitado mediante el constructor.");
        Stack stack = new LimitedStack(2);
        stack.add(0);
        stack.add(1);
        print(stack);
        System.out.println("==============================");
        System.out.println("UnrestrictedSet: Set que permite repetidos.");
        UnrestrictedSet unrestricted = new UnrestrictedSet();
        unrestricted.add(0);
        unrestricted.add(0);
        unrestricted.add(1);
        unrestricted.add(1);
        unrestricted.add(1);
        unrestricted.add(2);
        unrestricted.add(2);
        unrestricted.add(2);
        unrestricted.add(2);
        unrestricted.add(2);
        unrestricted.add(3);
        System.out.println("Se encontro " + unrestricted.count(0) + " el numero 0.");
        System.out.println("Se encontro " + unrestricted.count(1) + " el numero 1.");
        System.out.println("Se encontro " + unrestricted.count(2) + " el numero 2.");
        System.out.println("Se encontro " + unrestricted.count(3) + " el numero 3.");
        int randomElement = unrestricted.choose();
        System.out.println(randomElement);
        System.out.println("==============================");
        System.out.println("RandomMultipleDictionary(RMDictionary)");
        RMDictionary randomDictionary = new RMDictionary();
        randomDictionary.add(0, 1);
        randomDictionary.add(0, 2);
        randomDictionary.add(0, 3);
        randomDictionary.add(1, 4);
        randomDictionary.add(1, 5);
        Integer firstValue = randomDictionary.get(0);
        System.out.println("Valor aleatorio para la clave 0: " + firstValue);
        Integer secondValue = randomDictionary.get(1);
        System.out.println("Valor aleatorio para la clave 1: " + secondValue);

    }
}
