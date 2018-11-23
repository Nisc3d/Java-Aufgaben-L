package Aufgabe4;

public class KontostandException extends Exception {

    public KontostandException() {
    }

    public KontostandException(String fehler) {
        super(fehler);
    }
}
