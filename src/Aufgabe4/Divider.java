package Aufgabe4;

public class Divider {
    int ergebnis;

    Divider() {

    }

    public int dividiere(int a, int b) {

        try {
            ergebnis = a / b;
            return ergebnis;
        } catch (RuntimeException e) {
            throw new DivisionDurchNullException("Division durch 0!");
        }

    }
}
