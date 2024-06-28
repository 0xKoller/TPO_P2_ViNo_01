package org.example.model.ejercicios.Algorithms;

import org.example.model.ejercicios.Algorithms.Monte.Coordinates;
import org.example.model.ejercicios.Algorithms.Monte.MonteCarlo;
import org.example.model.ejercicios.Algorithms.Monte.Utilities.MonteCarloUtilities;

import java.util.Random;


public class Run {
    public static void main(String[] args) {
        double LIMIT = 1.0;
        // Mas precioso sin que tarde tanto
        int counter = 10000;
        MonteCarlo monteCarlo = new MonteCarlo(LIMIT);
        Random ran = new Random();

        for (int i = 0; i < counter; i++) {
            double x = ran.nextDouble() * LIMIT;
            double y = ran.nextDouble() * LIMIT;
            Coordinates coordinates = new Coordinates(x, y);
            monteCarlo.add(coordinates);
        }
        double pi = MonteCarloUtilities.getPi(monteCarlo);
        System.out.println("El valor de Pi es " + pi);
    }
}
