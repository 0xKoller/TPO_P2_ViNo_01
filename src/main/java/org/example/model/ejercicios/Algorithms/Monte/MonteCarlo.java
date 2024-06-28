package org.example.model.ejercicios.Algorithms.Monte;

public class MonteCarlo {
    private final DynamicSetOfCoordinates cordenades;
    private final double limit;

    public MonteCarlo(Double limit) {
        cordenades = new DynamicSetOfCoordinates();
        this.limit = limit;
    }

    public void add(Coordinates c) {
        if (c.getX() <= limit && c.getY() <= limit) {
            cordenades.add(c);
        }
    }

    public void remove(Coordinates c) {
        if (cordenades.isEmpty()) {
            throw new RuntimeException("MonteCarlo Vacío");
        }
        cordenades.remove(c);
    }

    public boolean isEmpty() {
        return cordenades.isEmpty();
    }

    public Coordinates choose() {
        return cordenades.choose();
    }

    public double getLimit() {
        return limit;
    }

}
