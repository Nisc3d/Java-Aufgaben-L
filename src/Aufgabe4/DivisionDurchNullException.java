package Aufgabe4;

public class DivisionDurchNullException extends RuntimeException {

    DivisionDurchNullException(){

    }

    DivisionDurchNullException(String fehler){
        super(fehler);
    }
}
