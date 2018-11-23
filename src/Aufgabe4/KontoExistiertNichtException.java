package Aufgabe4;

public class KontoExistiertNichtException extends Exception {

    public KontoExistiertNichtException() {
    }

    public KontoExistiertNichtException(String fehler) {
        super(fehler);
    }
}
