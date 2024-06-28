package org.example.model.ejercicios.Algorithms.Monte.Utilities;

import org.example.model.ejercicios.Algorithms.Monte.Coordinates;
import org.example.model.ejercicios.Algorithms.Monte.MonteCarlo;

import java.util.ArrayList;
import java.util.List;

public class MonteCarloUtilities {

    public static MonteCarlo copy(final MonteCarlo monte) {
        final MonteCarlo aux = new MonteCarlo(monte.getLimit());
        final List<Coordinates> temp = new ArrayList<>();

        while (!monte.isEmpty()) {
            final Coordinates coordinates = monte.choose();
            aux.add(coordinates);
            temp.add(coordinates);
            monte.remove(coordinates);
        }

        for (Coordinates coordinates : temp) {
            monte.add(coordinates);
        }

        return aux;
    }

    public static int size(final MonteCarlo monteCarlo) {
        int count = 0;
        final MonteCarlo aux = copy(monteCarlo);

        while (!aux.isEmpty()) {
            aux.choose();
            aux.remove(aux.choose());
            count++;
        }

        return count;
    }

    public static double getPi(final MonteCarlo monteCarlo) {
        int insideCircle = 0;
        int total = 0;
        final double limitSquared = Math.pow(monteCarlo.getLimit(), 2);
        final MonteCarlo aux = copy(monteCarlo);

        while (!aux.isEmpty()) {
            final Coordinates coordinates = aux.choose();
            final double x = coordinates.getX();
            final double y = coordinates.getY();
            if (x * x + y * y <= limitSquared) {
                insideCircle++;
            }
            aux.remove(coordinates);
            total++;
        }

        return 4.0 * insideCircle / total;
    }
}

